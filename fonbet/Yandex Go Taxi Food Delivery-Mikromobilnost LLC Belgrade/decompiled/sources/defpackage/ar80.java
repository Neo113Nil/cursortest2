package defpackage;

/* loaded from: classes4.dex */
public final class ar80 extends o2 {
    public final xr1 a;
    public final mpf b;

    public ar80(i3 i3Var) {
        this.a = xr1.m(i3Var.A(0));
        this.b = (mpf) i3Var.A(1);
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }
}
