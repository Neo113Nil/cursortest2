package defpackage;

/* loaded from: classes4.dex */
public final class er80 extends o2 implements y1 {
    public w2 a;
    public final fr80 b;

    public er80(fr80 fr80Var) {
        this.b = fr80Var;
    }

    public static er80 o(a2 a2Var) {
        fr80 fr80Var;
        if (a2Var instanceof er80) {
            return (er80) a2Var;
        }
        if (a2Var instanceof w2) {
            er80 er80Var = new er80();
            er80Var.a = (w2) a2Var;
            return er80Var;
        }
        if (a2Var instanceof fr80) {
            fr80Var = (fr80) a2Var;
        } else if (a2Var != null) {
            i3 z = i3.z(a2Var);
            fr80 fr80Var2 = new fr80();
            if (z.size() != 2) {
                ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
                return null;
            }
            fr80Var2.a = xr1.m(z.A(0));
            fr80Var2.b = w2.x(z.A(1));
            fr80Var = fr80Var2;
        } else {
            fr80Var = null;
        }
        return new er80(fr80Var);
    }

    public final xr1 m() {
        fr80 fr80Var = this.b;
        return fr80Var == null ? new xr1(zo60.e) : fr80Var.a;
    }

    public final byte[] n() {
        fr80 fr80Var = this.b;
        return (fr80Var == null ? this.a : fr80Var.b).a;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        fr80 fr80Var = this.b;
        return fr80Var == null ? this.a : fr80Var.toASN1Primitive();
    }
}
