package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class ku1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new lu1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new lu1[i];
    }
}
