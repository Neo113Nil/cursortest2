package ru.ok.tracer.opentelemetry.record;

import android.os.Handler;
import android.os.Looper;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.builders.ListBuilder;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetryMetricExporter;
import ru.ok.tracer.utils.TracerThreads;
import xsna.cvf;
import xsna.e43;
import xsna.gag0;
import xsna.gcd0;
import xsna.izs;
import xsna.q8x;
import xsna.s3q0;
import xsna.sx3;
import xsna.xw1;
import xsna.zcl;

/* compiled from: TracerOpenTelemetryRecorderProvider.kt */
/* loaded from: classes9.dex */
public final class TracerOpenTelemetryRecorderProvider implements OpenTelemetryRecorderProvider {
    public static final Companion Companion = new Companion(null);
    private final cvf clock;
    private final long exportIntervalMillis;
    private final TracerOpenTelemetryMetricExporter exporter;
    private final Handler handler;
    private final CopyOnWriteArrayList<MutableMetricData> metrics;
    private final AtomicInteger recordCounter;
    private final izs<MutableMetricData, s3q0> recordListener;
    private final gag0 resource;

    /* compiled from: TracerOpenTelemetryRecorderProvider.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final TracerOpenTelemetryRecorderProvider create(cvf cvfVar, gag0 gag0Var, long j, TracerOpenTelemetryMetricExporter tracerOpenTelemetryMetricExporter) {
            return new TracerOpenTelemetryRecorderProvider(cvfVar, gag0Var, j, tracerOpenTelemetryMetricExporter, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TracerOpenTelemetryRecorderProvider(cvf cvfVar, gag0 gag0Var, long j, TracerOpenTelemetryMetricExporter tracerOpenTelemetryMetricExporter, zcl zclVar) {
        this(cvfVar, gag0Var, j, tracerOpenTelemetryMetricExporter);
    }

    private final void export() {
        long r = ((gcd0) this.clock).r(true);
        ListBuilder e = e43.e();
        Iterator<MutableMetricData> it = this.metrics.iterator();
        while (it.hasNext()) {
            it.next().collectInto(r, e);
        }
        ListBuilder g = e.g();
        if (g.isEmpty()) {
            return;
        }
        this.exporter.export(g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleExport() {
        if (this.recordCounter.getAndIncrement() == 0) {
            this.handler.postDelayed(new sx3(this, 13), this.exportIntervalMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleExport$lambda$1(TracerOpenTelemetryRecorderProvider tracerOpenTelemetryRecorderProvider) {
        TracerThreads.INSTANCE.runInBgSequential(new xw1(tracerOpenTelemetryRecorderProvider, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleExport$lambda$1$lambda$0(TracerOpenTelemetryRecorderProvider tracerOpenTelemetryRecorderProvider) {
        tracerOpenTelemetryRecorderProvider.recordCounter.set(0);
        tracerOpenTelemetryRecorderProvider.export();
    }

    @Override // ru.ok.tracer.opentelemetry.record.OpenTelemetryRecorderProvider
    public DoubleRecorder createDoubleRecorder(q8x q8xVar, String str, String str2, String str3) {
        MutableMetricData mutableMetricData = new MutableMetricData(this.resource, q8xVar, str, str2, str3, new MutableDoubleSumData(true, AggregationTemporality.CUMULATIVE));
        this.metrics.add(mutableMetricData);
        return new TracerOpenTelemetryDoubleRecorder(this.clock, mutableMetricData, this.recordListener);
    }

    @Override // ru.ok.tracer.opentelemetry.record.OpenTelemetryRecorderProvider
    public LongRecorder createLongRecorder(q8x q8xVar, String str, String str2, String str3) {
        MutableMetricData mutableMetricData = new MutableMetricData(this.resource, q8xVar, str, str2, str3, new MutableLongSumData(true, AggregationTemporality.CUMULATIVE));
        this.metrics.add(mutableMetricData);
        return new TracerOpenTelemetryLongRecorder(this.clock, mutableMetricData, this.recordListener);
    }

    private TracerOpenTelemetryRecorderProvider(cvf cvfVar, gag0 gag0Var, long j, TracerOpenTelemetryMetricExporter tracerOpenTelemetryMetricExporter) {
        this.clock = cvfVar;
        this.resource = gag0Var;
        this.exportIntervalMillis = j;
        this.exporter = tracerOpenTelemetryMetricExporter;
        this.metrics = new CopyOnWriteArrayList<>();
        this.handler = new Handler(Looper.getMainLooper());
        this.recordCounter = new AtomicInteger();
        this.recordListener = new izs<MutableMetricData, s3q0>() { // from class: ru.ok.tracer.opentelemetry.record.TracerOpenTelemetryRecorderProvider$recordListener$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(MutableMetricData mutableMetricData) {
                invoke2(mutableMetricData);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(MutableMetricData mutableMetricData) {
                TracerOpenTelemetryRecorderProvider.this.scheduleExport();
            }
        };
    }
}
