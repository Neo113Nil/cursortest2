package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: StaticAdsItemOnGestureListener.kt */
/* loaded from: classes17.dex */
public final class xvk0 extends GestureDetector.SimpleOnGestureListener {
    public final l340 b;

    public xvk0(l340 l340Var) {
        this.b = l340Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.a(vwk0.b);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.b.a(wwk0.b);
        return true;
    }
}
