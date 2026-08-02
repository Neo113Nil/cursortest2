package xsna;

/* compiled from: SnapshotStateList.kt */
/* loaded from: classes11.dex */
public final class euk0<T> extends puk0 {
    public c0a0<? extends T> c;
    public int d;
    public int e;

    public euk0(long j, c0a0<? extends T> c0a0Var) {
        super(j);
        this.c = c0a0Var;
    }

    @Override // xsna.puk0
    public final void a(puk0 puk0Var) {
        synchronized (m200.i) {
            this.c = ((euk0) puk0Var).c;
            this.d = ((euk0) puk0Var).d;
            this.e = ((euk0) puk0Var).e;
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.puk0
    public final puk0 b() {
        return c(qak0.j().g());
    }

    @Override // xsna.puk0
    public final puk0 c(long j) {
        return new euk0(j, this.c);
    }
}
