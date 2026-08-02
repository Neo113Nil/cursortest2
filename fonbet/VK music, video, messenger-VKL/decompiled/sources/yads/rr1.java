package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.vq;

/* loaded from: classes10.dex */
public final class rr1 implements Parcelable {
    public static final Parcelable.Creator<rr1> CREATOR = new or1();
    public final String b;
    public final Map c;
    public final List d;
    public final List e;
    public final List f;
    public final j5 g;
    public final Map h;

    public rr1(String str, Map map, List list, List list2, List list3, j5 j5Var, Map map2) {
        this.b = str;
        this.c = map;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = j5Var;
        this.h = map2;
    }

    public final Map d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr1)) {
            return false;
        }
        rr1 rr1Var = (rr1) obj;
        return epx.f(this.b, rr1Var.b) && epx.f(this.c, rr1Var.c) && epx.f(this.d, rr1Var.d) && epx.f(this.e, rr1Var.e) && epx.f(this.f, rr1Var.f) && epx.f(this.g, rr1Var.g) && epx.f(this.h, rr1Var.h);
    }

    public final int hashCode() {
        int a = xsna.v11.a(this.b.hashCode() * 31, 31, this.c);
        List list = this.d;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        j5 j5Var = this.g;
        int hashCode4 = (hashCode3 + (j5Var == null ? 0 : j5Var.b.hashCode())) * 31;
        Map map = this.h;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        Map map = this.c;
        List list = this.d;
        List list2 = this.e;
        List list3 = this.f;
        j5 j5Var = this.g;
        Map map2 = this.h;
        StringBuilder sb = new StringBuilder("MediationNetwork(adapter=");
        sb.append(str);
        sb.append(", networkData=");
        sb.append(map);
        sb.append(", impressionTrackingUrls=");
        vq.d(sb, list, ", clickTrackingUrls=", list2, ", adResponseTrackingUrls=");
        sb.append(list3);
        sb.append(", adImpressionData=");
        sb.append(j5Var);
        sb.append(", biddingInfo=");
        sb.append(map2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Map map = this.c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeStringList(this.d);
        parcel.writeStringList(this.e);
        parcel.writeStringList(this.f);
        j5 j5Var = this.g;
        if (j5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(j5Var.b);
        }
        Map map2 = this.h;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
    }
}
