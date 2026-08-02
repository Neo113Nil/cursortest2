package com.yandex.div.core.dagger;

import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporterImpl;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.util.DoubleCheckProvider;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import xsna.e9e0;
import xsna.gzs;
import xsna.tmn;
import xsna.umn;

/* compiled from: DivKitHistogramsModule.kt */
/* loaded from: classes7.dex */
public final class DivKitHistogramsModule {
    public static final DivKitHistogramsModule INSTANCE = new DivKitHistogramsModule();

    private DivKitHistogramsModule() {
    }

    private final e9e0<Executor> provideCalculateSizeExecutor(HistogramConfiguration histogramConfiguration, e9e0<ExecutorService> e9e0Var) {
        return histogramConfiguration.isSizeRecordingEnabled() ? e9e0Var : new tmn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor provideCalculateSizeExecutor$lambda$1() {
        return new umn();
    }

    private final e9e0<HistogramReporter> provideHistogramReporter(final HistogramReporterDelegate histogramReporterDelegate) {
        return new DoubleCheckProvider(new gzs<HistogramReporter>() { // from class: com.yandex.div.core.dagger.DivKitHistogramsModule$provideHistogramReporter$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final HistogramReporter invoke() {
                return DivHistogramsModuleKt.createHistogramReporter(HistogramReporterDelegate.this);
            }
        });
    }

    public final DivParsingHistogramReporter provideDivParsingHistogramReporter(HistogramConfiguration histogramConfiguration, e9e0<HistogramReporterDelegate> e9e0Var, e9e0<ExecutorService> e9e0Var2) {
        if (!histogramConfiguration.isReportingEnabled()) {
            return DivParsingHistogramReporter.Companion.getDEFAULT();
        }
        return new DivParsingHistogramReporterImpl(new DivKitHistogramsModule$provideDivParsingHistogramReporter$1(provideHistogramReporter(e9e0Var.get())), new DivKitHistogramsModule$provideDivParsingHistogramReporter$2(provideCalculateSizeExecutor(histogramConfiguration, e9e0Var2)));
    }

    public final HistogramReporterDelegate provideHistogramReporterDelegate(HistogramConfiguration histogramConfiguration, e9e0<HistogramRecorder> e9e0Var, e9e0<HistogramColdTypeChecker> e9e0Var2) {
        return histogramConfiguration.isReportingEnabled() ? DivHistogramsModuleKt.createHistogramReporterDelegate(histogramConfiguration, e9e0Var, e9e0Var2) : HistogramReporterDelegate.NoOp.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideCalculateSizeExecutor$lambda$1$lambda$0(Runnable runnable) {
    }
}
