package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.TrackingCardStatus$Image$Clipping;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i401 implements p401, t401 {
    public final String a;
    public final TrackingCardStatus$Image$Clipping b;

    public i401(String str, TrackingCardStatus$Image$Clipping trackingCardStatus$Image$Clipping) {
        this.a = str;
        this.b = trackingCardStatus$Image$Clipping;
    }

    public final TrackingCardStatus$Image$Clipping a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i401)) {
            return false;
        }
        i401 i401Var = (i401) obj;
        return this.a.equals(i401Var.a) && this.b == i401Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        TrackingCardStatus$Image$Clipping trackingCardStatus$Image$Clipping = this.b;
        return hashCode + (trackingCardStatus$Image$Clipping == null ? 0 : trackingCardStatus$Image$Clipping.hashCode());
    }

    public final String toString() {
        return "Image(url=" + this.a + ", clipping=" + this.b + Extension.C_BRAKE;
    }
}
