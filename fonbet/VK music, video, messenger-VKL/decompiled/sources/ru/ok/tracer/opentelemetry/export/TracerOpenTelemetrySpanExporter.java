package ru.ok.tracer.opentelemetry.export;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tracer.opentelemetry.FEATURE_OPEN_TELEMETRYKt;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerThreads;
import ru.ok.tracer.utils.config.ConfigStorage;
import xsna.cvf;
import xsna.gcd0;
import xsna.sj1;
import xsna.v7i;
import xsna.whk0;
import xsna.xhk0;
import xsna.zcl;

/* compiled from: TracerOpenTelemetrySpanExporter.kt */
/* loaded from: classes9.dex */
public final class TracerOpenTelemetrySpanExporter implements xhk0 {
    public static final Companion Companion = new Companion(null);
    private final cvf clock;
    private int maxCountToUpload;
    private final AtomicReference<Record> record;

    /* compiled from: TracerOpenTelemetrySpanExporter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ TracerOpenTelemetrySpanExporter create$default(Companion companion, cvf cvfVar, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 512;
            }
            return companion.create(cvfVar, i);
        }

        public final TracerOpenTelemetrySpanExporter create(cvf cvfVar, int i) {
            return new TracerOpenTelemetrySpanExporter(cvfVar, i, null);
        }

        private Companion() {
        }
    }

    /* compiled from: TracerOpenTelemetrySpanExporter.kt */
    public static final class Record {
        private final ConcurrentLinkedQueue<whk0> queue = new ConcurrentLinkedQueue<>();
        private final v7i result = new v7i();

        public final ConcurrentLinkedQueue<whk0> getQueue() {
            return this.queue;
        }

        public final v7i getResult() {
            return this.result;
        }
    }

    public /* synthetic */ TracerOpenTelemetrySpanExporter(cvf cvfVar, int i, zcl zclVar) {
        this(cvfVar, i);
    }

    private final void scheduleUpload() {
        TracerThreads.INSTANCE.runOnIo(new sj1(this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleUpload$lambda$0(TracerOpenTelemetrySpanExporter tracerOpenTelemetrySpanExporter) {
        Record andSet = tracerOpenTelemetrySpanExporter.record.getAndSet(new Record());
        ConcurrentLinkedQueue<whk0> queue = andSet.getQueue();
        if (queue.isEmpty()) {
            return;
        }
        try {
            TracerOpenTelemetryExporter.INSTANCE.performUpload$tracer_opentelemetry_release("api/otel/trace", ((gcd0) tracerOpenTelemetrySpanExporter.clock).r(true), OpenTelemetrySerializerKt.composeOpenTelemetryJson("resourceSpans", TracerOpenTelemetrySpanExporter$scheduleUpload$1$1.INSTANCE, "scopeSpans", TracerOpenTelemetrySpanExporter$scheduleUpload$1$2.INSTANCE, "spans", TracerOpenTelemetrySpanExporter$scheduleUpload$1$3.INSTANCE, queue));
            andSet.getResult().e();
        } catch (Exception unused) {
            andSet.getResult().a(null);
        }
    }

    @Override // xsna.xhk0, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // xsna.xhk0
    public v7i export(Collection<? extends whk0> collection) {
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_OPEN_TELEMETRYKt.getFEATURE_OPEN_TELEMETRY(), null, 2, null)) {
            Logger.d$default("Open telemetry limited", null, 2, null);
            return v7i.f;
        }
        Record record = this.record.get();
        ConcurrentLinkedQueue<whk0> queue = record.getQueue();
        queue.addAll(collection);
        if (queue.size() >= this.maxCountToUpload) {
            scheduleUpload();
        }
        return record.getResult();
    }

    public v7i flush() {
        Record record = this.record.get();
        if (record.getQueue().isEmpty()) {
            return v7i.e;
        }
        scheduleUpload();
        return record.getResult();
    }

    @Override // xsna.xhk0
    public v7i shutdown() {
        return flush();
    }

    private TracerOpenTelemetrySpanExporter(cvf cvfVar, int i) {
        this.clock = cvfVar;
        this.maxCountToUpload = i;
        this.record = new AtomicReference<>(new Record());
    }
}
