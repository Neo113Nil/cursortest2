package androidx.transition;

import android.graphics.Path;
import defpackage.g8e;

/* loaded from: classes10.dex */
public class ArcMotion extends PathMotion {
    public static final float b = (float) Math.tan(Math.toRadians(35.0d));
    public final float a = b;

    @Override // androidx.transition.PathMotion
    public final Path a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        Path path = new Path();
        path.moveTo(f, f2);
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = (f8 * f8) + (f7 * f7);
        float f10 = (f + f3) / 2.0f;
        float f11 = (f2 + f4) / 2.0f;
        float f12 = 0.25f * f9;
        boolean z = f2 > f4;
        if (Math.abs(f7) < Math.abs(f8)) {
            float abs = Math.abs(f9 / (f8 * 2.0f));
            if (z) {
                f6 = abs + f4;
                f5 = f3;
            } else {
                f6 = abs + f2;
                f5 = f;
            }
        } else {
            float f13 = f9 / (f7 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f13 + f;
            } else {
                f5 = f3 - f13;
                f6 = f4;
            }
        }
        float f14 = f12 * 0.0f * 0.0f;
        float f15 = f10 - f5;
        float f16 = f11 - f6;
        float f17 = (f16 * f16) + (f15 * f15);
        float f18 = this.a;
        float f19 = f12 * f18 * f18;
        if (f17 >= f14) {
            f14 = f17 > f19 ? f19 : 0.0f;
        }
        if (f14 != 0.0f) {
            float sqrt = (float) Math.sqrt(f14 / f17);
            f5 = g8e.b(f5, f10, sqrt, f10);
            f6 = g8e.b(f6, f11, sqrt, f11);
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }
}
