package defpackage;

/* loaded from: classes4.dex */
public final class nr60 extends o2 {
    public lr60 a;
    public er80 b;

    public nr60(lr60 lr60Var, er80 er80Var) {
        this.a = lr60Var;
        this.b = er80Var;
    }

    public static nr60 m(Object obj) {
        if (obj instanceof nr60) {
            return (nr60) obj;
        }
        lr60 lr60Var = null;
        if (obj != null) {
            i3 z = i3.z(obj);
            nr60 nr60Var = new nr60();
            if (z.size() >= 1 && z.size() <= 2) {
                a2 A = z.A(0);
                if (A instanceof lr60) {
                    lr60Var = (lr60) A;
                } else if (A != null) {
                    i3 z2 = i3.z(A);
                    lr60 lr60Var2 = new lr60();
                    if (z2.size() != 2) {
                        ny61.g(vfc.n(z2, new StringBuilder("Bad sequence size: ")));
                        return null;
                    }
                    lr60Var2.a = bvj0.getInstance(z2.A(0));
                    lr60Var2.b = (g2) z2.A(1);
                    lr60Var = lr60Var2;
                }
                nr60Var.a = lr60Var;
                if (z.size() > 1) {
                    nr60Var.b = er80.o(z.A(1));
                }
                return nr60Var;
            }
            ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        er80 er80Var = this.b;
        if (er80Var != null) {
            c2Var.a(er80Var);
        }
        return new jqf(c2Var);
    }
}
