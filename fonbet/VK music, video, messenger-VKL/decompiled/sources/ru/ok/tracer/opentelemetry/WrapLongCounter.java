package ru.ok.tracer.opentelemetry;

import xsna.e300;
import xsna.q94;
import xsna.wmj;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapLongCounter implements e300 {
    private final e300 d;

    public WrapLongCounter(e300 e300Var) {
        this.d = e300Var;
    }

    public void add(long j) {
        this.d.add(j, TracerOpenTelemetry.getBuiltinAttributes$tracer_opentelemetry_release$default(TracerOpenTelemetry.INSTANCE, null, 1, null));
    }

    @Override // xsna.e300
    public void add(long j, q94 q94Var) {
        this.d.add(j, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var));
    }

    @Override // xsna.e300
    public void add(long j, q94 q94Var, wmj wmjVar) {
        this.d.add(j, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var), wmjVar);
    }
}
