package defpackage;

import kotlin.collections.a;

/* loaded from: classes.dex */
public final class fis0 extends o2t0 {
    public Object b;
    public Object c;
    public iz40 d;
    public iz40 e;
    public ioq0 f;
    public final ate0 g = new ate0(15, this);
    public final h2t0 h;

    public fis0() {
        jid jidVar = new jid(7, this);
        q2t0.e(q2t0.a);
        synchronized (q2t0.c) {
            q2t0.h = a.o0(q2t0.h, jidVar);
        }
        this.h = new h2t0(jidVar);
    }

    @Override // defpackage.o2t0
    public final void a(ioq0 ioq0Var) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.o2t0
    public final void b() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    if (this.d == null) {
                        this.d = dmm0.a();
                    }
                    iz40 iz40Var = this.d;
                    this.d = this.e;
                    this.e = iz40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o2t0
    public final void c() {
        this.h.a();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    @Override // defpackage.o2t0
    public final tls d(ioq0 ioq0Var) {
        ioq0 ioq0Var2 = this.f;
        if (ioq0Var2 != null && !ioq0Var2.equals(ioq0Var)) {
            khe0.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = ioq0Var;
        return this.g;
    }
}
