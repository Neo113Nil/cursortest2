package defpackage;

/* loaded from: classes4.dex */
public final class lr60 extends o2 {
    public bvj0 a;
    public g2 b;

    public lr60(bvj0 bvj0Var, g2 g2Var) {
        this.a = bvj0Var;
        this.b = g2Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }
}
