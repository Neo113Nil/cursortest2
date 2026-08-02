package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.al, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4711al {
    public final Ho a;

    public C4711al(Ho ho) {
        this.a = ho;
    }

    public final long a() {
        long optLong;
        Ho ho = this.a;
        synchronized (ho) {
            optLong = ho.a.a().optLong("session_id", -1L);
        }
        long j = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.a.b(j);
        return j;
    }
}
