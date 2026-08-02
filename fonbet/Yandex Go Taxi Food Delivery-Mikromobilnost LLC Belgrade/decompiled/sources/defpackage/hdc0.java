package defpackage;

import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$GeometryEasing;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hdc0 {
    public final Float a;
    public final Double b;
    public final Double c;
    public final PlacesPinWarV2Config$GeometryEasing d;

    public hdc0(Float f, Double d, Double d2, PlacesPinWarV2Config$GeometryEasing placesPinWarV2Config$GeometryEasing) {
        this.a = f;
        this.b = d;
        this.c = d2;
        this.d = placesPinWarV2Config$GeometryEasing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdc0)) {
            return false;
        }
        hdc0 hdc0Var = (hdc0) obj;
        return jl40.l(this.a, hdc0Var.a) && jl40.l(this.b, hdc0Var.b) && jl40.l(this.c, hdc0Var.c) && this.d == hdc0Var.d;
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        PlacesPinWarV2Config$GeometryEasing placesPinWarV2Config$GeometryEasing = this.d;
        return hashCode3 + (placesPinWarV2Config$GeometryEasing != null ? placesPinWarV2Config$GeometryEasing.hashCode() : 0);
    }

    public final String toString() {
        return "Animation(showAnimationDurationSeconds=" + this.a + ", maxAnimatedDistance=" + this.b + ", minAnimatedDistance=" + this.c + ", geometryEasing=" + this.d + Extension.C_BRAKE;
    }

    public hdc0() {
        this(null, null, null, null);
    }
}
