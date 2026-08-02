package defpackage;

import java.util.Enumeration;

/* loaded from: classes4.dex */
public final class k4f0 extends o2 {
    public l2 a;
    public xr1 b;
    public w2 c;
    public m3 w;
    public s1 x;

    public static k4f0 m(Object obj) {
        if (obj instanceof k4f0) {
            return (k4f0) obj;
        }
        if (obj != null) {
            i3 z = i3.z(obj);
            k4f0 k4f0Var = new k4f0();
            Enumeration B = z.B();
            l2 u = l2.u(B.nextElement());
            k4f0Var.a = u;
            int A = u.A();
            if (A >= 0 && A <= 1) {
                k4f0Var.b = xr1.m(B.nextElement());
                k4f0Var.c = w2.x(B.nextElement());
                int i = -1;
                while (B.hasMoreElements()) {
                    s3 s3Var = (s3) B.nextElement();
                    int i2 = s3Var.c;
                    if (i2 <= i) {
                        ny61.g("invalid optional field in private key info");
                        return null;
                    }
                    if (i2 == 0) {
                        k4f0Var.w = (m3) m3.c.Hg(s3Var, false);
                    } else {
                        if (i2 != 1) {
                            ny61.g("unknown optional field in private key info");
                            return null;
                        }
                        if (A < 1) {
                            ny61.g("'publicKey' requires version v2(1) or later");
                            return null;
                        }
                        k4f0Var.x = (s1) s1.b.Hg(s3Var, false);
                    }
                    i = i2;
                }
                return k4f0Var;
            }
            ny61.g("invalid version for private key info");
        }
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(5);
        c2Var.a(this.a);
        c2Var.a(this.b);
        c2Var.a(this.c);
        m3 m3Var = this.w;
        if (m3Var != null) {
            c2Var.a(new oqf(false, 0, m3Var, 0));
        }
        s1 s1Var = this.x;
        if (s1Var != null) {
            c2Var.a(new oqf(false, 1, s1Var, 0));
        }
        return new jqf(c2Var);
    }
}
