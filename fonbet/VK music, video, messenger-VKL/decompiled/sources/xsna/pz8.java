package xsna;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class pz8 implements mz8 {
    public final Matrix b = new Matrix();
    public final int[] c = new int[2];

    @Override // xsna.mz8
    public void d(View view, float[] fArr) {
        Matrix matrix = this.b;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.c;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        alk.y(matrix, fArr);
    }
}
