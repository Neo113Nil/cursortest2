package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import xsna.v4s;

/* compiled from: MinLinesConstrainer.kt */
/* loaded from: classes11.dex */
public final class ko20 {
    public static ko20 h;
    public final LayoutDirection a;
    public final nmo0 b;
    public final dzl c;
    public final v4s.a d;
    public final nmo0 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    /* compiled from: MinLinesConstrainer.kt */
    public static final class a {
        public static ko20 a(ko20 ko20Var, LayoutDirection layoutDirection, nmo0 nmo0Var, azl azlVar, v4s.a aVar) {
            if (ko20Var != null && layoutDirection == ko20Var.a && tmo0.a(nmo0Var, layoutDirection).equals(ko20Var.b) && azlVar.getDensity() == ko20Var.c.b && aVar == ko20Var.d) {
                return ko20Var;
            }
            ko20 ko20Var2 = ko20.h;
            if (ko20Var2 != null && layoutDirection == ko20Var2.a && tmo0.a(nmo0Var, layoutDirection).equals(ko20Var2.b) && azlVar.getDensity() == ko20Var2.c.b && aVar == ko20Var2.d) {
                return ko20Var2;
            }
            ko20 ko20Var3 = new ko20(layoutDirection, tmo0.a(nmo0Var, layoutDirection), new dzl(azlVar.getDensity(), azlVar.getFontScale()), aVar);
            ko20.h = ko20Var3;
            return ko20Var3;
        }
    }

    public ko20(LayoutDirection layoutDirection, nmo0 nmo0Var, dzl dzlVar, v4s.a aVar) {
        this.a = layoutDirection;
        this.b = nmo0Var;
        this.c = dzlVar;
        this.d = aVar;
        this.e = tmo0.a(nmo0Var, layoutDirection);
    }

    public final long a(int i, long j) {
        int j2;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = lo20.a;
            long b = s6j.b(0, 0, 0, 0, 15);
            nmo0 nmo0Var = this.e;
            dzl dzlVar = this.c;
            float c = dh90.a(str, nmo0Var, b, dzlVar, this.d, null, 1, 96).c();
            float c2 = dh90.a(lo20.b, this.e, s6j.b(0, 0, 0, 0, 15), dzlVar, this.d, null, 2, 96).c() - c;
            this.g = c;
            this.f = c2;
            f2 = c2;
            f = c;
        }
        if (i != 1) {
            int round = Math.round((f2 * (i - 1)) + f);
            j2 = round >= 0 ? round : 0;
            int h2 = o6j.h(j);
            if (j2 > h2) {
                j2 = h2;
            }
        } else {
            j2 = o6j.j(j);
        }
        return s6j.a(o6j.k(j), o6j.i(j), j2, o6j.h(j));
    }
}
