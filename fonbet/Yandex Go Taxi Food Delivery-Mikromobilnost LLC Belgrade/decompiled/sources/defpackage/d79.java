package defpackage;

/* loaded from: classes4.dex */
public final class d79 extends o2 {
    public xr1 a;
    public w2 b;
    public w2 c;
    public l2 w;

    public d79(xr1 xr1Var, dqf dqfVar, dqf dqfVar2, l2 l2Var) {
        this.a = xr1Var;
        this.b = dqfVar;
        this.c = dqfVar2;
        this.w = l2Var;
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
