package defpackage;

/* loaded from: classes7.dex */
public final class j481 implements a871 {
    public final /* synthetic */ a871 a;
    public final /* synthetic */ qgg b;

    public j481(qgg qggVar, a871 a871Var) {
        this.b = qggVar;
        this.a = a871Var;
    }

    @Override // defpackage.a871
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.a871
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.a871
    public final v171 d(long j) {
        v171 d = this.a.d(j);
        oe71 oe71Var = d.a;
        long j2 = oe71Var.a;
        long j3 = oe71Var.b;
        long j4 = this.b.b;
        oe71 oe71Var2 = new oe71(j2, j3 + j4);
        oe71 oe71Var3 = d.b;
        return new v171(oe71Var2, new oe71(oe71Var3.a, oe71Var3.b + j4));
    }
}
