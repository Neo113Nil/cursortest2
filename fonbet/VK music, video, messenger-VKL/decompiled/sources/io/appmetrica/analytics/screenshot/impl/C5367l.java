package io.appmetrica.analytics.screenshot.impl;

import xsna.epx;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5367l {
    public final boolean a;
    public final C5368m b;

    public C5367l(boolean z, C5368m c5368m) {
        this.a = z;
        this.b = c5368m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5367l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C5367l c5367l = (C5367l) obj;
        return this.a == c5367l.a && epx.f(this.b, c5367l.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        C5368m c5368m = this.b;
        return hashCode + (c5368m != null ? c5368m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.a + ", config=" + this.b + ')';
    }
}
