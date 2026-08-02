package defpackage;

import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$PhoneCallFallbackReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class clv implements elv {
    public final InAppCallsAnalytics$PhoneCallFallbackReason a;

    public clv(InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason) {
        this.a = inAppCallsAnalytics$PhoneCallFallbackReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clv) && this.a == ((clv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(reason=" + this.a + Extension.C_BRAKE;
    }
}
