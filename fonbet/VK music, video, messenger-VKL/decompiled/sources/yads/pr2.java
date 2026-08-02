package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class pr2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new rr2(parcel.readInt() != 0, parcel.readInt() == 0 ? null : rv.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? cz2.CREATOR.createFromParcel(parcel) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new rr2[i];
    }
}
