package xsna;

import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: CallZoomHelper.kt */
/* loaded from: classes7.dex */
public final class hb9 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ gb9 b;

    public hb9(gb9 gb9Var) {
        this.b = gb9Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        gb9 gb9Var = this.b;
        gb9Var.u.postTranslate(-f, -f2);
        Matrix matrix = gb9Var.u;
        float[] fArr = gb9Var.s;
        float[] fArr2 = gb9Var.r;
        matrix.mapPoints(fArr, fArr2);
        Matrix matrix2 = gb9Var.j;
        float[] fArr3 = gb9Var.t;
        matrix2.mapPoints(fArr3, fArr2);
        boolean z = (gb9Var.y && fArr[0] > fArr3[0]) || fArr[2] < fArr3[2];
        gb9Var.m = z;
        if (!z) {
            gb9Var.n = true;
            gb9Var.a();
        }
        return true;
    }
}
