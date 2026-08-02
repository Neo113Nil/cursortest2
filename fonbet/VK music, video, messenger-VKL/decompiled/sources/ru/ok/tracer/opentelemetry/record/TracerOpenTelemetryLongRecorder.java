package ru.ok.tracer.opentelemetry.record;

import xsna.cvf;
import xsna.gcd0;
import xsna.izs;
import xsna.q94;
import xsna.qhk0;
import xsna.s3q0;

/* compiled from: TracerOpenTelemetryRecorderProvider.kt */
/* loaded from: classes9.dex */
final class TracerOpenTelemetryLongRecorder implements LongRecorder {
    private final izs<MutableMetricData, s3q0> callback;
    private final cvf clock;
    private final MutableMetricData metric;

    /* JADX WARN: Multi-variable type inference failed */
    public TracerOpenTelemetryLongRecorder(cvf cvfVar, MutableMetricData mutableMetricData, izs<? super MutableMetricData, s3q0> izsVar) {
        this.clock = cvfVar;
        this.metric = mutableMetricData;
        this.callback = izsVar;
    }

    @Override // ru.ok.tracer.opentelemetry.record.LongRecorder
    public void record(long j, q94 q94Var, qhk0 qhk0Var) {
        this.metric.record(((gcd0) this.clock).r(true), Long.valueOf(j), q94Var, qhk0Var);
        this.callback.invoke(this.metric);
    }
}
