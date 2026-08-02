package ru.ok.tracer.opentelemetry;

import java.util.function.Consumer;
import xsna.qq70;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapLongCallback implements Consumer<qq70> {
    private final Consumer<qq70> d;

    public WrapLongCallback(Consumer<qq70> consumer) {
        this.d = consumer;
    }

    @Override // java.util.function.Consumer
    public void accept(qq70 qq70Var) {
        this.d.accept(new WrapLongMeasurement(qq70Var));
    }
}
