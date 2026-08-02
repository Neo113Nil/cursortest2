package ru.ok.tracer.opentelemetry.record;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.MetricDataType;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c4q;
import xsna.j5g;
import xsna.jk3;
import xsna.om5;
import xsna.pm5;
import xsna.q94;
import xsna.qhk0;
import xsna.v300;

/* compiled from: TracerOpenTelemetryRecorderProvider.kt */
/* loaded from: classes9.dex */
final class MutableLongSumData extends MutableSumData<v300, Long> {
    public MutableLongSumData(boolean z, AggregationTemporality aggregationTemporality) {
        super(z, aggregationTemporality);
    }

    @Override // ru.ok.tracer.opentelemetry.record.MutableSumData
    public /* bridge */ /* synthetic */ v300 appendPointData(long j, v300 v300Var, q94 q94Var, Long l, qhk0 qhk0Var) {
        return appendPointData(j, v300Var, q94Var, l.longValue(), qhk0Var);
    }

    @Override // ru.ok.tracer.opentelemetry.record.MutableData
    public MetricDataType getType() {
        return MetricDataType.LONG_SUM;
    }

    public v300 appendPointData(long j, v300 v300Var, q94 q94Var, long j2, qhk0 qhk0Var) {
        long g = v300Var != null ? v300Var.g() : j;
        List<? extends c4q> o = v300Var != null ? v300Var.o() : null;
        if (o == null) {
            o = EmptyList.b;
        }
        return new pm5(g, j, q94Var, j2, j5g.u0(Collections.singletonList(new om5(jk3.e, j, qhk0Var, j2)), o));
    }

    @Override // ru.ok.tracer.opentelemetry.record.MutableSumData
    public v300 createPointData(long j, v300 v300Var) {
        return new pm5(j, j, v300Var.getAttributes(), v300Var.getValue(), EmptyList.b);
    }
}
