package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class gh20 {
    public static gh20 h;
    public final LayoutDirection a;
    public final ety0 b;
    public final iwi c;
    public final dyr d;
    public final ety0 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public gh20(LayoutDirection layoutDirection, ety0 ety0Var, iwi iwiVar, dyr dyrVar) {
        this.a = layoutDirection;
        this.b = ety0Var;
        this.c = iwiVar;
        this.d = dyrVar;
        this.e = bb1.I(ety0Var, layoutDirection);
    }

    public final long a(int i, long j) {
        int j2;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = hh20.a;
            long b = p8e.b(0, 0, 0, 0, 15);
            ety0 ety0Var = this.e;
            iwi iwiVar = this.c;
            float b2 = t691.c(str, ety0Var, b, iwiVar, this.d, 1, 96).b();
            float b3 = t691.c(hh20.b, this.e, p8e.b(0, 0, 0, 0, 15), iwiVar, this.d, 2, 96).b() - b2;
            this.g = b2;
            this.f = b3;
            f2 = b3;
            f = b2;
        }
        if (i != 1) {
            int round = Math.round((f2 * (i - 1)) + f);
            j2 = round >= 0 ? round : 0;
            int h2 = n8e.h(j);
            if (j2 > h2) {
                j2 = h2;
            }
        } else {
            j2 = n8e.j(j);
        }
        return p8e.a(n8e.k(j), n8e.i(j), j2, n8e.h(j));
    }
}
