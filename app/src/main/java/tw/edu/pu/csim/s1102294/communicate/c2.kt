package tw.edu.pu.csim.s1102294.communicate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.GestureDetector.OnDoubleTapListener
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.media.MediaPlayer
import android.view.View.OnTouchListener

class c2 : AppCompatActivity(), GestureDetector.OnGestureListener, OnTouchListener{
    lateinit var txv: TextView
    lateinit var txv2: TextView
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var imageView: ImageView
    lateinit var gDetector:GestureDetector
    var mper = MediaPlayer()
    var count:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        imageView = findViewById(R.id.imageView)
        gDetector = GestureDetector(this, this)

        txv.text = "尿尿"
        imageView.setImageDrawable(getDrawable(R.drawable.child))


    }
    fun a(view: View) {
        mper.reset()
        mper = MediaPlayer.create(this, R.raw.kencing)
        mper.start()
    }

    fun b(view: View) {
        mper.reset()
        mper = MediaPlayer.create(this, R.raw.pee)
        mper.start()
    }

    fun swac() {
        val intent = Intent(this, MainActivity::class.java )
        startActivity(intent)
    }

    fun swap() {
        val intent = Intent(this, c1::class.java )
        startActivity(intent)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        gDetector.onTouchEvent(event)
        return true
    }

    override fun onDown(p0: MotionEvent): Boolean {
        return true
    }

    override fun onShowPress(p0: MotionEvent) {
    }

    override fun onSingleTapUp(p0: MotionEvent): Boolean {

        return true
    }

    override fun onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Float, distanceY: Float): Boolean {
        return true
    }

    override fun onLongPress(p0: MotionEvent) {

    }

    override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
        if (e1.x <= e2.x){
           swap()
        }
        else{
            swac()
        }
        return true

    }


    override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }


}