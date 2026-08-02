package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: AdsItemOnGestureListener.kt */
/* loaded from: classes17.dex */
public final class my0 extends GestureDetector.SimpleOnGestureListener {
    public final ux0 b;

    public my0(ux0 ux0Var) {
        this.b = ux0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.b.a(uz0.b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.a(vz0.b);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.b.a(wz0.b);
        return true;
    }
}
