package xsna;

/* compiled from: SharedFlow.kt */
/* loaded from: classes11.dex */
public final class gaj0 extends vh<caj0<?>> {
    public long a = -1;
    public lq9 b;

    @Override // xsna.vh
    public final boolean a(th thVar) {
        caj0 caj0Var = (caj0) thVar;
        if (this.a >= 0) {
            return false;
        }
        long j = caj0Var.j;
        if (j < caj0Var.k) {
            caj0Var.k = j;
        }
        this.a = j;
        return true;
    }

    @Override // xsna.vh
    public final spj[] b(th thVar) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((caj0) thVar).u(j);
    }
}
