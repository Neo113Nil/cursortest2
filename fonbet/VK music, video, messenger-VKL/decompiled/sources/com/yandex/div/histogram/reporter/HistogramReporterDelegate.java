package com.yandex.div.histogram.reporter;

/* compiled from: HistogramReporterDelegate.kt */
/* loaded from: classes7.dex */
public interface HistogramReporterDelegate {
    void reportDuration(String str, long j, String str2);

    /* compiled from: HistogramReporterDelegate.kt */
    public static final class NoOp implements HistogramReporterDelegate {
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
        }

        @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
        public void reportDuration(String str, long j, String str2) {
        }
    }
}
