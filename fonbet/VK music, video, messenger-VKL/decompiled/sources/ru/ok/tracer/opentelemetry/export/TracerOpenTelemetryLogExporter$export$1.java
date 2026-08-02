package ru.ok.tracer.opentelemetry.export;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gag0;
import xsna.izs;
import xsna.m000;

/* compiled from: TracerOpenTelemetryLogExporter.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class TracerOpenTelemetryLogExporter$export$1 extends FunctionReferenceImpl implements izs<m000, gag0> {
    public static final TracerOpenTelemetryLogExporter$export$1 INSTANCE = new TracerOpenTelemetryLogExporter$export$1();

    public TracerOpenTelemetryLogExporter$export$1() {
        super(1, m000.class, "getResource", "getResource()Lio/opentelemetry/sdk/resources/Resource;", 0);
    }

    @Override // xsna.izs
    public final gag0 invoke(m000 m000Var) {
        return m000Var.d();
    }
}
