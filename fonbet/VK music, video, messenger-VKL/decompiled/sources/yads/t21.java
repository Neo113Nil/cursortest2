package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import xsna.h5s;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class t21 implements tt1 {
    public static final Parcelable.Creator<t21> CREATOR = new s21();
    public final byte[] b;
    public final String c;
    public final String d;

    public t21(Parcel parcel) {
        this.b = (byte[]) ni.a(parcel.createByteArray());
        this.c = parcel.readString();
        this.d = parcel.readString();
    }

    @Override // yads.tt1
    public final void a(jn1 jn1Var) {
        String str = this.c;
        if (str != null) {
            jn1Var.a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t21.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((t21) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return h5s.c(this.b.length, "\"", xe9.a("ICY: title=\"", this.c, "\", url=\"", this.d, "\", rawMetadata.length=\""));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public t21(byte[] bArr, String str, String str2) {
        this.b = bArr;
        this.c = str;
        this.d = str2;
    }
}
