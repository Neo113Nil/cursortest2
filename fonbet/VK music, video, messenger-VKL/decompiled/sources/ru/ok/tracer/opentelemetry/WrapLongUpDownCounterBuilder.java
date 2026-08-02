package ru.ok.tracer.opentelemetry;

import java.util.function.Consumer;
import xsna.d600;
import xsna.qq70;
import xsna.ril;
import xsna.rq70;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapLongUpDownCounterBuilder implements d600 {
    private final d600 d;

    public WrapLongUpDownCounterBuilder(d600 d600Var) {
        this.d = d600Var;
    }

    public /* bridge */ /* synthetic */ qq70 buildObserver() {
        return ril.h;
    }

    @Override // xsna.d600
    public rq70 buildWithCallback(Consumer<qq70> consumer) {
        return this.d.buildWithCallback(new WrapLongCallback(consumer));
    }

    @Override // xsna.d600
    public WrapLongUpDownCounter build() {
        return new WrapLongUpDownCounter(this.d.build());
    }

    @Override // xsna.d600
    public WrapDoubleUpDownCounterBuilder ofDoubles() {
        return new WrapDoubleUpDownCounterBuilder(this.d.ofDoubles());
    }

    @Override // xsna.d600
    public WrapLongUpDownCounterBuilder setDescription(String str) {
        this.d.setDescription(str);
        return this;
    }

    @Override // xsna.d600
    public WrapLongUpDownCounterBuilder setUnit(String str) {
        this.d.setUnit(str);
        return this;
    }
}
