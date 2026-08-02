package ru.ok.tracer.opentelemetry;

import java.util.function.Consumer;
import xsna.l7o;
import xsna.lq70;
import xsna.mq70;
import xsna.ril;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapDoubleUpDownCounterBuilder implements l7o {
    private final l7o d;

    public WrapDoubleUpDownCounterBuilder(l7o l7oVar) {
        this.d = l7oVar;
    }

    public /* bridge */ /* synthetic */ lq70 buildObserver() {
        return ril.g;
    }

    @Override // xsna.l7o
    public mq70 buildWithCallback(Consumer<lq70> consumer) {
        return this.d.buildWithCallback(new WrapDoubleCallback(consumer));
    }

    @Override // xsna.l7o
    public WrapDoubleUpDownCounter build() {
        return new WrapDoubleUpDownCounter(this.d.build());
    }

    @Override // xsna.l7o
    public WrapDoubleUpDownCounterBuilder setDescription(String str) {
        this.d.setDescription(str);
        return this;
    }

    @Override // xsna.l7o
    public WrapDoubleUpDownCounterBuilder setUnit(String str) {
        this.d.setUnit(str);
        return this;
    }
}
