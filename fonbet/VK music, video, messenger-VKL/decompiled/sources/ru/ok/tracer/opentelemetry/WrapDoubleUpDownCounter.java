package ru.ok.tracer.opentelemetry;

import xsna.k7o;
import xsna.q94;
import xsna.wmj;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapDoubleUpDownCounter implements k7o {
    private final k7o d;

    public WrapDoubleUpDownCounter(k7o k7oVar) {
        this.d = k7oVar;
    }

    public void add(double d) {
        this.d.add(d, TracerOpenTelemetry.getBuiltinAttributes$tracer_opentelemetry_release$default(TracerOpenTelemetry.INSTANCE, null, 1, null));
    }

    @Override // xsna.k7o
    public void add(double d, q94 q94Var) {
        this.d.add(d, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var));
    }

    @Override // xsna.k7o
    public void add(double d, q94 q94Var, wmj wmjVar) {
        this.d.add(d, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var), wmjVar);
    }
}
