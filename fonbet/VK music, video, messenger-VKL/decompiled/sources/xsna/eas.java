package xsna;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout.kt */
/* loaded from: classes8.dex */
public final class eas extends mxo0 {
    public mxo0 e;

    public eas(mxo0 mxo0Var) {
        this.e = mxo0Var;
    }

    @Override // xsna.mxo0
    public final mxo0 a() {
        return this.e.a();
    }

    @Override // xsna.mxo0
    public final mxo0 b() {
        return this.e.b();
    }

    @Override // xsna.mxo0
    public final long c() {
        return this.e.c();
    }

    @Override // xsna.mxo0
    public final mxo0 d(long j) {
        return this.e.d(j);
    }

    @Override // xsna.mxo0
    public final boolean e() {
        return this.e.e();
    }

    @Override // xsna.mxo0
    public final void f() throws IOException {
        this.e.f();
    }

    @Override // xsna.mxo0
    public final mxo0 g(long j, TimeUnit timeUnit) {
        return this.e.g(j, timeUnit);
    }

    @Override // xsna.mxo0
    public final long h() {
        return this.e.h();
    }
}
