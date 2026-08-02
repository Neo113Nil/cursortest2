package defpackage;

/* loaded from: classes4.dex */
public final class dcs0 extends o2 {
    public i3 a;
    public i3 b;

    public static dcs0 m(a2 a2Var) {
        if (a2Var instanceof dcs0) {
            return (dcs0) a2Var;
        }
        if (a2Var != null) {
            i3 z = i3.z(a2Var);
            dcs0 dcs0Var = new dcs0();
            if (z.size() >= 1 && z.size() <= 2) {
                dcs0Var.a = i3.z(z.A(0));
                if (z.size() > 1) {
                    dcs0Var.b = i3.z(z.A(1));
                }
                return dcs0Var;
            }
            ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        i3 i3Var = this.b;
        if (i3Var != null) {
            c2Var.a(i3Var);
        }
        return new jqf(c2Var);
    }
}
