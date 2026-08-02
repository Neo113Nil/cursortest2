package io.appmetrica.analytics.modulesapi.internal.service.event;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;

/* loaded from: classes8.dex */
public interface ModuleEventServiceHandlerReporter {
    boolean isMain();

    void report(CounterReportApi counterReportApi);
}
