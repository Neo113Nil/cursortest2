package defpackage;

import com.yandex.plus.home.api.location.GeoPoint;

/* loaded from: classes8.dex */
public final class jzs {
    public final GeoPoint a;
    public final GeoPoint b;
    public final String c;

    public jzs(GeoPoint geoPoint, GeoPoint geoPoint2, String str) {
        this.a = geoPoint;
        this.b = geoPoint2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzs)) {
            return false;
        }
        jzs jzsVar = (jzs) obj;
        return jl40.l(this.a, jzsVar.a) && jl40.l(this.b, jzsVar.b) && jl40.l(this.c, jzsVar.c);
    }

    public final int hashCode() {
        GeoPoint geoPoint = this.a;
        int hashCode = (geoPoint == null ? 0 : geoPoint.hashCode()) * 31;
        GeoPoint geoPoint2 = this.b;
        int hashCode2 = (hashCode + (geoPoint2 == null ? 0 : geoPoint2.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoLocation(location=");
        sb.append(this.a);
        sb.append(", pinPosition=");
        sb.append(this.b);
        sb.append(", zoneName=");
        return b64.p(sb, this.c, ')');
    }
}
