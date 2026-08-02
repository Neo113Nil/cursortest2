package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes14.dex */
public final class ig60 extends jg60 {
    public final CommunicationItem a;

    public ig60(CommunicationItem communicationItem) {
        this.a = communicationItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ig60) && this.a.equals(((ig60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowNotification(notification=" + this.a + Extension.C_BRAKE;
    }
}
