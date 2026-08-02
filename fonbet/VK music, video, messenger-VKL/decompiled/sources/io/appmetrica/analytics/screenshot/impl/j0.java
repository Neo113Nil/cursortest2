package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes8.dex */
public final class j0 {
    public final boolean a;
    public final k0 b;

    public j0(boolean z, k0 k0Var) {
        this.a = z;
        this.b = k0Var;
    }

    public final k0 a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.a + ", config=" + this.b + ')';
    }

    public j0() {
        this(new J());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(J j) {
        this(r0, r3 != null ? new k0(r3) : null);
        boolean b = j.b();
        W a = j.a();
    }
}
