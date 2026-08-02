package xsna;

/* compiled from: VideoTransfigurableProducerListener.kt */
/* loaded from: classes3.dex */
public abstract class xmt0 implements r6t0 {
    public final gyi a;
    public final izs<l8l, s3q0> b;
    public boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public xmt0(gyi gyiVar, izs<? super l8l, s3q0> izsVar) {
        this.a = gyiVar;
        this.b = izsVar;
    }

    @Override // xsna.r6t0
    public final void b(kes0 kes0Var, long j) {
        this.a.d(kes0Var, j);
    }

    @Override // xsna.r6t0
    public final void c(int i, long j, kes0 kes0Var) {
        this.a.a(i, j, kes0Var);
    }

    @Override // xsna.r6t0
    public final void d(l8l l8lVar) {
        this.a.e(l8lVar);
        if (this.c) {
            return;
        }
        this.b.invoke(l8lVar);
        this.c = true;
    }
}
