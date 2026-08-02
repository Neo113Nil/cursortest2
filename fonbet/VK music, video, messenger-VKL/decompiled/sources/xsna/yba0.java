package xsna;

import android.graphics.Matrix;
import android.graphics.Rect;
import xsna.f5h0;

/* compiled from: PhotoTagScaleType.kt */
/* loaded from: classes4.dex */
public final class yba0 implements f5h0.d {
    public double a;
    public double b;
    public double c;
    public double d;

    @Override // xsna.f5h0.d
    public final Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        double d = 100.0f;
        double d2 = i;
        float f3 = (float) ((this.a / d) * d2);
        float f4 = (float) ((this.b / d) * d2);
        double d3 = i2;
        float f5 = (float) ((this.c / d) * d3);
        float min = Math.min(rect.width() / (f4 - f3), rect.height() / (((float) ((this.d / d) * d3)) - f5));
        float f6 = rect.left - (f3 * min);
        float f7 = rect.top - (f5 * min);
        matrix.setScale(min, min);
        matrix.postTranslate((int) (f6 + 0.5f), (int) (f7 + 0.5f));
        return matrix;
    }
}
