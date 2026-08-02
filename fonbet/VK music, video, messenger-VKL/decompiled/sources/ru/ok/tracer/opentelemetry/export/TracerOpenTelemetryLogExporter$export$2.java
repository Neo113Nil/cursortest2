package ru.ok.tracer.opentelemetry.export;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.m000;
import xsna.q8x;

/* compiled from: TracerOpenTelemetryLogExporter.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class TracerOpenTelemetryLogExporter$export$2 extends FunctionReferenceImpl implements izs<m000, q8x> {
    public static final TracerOpenTelemetryLogExporter$export$2 INSTANCE = new TracerOpenTelemetryLogExporter$export$2();

    public TracerOpenTelemetryLogExporter$export$2() {
        super(1, m000.class, "getInstrumentationScopeInfo", "getInstrumentationScopeInfo()Lio/opentelemetry/sdk/common/InstrumentationScopeInfo;", 0);
    }

    @Override // xsna.izs
    public final q8x invoke(m000 m000Var) {
        return m000Var.c();
    }
}
