package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class or1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        for (int i = 0; i != readInt; i++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
        LinkedHashMap linkedHashMap2 = null;
        j5 createFromParcel = parcel.readInt() == 0 ? null : j5.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap3.put(parcel.readString(), parcel.readString());
            }
            linkedHashMap2 = linkedHashMap3;
        }
        return new rr1(readString, linkedHashMap, createStringArrayList, createStringArrayList2, createStringArrayList3, createFromParcel, linkedHashMap2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new rr1[i];
    }
}
