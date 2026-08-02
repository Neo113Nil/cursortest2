package ru.ok.tracer.opentelemetry.export;

import java.util.Collection;
import ru.ok.tracer.opentelemetry.FEATURE_OPEN_TELEMETRYKt;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.config.ConfigStorage;
import xsna.cvf;
import xsna.gcd0;
import xsna.m000;
import xsna.n000;
import xsna.v7i;
import xsna.zcl;

/* compiled from: TracerOpenTelemetryLogExporter.kt */
/* loaded from: classes9.dex */
public final class TracerOpenTelemetryLogExporter implements n000 {
    public static final Companion Companion = new Companion(null);
    private final cvf clock;

    /* compiled from: TracerOpenTelemetryLogExporter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final TracerOpenTelemetryLogExporter create(cvf cvfVar) {
            return new TracerOpenTelemetryLogExporter(cvfVar, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TracerOpenTelemetryLogExporter(cvf cvfVar, zcl zclVar) {
        this(cvfVar);
    }

    @Override // xsna.n000, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // xsna.n000
    public v7i export(Collection<? extends m000> collection) {
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_OPEN_TELEMETRYKt.getFEATURE_OPEN_TELEMETRY(), null, 2, null)) {
            Logger.d$default("Open telemetry logs limited", null, 2, null);
            return v7i.f;
        }
        v7i v7iVar = new v7i();
        TracerOpenTelemetryExporter.INSTANCE.upload$tracer_opentelemetry_release("api/otel/collect/v1/logs", OpenTelemetrySerializerKt.composeOpenTelemetryJson("resourceLogs", TracerOpenTelemetryLogExporter$export$1.INSTANCE, "scopeLogs", TracerOpenTelemetryLogExporter$export$2.INSTANCE, "logRecords", TracerOpenTelemetryLogExporter$export$3.INSTANCE, collection), ((gcd0) this.clock).r(true), v7iVar);
        return v7iVar;
    }

    public v7i flush() {
        return v7i.e;
    }

    @Override // xsna.n000
    public v7i shutdown() {
        return flush();
    }

    private TracerOpenTelemetryLogExporter(cvf cvfVar) {
        this.clock = cvfVar;
    }
}
