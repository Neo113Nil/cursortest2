package com.yandex.div.histogram;

import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.Executor;
import xsna.gzs;

/* compiled from: DivParsingHistogramReporter.kt */
/* loaded from: classes7.dex */
public final class DivParsingHistogramReporterImpl implements DivParsingHistogramReporter {
    private final gzs<Executor> calculateSizeExecutor;
    private final gzs<HistogramReporter> histogramReporter;

    /* JADX WARN: Multi-variable type inference failed */
    public DivParsingHistogramReporterImpl(gzs<? extends HistogramReporter> gzsVar, gzs<? extends Executor> gzsVar2) {
        this.histogramReporter = gzsVar;
        this.calculateSizeExecutor = gzsVar2;
    }
}
