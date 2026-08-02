package ru.ok.tracer.opentelemetry.record;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.MetricDataType;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c4q;
import xsna.em5;
import xsna.fm5;
import xsna.j5g;
import xsna.jk3;
import xsna.q94;
import xsna.qhk0;
import xsna.u6o;

/* compiled from: TracerOpenTelemetryRecorderProvider.kt */
/* loaded from: classes9.dex */
final class MutableDoubleSumData extends MutableSumData<u6o, Double> {
    public MutableDoubleSumData(boolean z, AggregationTemporality aggregationTemporality) {
        super(z, aggregationTemporality);
    }

    @Override // ru.ok.tracer.opentelemetry.record.MutableSumData
    public /* bridge */ /* synthetic */ u6o appendPointData(long j, u6o u6oVar, q94 q94Var, Double d, qhk0 qhk0Var) {
        return appendPointData(j, u6oVar, q94Var, d.doubleValue(), qhk0Var);
    }

    @Override // ru.ok.tracer.opentelemetry.record.MutableData
    public MetricDataType getType() {
        return MetricDataType.DOUBLE_SUM;
    }

    public u6o appendPointData(long j, u6o u6oVar, q94 q94Var, double d, qhk0 qhk0Var) {
        long g = u6oVar != null ? u6oVar.g() : j;
        List<? extends c4q> o = u6oVar != null ? u6oVar.o() : null;
        if (o == null) {
            o = EmptyList.b;
        }
        return new fm5(g, j, q94Var, d, j5g.u0(Collections.singletonList(new em5(jk3.e, j, qhk0Var, d)), o));
    }

    @Override // ru.ok.tracer.opentelemetry.record.MutableSumData
    public u6o createPointData(long j, u6o u6oVar) {
        return new fm5(j, j, u6oVar.getAttributes(), u6oVar.getValue(), EmptyList.b);
    }
}
