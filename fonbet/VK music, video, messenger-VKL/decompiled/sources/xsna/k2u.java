package xsna;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class k2u extends uh50 {

    /* compiled from: Snapshot.kt */
    /* loaded from: classes11.dex */
    public static final class a implements izs<kak0, uh50> {
        public final /* synthetic */ izs<Object, s3q0> b;
        public final /* synthetic */ izs<Object, s3q0> c;

        public a(izs<Object, s3q0> izsVar, izs<Object, s3q0> izsVar2) {
            this.b = izsVar;
            this.c = izsVar2;
        }

        @Override // xsna.izs
        public final uh50 invoke(kak0 kak0Var) {
            long j;
            kak0 kak0Var2 = kak0Var;
            synchronized (qak0.c) {
                j = qak0.e;
                qak0.e = 1 + j;
            }
            return new uh50(j, kak0Var2, this.b, this.c);
        }
    }

    /* compiled from: Snapshot.kt */
    /* loaded from: classes11.dex */
    public static final class b implements izs<kak0, a8f0> {
        public final /* synthetic */ izs<Object, s3q0> b;

        public b(izs<Object, s3q0> izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.izs
        public final a8f0 invoke(kak0 kak0Var) {
            long j;
            kak0 kak0Var2 = kak0Var;
            synchronized (qak0.c) {
                j = qak0.e;
                qak0.e = 1 + j;
            }
            return new a8f0(j, kak0Var2, this.b);
        }
    }

    @Override // xsna.uh50
    public final uh50 C(izs<Object, s3q0> izsVar, izs<Object, s3q0> izsVar2) {
        return (uh50) ((dak0) qak0.e(new opd(new a(izsVar, izsVar2), 5)));
    }

    @Override // xsna.uh50, xsna.dak0
    public final void c() {
        synchronized (qak0.c) {
            o();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.uh50, xsna.dak0
    public final void k() {
        bis.p();
        throw null;
    }

    @Override // xsna.uh50, xsna.dak0
    public final void l() {
        bis.p();
        throw null;
    }

    @Override // xsna.uh50, xsna.dak0
    public final void m() {
        qak0.a();
    }

    @Override // xsna.uh50, xsna.dak0
    public final dak0 u(izs<Object, s3q0> izsVar) {
        return (a8f0) ((dak0) qak0.e(new opd(new b(izsVar), 5)));
    }

    @Override // xsna.uh50
    public final eak0 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
