package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class u23 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new v23(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new v23[i];
    }
}
