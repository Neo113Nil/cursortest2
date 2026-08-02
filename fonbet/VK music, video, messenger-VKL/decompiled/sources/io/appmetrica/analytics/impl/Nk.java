package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;
import xsna.vu5;

/* loaded from: classes8.dex */
public final class Nk {
    public final C4927j5 a;
    public final C4814el b;
    public final Qk c;
    public long d;
    public long e;
    public AtomicLong f;
    public boolean g;
    public volatile C4763cl h;
    public long i;
    public long j;
    public final SystemTimeProvider k;

    public Nk(C4927j5 c4927j5, C4814el c4814el, Qk qk, SystemTimeProvider systemTimeProvider) {
        this.a = c4927j5;
        this.b = c4814el;
        this.c = qk;
        this.k = systemTimeProvider;
        a();
    }

    public final void a() {
        Qk qk = this.c;
        long elapsedRealtime = this.k.elapsedRealtime();
        Long l = qk.c;
        if (l != null) {
            elapsedRealtime = l.longValue();
        }
        this.e = elapsedRealtime;
        Long l2 = this.c.b;
        this.d = l2 == null ? -1L : l2.longValue();
        Long l3 = this.c.e;
        this.f = new AtomicLong(l3 == null ? 0L : l3.longValue());
        Boolean bool = this.c.f;
        this.g = bool == null ? true : bool.booleanValue();
        Long l4 = this.c.g;
        long longValue = l4 != null ? l4.longValue() : 0L;
        this.i = longValue;
        Qk qk2 = this.c;
        long j = longValue - this.e;
        Long l5 = qk2.h;
        if (l5 != null) {
            j = l5.longValue();
        }
        this.j = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{id=");
        sb.append(this.d);
        sb.append(", creationTime=");
        sb.append(this.e);
        sb.append(", currentReportId=");
        sb.append(this.f);
        sb.append(", sessionRequestParams=");
        sb.append(this.h);
        sb.append(", sleepStart=");
        return vu5.a('}', this.i, sb);
    }
}
