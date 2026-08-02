package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class j401 implements p401 {
    public final String a;
    public final String b;
    public final TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner c;

    public j401(String str, String str2, TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner) {
        this.a = str;
        this.b = str2;
        this.c = trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j401)) {
            return false;
        }
        j401 j401Var = (j401) obj;
        return this.a.equals(j401Var.a) && this.b.equals(j401Var.b) && this.c == j401Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("ImageWithCircleImageOverlap(primaryImageUrl=", this.a, ", overlayImageUrl=", this.b, ", overlapCorner=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
