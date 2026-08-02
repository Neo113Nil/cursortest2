package ru.ok.tracer.opentelemetry;

import java.util.function.Consumer;
import xsna.kq70;
import xsna.lq70;
import xsna.n6o;
import xsna.o6o;
import xsna.ril;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapDoubleGaugeBuilder implements o6o {
    private final o6o d;

    public WrapDoubleGaugeBuilder(o6o o6oVar) {
        this.d = o6oVar;
    }

    public /* bridge */ /* synthetic */ n6o build() {
        return ril.e.c;
    }

    public /* bridge */ /* synthetic */ lq70 buildObserver() {
        return ril.g;
    }

    @Override // xsna.o6o
    public kq70 buildWithCallback(Consumer<lq70> consumer) {
        return this.d.buildWithCallback(new WrapDoubleCallback(consumer));
    }

    @Override // xsna.o6o
    public WrapLongGaugeBuilder ofLongs() {
        return new WrapLongGaugeBuilder(this.d.ofLongs());
    }

    @Override // xsna.o6o
    public WrapDoubleGaugeBuilder setDescription(String str) {
        this.d.setDescription(str);
        return this;
    }

    @Override // xsna.o6o
    public WrapDoubleGaugeBuilder setUnit(String str) {
        this.d.setUnit(str);
        return this;
    }
}
