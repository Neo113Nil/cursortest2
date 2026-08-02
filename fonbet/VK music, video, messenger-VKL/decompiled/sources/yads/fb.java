package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class fb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = xsna.en.a(rr1.CREATOR, parcel, arrayList, i, 1);
        }
        return new gb(readString, parcel.readString(), arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new gb[i];
    }
}
