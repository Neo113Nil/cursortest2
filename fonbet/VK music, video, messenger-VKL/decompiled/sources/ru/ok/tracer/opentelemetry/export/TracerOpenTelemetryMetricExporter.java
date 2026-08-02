package ru.ok.tracer.opentelemetry.export;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.Collection;
import java.util.Objects;
import ru.ok.tracer.opentelemetry.FEATURE_OPEN_TELEMETRYKt;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetryMetricExporter;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.config.ConfigStorage;
import xsna.al20;
import xsna.cvf;
import xsna.gcd0;
import xsna.nb1;
import xsna.v7i;
import xsna.v9l;
import xsna.x71;
import xsna.x9l;
import xsna.yk20;
import xsna.zcl;

/* compiled from: TracerOpenTelemetryMetricExporter.kt */
/* loaded from: classes9.dex */
public final class TracerOpenTelemetryMetricExporter implements al20 {
    public static final Companion Companion = new Companion(null);
    private final cvf clock;

    /* compiled from: TracerOpenTelemetryMetricExporter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final TracerOpenTelemetryMetricExporter create(cvf cvfVar) {
            return new TracerOpenTelemetryMetricExporter(cvfVar, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TracerOpenTelemetryMetricExporter(cvf cvfVar, zcl zclVar) {
        this(cvfVar);
    }

    @Override // xsna.al20, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // xsna.al20
    public v7i export(Collection<? extends yk20> collection) {
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_OPEN_TELEMETRYKt.getFEATURE_OPEN_TELEMETRY(), null, 2, null)) {
            Logger.d$default("Open telemetry metrics limited", null, 2, null);
            return v7i.f;
        }
        v7i v7iVar = new v7i();
        TracerOpenTelemetryExporter.INSTANCE.upload$tracer_opentelemetry_release("api/otel/collect/v1/metrics", OpenTelemetrySerializerKt.composeOpenTelemetryJson("resourceMetrics", TracerOpenTelemetryMetricExporter$export$1.INSTANCE, "scopeMetrics", TracerOpenTelemetryMetricExporter$export$2.INSTANCE, "metrics", TracerOpenTelemetryMetricExporter$export$3.INSTANCE, collection), ((gcd0) this.clock).r(true), v7iVar);
        return v7iVar;
    }

    public v7i flush() {
        return v7i.e;
    }

    @Override // xsna.nb1
    public AggregationTemporality getAggregationTemporality(InstrumentType instrumentType) {
        int i = nb1.a.a[instrumentType.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? AggregationTemporality.CUMULATIVE : AggregationTemporality.DELTA;
    }

    @Override // xsna.al20, xsna.x9l
    public x71 getDefaultAggregation(InstrumentType instrumentType) {
        return v9l.a;
    }

    @Override // xsna.al20
    public MemoryMode getMemoryMode() {
        return MemoryMode.IMMUTABLE_DATA;
    }

    @Override // xsna.al20
    public v7i shutdown() {
        return flush();
    }

    public x9l with(final InstrumentType instrumentType, final x71 x71Var) {
        Objects.requireNonNull(instrumentType, "instrumentType");
        Objects.requireNonNull(x71Var, "aggregation");
        return new x9l() { // from class: xsna.w9l
            @Override // xsna.x9l
            public final x71 getDefaultAggregation(InstrumentType instrumentType2) {
                return instrumentType2 == instrumentType ? x71Var : TracerOpenTelemetryMetricExporter.this.getDefaultAggregation(instrumentType2);
            }
        };
    }

    private TracerOpenTelemetryMetricExporter(cvf cvfVar) {
        this.clock = cvfVar;
    }
}
