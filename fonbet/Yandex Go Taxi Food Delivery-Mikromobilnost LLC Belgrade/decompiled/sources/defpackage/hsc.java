package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes14.dex */
public final class hsc implements g6v {
    public final CommunicationItem a;
    public final String b;

    public hsc(CommunicationItem communicationItem) {
        this.a = communicationItem;
        this.b = communicationItem.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hsc) && jl40.l(this.a, ((hsc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CommunicationItemAnalyticsModel(communicationItem=" + this.a + Extension.C_BRAKE;
    }
}
