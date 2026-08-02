package defpackage;

import com.yandex.plus.home.api.location.GeoPoint;

/* loaded from: classes8.dex */
public final class kzs {
    public final lzs a;

    public kzs(lzs lzsVar) {
        this.a = lzsVar;
    }

    public final n9z a() {
        jzs a = this.a.a();
        if (a == null) {
            return null;
        }
        GeoPoint geoPoint = a.a;
        yf70 c0 = qje.c0(geoPoint != null ? new eoe(geoPoint.getAccuracy(), geoPoint.getLat(), geoPoint.getLon()) : null);
        GeoPoint geoPoint2 = a.b;
        return new n9z(c0, qje.c0(geoPoint2 != null ? new eoe(geoPoint2.getAccuracy(), geoPoint2.getLat(), geoPoint2.getLon()) : null), 2);
    }
}
