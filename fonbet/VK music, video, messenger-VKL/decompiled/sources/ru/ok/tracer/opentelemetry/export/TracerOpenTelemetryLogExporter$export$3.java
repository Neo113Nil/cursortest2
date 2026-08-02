package ru.ok.tracer.opentelemetry.export;

import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.izs;
import xsna.m000;

/* compiled from: TracerOpenTelemetryLogExporter.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class TracerOpenTelemetryLogExporter$export$3 extends FunctionReferenceImpl implements izs<m000, JSONObject> {
    public static final TracerOpenTelemetryLogExporter$export$3 INSTANCE = new TracerOpenTelemetryLogExporter$export$3();

    public TracerOpenTelemetryLogExporter$export$3() {
        super(1, OpenTelemetrySerializerKt.class, "toJsonObject", "toJsonObject(Lio/opentelemetry/sdk/logs/data/LogRecordData;)Lorg/json/JSONObject;", 1);
    }

    @Override // xsna.izs
    public final JSONObject invoke(m000 m000Var) {
        return OpenTelemetrySerializerKt.toJsonObject(m000Var);
    }
}
