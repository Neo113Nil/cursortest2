package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: ScaleGestureDetectorWithConfigurableSpan.java */
/* loaded from: classes6.dex */
public final class r4h0 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ s4h0 b;

    public r4h0(s4h0 s4h0Var) {
        this.b = s4h0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        s4h0 s4h0Var = this.b;
        s4h0Var.l = x;
        s4h0Var.m = motionEvent.getY();
        s4h0Var.n = 1;
        return true;
    }
}
