package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;

/* loaded from: classes10.dex */
public class cw01 {
    public static void a(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f2 != 0.0f) {
            matrix.preScale(f4, 1.0f);
        }
        if (f != 0.0f) {
            matrix.preScale(1.0f, f3);
        }
    }

    public static void b(Matrix matrix, PointF pointF, PointF pointF2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        matrix.reset();
        if (pointF2 != null) {
            float f8 = pointF2.x;
            if (f8 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f8, pointF2.y);
            }
        }
        if (f5 != 0.0f) {
            matrix.preRotate(f5);
        }
        if (f4 != 0.0f) {
            matrix.preScale(f7, 1.0f);
        }
        if (f3 != 0.0f) {
            matrix.preScale(1.0f, f6);
        }
        if (f != 1.0f || f2 != 1.0f) {
            matrix.preScale(f, f2);
        }
        if (pointF != null) {
            float f9 = pointF.x;
            if (f9 == 0.0f && pointF.y == 0.0f) {
                return;
            }
            matrix.preTranslate(-f9, -pointF.y);
        }
    }
}
