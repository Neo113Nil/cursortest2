package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public class n2 extends h1 {
    public Long c;
    public Long d;

    public n2(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
    }

    public final long c() {
        long nanoTime = System.nanoTime();
        Long l = this.d;
        long longValue = l != null ? l.longValue() : nanoTime;
        Long l2 = this.c;
        if (l2 != null) {
            nanoTime = l2.longValue();
        }
        return (longValue - nanoTime) / 1000000;
    }

    public void d() {
        this.d = Long.valueOf(System.nanoTime());
    }

    public void e() {
        this.c = Long.valueOf(System.nanoTime());
    }
}
