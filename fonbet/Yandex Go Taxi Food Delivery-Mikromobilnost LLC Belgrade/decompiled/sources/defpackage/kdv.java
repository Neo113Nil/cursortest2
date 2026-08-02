package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes10.dex */
public final class kdv {
    public boolean a;

    public final uy80 a(jdv jdvVar) {
        int e = this.a ? jdvVar.G0().e() : 0;
        RectF rectF = new RectF(0.0f, 0.0f, jdvVar.getWidth(), jdvVar.getHeight());
        Matrix a = lw01.a(rectF, lw01.d(e) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : new RectF(0.0f, 0.0f, rectF.width(), rectF.height()), e, false);
        RectF rectF2 = new RectF(jdvVar.getCropRect());
        Matrix matrix = new Matrix();
        matrix.setRectToRect(lw01.a, rectF2, Matrix.ScaleToFit.FILL);
        a.preConcat(matrix);
        return new uy80(a, lw01.g(jdvVar.getCropRect()));
    }
}
