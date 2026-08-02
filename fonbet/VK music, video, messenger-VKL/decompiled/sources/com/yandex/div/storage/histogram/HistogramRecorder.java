package com.yandex.div.storage.histogram;

import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: HistogramRecorder.kt */
/* loaded from: classes7.dex */
public class HistogramRecorder {
    private final HistogramReporter histogramReporter;
    private final CopyOnWriteArraySet<String> recordedHistograms = new CopyOnWriteArraySet<>();

    public HistogramRecorder(HistogramReporterDelegate histogramReporterDelegate, HistogramNameProvider histogramNameProvider) {
        this.histogramReporter = new HistogramReporter(histogramReporterDelegate);
    }
}
