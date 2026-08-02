package xsna;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes12.dex */
public final class d2u0 extends c2u0 {
    @Override // xsna.bis
    public final float h(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // xsna.bis
    public final void m(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // xsna.c2u0, xsna.bis
    public final void n(int i, View view) {
        view.setTransitionVisibility(i);
    }

    @Override // xsna.b2u0
    public final void r(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // xsna.b2u0
    public final void s(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // xsna.b2u0
    public final void t(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // xsna.b2u0
    public final void u(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
