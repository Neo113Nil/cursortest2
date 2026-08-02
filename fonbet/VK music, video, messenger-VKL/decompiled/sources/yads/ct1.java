package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class ct1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        for (int i = 0; i != readInt; i++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new dt1(readString, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new dt1[i];
    }
}
