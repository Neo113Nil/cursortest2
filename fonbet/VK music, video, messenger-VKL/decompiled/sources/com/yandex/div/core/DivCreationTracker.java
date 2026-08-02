package com.yandex.div.core;

import android.os.SystemClock;
import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.zcl;

/* compiled from: DivCreationTracker.kt */
/* loaded from: classes7.dex */
public final class DivCreationTracker {
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean isColdContextCreate = new AtomicBoolean(true);
    private static final AtomicBoolean isColdViewCreate = new AtomicBoolean(true);
    private final String contextCreateCallType;
    private long contextCreatedTime = -1;
    private final AtomicBoolean contextCreationReported = new AtomicBoolean(false);
    private final long contextCreationStarted;
    private final AtomicBoolean isFirstViewCreate;

    /* compiled from: DivCreationTracker.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final long getCurrentUptimeMillis() {
            return SystemClock.uptimeMillis();
        }

        private Companion() {
        }
    }

    public DivCreationTracker(long j) {
        this.contextCreationStarted = j;
        this.contextCreateCallType = isColdContextCreate.compareAndSet(true, false) ? "Cold" : "Cool";
        this.isFirstViewCreate = new AtomicBoolean(true);
    }

    private final void sendContextCreationHistogram(HistogramReporter histogramReporter) {
        long j = this.contextCreatedTime;
        if (j < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, "Div.Context.Create", j - this.contextCreationStarted, null, this.contextCreateCallType, null, 20, null);
        this.contextCreatedTime = -1L;
    }

    public final String getViewCreateCallType() {
        return this.isFirstViewCreate.compareAndSet(true, false) ? isColdViewCreate.compareAndSet(true, false) ? "Cold" : "Cool" : "Warm";
    }

    public final void onContextCreationFinished() {
        if (this.contextCreatedTime >= 0) {
            return;
        }
        this.contextCreatedTime = Companion.getCurrentUptimeMillis();
    }

    public final void sendHistograms(long j, long j2, HistogramReporter histogramReporter, String str) {
        if (j2 < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, "Div.View.Create", j2 - j, null, str, null, 20, null);
        if (this.contextCreationReported.compareAndSet(false, true)) {
            sendContextCreationHistogram(histogramReporter);
        }
    }
}
