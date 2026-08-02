package ru.ok.tracer.opentelemetry;

import java.util.List;
import xsna.l300;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapLongHistogramBuilder implements l300 {
    private final l300 d;

    public WrapLongHistogramBuilder(l300 l300Var) {
        this.d = l300Var;
    }

    @Override // xsna.l300
    public WrapLongHistogram build() {
        return new WrapLongHistogram(this.d.build());
    }

    @Override // xsna.l300
    public WrapLongHistogramBuilder setDescription(String str) {
        this.d.setDescription(str);
        return this;
    }

    @Override // xsna.l300
    public WrapLongHistogramBuilder setUnit(String str) {
        this.d.setUnit(str);
        return this;
    }

    public l300 setExplicitBucketBoundariesAdvice(List list) {
        return this;
    }
}
