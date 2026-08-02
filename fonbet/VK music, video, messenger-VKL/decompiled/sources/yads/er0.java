package yads;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.rqi;

/* loaded from: classes10.dex */
public final class er0 implements Parcelable {
    public static final Parcelable.Creator<er0> CREATOR = new dr0();
    public final String b;
    public final long c;

    public er0(String str, long j) {
        this.b = str;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er0)) {
            return false;
        }
        er0 er0Var = (er0) obj;
        return epx.f(this.b, er0Var.b) && this.c == er0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder d = rqi.d(this.c, "FalseClick(url=", this.b, ", interval=");
        d.append(")");
        return d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }
}
