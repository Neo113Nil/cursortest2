package io.appmetrica.analytics.screenshot.impl;

import xsna.epx;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5368m {
    public final C5365j a;
    public final C5369n b;
    public final C5366k c;

    public C5368m(C5365j c5365j, C5369n c5369n, C5366k c5366k) {
        this.a = c5365j;
        this.b = c5369n;
        this.c = c5366k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5368m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C5368m c5368m = (C5368m) obj;
        return epx.f(this.a, c5368m.a) && epx.f(this.b, c5368m.b) && epx.f(this.c, c5368m.c);
    }

    public final int hashCode() {
        C5365j c5365j = this.a;
        int hashCode = (c5365j != null ? c5365j.hashCode() : 0) * 31;
        C5369n c5369n = this.b;
        int hashCode2 = (hashCode + (c5369n != null ? c5369n.hashCode() : 0)) * 31;
        C5366k c5366k = this.c;
        return hashCode2 + (c5366k != null ? c5366k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5368m(F f) {
        this(r2, r3, r5 != null ? new C5366k(r5) : null);
        C5380z a = f.a();
        C5365j c5365j = a != null ? new C5365j(a) : null;
        H c = f.c();
        C5369n c5369n = c != null ? new C5369n(c) : null;
        B b = f.b();
    }
}
