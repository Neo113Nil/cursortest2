package ru.ok.tracer.opentelemetry;

import xsna.p6o;
import xsna.q94;
import xsna.wmj;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapDoubleHistogram implements p6o {
    private final p6o d;

    public WrapDoubleHistogram(p6o p6oVar) {
        this.d = p6oVar;
    }

    public void record(double d) {
        this.d.record(d, TracerOpenTelemetry.getBuiltinAttributes$tracer_opentelemetry_release$default(TracerOpenTelemetry.INSTANCE, null, 1, null));
    }

    @Override // xsna.p6o
    public void record(double d, q94 q94Var) {
        this.d.record(d, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var));
    }

    @Override // xsna.p6o
    public void record(double d, q94 q94Var, wmj wmjVar) {
        this.d.record(d, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var), wmjVar);
    }
}
