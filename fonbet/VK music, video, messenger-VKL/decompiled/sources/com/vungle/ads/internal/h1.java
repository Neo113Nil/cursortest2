package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public abstract class h1 {
    public Sdk.SDKMetric.SDKMetricType a;
    public String b;

    public h1(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        this.a = sDKMetricType;
    }

    public final void a(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        this.a = sDKMetricType;
    }

    public final Sdk.SDKMetric.SDKMetricType b() {
        return this.a;
    }

    public final String a() {
        return this.b;
    }

    public final void a(String str) {
        this.b = str;
    }
}
