package ru.ok.tracer.opentelemetry;

import java.util.function.Consumer;
import xsna.f300;
import xsna.oq70;
import xsna.qq70;
import xsna.ril;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapLongCounterBuilder implements f300 {
    private final f300 d;

    public WrapLongCounterBuilder(f300 f300Var) {
        this.d = f300Var;
    }

    public /* bridge */ /* synthetic */ qq70 buildObserver() {
        return ril.h;
    }

    @Override // xsna.f300
    public oq70 buildWithCallback(Consumer<qq70> consumer) {
        return this.d.buildWithCallback(new WrapLongCallback(consumer));
    }

    @Override // xsna.f300
    public WrapLongCounter build() {
        return new WrapLongCounter(this.d.build());
    }

    @Override // xsna.f300
    public WrapDoubleCounterBuilder ofDoubles() {
        return new WrapDoubleCounterBuilder(this.d.ofDoubles());
    }

    @Override // xsna.f300
    public WrapLongCounterBuilder setDescription(String str) {
        this.d.setDescription(str);
        return this;
    }

    @Override // xsna.f300
    public WrapLongCounterBuilder setUnit(String str) {
        this.d.setUnit(str);
        return this;
    }
}
