package ru.ok.tracer.lite.performance.metrics;

import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import ru.ok.tracer.base.sessionuuuid.SessionUuidUtils;
import ru.ok.tracer.base.time.PrecisionClock;
import ru.ok.tracer.base.ucum.UcumUtils;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.limits.TracerLiteLimits;
import ru.ok.tracer.lite.performance.metrics.upload.PerfSampleUploaderLite;
import ru.ok.tracer.lite.performance.metrics.util.DelayedWork;
import ru.ok.tracer.lite.utils.TracerExecutorsHolder;
import xsna.e43;
import xsna.pn00;
import xsna.qc9;

/* compiled from: TracerPerformanceMetricsLite.kt */
/* loaded from: classes9.dex */
public final class TracerPerformanceMetricsLite {
    private final TracerLiteLimits limits;
    private final TracerLite tracer;
    private volatile boolean tracerIsDisabled;
    private final PerfSampleUploaderLite uploader;
    private final ConcurrentLinkedQueue<PerfSampleLite> queue = new ConcurrentLinkedQueue<>();
    private final DelayedWork work = new DelayedWork(null, 1000, 0, 0, 0, new TracerPerformanceMetricsLite$work$1(this), 29, null);

    public TracerPerformanceMetricsLite(TracerLite tracerLite) {
        this.tracer = tracerLite;
        this.limits = TracerLiteLimits.Companion.get(tracerLite);
        this.uploader = new PerfSampleUploaderLite(tracerLite);
    }

    private final Executor getIoExecutor() {
        return TracerExecutorsHolder.Companion.get(this.tracer).getIoExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareUpload() {
        getIoExecutor().execute(new qc9(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareUpload$lambda$1(TracerPerformanceMetricsLite tracerPerformanceMetricsLite) {
        if (tracerPerformanceMetricsLite.limits.isLimited(TracerPerformanceMetricsLiteKt.FEATURE_PERFORMANCE_METRICS, null)) {
            Log.e("Tracer", "Feature PERFORMANCE_METRICS limited");
            return;
        }
        ListBuilder e = e43.e();
        while (true) {
            PerfSampleLite poll = tracerPerformanceMetricsLite.queue.poll();
            if (poll == null) {
                break;
            } else {
                e.add(poll);
            }
        }
        ListBuilder g = e.g();
        if (tracerPerformanceMetricsLite.tracer.isDisabled()) {
            tracerPerformanceMetricsLite.tracerIsDisabled = true;
        } else {
            tracerPerformanceMetricsLite.uploader.upload(g);
        }
    }

    public final void sample(String str, long j, TimeUnit timeUnit, Pair<String, ? extends Object>... pairArr) {
        sample(str, j, UcumUtils.getToUcumString(timeUnit), pn00.k((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }

    public final void sample(String str, long j, String str2, Pair<String, ? extends Object>... pairArr) {
        sample(str, j, str2, pn00.k((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }

    private final void sample(String str, long j, String str2, Map<String, ? extends Object> map) {
        if (this.tracerIsDisabled) {
            return;
        }
        if (this.limits.isLimited(TracerPerformanceMetricsLiteKt.FEATURE_PERFORMANCE_METRICS, null)) {
            Log.e("Tracer", "Feature PERFORMANCE_METRICS limited");
        } else {
            this.queue.add(new PerfSampleLite(SessionUuidUtils.getCurrentSessionUuid(), PrecisionClock.currentTimeNanos(), str, j, str2, map));
            DelayedWork.schedule$default(this.work, 0, 1, null);
        }
    }
}
