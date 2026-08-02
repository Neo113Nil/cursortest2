package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: ScaleOnTapVH.kt */
/* loaded from: classes6.dex */
public final class w4h0 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ y4h0 b;

    public w4h0(y4h0 y4h0Var) {
        this.b = y4h0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.W5();
    }
}
