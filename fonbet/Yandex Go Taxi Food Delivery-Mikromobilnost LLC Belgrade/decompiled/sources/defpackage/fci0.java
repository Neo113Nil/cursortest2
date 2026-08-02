package defpackage;

import androidx.compose.runtime.snapshots.a;

/* loaded from: classes.dex */
public final class fci0 extends i2t0 {
    public final tls e;
    public int f;

    public fci0(long j, a aVar, tls tlsVar) {
        super(j, aVar);
        this.e = tlsVar;
        this.f = 1;
    }

    @Override // defpackage.i2t0
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        this.c = true;
        synchronized (q2t0.c) {
            o();
        }
    }

    @Override // defpackage.i2t0
    public final tls e() {
        return this.e;
    }

    @Override // defpackage.i2t0
    public final boolean f() {
        return true;
    }

    @Override // defpackage.i2t0
    public final tls i() {
        return null;
    }

    @Override // defpackage.i2t0
    public final void k() {
        this.f++;
    }

    @Override // defpackage.i2t0
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.i2t0
    public final void m() {
    }

    @Override // defpackage.i2t0
    public final void n(g5u0 g5u0Var) {
        q2m0 q2m0Var = q2t0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.i2t0
    public final i2t0 u(tls tlsVar) {
        q2t0.c(this);
        return new fn50(this.b, this.a, q2t0.k(tlsVar, this.e, true), this);
    }
}
