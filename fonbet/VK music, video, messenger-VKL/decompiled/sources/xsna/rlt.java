package xsna;

import com.vk.dto.geo.GeoLocation;

/* compiled from: GeoPostsMapDto.kt */
/* loaded from: classes4.dex */
public final class rlt {
    public final GeoLocation a;
    public final boolean b;
    public final klk c;

    public rlt(GeoLocation geoLocation, boolean z, klk klkVar) {
        this.a = geoLocation;
        this.b = z;
        this.c = klkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlt)) {
            return false;
        }
        rlt rltVar = (rlt) obj;
        return epx.f(this.a, rltVar.a) && this.b == rltVar.b && epx.f(this.c, rltVar.c);
    }

    public final int hashCode() {
        GeoLocation geoLocation = this.a;
        return this.c.hashCode() + qoy.b((geoLocation == null ? 0 : geoLocation.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "GeoPostsMapDto(place=" + this.a + ", isMapAvailable=" + this.b + ", currentLocation=" + this.c + ')';
    }
}
