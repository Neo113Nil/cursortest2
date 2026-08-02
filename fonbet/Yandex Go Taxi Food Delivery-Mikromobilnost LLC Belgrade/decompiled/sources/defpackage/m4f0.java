package defpackage;

import java.util.Enumeration;

/* loaded from: classes4.dex */
public final class m4f0 extends o2 {
    public g2 a;
    public g2 b;

    public static m4f0 m(o2 o2Var) {
        if (o2Var instanceof m4f0) {
            return (m4f0) o2Var;
        }
        i3 z = i3.z(o2Var);
        m4f0 m4f0Var = new m4f0();
        Enumeration B = z.B();
        while (B.hasMoreElements()) {
            s3 s3Var = (s3) B.nextElement();
            int i = s3Var.c;
            p1 p1Var = g2.b;
            if (i == 0) {
                m4f0Var.a = (g2) p1Var.Hg(s3Var, false);
            } else if (i == 1) {
                m4f0Var.b = (g2) p1Var.Hg(s3Var, false);
            }
        }
        return m4f0Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        g2 g2Var = this.a;
        if (g2Var != null) {
            c2Var.a(new oqf(false, 0, g2Var, 0));
        }
        g2 g2Var2 = this.b;
        if (g2Var2 != null) {
            c2Var.a(new oqf(false, 1, g2Var2, 0));
        }
        return new jqf(c2Var);
    }
}
