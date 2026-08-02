package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes14.dex */
public final class o6y0 implements p6y0 {
    public final CommunicationItem a;

    public o6y0(CommunicationItem communicationItem) {
        this.a = communicationItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6y0) && this.a.equals(((o6y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Promoblock(communication=" + this.a + Extension.C_BRAKE;
    }
}
