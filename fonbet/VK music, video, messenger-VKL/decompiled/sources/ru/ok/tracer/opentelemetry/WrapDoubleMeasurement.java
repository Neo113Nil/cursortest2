package ru.ok.tracer.opentelemetry;

import xsna.lq70;
import xsna.q94;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapDoubleMeasurement implements lq70 {
    private final lq70 d;

    public WrapDoubleMeasurement(lq70 lq70Var) {
        this.d = lq70Var;
    }

    public void record(double d) {
        this.d.record(d, TracerOpenTelemetry.getBuiltinAttributes$tracer_opentelemetry_release$default(TracerOpenTelemetry.INSTANCE, null, 1, null));
    }

    @Override // xsna.lq70
    public void record(double d, q94 q94Var) {
        this.d.record(d, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var));
    }
}
