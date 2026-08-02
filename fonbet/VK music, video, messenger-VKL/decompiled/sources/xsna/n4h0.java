package xsna;

import android.view.ScaleGestureDetector;

/* compiled from: ScaleGestureDetector.kt */
/* loaded from: classes4.dex */
public final class n4h0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ p4h0 b;

    public n4h0(p4h0 p4h0Var) {
        this.b = p4h0Var;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xsna.p4h0$a] */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        ?? r1 = this.b.a;
        if (r1 == 0) {
            return true;
        }
        r1.onScale(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
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
