package xsna;

import com.vk.dto.geo.GeoLocation;

/* compiled from: ClipsPlace.kt */
/* loaded from: classes16.dex */
public final class ype {
    public final GeoLocation a;

    public ype(GeoLocation geoLocation) {
        this.a = geoLocation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ype) && epx.f(this.a, ((ype) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClipsPlace(location=" + this.a + ')';
    }
}
