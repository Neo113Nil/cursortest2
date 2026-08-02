package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class hr1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = xsna.en.a(rr1.CREATOR, parcel, arrayList, i, 1);
        }
        int readInt2 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
        for (int i2 = 0; i2 != readInt2; i2++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new ir1(arrayList, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ir1[i];
    }
}
