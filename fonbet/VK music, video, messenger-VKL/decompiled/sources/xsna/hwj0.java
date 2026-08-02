package xsna;

/* compiled from: SnapshotFlow.kt */
/* loaded from: classes11.dex */
public final class hwj0 extends jak0 {
    public Object b;
    public Object c;
    public qh50<Object> d;
    public qh50<Object> e;
    public ohi0<? super s3q0> f;
    public final ape0 g = new ape0(this, 7);
    public final cak0 h;

    public hwj0() {
        y5 y5Var = new y5(this, 10);
        qak0.e(qak0.a);
        synchronized (qak0.c) {
            qak0.h = j5g.v0(y5Var, qak0.h);
            s3q0 s3q0Var = s3q0.a;
        }
        this.h = new cak0(y5Var);
    }

    @Override // xsna.jak0
    public final void a(ohi0<? super s3q0> ohi0Var) {
        this.c = null;
        this.e = null;
    }

    @Override // xsna.jak0
    public final void b() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    if (this.d == null) {
                        this.d = k5h0.a();
                    }
                    qh50<Object> qh50Var = this.d;
                    this.d = this.e;
                    this.e = qh50Var;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.jak0
    public final void c() {
        this.h.dispose();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.jak0
    public final izs<Object, s3q0> d(ohi0<? super s3q0> ohi0Var) {
        ohi0<? super s3q0> ohi0Var2 = this.f;
        if (ohi0Var2 != null && !ohi0Var2.equals(ohi0Var)) {
            gxc0.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = ohi0Var;
        return this.g;
    }

    @Override // xsna.jak0
    public final void e(qta qtaVar) {
        this.f = null;
        this.c = null;
        this.e = null;
        b();
    }
}
