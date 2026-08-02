package defpackage;

import androidx.compose.runtime.snapshots.a;

/* loaded from: classes10.dex */
public final class fn50 extends i2t0 {
    public final tls e;
    public final i2t0 f;

    public fn50(long j, a aVar, tls tlsVar, i2t0 i2t0Var) {
        super(j, aVar);
        this.e = tlsVar;
        this.f = i2t0Var;
        i2t0Var.k();
    }

    @Override // defpackage.i2t0
    public final void c() {
        i2t0 i2t0Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != i2t0Var.g()) {
            a();
        }
        i2t0Var.l();
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
        yz91.e();
        throw null;
    }

    @Override // defpackage.i2t0
    public final void l() {
        yz91.e();
        throw null;
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
        return new fn50(this.b, this.a, q2t0.k(tlsVar, this.e, true), this.f);
    }
}
