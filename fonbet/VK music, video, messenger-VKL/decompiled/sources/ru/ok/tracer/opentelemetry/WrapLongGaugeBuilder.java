package ru.ok.tracer.opentelemetry;

import java.util.function.Consumer;
import xsna.i300;
import xsna.j300;
import xsna.pq70;
import xsna.qq70;
import xsna.ril;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapLongGaugeBuilder implements j300 {
    private final j300 d;

    public WrapLongGaugeBuilder(j300 j300Var) {
        this.d = j300Var;
    }

    public /* bridge */ /* synthetic */ i300 build() {
        return ril.m.b;
    }

    public /* bridge */ /* synthetic */ qq70 buildObserver() {
        return ril.h;
    }

    @Override // xsna.j300
    public pq70 buildWithCallback(Consumer<qq70> consumer) {
        return this.d.buildWithCallback(new WrapLongCallback(consumer));
    }

    @Override // xsna.j300
    public WrapLongGaugeBuilder setDescription(String str) {
        this.d.setDescription(str);
        return this;
    }

    @Override // xsna.j300
    public WrapLongGaugeBuilder setUnit(String str) {
        this.d.setUnit(str);
        return this;
    }
}
