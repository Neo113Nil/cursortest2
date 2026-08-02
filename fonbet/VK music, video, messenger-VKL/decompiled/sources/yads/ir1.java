package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ir1 implements Parcelable {
    public static final Parcelable.Creator<ir1> CREATOR = new hr1();
    public final List b;
    public final Map c;

    public ir1(ArrayList arrayList, Map map) {
        this.b = arrayList;
        this.c = map;
    }

    public final List c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a = xsna.ao.a(parcel, this.b);
        while (a.hasNext()) {
            ((rr1) a.next()).writeToParcel(parcel, i);
        }
        Map map = this.c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
