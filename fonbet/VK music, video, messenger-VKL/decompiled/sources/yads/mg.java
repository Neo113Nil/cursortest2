package yads;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.i5s;

/* loaded from: classes10.dex */
public final class mg implements tt1 {
    public static final Parcelable.Creator<mg> CREATOR = new lg();
    public final int b;
    public final String c;

    public mg(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.b);
        sb.append(",url=");
        return i5s.a(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.b);
    }
}
