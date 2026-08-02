package com.yandex.div.histogram.reporter;

import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.TaskExecutor;
import com.yandex.div.histogram.util.HistogramUtils;
import io.jsonwebtoken.JwtParser;
import java.util.concurrent.TimeUnit;
import xsna.e9e0;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: HistogramReporterDelegateImpl.kt */
/* loaded from: classes7.dex */
public final class HistogramReporterDelegateImpl implements HistogramReporterDelegate {
    private final HistogramCallTypeProvider histogramCallTypeProvider;
    private final HistogramRecordConfiguration histogramRecordConfig;
    private final e9e0<HistogramRecorder> histogramRecorder;
    private final e9e0<TaskExecutor> taskExecutor;

    public HistogramReporterDelegateImpl(e9e0<HistogramRecorder> e9e0Var, HistogramCallTypeProvider histogramCallTypeProvider, HistogramRecordConfiguration histogramRecordConfiguration, e9e0<TaskExecutor> e9e0Var2) {
        this.histogramRecorder = e9e0Var;
        this.histogramCallTypeProvider = histogramCallTypeProvider;
        this.histogramRecordConfig = histogramRecordConfiguration;
        this.taskExecutor = e9e0Var2;
    }

    @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
    public void reportDuration(final String str, final long j, String str2) {
        final String histogramCallType = str2 == null ? this.histogramCallTypeProvider.getHistogramCallType(str) : str2;
        if (HistogramUtils.INSTANCE.shouldRecordHistogram(histogramCallType, this.histogramRecordConfig)) {
            this.taskExecutor.get().post(new gzs<s3q0>() { // from class: com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl$reportDuration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    e9e0 e9e0Var;
                    e9e0Var = HistogramReporterDelegateImpl.this.histogramRecorder;
                    HistogramRecorder histogramRecorder = (HistogramRecorder) e9e0Var.get();
                    String str3 = str + JwtParser.SEPARATOR_CHAR + histogramCallType;
                    long j2 = j;
                    if (j2 < 1) {
                        j2 = 1;
                    }
                    histogramRecorder.recordShortTimeHistogram(str3, j2, TimeUnit.MILLISECONDS);
                }
            });
        }
    }
}
