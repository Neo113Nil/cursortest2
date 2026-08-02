package xsna;

import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: CropUtils.java */
/* loaded from: classes17.dex */
public final class lik {
    public static final Paint a = new Paint(2);

    public static RectF a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = (f2 - f4) - f6;
        float f13 = (f3 - f5) - f7;
        float min = Math.min(f12, f13);
        float f14 = f12 / f13;
        float f15 = f12 / 2.0f;
        float f16 = f4 + f15;
        float f17 = f13 / 2.0f;
        float f18 = f5 + f17;
        if (Math.abs(1.0f - f) < 1.0E-4f) {
            float f19 = min / 2.0f;
            f8 = f16 - f19;
            f9 = f18 - f19;
            f10 = f16 + f19;
            f11 = f18 + f19;
        } else if (f > f14) {
            float f20 = f16 - f15;
            float f21 = (f12 / f) / 2.0f;
            float f22 = f18 - f21;
            f10 = f16 + f15;
            f11 = f18 + f21;
            f9 = f22;
            f8 = f20;
        } else {
            float f23 = (f13 * f) / 2.0f;
            f8 = f16 - f23;
            f9 = f18 - f17;
            f10 = f16 + f23;
            f11 = f18 + f17;
        }
        return new RectF(f8, f9, f10, f11);
    }
}
