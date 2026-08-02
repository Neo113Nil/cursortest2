package defpackage;

/* loaded from: classes4.dex */
public final class nt10 extends o2 {
    public xr1 a;
    public byte[] b;

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(new dqf(this.b));
        return new jqf(c2Var);
    }
}
