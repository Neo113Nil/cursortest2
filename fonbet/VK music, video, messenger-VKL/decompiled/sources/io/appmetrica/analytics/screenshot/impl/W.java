package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes8.dex */
public final class W {
    public final C5360e a;
    public final a0 b;
    public final C5371p c;

    public W(C5360e c5360e, a0 a0Var, C5371p c5371p) {
        this.a = c5360e;
        this.b = a0Var;
        this.c = c5371p;
    }

    public final C5360e a() {
        return this.a;
    }

    public final C5371p b() {
        return this.c;
    }

    public final a0 c() {
        return this.b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    public W() {
        this(new C5360e(), new a0(), new C5371p());
    }
}
