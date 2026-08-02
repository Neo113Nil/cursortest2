package defpackage;

/* loaded from: classes4.dex */
public final class jr80 extends o2 {
    public u2 a;
    public a2 b;

    public static jr80 m(o2 o2Var) {
        if (o2Var instanceof jr80) {
            return (jr80) o2Var;
        }
        if (o2Var == null) {
            return null;
        }
        i3 z = i3.z(o2Var);
        jr80 jr80Var = new jr80();
        jr80Var.a = u2.A(z.A(0));
        jr80Var.b = z.A(1);
        return jr80Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }
}
