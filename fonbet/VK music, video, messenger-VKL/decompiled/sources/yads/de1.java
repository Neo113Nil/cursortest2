package yads;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class de1 implements Parcelable {
    public static final Parcelable.Creator<de1> CREATOR = new ce1();
    public final String b;
    public final String c;
    public final boolean d;

    public de1(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de1)) {
            return false;
        }
        de1 de1Var = (de1) obj;
        return epx.f(this.b, de1Var.b) && epx.f(this.c, de1Var.c) && this.d == de1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k4.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        return xsna.n23.b(xe9.a("JavaScriptResource(apiFramework=", str, ", url=", str2, ", browserOptional="), this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
