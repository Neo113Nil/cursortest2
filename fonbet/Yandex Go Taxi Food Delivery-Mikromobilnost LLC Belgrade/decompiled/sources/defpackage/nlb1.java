package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes11.dex */
public abstract class nlb1 {
    public static au2 a;

    public static final SpannableStringBuilder a(CharSequence charSequence, CharSequence charSequence2, int i) {
        int i2 = i;
        while (i2 > 0 && charSequence2.charAt(i2 - 1) != '\n') {
            i2--;
        }
        boolean i3 = xly0.c.i(i2, i - i2, charSequence2);
        wvb1 wvb1Var = fp5.d;
        dp5 dp5Var = new dp5();
        dp5Var.a = i3;
        dp5Var.c = fp5.d;
        dp5Var.b = 2;
        fp5 a2 = dp5Var.a();
        return a2.c(charSequence, a2.c);
    }

    public static final au2 b() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("ChevronRightL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 e = nnm.e(12.0f, 2.0f);
        e.b(10.0f, 10.0f, true, true, 0.0f, 20.0f);
        e.b(10.0f, 10.0f, false, true, 0.0f, -20.0f);
        e.j(9.09f, 7.6f);
        e.i(4.4f, 4.4f);
        e.i(-4.4f, 4.4f);
        e.i(1.41f, 1.41f);
        tse0.u(e, 16.31f, 12.0f, 10.5f, 6.19f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static float[] c(re20 re20Var, int i) {
        float d = d(re20Var.a, i);
        float d2 = d(re20Var.b, i);
        float d3 = d(re20Var.c, i);
        float d4 = d(re20Var.d, i);
        return new float[]{d, d, d2, d2, d3, d3, d4, d4};
    }

    public static float d(ne20 ne20Var, int i) {
        if (ne20Var instanceof ke20) {
            return ((ke20) ne20Var).a;
        }
        if (ne20Var.equals(l76.G)) {
            return i / 2.0f;
        }
        w511.b();
        return 0.0f;
    }
}
