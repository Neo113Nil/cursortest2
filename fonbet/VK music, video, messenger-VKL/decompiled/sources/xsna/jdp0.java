package xsna;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.kkk0;
import xsna.wy80;

/* compiled from: TouchTracker.java */
/* loaded from: classes12.dex */
public final class jdp0 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, wy80.a {
    public final kkk0.a d;
    public final GestureDetector f;
    public final PointF b = new PointF();
    public final PointF c = new PointF();
    public final float e = 25.0f;
    public volatile float g = 3.1415927f;

    public jdp0(Context context, kkk0.a aVar) {
        this.d = aVar;
        this.f = new GestureDetector(context, this);
    }

    @Override // xsna.wy80.a
    public final void d(float[] fArr, float f) {
        this.g = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.b.x) / this.e;
        float y = motionEvent2.getY();
        PointF pointF = this.b;
        float f3 = (y - pointF.y) / this.e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.g;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.c;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = (cos * f3) + (sin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        kkk0.a aVar = this.d;
        PointF pointF3 = this.c;
        synchronized (aVar) {
            float f5 = pointF3.y;
            aVar.h = f5;
            Matrix.setRotateM(aVar.f, 0, -f5, (float) Math.cos(aVar.i), (float) Math.sin(aVar.i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Matrix.setRotateM(aVar.g, 0, -pointF3.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return kkk0.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f.onTouchEvent(motionEvent);
    }
}
