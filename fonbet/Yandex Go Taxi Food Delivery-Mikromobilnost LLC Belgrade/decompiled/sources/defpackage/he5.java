package defpackage;

/* loaded from: classes4.dex */
public final class he5 extends o2 {
    public bwj0 a;
    public xr1 b;
    public mpf c;
    public i3 w;

    public he5(bwj0 bwj0Var, xr1 xr1Var, mpf mpfVar, i3 i3Var) {
        this.a = bwj0Var;
        this.b = xr1Var;
        this.c = mpfVar;
        this.w = i3Var;
    }

    public static he5 m(Object obj) {
        if (obj instanceof he5) {
            return (he5) obj;
        }
        bwj0 bwj0Var = null;
        if (obj == null) {
            return null;
        }
        i3 z = i3.z(obj);
        he5 he5Var = new he5();
        int i = 0;
        a2 A = z.A(0);
        l2 l2Var = bwj0.z;
        if (A instanceof bwj0) {
            bwj0Var = (bwj0) A;
        } else if (A != null) {
            i3 z2 = i3.z(A);
            l2 l2Var2 = bwj0.z;
            bwj0Var = new bwj0();
            if ((z2.A(0) instanceof s3) && ((s3) z2.A(0)).c == 0) {
                bwj0Var.a = true;
                bwj0Var.b = (l2) l2.c.Hg((s3) z2.A(0), true);
                i = 1;
            } else {
                bwj0Var.b = l2Var2;
            }
            bwj0Var.c = bvj0.getInstance(z2.A(i));
            int i2 = i + 2;
            bwj0Var.w = g2.z(z2.A(i + 1));
            int i3 = i + 3;
            bwj0Var.x = (i3) z2.A(i2);
            if (z2.size() > i3) {
                bwj0Var.y = gzo.n(i3.y((s3) z2.A(i3), true));
            }
        }
        he5Var.a = bwj0Var;
        he5Var.b = xr1.m(z.A(1));
        he5Var.c = (mpf) z.A(2);
        if (z.size() > 3) {
            he5Var.w = i3.y((s3) z.A(3), true);
        }
        return he5Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(4);
        c2Var.a(this.a);
        c2Var.a(this.b);
        c2Var.a(this.c);
        i3 i3Var = this.w;
        if (i3Var != null) {
            c2Var.a(new oqf(true, 0, i3Var, 0));
        }
        return new jqf(c2Var);
    }
}
