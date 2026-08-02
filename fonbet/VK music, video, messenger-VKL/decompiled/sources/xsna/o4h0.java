package xsna;

import android.view.ScaleGestureDetector;

/* compiled from: ScaleGestureDetector.kt */
/* loaded from: classes4.dex */
public final class o4h0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ q4h0 b;

    public o4h0(q4h0 q4h0Var) {
        this.b = q4h0Var;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        sot sotVar = this.b.a;
        if (sotVar == null) {
            return true;
        }
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        if (!sotVar.j) {
            return true;
        }
        sotVar.b.onScale(scaleFactor, focusX, focusY);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
