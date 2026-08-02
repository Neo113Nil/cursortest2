package ru.ok.tracer.opentelemetry;

import java.util.function.Consumer;
import xsna.i6o;
import xsna.jq70;
import xsna.lq70;
import xsna.ril;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapDoubleCounterBuilder implements i6o {
    private final i6o d;

    public WrapDoubleCounterBuilder(i6o i6oVar) {
        this.d = i6oVar;
    }

    public /* bridge */ /* synthetic */ lq70 buildObserver() {
        return ril.g;
    }

    @Override // xsna.i6o
    public jq70 buildWithCallback(Consumer<lq70> consumer) {
        return this.d.buildWithCallback(new WrapDoubleCallback(consumer));
    }

    @Override // xsna.i6o
    public WrapDoubleCounter build() {
        return new WrapDoubleCounter(this.d.build());
    }

    @Override // xsna.i6o
    public WrapDoubleCounterBuilder setDescription(String str) {
        this.d.setDescription(str);
        return this;
    }

    @Override // xsna.i6o
    public WrapDoubleCounterBuilder setUnit(String str) {
        this.d.setUnit(str);
        return this;
    }
}
