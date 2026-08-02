package com.yandex.alicekit.core.location;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nzs;
import defpackage.w511;

/* loaded from: classes11.dex */
public class GeoPoint implements Parcelable {
    public static final Parcelable.Creator<GeoPoint> CREATOR = new Parcelable.Creator<GeoPoint>() { // from class: com.yandex.alicekit.core.location.GeoPoint.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GeoPoint createFromParcel(Parcel parcel) {
            return new GeoPoint(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GeoPoint[] newArray(int i) {
            return new GeoPoint[i];
        }
    };
    private final double mLatitude;
    private final double mLongitude;

    public GeoPoint(Parcel parcel) {
        this.mLatitude = parcel.readDouble();
        this.mLongitude = parcel.readDouble();
    }

    public static GeoPoint valueOf(double d, double d2) {
        if (!Double.isNaN(d) && !Double.isInfinite(d) && !Double.isNaN(d2) && !Double.isInfinite(d2)) {
            return new GeoPoint(d, d2);
        }
        w511.q();
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GeoPoint { latitude = ");
        sb.append(this.mLatitude);
        sb.append(", longitude = ");
        return nzs.c(sb, this.mLongitude, " }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mLatitude);
        parcel.writeDouble(this.mLongitude);
    }

    private GeoPoint(double d, double d2) {
        this.mLatitude = d;
        this.mLongitude = d2;
    }
}
