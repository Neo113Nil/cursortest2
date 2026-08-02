package yads;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class j5 implements Parcelable {
    public final String b;
    public static final h5 Companion = new h5();
    public static final Parcelable.Creator<j5> CREATOR = new i5();

    public j5(String str) {
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
        return (obj instanceof j5) && epx.f(this.b, ((j5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("AdImpressionData(rawData=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
