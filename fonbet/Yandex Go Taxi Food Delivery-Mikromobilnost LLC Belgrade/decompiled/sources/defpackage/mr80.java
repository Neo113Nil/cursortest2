package defpackage;

/* loaded from: classes4.dex */
public final class mr80 extends o2 {
    public u2 a;
    public a2 b;

    public mr80(u2 u2Var, a2 a2Var) {
        this.a = u2Var;
        this.b = a2Var;
    }

    public static mr80 m(o2 o2Var) {
        if (o2Var instanceof mr80) {
            return (mr80) o2Var;
        }
        if (o2Var == null) {
            return null;
        }
        i3 z = i3.z(o2Var);
        mr80 mr80Var = new mr80();
        mr80Var.a = u2.A(z.A(0));
        mr80Var.b = z.A(1);
        return mr80Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }
}
