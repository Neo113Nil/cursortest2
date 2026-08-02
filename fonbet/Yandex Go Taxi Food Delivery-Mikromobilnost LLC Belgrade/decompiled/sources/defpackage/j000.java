package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;

/* loaded from: classes5.dex */
public final class j000 {
    public final MultiTransportChooseStationCardAnalytics$OpenReasonV2 a;

    public j000(MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2) {
        this.a = multiTransportChooseStationCardAnalytics$OpenReasonV2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j000) && this.a == ((j000) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Payload(openReason=" + this.a + Extension.C_BRAKE;
    }
}
