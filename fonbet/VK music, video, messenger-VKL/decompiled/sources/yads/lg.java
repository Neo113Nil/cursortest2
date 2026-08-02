package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class lg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return new mg(parcel.readInt(), readString);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new mg[i];
    }
}
