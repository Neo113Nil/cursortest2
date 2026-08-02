package ru.ok.tracer.opentelemetry.record;

import io.opentelemetry.sdk.metrics.data.MetricDataType;
import xsna.jlb0;
import xsna.q94;
import xsna.qhk0;
import xsna.qtk;

/* compiled from: TracerOpenTelemetryRecorderProvider.kt */
/* loaded from: classes9.dex */
abstract class MutableData<PT extends jlb0, T> {
    public abstract MetricDataType getType();

    public abstract boolean isEmpty();

    public abstract void record(long j, T t, q94 q94Var, qhk0 qhk0Var);

    public abstract qtk<?> rotate(long j);
}
