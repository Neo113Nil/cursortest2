package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.vu5;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5366k {
    public final boolean a;
    public final List b;
    public final long c;

    public C5366k(boolean z, List list, long j) {
        this.a = z;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5366k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C5366k c5366k = (C5366k) obj;
        return this.a == c5366k.a && epx.f(this.b, c5366k.b) && this.c == c5366k.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + fw3.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSideContentObserverCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.b);
        sb.append(", detectWindowSeconds=");
        return vu5.a(')', this.c, sb);
    }

    public C5366k(B b) {
        this(b.b(), b.c(), b.a());
    }
}
