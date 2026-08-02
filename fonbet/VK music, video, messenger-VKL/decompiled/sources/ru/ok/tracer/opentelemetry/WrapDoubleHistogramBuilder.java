package ru.ok.tracer.opentelemetry;

import java.util.List;
import xsna.q6o;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapDoubleHistogramBuilder implements q6o {
    private final q6o d;

    public WrapDoubleHistogramBuilder(q6o q6oVar) {
        this.d = q6oVar;
    }

    @Override // xsna.q6o
    public WrapDoubleHistogram build() {
        return new WrapDoubleHistogram(this.d.build());
    }

    @Override // xsna.q6o
    public WrapLongHistogramBuilder ofLongs() {
        return new WrapLongHistogramBuilder(this.d.ofLongs());
    }

    @Override // xsna.q6o
    public WrapDoubleHistogramBuilder setDescription(String str) {
        this.d.setDescription(str);
        return this;
    }

    @Override // xsna.q6o
    public WrapDoubleHistogramBuilder setUnit(String str) {
        this.d.setUnit(str);
        return this;
    }

    @Override // xsna.q6o
    public q6o setExplicitBucketBoundariesAdvice(List list) {
        return this;
    }
}
