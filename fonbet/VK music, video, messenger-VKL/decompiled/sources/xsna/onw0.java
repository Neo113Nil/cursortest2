package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: VoipEffectController.kt */
/* loaded from: classes7.dex */
public final class onw0 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ rnw0 b;

    public onw0(rnw0 rnw0Var) {
        this.b = rnw0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.b.d.e().a();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }
}
