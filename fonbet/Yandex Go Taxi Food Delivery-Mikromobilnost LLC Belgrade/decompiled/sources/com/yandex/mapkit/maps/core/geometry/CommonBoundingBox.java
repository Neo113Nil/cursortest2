package com.yandex.mapkit.maps.core.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/CommonBoundingBox;", "Lcom/yandex/mapkit/maps/core/geometry/BoundingBox;", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "southWest", "northEast", "<init>", "(Lcom/yandex/mapkit/maps/core/geometry/Point;Lcom/yandex/mapkit/maps/core/geometry/Point;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/mapkit/maps/core/geometry/Point;", "component2", "copy", "(Lcom/yandex/mapkit/maps/core/geometry/Point;Lcom/yandex/mapkit/maps/core/geometry/Point;)Lcom/yandex/mapkit/maps/core/geometry/CommonBoundingBox;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "getSouthWest", "getNorthEast", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class CommonBoundingBox implements BoundingBox {
    public static final Parcelable.Creator<CommonBoundingBox> CREATOR = new Creator();
    private final Point northEast;
    private final Point southWest;

    public CommonBoundingBox(Point point, Point point2) {
        this.southWest = point;
        this.northEast = point2;
    }

    public static /* synthetic */ CommonBoundingBox copy$default(CommonBoundingBox commonBoundingBox, Point point, Point point2, int i, Object obj) {
        if ((i & 1) != 0) {
            point = commonBoundingBox.southWest;
        }
        if ((i & 2) != 0) {
            point2 = commonBoundingBox.northEast;
        }
        return commonBoundingBox.copy(point, point2);
    }

    /* renamed from: component1, reason: from getter */
    public final Point getSouthWest() {
        return this.southWest;
    }

    /* renamed from: component2, reason: from getter */
    public final Point getNorthEast() {
        return this.northEast;
    }

    public final CommonBoundingBox copy(Point southWest, Point northEast) {
        return new CommonBoundingBox(southWest, northEast);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonBoundingBox)) {
            return false;
        }
        CommonBoundingBox commonBoundingBox = (CommonBoundingBox) other;
        return jl40.l(this.southWest, commonBoundingBox.southWest) && jl40.l(this.northEast, commonBoundingBox.northEast);
    }

    @Override // com.yandex.mapkit.maps.core.geometry.BoundingBox
    public Point getNorthEast() {
        return this.northEast;
    }

    @Override // com.yandex.mapkit.maps.core.geometry.BoundingBox
    public Point getSouthWest() {
        return this.southWest;
    }

    public int hashCode() {
        return this.northEast.hashCode() + (this.southWest.hashCode() * 31);
    }

    public String toString() {
        return "CommonBoundingBox(southWest=" + this.southWest + ", northEast=" + this.northEast + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.southWest, flags);
        dest.writeParcelable(this.northEast, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommonBoundingBox> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonBoundingBox createFromParcel(Parcel parcel) {
            return new CommonBoundingBox((Point) parcel.readParcelable(CommonBoundingBox.class.getClassLoader()), (Point) parcel.readParcelable(CommonBoundingBox.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonBoundingBox[] newArray(int i) {
            return new CommonBoundingBox[i];
        }
    }
}
