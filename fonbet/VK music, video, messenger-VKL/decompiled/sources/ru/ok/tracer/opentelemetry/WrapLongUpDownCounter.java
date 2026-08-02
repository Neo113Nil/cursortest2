package ru.ok.tracer.opentelemetry;

import xsna.c600;
import xsna.q94;
import xsna.wmj;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapLongUpDownCounter implements c600 {
    private final c600 d;

    public WrapLongUpDownCounter(c600 c600Var) {
        this.d = c600Var;
    }

    public void add(long j) {
        this.d.add(j, TracerOpenTelemetry.getBuiltinAttributes$tracer_opentelemetry_release$default(TracerOpenTelemetry.INSTANCE, null, 1, null));
    }

    @Override // xsna.c600
    public void add(long j, q94 q94Var) {
        this.d.add(j, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var));
    }

    @Override // xsna.c600
    public void add(long j, q94 q94Var, wmj wmjVar) {
        this.d.add(j, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var), wmjVar);
    }
}
