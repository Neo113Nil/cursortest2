package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes8.dex */
public interface Na {
    C5108q4 a();

    void a(AppMetricaConfig appMetricaConfig, InterfaceC4830fb interfaceC4830fb);

    Handler b();

    C4795e2 c();

    C5268wb d();

    ICommonExecutor getDefaultExecutor();
}
