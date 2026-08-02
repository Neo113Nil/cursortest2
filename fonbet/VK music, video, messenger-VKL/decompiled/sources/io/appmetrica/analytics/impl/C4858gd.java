package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4858gd implements ModuleEventServiceHandlerReporter {
    public final boolean a;
    public final C5266w9 b;
    public final C4722b6 c;

    public C4858gd(boolean z, C5266w9 c5266w9, C4722b6 c4722b6) {
        this.a = z;
        this.b = c5266w9;
        this.c = c4722b6;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        C4722b6 d = C4722b6.d(this.c);
        d.d = counterReportApi.getType();
        d.e = counterReportApi.getCustomType();
        d.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            d.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            d.setValueBytes(valueBytes);
        }
        d.g = counterReportApi.getBytesTruncated();
        C5266w9 c5266w9 = this.b;
        c5266w9.a(d, C4737bl.a(c5266w9.c.b(d), d.i));
    }
}
