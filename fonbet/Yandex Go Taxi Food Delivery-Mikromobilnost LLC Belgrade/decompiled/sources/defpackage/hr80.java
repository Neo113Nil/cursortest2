package defpackage;

/* loaded from: classes4.dex */
public final class hr80 extends o2 {
    public u2 a;
    public a2 b;

    public static hr80 m(a2 a2Var) {
        if (a2Var instanceof hr80) {
            return (hr80) a2Var;
        }
        if (a2Var == null) {
            return null;
        }
        i3 z = i3.z(a2Var);
        hr80 hr80Var = new hr80();
        hr80Var.a = (u2) z.A(0);
        hr80Var.b = z.A(1);
        return hr80Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }
}
