package xsna;

import androidx.compose.runtime.a;

/* compiled from: Tooltip.kt */
/* loaded from: classes11.dex */
public final class f5p0 {
    public static final float a;

    static {
        byc0.b(16, 8);
        a = 200;
    }

    public static a6p0 a(androidx.compose.runtime.a aVar) {
        float f = x5p0.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-573803578, 390, -1, "androidx.compose.material3.TooltipDefaults.rememberTooltipPositionProvider (Tooltip.kt:849)");
        }
        int r0 = ((azl) aVar.r(uvi.h)).r0(f);
        boolean o = aVar.o(r0);
        Object x = aVar.x();
        if (o || x == a.C0011a.a) {
            x = new a6p0(r0);
            aVar.R(x);
        }
        a6p0 a6p0Var = (a6p0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a6p0Var;
    }
}
