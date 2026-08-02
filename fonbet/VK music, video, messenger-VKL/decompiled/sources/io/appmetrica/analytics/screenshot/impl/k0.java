package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes8.dex */
public final class k0 {
    public final h0 a;
    public final l0 b;
    public final i0 c;

    public k0(h0 h0Var, l0 l0Var, i0 i0Var) {
        this.a = h0Var;
        this.b = l0Var;
        this.c = i0Var;
    }

    public final h0 a() {
        return this.a;
    }

    public final i0 b() {
        return this.c;
    }

    public final l0 c() {
        return this.b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(W w) {
        this(r2, r3, r5 != null ? new i0(r5) : null);
        C5360e a = w.a();
        h0 h0Var = a != null ? new h0(a) : null;
        a0 c = w.c();
        l0 l0Var = c != null ? new l0(c) : null;
        C5371p b = w.b();
    }
}
