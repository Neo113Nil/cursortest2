package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl;
import xsna.e9e0;

/* compiled from: DivHistogramsModule.kt */
/* loaded from: classes7.dex */
public final class DivHistogramsModuleKt {
    public static final HistogramReporter createHistogramReporter(HistogramReporterDelegate histogramReporterDelegate) {
        return new HistogramReporter(histogramReporterDelegate);
    }

    public static final HistogramReporterDelegate createHistogramReporterDelegate(HistogramConfiguration histogramConfiguration, e9e0<HistogramRecorder> e9e0Var, e9e0<HistogramColdTypeChecker> e9e0Var2) {
        return !histogramConfiguration.isReportingEnabled() ? HistogramReporterDelegate.NoOp.INSTANCE : new HistogramReporterDelegateImpl(e9e0Var, new HistogramCallTypeProvider(new DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(e9e0Var2)), histogramConfiguration, histogramConfiguration.getTaskExecutorProvider());
    }
}
