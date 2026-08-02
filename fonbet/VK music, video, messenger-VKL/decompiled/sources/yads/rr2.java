package yads;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* loaded from: classes10.dex */
public final class rr2 implements Parcelable {
    public static final Parcelable.Creator<rr2> CREATOR = new pr2();
    public final boolean b;
    public final rv c;
    public final cz2 d;

    public rr2(boolean z, rv rvVar, cz2 cz2Var) {
        this.b = z;
        this.c = rvVar;
        this.d = cz2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr2)) {
            return false;
        }
        rr2 rr2Var = (rr2) obj;
        return this.b == rr2Var.b && epx.f(this.c, rr2Var.c) && epx.f(this.d, rr2Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        rv rvVar = this.c;
        int hashCode2 = (hashCode + (rvVar == null ? 0 : rvVar.hashCode())) * 31;
        cz2 cz2Var = this.d;
        return hashCode2 + (cz2Var != null ? cz2Var.b.hashCode() : 0);
    }

    public final String toString() {
        return "RewardData(serverSideRewardType=" + this.b + ", clientSideReward=" + this.c + ", serverSideReward=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        rv rvVar = this.c;
        if (rvVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(rvVar.b);
            parcel.writeString(rvVar.c);
        }
        cz2 cz2Var = this.d;
        if (cz2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cz2Var.b);
        }
    }
}
