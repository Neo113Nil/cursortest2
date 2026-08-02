package ru.ok.tracer.opentelemetry.export;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gag0;
import xsna.izs;
import xsna.yk20;

/* compiled from: TracerOpenTelemetryMetricExporter.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class TracerOpenTelemetryMetricExporter$export$1 extends FunctionReferenceImpl implements izs<yk20, gag0> {
    public static final TracerOpenTelemetryMetricExporter$export$1 INSTANCE = new TracerOpenTelemetryMetricExporter$export$1();

    public TracerOpenTelemetryMetricExporter$export$1() {
        super(1, yk20.class, "getResource", "getResource()Lio/opentelemetry/sdk/resources/Resource;", 0);
    }

    @Override // xsna.izs
    public final gag0 invoke(yk20 yk20Var) {
        return yk20Var.d();
    }
}
