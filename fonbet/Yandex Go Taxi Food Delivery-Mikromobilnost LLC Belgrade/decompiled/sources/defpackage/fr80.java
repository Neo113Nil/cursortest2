package defpackage;

/* loaded from: classes4.dex */
public final class fr80 extends o2 {
    public xr1 a;
    public w2 b;

    public fr80(xr1 xr1Var, dqf dqfVar) {
        this.a = xr1Var;
        this.b = dqfVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }
}
