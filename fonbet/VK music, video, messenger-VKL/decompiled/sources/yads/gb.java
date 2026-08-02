package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.i5s;

/* loaded from: classes10.dex */
public final class gb implements Parcelable {
    public static final Parcelable.Creator<gb> CREATOR = new fb();
    public final String b;
    public final List c;
    public final String d;

    public gb(String str, String str2, ArrayList arrayList) {
        this.b = str;
        this.c = arrayList;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return epx.f(this.b, gbVar.b) && epx.f(this.c, gbVar.c) && epx.f(this.d, gbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + eb.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.b;
        List list = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder("AdUnitIdBiddingSettings(adUnitId=");
        sb.append(str);
        sb.append(", mediationNetworks=");
        sb.append(list);
        sb.append(", rawData=");
        return i5s.a(sb, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Iterator a = xsna.ao.a(parcel, this.c);
        while (a.hasNext()) {
            ((rr1) a.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
    }
}
