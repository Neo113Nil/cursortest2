package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: MarketAdsItemOnGestureListener.kt */
/* loaded from: classes17.dex */
public final class zp00 extends GestureDetector.SimpleOnGestureListener {
    public final dg1 b;

    public zp00(dg1 dg1Var) {
        this.b = dg1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.a(zq00.b);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.b.a(ar00.b);
        return true;
    }
}
