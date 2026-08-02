package xsna;

/* compiled from: Scrollable.kt */
/* loaded from: classes11.dex */
public final class whh0 implements n160 {
    public final /* synthetic */ zhh0 a;

    public whh0(zhh0 zhh0Var) {
        this.a = zhh0Var;
    }

    @Override // xsna.n160
    public final long a(int i, long j) {
        zhh0 zhh0Var = this.a;
        zhh0Var.j = i;
        e490 e490Var = zhh0Var.b;
        return (e490Var == null || !(zhh0Var.a.c() || zhh0Var.a.e())) ? zhh0Var.c(zhh0Var.k, j, i) : e490Var.c(zhh0Var.j, j, zhh0Var.m);
    }

    @Override // xsna.n160
    public final long b(long j) {
        zhh0 zhh0Var = this.a;
        return zhh0Var.c(zhh0Var.k, j, 1);
    }
}
