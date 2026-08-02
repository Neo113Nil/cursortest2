package yads;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* loaded from: classes10.dex */
public final class cz2 implements Parcelable {
    public static final Parcelable.Creator<cz2> CREATOR = new bz2();
    public final String b;

    public cz2(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz2) && epx.f(this.b, ((cz2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("ServerSideReward(rewardUrl=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
