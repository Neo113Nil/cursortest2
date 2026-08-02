package defpackage;

import com.yandex.messaging.internal.entities.MessageTranslation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class az01 {
    public final long a;
    public final MessageTranslation.Status b;

    public az01(long j, MessageTranslation.Status status) {
        this.a = j;
        this.b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az01)) {
            return false;
        }
        az01 az01Var = (az01) obj;
        return this.a == az01Var.a && this.b.equals(az01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TranslationStatus(timestamp=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }
}
