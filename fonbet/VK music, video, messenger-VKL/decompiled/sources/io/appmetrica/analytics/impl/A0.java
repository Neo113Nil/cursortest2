package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes8.dex */
public final class A0 implements Ic {
    public final /* synthetic */ C0 a;
    public final /* synthetic */ AppMetricaConfig b;
    public final /* synthetic */ PublicLogger c;

    public A0(C0 c0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.a = c0;
        this.b = appMetricaConfig;
        this.c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final C5193tc a() {
        C0 c0 = this.a;
        C5199ti c5199ti = c0.g;
        AppMetricaConfig appMetricaConfig = this.b;
        PublicLogger publicLogger = this.c;
        P7 p7 = c0.i;
        return c5199ti.a(appMetricaConfig, publicLogger, new C4974l0(p7.j, p7.h));
    }
}
