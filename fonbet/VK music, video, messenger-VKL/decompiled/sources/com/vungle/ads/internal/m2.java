package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public class m2 extends h1 {
    public Long c;

    public m2(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final long c() {
        Long l = this.c;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
