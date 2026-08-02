package defpackage;

/* loaded from: classes4.dex */
public final class njx extends o2 {
    public l2 a;
    public mgi0 b;
    public xr1 c;
    public w2 w;

    public static njx m(o2 o2Var) {
        if (o2Var instanceof njx) {
            return (njx) o2Var;
        }
        if (o2Var == null) {
            return null;
        }
        i3 z = i3.z(o2Var);
        njx njxVar = new njx();
        njxVar.a = (l2) z.A(0);
        njxVar.b = mgi0.n(z.A(1));
        njxVar.c = xr1.m(z.A(2));
        njxVar.w = (w2) z.A(3);
        return njxVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(4);
        c2Var.a(this.a);
        c2Var.a(this.b);
        c2Var.a(this.c);
        c2Var.a(this.w);
        return new jqf(c2Var);
    }
}
