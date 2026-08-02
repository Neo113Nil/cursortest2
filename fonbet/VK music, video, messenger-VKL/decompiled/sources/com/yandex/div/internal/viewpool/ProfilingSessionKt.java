package com.yandex.div.internal.viewpool;

/* compiled from: ProfilingSession.kt */
/* loaded from: classes7.dex */
public final class ProfilingSessionKt {
    private static final long floorTo(long j, long j2) {
        return (j / j2) * j2;
    }

    public static final long roundRoughly(long j) {
        if (j < 0) {
            return 0L;
        }
        if (j < 100) {
            return floorTo(j, 20L);
        }
        if (j < 1000) {
            return floorTo(j, 100L);
        }
        if (j < 2000) {
            return floorTo(j, 200L);
        }
        if (j < 5000) {
            return floorTo(j, 500L);
        }
        if (j < 10000) {
            return floorTo(j, 1000L);
        }
        if (j < 20000) {
            return floorTo(j, 2000L);
        }
        if (j < 50000) {
            return floorTo(j, 5000L);
        }
        return 50000L;
    }
}
