package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fdv0 implements hdv0 {
    public final SummaryAnalytics$SummaryCollapseReasonV2 a;

    public fdv0(SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV2) {
        this.a = summaryAnalytics$SummaryCollapseReasonV2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fdv0) && this.a == ((fdv0) obj).a;
    }

    public final int hashCode() {
        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV2 = this.a;
        if (summaryAnalytics$SummaryCollapseReasonV2 == null) {
            return 0;
        }
        return summaryAnalytics$SummaryCollapseReasonV2.hashCode();
    }

    public final String toString() {
        return "SettleAnchored(reason=" + this.a + Extension.C_BRAKE;
    }
}
