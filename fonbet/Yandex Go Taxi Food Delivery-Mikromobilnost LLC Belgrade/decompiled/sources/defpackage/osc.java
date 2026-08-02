package defpackage;

import com.yandex.delivery.mapper.model.ForwardingId;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class osc extends psc {
    public final ForwardingId a;

    public osc(ForwardingId forwardingId) {
        this.a = forwardingId;
    }

    public final ForwardingId a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osc) && this.a == ((osc) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VoiceForwardingCall(forwardingId=" + this.a + Extension.C_BRAKE;
    }
}
