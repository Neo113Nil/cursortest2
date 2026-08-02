package com.yandex.div.histogram.reporter;

import com.yandex.div.histogram.HistogramFilter;
import io.jsonwebtoken.JwtParser;
import xsna.v1v;

/* compiled from: HistogramReporter.kt */
/* loaded from: classes7.dex */
public class HistogramReporter {
    private final HistogramReporterDelegate histogramReporterDelegate;

    public HistogramReporter(HistogramReporterDelegate histogramReporterDelegate) {
        this.histogramReporterDelegate = histogramReporterDelegate;
    }

    public static /* synthetic */ void reportDuration$default(HistogramReporter histogramReporter, String str, long j, String str2, String str3, HistogramFilter histogramFilter, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDuration");
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            histogramFilter = HistogramFilter.Companion.getON();
        }
        histogramReporter.reportDuration(str, j, str2, str3, histogramFilter);
    }

    public void reportDuration(String str, long j, String str2, String str3, HistogramFilter histogramFilter) {
        if (histogramFilter.report(null)) {
            this.histogramReporterDelegate.reportDuration(str, j, str3);
        }
        if (str2 != null) {
            String a = v1v.a(JwtParser.SEPARATOR_CHAR, str2, str);
            if (histogramFilter.report(str2)) {
                this.histogramReporterDelegate.reportDuration(a, j, str3);
            }
        }
    }
}
