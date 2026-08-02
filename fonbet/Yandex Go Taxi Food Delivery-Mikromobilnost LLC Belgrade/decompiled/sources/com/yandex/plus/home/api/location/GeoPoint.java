package com.yandex.plus.home.api.location;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.unr0;
import defpackage.wzs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\rJ.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006'"}, d2 = {"Lcom/yandex/plus/home/api/location/GeoPoint;", "Landroid/os/Parcelable;", "", "lat", "lon", "", "accuracy", "<init>", "(DDI)V", "", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()D", "component2", "component3", "copy", "(DDI)Lcom/yandex/plus/home/api/location/GeoPoint;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_REQUEST_D, "getLat", "getLon", CA20Status.STATUS_USER_I, "getAccuracy", "Companion", "wzs", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class GeoPoint implements Parcelable {
    private final int accuracy;
    private final double lat;
    private final double lon;
    public static final wzs Companion = new wzs();
    public static final Parcelable.Creator<GeoPoint> CREATOR = new Creator();
    private static final GeoPoint EMPTY = new GeoPoint(0.0d, 0.0d, 0, 4, null);

    public /* synthetic */ GeoPoint(double d, double d2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ GeoPoint copy$default(GeoPoint geoPoint, double d, double d2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = geoPoint.lat;
        }
        double d3 = d;
        if ((i2 & 2) != 0) {
            d2 = geoPoint.lon;
        }
        double d4 = d2;
        if ((i2 & 4) != 0) {
            i = geoPoint.accuracy;
        }
        return geoPoint.copy(d3, d4, i);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAccuracy() {
        return this.accuracy;
    }

    public final GeoPoint copy(double lat, double lon, int accuracy) {
        return new GeoPoint(lat, lon, accuracy);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoPoint)) {
            return false;
        }
        GeoPoint geoPoint = (GeoPoint) other;
        return Double.compare(this.lat, geoPoint.lat) == 0 && Double.compare(this.lon, geoPoint.lon) == 0 && this.accuracy == geoPoint.accuracy;
    }

    public final int getAccuracy() {
        return this.accuracy;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public int hashCode() {
        return Integer.hashCode(this.accuracy) + unr0.a(Double.hashCode(this.lat) * 31, 31, this.lon);
    }

    public String toString() {
        return "[lat=" + this.lat + ", lon=" + this.lon + "] accuracy=" + this.accuracy;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.lat);
        dest.writeDouble(this.lon);
        dest.writeInt(this.accuracy);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GeoPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GeoPoint createFromParcel(Parcel parcel) {
            return new GeoPoint(parcel.readDouble(), parcel.readDouble(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GeoPoint[] newArray(int i) {
            return new GeoPoint[i];
        }
    }

    public GeoPoint(double d, double d2, int i) {
        this.lat = d;
        this.lon = d2;
        this.accuracy = i;
    }
}
