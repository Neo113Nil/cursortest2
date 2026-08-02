package defpackage;

/* loaded from: classes8.dex */
public final class p1m0 implements yl {
    public final wnt a;
    public final cne0 b;

    public p1m0(wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = dne0Var.a("saved_payment_before_debt");
    }

    @Override // defpackage.yl
    public final void a(long j, long j2) {
        this.b.w("payment");
    }

    @Override // defpackage.yl
    public final void b() {
        this.b.w("payment");
    }
}
