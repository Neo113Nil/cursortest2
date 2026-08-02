package defpackage;

import java.io.IOException;
import ru.CryptoPro.AdES.tools.AdESUtility;

/* loaded from: classes4.dex */
public final class ayo extends o2 {
    public static final u2 A;
    public static final u2 B;
    public static final u2 C;
    public static final u2 D;
    public static final u2 E;
    public static final u2 F;
    public static final u2 G;
    public static final u2 H;
    public static final u2 I;
    public static final u2 J;
    public static final u2 K;
    public static final u2 L;
    public static final u2 M;
    public static final u2 N;
    public static final u2 O;
    public static final u2 w = xvz.e("2.5.29.9");
    public static final u2 x = xvz.e("2.5.29.14");
    public static final u2 y = xvz.e(AdESUtility.KEY_USAGE);
    public static final u2 z;
    public u2 a;
    public boolean b;
    public w2 c;

    static {
        new u2("2.5.29.16").B();
        z = new u2("2.5.29.17").B();
        A = xvz.e("2.5.29.18");
        B = xvz.e("2.5.29.19");
        C = xvz.e("2.5.29.20");
        D = xvz.e("2.5.29.21");
        new u2("2.5.29.23").B();
        new u2("2.5.29.24").B();
        E = new u2("2.5.29.27").B();
        F = xvz.e("2.5.29.28");
        G = xvz.e("2.5.29.29");
        H = xvz.e("2.5.29.30");
        I = xvz.e("2.5.29.31");
        J = xvz.e("2.5.29.32");
        K = xvz.e("2.5.29.33");
        L = xvz.e("2.5.29.35");
        M = xvz.e("2.5.29.36");
        new u2(AdESUtility.EXTENDED_KEY_USAGE).B();
        N = new u2("2.5.29.46").B();
        O = xvz.e("2.5.29.54");
        new u2("1.3.6.1.5.5.7.1.1").B();
        new u2("1.3.6.1.5.5.7.1.11").B();
        new u2("1.3.6.1.5.5.7.1.12").B();
        new u2("1.3.6.1.5.5.7.1.2").B();
        new u2("1.3.6.1.5.5.7.1.3").B();
        new u2("1.3.6.1.5.5.7.1.4").B();
        new u2("2.5.29.56").B();
        new u2("2.5.29.55").B();
        new u2("2.5.29.60").B();
        new u2("2.5.29.72").B();
        new u2("2.5.29.73").B();
        new u2("2.5.29.74").B();
        new u2("2.16.840.1.114027.80.6.1");
    }

    @Override // defpackage.o2
    public final boolean equals(Object obj) {
        if (!(obj instanceof ayo)) {
            return false;
        }
        ayo ayoVar = (ayo) obj;
        return ayoVar.a.q(this.a) && ayoVar.c.q(this.c) && ayoVar.b == this.b;
    }

    @Override // defpackage.o2
    public final int hashCode() {
        u2 u2Var = this.a;
        boolean z2 = this.b;
        w2 w2Var = this.c;
        return z2 ? rza1.e(w2Var.a) ^ u2Var.a.hashCode() : ~(rza1.e(w2Var.a) ^ u2Var.a.hashCode());
    }

    public final b3 m() {
        try {
            return b3.r(this.c.a);
        } catch (IOException e) {
            kbs.f(e, "can't convert extension: ");
            return null;
        }
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        c2Var.a(this.a);
        if (this.b) {
            c2Var.a(w1.w);
        }
        c2Var.a(this.c);
        return new jqf(c2Var);
    }
}
