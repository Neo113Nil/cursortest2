package defpackage;

/* loaded from: classes10.dex */
public final class bb70 extends gc70 {
    public static final bb70 c = new bb70(0, 2, 1);

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        int i;
        g6w g6wVar = (g6w) vc70Var.b(0);
        int c2 = ows0Var.c((yss) vc70Var.b(1));
        if (ows0Var.t >= c2) {
            lid.a("Check failed");
        }
        wub1.f(ows0Var, o13Var, c2);
        int i2 = ows0Var.t;
        int i3 = ows0Var.v;
        while (i3 >= 0 && !ows0Var.y(i3)) {
            i3 = ows0Var.G(i3, ows0Var.b);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (ows0Var.v(i2, i4)) {
                if (ows0Var.y(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += ows0Var.y(i4) ? 1 : ows0Var.F(i4);
                i4 += ows0Var.u(i4);
            }
        }
        while (true) {
            i = ows0Var.t;
            if (i >= c2) {
                break;
            }
            if (ows0Var.v(c2, i)) {
                int i6 = ows0Var.t;
                if (i6 < ows0Var.u && (ows0Var.b[(ows0Var.r(i6) * 5) + 1] & 1073741824) != 0) {
                    o13Var.n(ows0Var.E(ows0Var.t));
                    i5 = 0;
                }
                ows0Var.R();
            } else {
                i5 += ows0Var.N();
            }
        }
        if (i != c2) {
            lid.a("Check failed");
        }
        g6wVar.a = i5;
    }
}
