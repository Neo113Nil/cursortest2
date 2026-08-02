package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: ButtonsSwipeView.kt */
/* loaded from: classes6.dex */
public final class qs8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ps8 b;

    public qs8(ps8 ps8Var) {
        this.b = ps8Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ps8 ps8Var = this.b;
        if (!ps8Var.i) {
            return false;
        }
        t12 t12Var = new t12(ps8Var, 3);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        ps8Var.postOnAnimation(t12Var);
        return true;
    }
}
