package ru.ok.tracer.opentelemetry;

import xsna.aj20;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapMeterBuilder implements aj20 {
    private final aj20 d;

    public WrapMeterBuilder(aj20 aj20Var) {
        this.d = aj20Var;
    }

    @Override // xsna.aj20
    public WrapMeter build() {
        return new WrapMeter(this.d.build());
    }

    @Override // xsna.aj20
    public WrapMeterBuilder setInstrumentationVersion(String str) {
        this.d.setInstrumentationVersion(str);
        return this;
    }

    @Override // xsna.aj20
    public WrapMeterBuilder setSchemaUrl(String str) {
        this.d.setSchemaUrl(str);
        return this;
    }
}
