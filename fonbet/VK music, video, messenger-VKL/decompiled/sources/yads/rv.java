package yads;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* loaded from: classes10.dex */
public final class rv implements Parcelable {
    public static final Parcelable.Creator<rv> CREATOR = new qv();
    public final int b;
    public final String c;

    public rv(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv)) {
            return false;
        }
        rv rvVar = (rv) obj;
        return this.b == rvVar.b && epx.f(this.c, rvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return xsna.gq.b(this.b, "ClientSideReward(rewardAmount=", ", rewardType=", this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }
}
