package ru.ok.tracer.opentelemetry;

import xsna.q94;
import xsna.qq70;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapLongMeasurement implements qq70 {
    private final qq70 d;

    public WrapLongMeasurement(qq70 qq70Var) {
        this.d = qq70Var;
    }

    public void record(long j) {
        this.d.record(j, TracerOpenTelemetry.getBuiltinAttributes$tracer_opentelemetry_release$default(TracerOpenTelemetry.INSTANCE, null, 1, null));
    }

    @Override // xsna.qq70
    public void record(long j, q94 q94Var) {
        this.d.record(j, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var));
    }
}
