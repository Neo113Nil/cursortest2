package defpackage;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hhv0 implements ihv0 {
    public final SummaryExpandReason a;

    public hhv0(SummaryExpandReason summaryExpandReason) {
        this.a = summaryExpandReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhv0) && this.a == ((hhv0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Expanded(reason=" + this.a + Extension.C_BRAKE;
    }
}
