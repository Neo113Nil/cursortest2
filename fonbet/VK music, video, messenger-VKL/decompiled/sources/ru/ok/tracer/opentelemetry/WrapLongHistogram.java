package ru.ok.tracer.opentelemetry;

import xsna.k300;
import xsna.q94;
import xsna.wmj;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
final class WrapLongHistogram implements k300 {
    private final k300 d;

    public WrapLongHistogram(k300 k300Var) {
        this.d = k300Var;
    }

    public void record(long j) {
        this.d.record(j, TracerOpenTelemetry.getBuiltinAttributes$tracer_opentelemetry_release$default(TracerOpenTelemetry.INSTANCE, null, 1, null));
    }

    @Override // xsna.k300
    public void record(long j, q94 q94Var) {
        this.d.record(j, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var));
    }

    @Override // xsna.k300
    public void record(long j, q94 q94Var, wmj wmjVar) {
        this.d.record(j, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var), wmjVar);
    }
}
