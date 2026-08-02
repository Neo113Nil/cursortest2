package defpackage;

import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class gkd implements MviMetricsReporter {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // io.appmetrica.analytics.MviMetricsReporter
    public final MviMetricsReporter.ReportToPulse reportAdditionalMetric(MviScreen mviScreen, MviMetricsReporter.AdditionalMetric additionalMetric, Long l, MviMetricsReporter.StartupType startupType) {
        l.getClass();
        MviMetricsReporter mviMetricsReporter = (MviMetricsReporter) this.a.get(qoi0.a(mviScreen.getClass()));
        if (mviMetricsReporter != null) {
            mviMetricsReporter.reportAdditionalMetric(mviScreen, additionalMetric, l, startupType);
            MviMetricsReporter.ReportToPulse reportToPulse = MviMetricsReporter.ReportToPulse.SKIP;
            if (reportToPulse != null) {
                return reportToPulse;
            }
        }
        return MviMetricsReporter.ReportToPulse.REPORT;
    }

    @Override // io.appmetrica.analytics.MviMetricsReporter
    public final MviMetricsReporter.ReportToPulse reportKeyMetric(MviScreen mviScreen, MviMetricsReporter.KeyMetric keyMetric, Long l, Double d, String str, MviMetricsReporter.StartupType startupType) {
        l.getClass();
        d.getClass();
        MviMetricsReporter mviMetricsReporter = (MviMetricsReporter) this.a.get(qoi0.a(mviScreen.getClass()));
        if (mviMetricsReporter != null) {
            mviMetricsReporter.reportKeyMetric(mviScreen, keyMetric, l, d, str, startupType);
            MviMetricsReporter.ReportToPulse reportToPulse = MviMetricsReporter.ReportToPulse.SKIP;
            if (reportToPulse != null) {
                return reportToPulse;
            }
        }
        return MviMetricsReporter.ReportToPulse.REPORT;
    }

    @Override // io.appmetrica.analytics.MviMetricsReporter
    public final MviMetricsReporter.ReportToPulseTotal reportTotalScore(MviScreen mviScreen, Double d, Map map, MviMetricsReporter.StartupType startupType) {
        d.getClass();
        MviMetricsReporter mviMetricsReporter = (MviMetricsReporter) this.a.get(qoi0.a(mviScreen.getClass()));
        if (mviMetricsReporter != null) {
            mviMetricsReporter.reportTotalScore(mviScreen, d, map, startupType);
            MviMetricsReporter.ReportToPulseTotal reportToPulseTotal = MviMetricsReporter.ReportToPulseTotal.SKIP;
            if (reportToPulseTotal != null) {
                return reportToPulseTotal;
            }
        }
        return MviMetricsReporter.ReportToPulseTotal.REPORT_TOTAL_AND_STARTUP_SPECIFIC;
    }

    @Override // io.appmetrica.analytics.MviMetricsReporter
    public final MviMetricsReporter.ReportToPulseTotal reportTotalScoreV2(MviScreen mviScreen, Double d, Map map, MviMetricsReporter.StartupType startupType) {
        d.getClass();
        MviMetricsReporter mviMetricsReporter = (MviMetricsReporter) this.a.get(qoi0.a(mviScreen.getClass()));
        if (mviMetricsReporter != null) {
            mviMetricsReporter.reportTotalScoreV2(mviScreen, d, map, startupType);
            MviMetricsReporter.ReportToPulseTotal reportToPulseTotal = MviMetricsReporter.ReportToPulseTotal.SKIP;
            if (reportToPulseTotal != null) {
                return reportToPulseTotal;
            }
        }
        return MviMetricsReporter.ReportToPulseTotal.REPORT_TOTAL_AND_STARTUP_SPECIFIC;
    }
}
