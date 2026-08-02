package defpackage;

import com.yandex.go.taxi.summary.api.model.MobilityHubSourceAction;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a2v {
    public final MobilityHubSourceAction a;
    public final MobilityHubSourceType b;

    public a2v(MobilityHubSourceAction mobilityHubSourceAction, MobilityHubSourceType mobilityHubSourceType) {
        this.a = mobilityHubSourceAction;
        this.b = mobilityHubSourceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2v)) {
            return false;
        }
        a2v a2vVar = (a2v) obj;
        return this.a == a2vVar.a && this.b == a2vVar.b;
    }

    public final int hashCode() {
        MobilityHubSourceAction mobilityHubSourceAction = this.a;
        int hashCode = (mobilityHubSourceAction == null ? 0 : mobilityHubSourceAction.hashCode()) * 31;
        MobilityHubSourceType mobilityHubSourceType = this.b;
        return hashCode + (mobilityHubSourceType != null ? mobilityHubSourceType.hashCode() : 0);
    }

    public final String toString() {
        return "HubSourceParams(sourceAction=" + this.a + ", sourceType=" + this.b + Extension.C_BRAKE;
    }
}
