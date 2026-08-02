package com.yandex.pulse.metrics;

import defpackage.nlu;
import defpackage.vku;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public /* synthetic */ class MetricsService$initializeAndStartService$2 extends FunctionReferenceImpl implements wls {
    public MetricsService$initializeAndStartService$2(MetricsService metricsService) {
        super(2, metricsService, MetricsService.class, "recordDeltaWithLogging", "recordDeltaWithLogging(Lcom/yandex/pulse/histogram/HistogramBase;Lcom/yandex/pulse/histogram/HistogramSamples;)V", 0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((MetricsService) this.receiver).recordDeltaWithLogging((vku) obj, (nlu) obj2);
        return zy11.a;
    }
}
