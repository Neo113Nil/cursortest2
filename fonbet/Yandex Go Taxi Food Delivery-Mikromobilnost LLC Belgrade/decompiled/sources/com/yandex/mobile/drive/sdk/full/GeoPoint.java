package com.yandex.mobile.drive.sdk.full;

import defpackage.nzs;
import defpackage.oyr;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/GeoPoint;", "", "", "lat", "lon", "<init>", "(DD)V", CA20Status.STATUS_REQUEST_D, "a", "()D", "b", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GeoPoint {

    @ysq0("lat")
    private final double lat;

    @ysq0("lon")
    private final double lon;

    public GeoPoint(double d, double d2) {
        this.lat = d;
        this.lon = d2;
    }

    /* renamed from: a, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: b, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoPoint)) {
            return false;
        }
        GeoPoint geoPoint = (GeoPoint) obj;
        return Double.compare(this.lat, geoPoint.lat) == 0 && Double.compare(this.lon, geoPoint.lon) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.lon) + (Double.hashCode(this.lat) * 31);
    }

    public final String toString() {
        double d = this.lat;
        return nzs.c(oyr.u(d, "GeoPoint(lat=", ", lon="), this.lon, Extension.C_BRAKE);
    }
}
