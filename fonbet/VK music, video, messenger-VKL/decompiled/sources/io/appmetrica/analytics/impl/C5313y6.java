package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.y6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5313y6 {
    public final Gi a;
    public final Ph b;

    public C5313y6(Lf lf, P8 p8, Gi gi, AppMetricaConfig appMetricaConfig) {
        this.a = gi;
        this.b = new Ph(lf, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), p8, appMetricaConfig.userProfileID);
    }

    public final Ph a() {
        return this.b;
    }
}
