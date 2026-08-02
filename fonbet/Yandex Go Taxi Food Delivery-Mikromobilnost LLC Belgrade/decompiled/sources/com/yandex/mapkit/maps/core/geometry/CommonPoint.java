package com.yandex.mapkit.maps.core.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nzs;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/CommonPoint;", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "", "lat", "lon", "<init>", "(DD)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()D", "component2", "copy", "(DD)Lcom/yandex/mapkit/maps/core/geometry/CommonPoint;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_REQUEST_D, "getLat", "getLon", "exported-geometry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CommonPoint implements Point {
    public static final Parcelable.Creator<CommonPoint> CREATOR = new Creator();
    private final double lat;
    private final double lon;

    public CommonPoint(double d, double d2) {
        this.lat = d;
        this.lon = d2;
    }

    public static /* synthetic */ CommonPoint copy$default(CommonPoint commonPoint, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = commonPoint.lat;
        }
        if ((i & 2) != 0) {
            d2 = commonPoint.lon;
        }
        return commonPoint.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    public final CommonPoint copy(double lat, double lon) {
        return new CommonPoint(lat, lon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonPoint)) {
            return false;
        }
        CommonPoint commonPoint = (CommonPoint) other;
        return Double.compare(this.lat, commonPoint.lat) == 0 && Double.compare(this.lon, commonPoint.lon) == 0;
    }

    @Override // com.yandex.mapkit.maps.core.geometry.Point
    public double getLat() {
        return this.lat;
    }

    @Override // com.yandex.mapkit.maps.core.geometry.Point
    public double getLon() {
        return this.lon;
    }

    public int hashCode() {
        return Double.hashCode(this.lon) + (Double.hashCode(this.lat) * 31);
    }

    public String toString() {
        double d = this.lat;
        return nzs.c(oyr.u(d, "CommonPoint(lat=", ", lon="), this.lon, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.lat);
        dest.writeDouble(this.lon);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommonPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonPoint createFromParcel(Parcel parcel) {
            return new CommonPoint(parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonPoint[] newArray(int i) {
            return new CommonPoint[i];
        }
    }
}
