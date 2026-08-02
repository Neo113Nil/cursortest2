package defpackage;

import android.view.animation.Interpolator;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinWarGeometryEasing;
import ru.yandex.yandexmaps.multiplatform.pin.war.c;

/* loaded from: classes7.dex */
public final class b2c0 {
    /* JADX WARN: Type inference failed for: r15v0, types: [z1c0] */
    public static c a(k8c k8cVar, y1c0 y1c0Var, float f, uub0 uub0Var, l2c0 l2c0Var, w1c0 w1c0Var, fdc0 fdc0Var, aq80 aq80Var, owb0 owb0Var, n1c0 n1c0Var, Float f2, s1c0 s1c0Var) {
        n1c0 n1c0Var2 = n1c0Var == null ? n1c0.e : n1c0Var;
        long j = (long) (n1c0Var2.a * 1000.0f);
        final PinWarGeometryEasing pinWarGeometryEasing = n1c0Var2.d;
        return new c(k8cVar, y1c0Var, f, uub0Var, l2c0Var, w1c0Var, fdc0Var, new ymu(11, aq80Var, new c4c0(j, new Interpolator() { // from class: z1c0
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f3) {
                double d;
                double b = y6i0.b(f3, 0.0d, 1.0d);
                int i = a2c0.a[PinWarGeometryEasing.this.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        d = b * b;
                    } else if (i == 3) {
                        double d2 = 1.0d - b;
                        b = 1.0d - ((d2 * d2) * d2);
                    } else {
                        if (i != 4) {
                            w511.b();
                            return 0.0f;
                        }
                        if (b < 0.5d) {
                            d = 4.0d * b * b;
                        } else {
                            double d3 = (b * (-2.0d)) + 2.0d;
                            b = 1.0d - (((d3 * d3) * d3) / 2.0d);
                        }
                    }
                    b *= d;
                }
                return (float) b;
            }
        }, n1c0Var2.b, n1c0Var2.c)), owb0Var, n1c0Var2, f2, s1c0Var);
    }
}
