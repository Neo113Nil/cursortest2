package defpackage;

/* loaded from: classes.dex */
public final class akt extends mz40 {
    @Override // defpackage.mz40
    public final mz40 C(tls tlsVar, tls tlsVar2) {
        return (mz40) ((i2t0) q2t0.e(new he7(2, new vg7(2, tlsVar, tlsVar2))));
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final void c() {
        synchronized (q2t0.c) {
            o();
        }
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final void k() {
        yz91.e();
        throw null;
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final void l() {
        yz91.e();
        throw null;
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final void m() {
        q2t0.a();
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final i2t0 u(tls tlsVar) {
        return (fci0) ((i2t0) q2t0.e(new he7(2, new dq0(5, tlsVar))));
    }

    @Override // defpackage.mz40
    public final qke w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
