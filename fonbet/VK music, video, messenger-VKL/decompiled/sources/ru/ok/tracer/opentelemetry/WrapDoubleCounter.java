package ru.ok.tracer.opentelemetry;

import xsna.h6o;
import xsna.q94;
import xsna.wmj;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapDoubleCounter implements h6o {
    private final h6o d;

    public WrapDoubleCounter(h6o h6oVar) {
        this.d = h6oVar;
    }

    public void add(double d) {
        this.d.add(d, TracerOpenTelemetry.getBuiltinAttributes$tracer_opentelemetry_release$default(TracerOpenTelemetry.INSTANCE, null, 1, null));
    }

    @Override // xsna.h6o
    public void add(double d, q94 q94Var) {
        this.d.add(d, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var));
    }

    @Override // xsna.h6o
    public void add(double d, q94 q94Var, wmj wmjVar) {
        this.d.add(d, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var), wmjVar);
    }
}
