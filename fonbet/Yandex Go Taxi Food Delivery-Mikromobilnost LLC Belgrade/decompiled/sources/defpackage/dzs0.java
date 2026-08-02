package defpackage;

import com.yandex.quark.webchat.auth.internal.synchronizer.SmartCookieRefreshImpl$ApplyEventReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes2.dex */
public final class dzs0 extends wtf0 {
    public final SmartCookieRefreshImpl$ApplyEventReason d;

    public dzs0(SmartCookieRefreshImpl$ApplyEventReason smartCookieRefreshImpl$ApplyEventReason) {
        super(4, "web-chat-smart-cookie-refresh-apply", g8e.z(CRLReasonCodeExtension.REASON, smartCookieRefreshImpl$ApplyEventReason.getValue()), false);
        this.d = smartCookieRefreshImpl$ApplyEventReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dzs0) && this.d == ((dzs0) obj).d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "ApplyEvent(reason=" + this.d + Extension.C_BRAKE;
    }
}
