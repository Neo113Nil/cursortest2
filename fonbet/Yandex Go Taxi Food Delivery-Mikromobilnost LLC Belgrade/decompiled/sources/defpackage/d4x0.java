package defpackage;

/* loaded from: classes4.dex */
public final class d4x0 extends o2 implements uc51, b490 {
    public i3 a;
    public jc51 b;
    public jc51 c;

    public static d4x0 m(b3 b3Var) {
        int i;
        if (b3Var == null) {
            return null;
        }
        i3 z = i3.z(b3Var);
        d4x0 d4x0Var = new d4x0();
        d4x0Var.a = z;
        if (z.A(0) instanceof s3) {
            i = 0;
        } else {
            new l2(0L);
            i = -1;
        }
        l2.u(z.A(i + 1));
        xr1.m(z.A(i + 2));
        d4x0Var.b = jc51.m(z.A(i + 3));
        i3 i3Var = (i3) z.A(i + 4);
        t5z0.n(i3Var.A(0));
        t5z0.n(i3Var.A(1));
        d4x0Var.c = jc51.m(z.A(i + 5));
        int i2 = i + 6;
        zyu0.m(z.A(i2));
        for (int size = (z.size() - i2) - 1; size > 0; size--) {
            s3 A = s3.A(z.A(i2 + size));
            int i3 = A.c;
            p1 p1Var = s1.b;
            if (i3 == 1 || i3 == 2) {
            } else if (i3 == 3) {
                qc51.m(A);
            }
        }
        return d4x0Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.a;
    }
}
