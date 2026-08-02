package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class s21 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new t21(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new t21[i];
    }
}
