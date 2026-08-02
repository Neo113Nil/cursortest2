package ru.ok.tracer.opentelemetry.export;

import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.izs;
import xsna.whk0;

/* compiled from: TracerOpenTelemetrySpanExporter.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class TracerOpenTelemetrySpanExporter$scheduleUpload$1$3 extends FunctionReferenceImpl implements izs<whk0, JSONObject> {
    public static final TracerOpenTelemetrySpanExporter$scheduleUpload$1$3 INSTANCE = new TracerOpenTelemetrySpanExporter$scheduleUpload$1$3();

    public TracerOpenTelemetrySpanExporter$scheduleUpload$1$3() {
        super(1, OpenTelemetrySerializerKt.class, "toJsonObject", "toJsonObject(Lio/opentelemetry/sdk/trace/data/SpanData;)Lorg/json/JSONObject;", 1);
    }

    @Override // xsna.izs
    public final JSONObject invoke(whk0 whk0Var) {
        return OpenTelemetrySerializerKt.toJsonObject(whk0Var);
    }
}
