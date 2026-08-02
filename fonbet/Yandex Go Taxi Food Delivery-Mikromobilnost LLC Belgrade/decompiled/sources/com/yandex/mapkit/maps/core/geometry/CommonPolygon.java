package com.yandex.mapkit.maps.core.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/CommonPolygon;", "Lcom/yandex/mapkit/maps/core/geometry/Polygon;", "", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "coordinates", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/yandex/mapkit/maps/core/geometry/CommonPolygon;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCoordinates", "exported-geometry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CommonPolygon implements Polygon {
    public static final Parcelable.Creator<CommonPolygon> CREATOR = new Creator();
    private final List<Point> coordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonPolygon(List<? extends Point> list) {
        this.coordinates = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonPolygon copy$default(CommonPolygon commonPolygon, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = commonPolygon.coordinates;
        }
        return commonPolygon.copy(list);
    }

    public final List<Point> component1() {
        return this.coordinates;
    }

    public final CommonPolygon copy(List<? extends Point> coordinates) {
        return new CommonPolygon(coordinates);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CommonPolygon) && jl40.l(this.coordinates, ((CommonPolygon) other).coordinates);
    }

    @Override // com.yandex.mapkit.maps.core.geometry.Polygon
    public List<Point> getCoordinates() {
        return this.coordinates;
    }

    public int hashCode() {
        return this.coordinates.hashCode();
    }

    public String toString() {
        return tse0.k("CommonPolygon(coordinates=", Extension.C_BRAKE, this.coordinates);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Iterator t = vfc.t(dest, this.coordinates);
        while (t.hasNext()) {
            dest.writeParcelable((Parcelable) t.next(), flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommonPolygon> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonPolygon createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = vfc.e(CommonPolygon.class, parcel, arrayList, i, 1);
            }
            return new CommonPolygon(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonPolygon[] newArray(int i) {
            return new CommonPolygon[i];
        }
    }
}
