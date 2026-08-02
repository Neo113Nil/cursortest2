package ru.ok.tracer.opentelemetry.export;

import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.izs;
import xsna.yk20;

/* compiled from: TracerOpenTelemetryMetricExporter.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class TracerOpenTelemetryMetricExporter$export$3 extends FunctionReferenceImpl implements izs<yk20, JSONObject> {
    public static final TracerOpenTelemetryMetricExporter$export$3 INSTANCE = new TracerOpenTelemetryMetricExporter$export$3();

    public TracerOpenTelemetryMetricExporter$export$3() {
        super(1, OpenTelemetrySerializerKt.class, "toJsonObject", "toJsonObject(Lio/opentelemetry/sdk/metrics/data/MetricData;)Lorg/json/JSONObject;", 1);
    }

    @Override // xsna.izs
    public final JSONObject invoke(yk20 yk20Var) {
        return OpenTelemetrySerializerKt.toJsonObject(yk20Var);
    }
}
