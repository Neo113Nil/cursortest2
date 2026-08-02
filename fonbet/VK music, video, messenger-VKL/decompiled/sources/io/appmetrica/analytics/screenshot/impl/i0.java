package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import xsna.vu5;

/* loaded from: classes8.dex */
public final class i0 {
    public final boolean a;
    public final List b;
    public final long c;

    public i0(boolean z, List list, long j) {
        this.a = z;
        this.b = list;
        this.c = j;
    }

    public final long a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final List c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideContentObserverCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.b);
        sb.append(", detectWindowSeconds=");
        return vu5.a(')', this.c, sb);
    }

    public i0(C5371p c5371p) {
        this(c5371p.b(), c5371p.c(), c5371p.a());
    }
}
