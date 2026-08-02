package ru.ok.tracer.opentelemetry;

import java.util.function.Consumer;
import xsna.lq70;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapDoubleCallback implements Consumer<lq70> {
    private final Consumer<lq70> d;

    public WrapDoubleCallback(Consumer<lq70> consumer) {
        this.d = consumer;
    }

    @Override // java.util.function.Consumer
    public void accept(lq70 lq70Var) {
        this.d.accept(new WrapDoubleMeasurement(lq70Var));
    }
}
