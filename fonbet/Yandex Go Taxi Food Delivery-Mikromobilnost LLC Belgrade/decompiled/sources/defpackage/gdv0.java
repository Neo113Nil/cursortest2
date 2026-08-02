package defpackage;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gdv0 implements hdv0 {
    public final SummaryExpandReason a;

    public gdv0(SummaryExpandReason summaryExpandReason) {
        this.a = summaryExpandReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gdv0) && this.a == ((gdv0) obj).a;
    }

    public final int hashCode() {
        SummaryExpandReason summaryExpandReason = this.a;
        if (summaryExpandReason == null) {
            return 0;
        }
        return summaryExpandReason.hashCode();
    }

    public final String toString() {
        return "SettleExpanded(reason=" + this.a + Extension.C_BRAKE;
    }
}
