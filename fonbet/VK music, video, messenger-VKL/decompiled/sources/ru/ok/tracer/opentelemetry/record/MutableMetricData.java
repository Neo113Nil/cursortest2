package ru.ok.tracer.opentelemetry.record;

import io.opentelemetry.sdk.metrics.data.MetricDataType;
import java.util.Collection;
import kotlin.NotImplementedError;
import ru.ok.tracer.opentelemetry.TracerOpenTelemetry;
import xsna.gag0;
import xsna.q8x;
import xsna.q94;
import xsna.qhk0;
import xsna.qm5;
import xsna.yk20;

/* compiled from: TracerOpenTelemetryRecorderProvider.kt */
/* loaded from: classes9.dex */
final class MutableMetricData {
    private final MutableData<?, ?> data;
    private final String description;
    private final q8x instrumentationScopeInfo;
    private final String name;
    private final gag0 resource;
    private final String unit;

    /* compiled from: TracerOpenTelemetryRecorderProvider.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MetricDataType.values().length];
            try {
                iArr[MetricDataType.DOUBLE_SUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetricDataType.LONG_SUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MutableMetricData(gag0 gag0Var, q8x q8xVar, String str, String str2, String str3, MutableData<?, ?> mutableData) {
        this.resource = gag0Var;
        this.instrumentationScopeInfo = q8xVar;
        this.name = str;
        this.description = str2;
        this.unit = str3;
        this.data = mutableData;
    }

    private final MetricDataType getType() {
        return this.data.getType();
    }

    public final void collectInto(long j, Collection<yk20> collection) {
        if (this.data.isEmpty()) {
            return;
        }
        collection.add(rotate(j));
    }

    public final void record(long j, Object obj, q94 q94Var, qhk0 qhk0Var) {
        this.data.record(j, obj, TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var), qhk0Var);
    }

    public final yk20 rotate(long j) {
        int i = WhenMappings.$EnumSwitchMapping$0[getType().ordinal()];
        if (i == 1) {
            return new qm5(this.resource, this.instrumentationScopeInfo, this.name, this.description, this.unit, MetricDataType.DOUBLE_SUM, ((MutableSumData) this.data).rotate(j));
        }
        if (i != 2) {
            throw new NotImplementedError();
        }
        return new qm5(this.resource, this.instrumentationScopeInfo, this.name, this.description, this.unit, MetricDataType.LONG_SUM, ((MutableSumData) this.data).rotate(j));
    }
}
