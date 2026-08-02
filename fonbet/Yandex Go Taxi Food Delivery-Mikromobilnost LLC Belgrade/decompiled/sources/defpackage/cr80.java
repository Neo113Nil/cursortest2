package defpackage;

/* loaded from: classes4.dex */
public final class cr80 extends o2 {
    public o2 a;
    public r0x b;

    public cr80(xr1 xr1Var, byte[] bArr, r0x r0xVar) {
        this.a = new njj(xr1Var, bArr);
        this.b = r0xVar;
    }

    public static cr80 o(a2 a2Var) {
        if (a2Var instanceof cr80) {
            return (cr80) a2Var;
        }
        if (a2Var != null) {
            i3 z = i3.z(a2Var);
            cr80 cr80Var = new cr80();
            if (z.size() >= 1 && z.size() <= 2) {
                boolean z2 = z.A(0).toASN1Primitive() instanceof w2;
                a2 A = z.A(0);
                cr80Var.a = z2 ? w2.x(A) : njj.m(A);
                if (z.size() > 1) {
                    cr80Var.b = r0x.m(z.A(1));
                }
                return cr80Var;
            }
            ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    public final xr1 m() {
        o2 o2Var = this.a;
        return o2Var.toASN1Primitive() instanceof w2 ? new xr1(zo60.e) : njj.m(o2Var).b;
    }

    public final byte[] n() {
        o2 o2Var = this.a;
        return o2Var.toASN1Primitive() instanceof w2 ? ((w2) o2Var.toASN1Primitive()).a : rza1.b(njj.m(o2Var).a);
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        r0x r0xVar = this.b;
        if (r0xVar != null) {
            c2Var.a(r0xVar);
        }
        return new jqf(c2Var);
    }
}
