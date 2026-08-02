package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/yandex/passport/api/PassportLatLng;", "Landroid/os/Parcelable;", "", "lat", "lon", "<init>", "(DD)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()D", "component2", "copy", "(DD)Lcom/yandex/passport/api/PassportLatLng;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_REQUEST_D, "getLat", "getLon", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PassportLatLng implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PassportLatLng> CREATOR = new Creator();
    private final double lat;
    private final double lon;

    public PassportLatLng(double d, double d2) {
        this.lat = d;
        this.lon = d2;
    }

    public static /* synthetic */ PassportLatLng copy$default(PassportLatLng passportLatLng, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = passportLatLng.lat;
        }
        if ((i & 2) != 0) {
            d2 = passportLatLng.lon;
        }
        return passportLatLng.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    public final PassportLatLng copy(double lat, double lon) {
        return new PassportLatLng(lat, lon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportLatLng)) {
            return false;
        }
        PassportLatLng passportLatLng = (PassportLatLng) other;
        return Double.compare(this.lat, passportLatLng.lat) == 0 && Double.compare(this.lon, passportLatLng.lon) == 0;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public int hashCode() {
        return Double.hashCode(this.lon) + (Double.hashCode(this.lat) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PassportLatLng(lat=");
        sb.append(this.lat);
        sb.append(", lon=");
        return unr0.q(sb, this.lon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.lat);
        dest.writeDouble(this.lon);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportLatLng> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportLatLng createFromParcel(Parcel parcel) {
            return new PassportLatLng(parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportLatLng[] newArray(int i) {
            return new PassportLatLng[i];
        }
    }
}
