package xsna;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* compiled from: CallZoomHelper.kt */
/* loaded from: classes7.dex */
public final class ib9 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ gb9 b;

    public ib9(gb9 gb9Var) {
        this.b = gb9Var;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        gb9 gb9Var = this.b;
        TextureViewRenderer textureViewRenderer = gb9Var.i;
        if (textureViewRenderer == null) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        double b = ln10.b(gb9Var.u) * scaleFactor;
        if (0.2d > b || b > 20.0d) {
            return false;
        }
        float focusX = (scaleGestureDetector.getFocusX() - textureViewRenderer.getLeft()) + ((gb9Var.c / 2) - (textureViewRenderer.getWidth() / 2));
        float focusY = (scaleGestureDetector.getFocusY() - textureViewRenderer.getTop()) + ((gb9Var.d / 2) - (textureViewRenderer.getHeight() / 2));
        float[] fArr = gb9Var.p;
        fArr[0] = focusX;
        fArr[1] = focusY;
        gb9Var.k.mapPoints(gb9Var.q, fArr);
        gb9Var.j.mapPoints(gb9Var.p, gb9Var.q);
        Matrix matrix = gb9Var.u;
        float[] fArr2 = gb9Var.p;
        matrix.postScale(scaleFactor, scaleFactor, fArr2[0], fArr2[1]);
        gb9Var.u.invert(gb9Var.k);
        textureViewRenderer.setTransform(gb9Var.u);
        textureViewRenderer.invalidate();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        scaleGestureDetector.getFocusX();
        scaleGestureDetector.getFocusY();
        gb9 gb9Var = this.b;
        gb9Var.u.invert(gb9Var.k);
        gb9Var.a.getParent().requestDisallowInterceptTouchEvent(true);
        gb9Var.w = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
