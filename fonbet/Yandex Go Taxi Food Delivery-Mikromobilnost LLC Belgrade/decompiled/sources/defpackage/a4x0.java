package defpackage;

/* loaded from: classes4.dex */
public final class a4x0 extends o2 {
    public l2 a;
    public xr1 b;
    public jc51 c;
    public t5z0 w;
    public t5z0 x;
    public i3 y;
    public gzo z;

    public static a4x0 m(a2 a2Var) {
        if (a2Var instanceof a4x0) {
            return (a4x0) a2Var;
        }
        if (a2Var != null) {
            i3 z = i3.z(a2Var);
            a4x0 a4x0Var = new a4x0();
            if (z.size() >= 3 && z.size() <= 7) {
                int i = 0;
                if (z.A(0) instanceof l2) {
                    a4x0Var.a = l2.u(z.A(0));
                    i = 1;
                } else {
                    a4x0Var.a = null;
                }
                a4x0Var.b = xr1.m(z.A(i));
                a4x0Var.c = jc51.m(z.A(i + 1));
                int i2 = i + 3;
                a4x0Var.w = t5z0.n(z.A(i + 2));
                if (i2 < z.size() && ((z.A(i2) instanceof v3) || (z.A(i2) instanceof g2) || (z.A(i2) instanceof t5z0))) {
                    a4x0Var.x = t5z0.n(z.A(i2));
                    i2 = i + 4;
                }
                if (i2 < z.size() && !(z.A(i2) instanceof s3)) {
                    a4x0Var.y = i3.z(z.A(i2));
                    i2++;
                }
                if (i2 < z.size() && (z.A(i2) instanceof s3)) {
                    a4x0Var.z = gzo.n(i3.y((s3) z.A(i2), true));
                }
                return a4x0Var;
            }
            ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(7);
        l2 l2Var = this.a;
        if (l2Var != null) {
            c2Var.a(l2Var);
        }
        c2Var.a(this.b);
        c2Var.a(this.c);
        c2Var.a(this.w);
        t5z0 t5z0Var = this.x;
        if (t5z0Var != null) {
            c2Var.a(t5z0Var);
        }
        i3 i3Var = this.y;
        if (i3Var != null) {
            c2Var.a(i3Var);
        }
        gzo gzoVar = this.z;
        if (gzoVar != null) {
            c2Var.a(new oqf(true, 0, gzoVar, 0));
        }
        return new jqf(c2Var);
    }
}
