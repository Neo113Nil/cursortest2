package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import xsna.rl3;
import xsna.vu5;

/* renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5371p {
    public final boolean a;
    public final List b;
    public final long c;

    public C5371p(boolean z, List list, long j) {
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
        StringBuilder sb = new StringBuilder("ContentObserverCaptorConfig(enabled=");
        sb.append(this.a);
        sb.append(", mediaStoreColumnNames='");
        sb.append(this.b);
        sb.append("', detectWindowSeconds=");
        return vu5.a(')', this.c, sb);
    }

    public C5371p() {
        this(new O().a, rl3.u0(new O().c), new O().b);
    }
}
