package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: MinimumTranslationFinder.java */
/* loaded from: classes17.dex */
public final class is20 {
    public final RectF a = new RectF();
    public final Matrix b = new Matrix();
    public final float[] c = new float[8];
    public final PointF d = new PointF();
    public final float[] e = new float[2];

    public static void a(PointF[] pointFArr, float f, float f2, float f3, float f4, PointF pointF) {
        float f5 = Float.MAX_VALUE;
        float f6 = -3.4028235E38f;
        float f7 = Float.MAX_VALUE;
        float f8 = -3.4028235E38f;
        for (PointF pointF2 : pointFArr) {
            float f9 = pointF2.x;
            if (f9 < f5) {
                f5 = f9;
            }
            if (f9 > f8) {
                f8 = f9;
            }
            float f10 = pointF2.y;
            if (f10 < f7) {
                f7 = f10;
            }
            if (f10 > f6) {
                f6 = f10;
            }
        }
        if (f3 < f5) {
            pointF.x = f5 - f3;
        }
        if (f4 < f7) {
            pointF.y = f7 - f4;
        }
        if (f3 + f > f8) {
            pointF.x = (f8 - f3) - f;
        }
        if (f4 + f2 > f6) {
            pointF.y = (f6 - f4) - f2;
        }
    }
}
