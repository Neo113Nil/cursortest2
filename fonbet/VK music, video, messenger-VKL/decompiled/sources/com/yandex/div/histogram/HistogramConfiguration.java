package com.yandex.div.histogram;

import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.internal.util.DoubleCheckProvider;
import xsna.e9e0;
import xsna.gzs;

/* compiled from: HistogramConfiguration.kt */
/* loaded from: classes7.dex */
public interface HistogramConfiguration extends HistogramRecordConfiguration {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final HistogramConfiguration DEFAULT = new DefaultHistogramConfiguration();

    /* compiled from: HistogramConfiguration.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* compiled from: HistogramConfiguration.kt */
    public static class DefaultHistogramConfiguration implements HistogramConfiguration {
        private final boolean isColdRecordingEnabled;
        private final boolean isCoolRecordingEnabled;
        private final boolean isReportingEnabled;
        private final boolean isSizeRecordingEnabled;
        private final boolean isWarmRecordingEnabled;
        private final e9e0<HistogramBridge> histogramBridge = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1.INSTANCE);
        private final e9e0<CpuUsageHistogramReporter> cpuUsageHistogramReporter = new DoubleCheckProvider(new gzs<CpuUsageHistogramReporter>() { // from class: com.yandex.div.histogram.HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final CpuUsageHistogramReporter invoke() {
                return new CpuUsageHistogramReporter.NoOp();
            }
        });
        private final e9e0<TaskExecutor> taskExecutorProvider = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1.INSTANCE);
        private final e9e0<RenderConfiguration> renderConfiguration = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1.INSTANCE);

        @Override // com.yandex.div.histogram.HistogramConfiguration
        public e9e0<CpuUsageHistogramReporter> getCpuUsageHistogramReporter() {
            return this.cpuUsageHistogramReporter;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        public e9e0<HistogramBridge> getHistogramBridge() {
            return this.histogramBridge;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public e9e0<RenderConfiguration> getRenderConfiguration() {
            return this.renderConfiguration;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        public e9e0<TaskExecutor> getTaskExecutorProvider() {
            return this.taskExecutorProvider;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isColdRecordingEnabled() {
            return this.isColdRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isCoolRecordingEnabled() {
            return this.isCoolRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        public boolean isReportingEnabled() {
            return this.isReportingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isSizeRecordingEnabled() {
            return this.isSizeRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isWarmRecordingEnabled() {
            return this.isWarmRecordingEnabled;
        }
    }

    e9e0<CpuUsageHistogramReporter> getCpuUsageHistogramReporter();

    e9e0<HistogramBridge> getHistogramBridge();

    e9e0<TaskExecutor> getTaskExecutorProvider();

    boolean isReportingEnabled();
}
