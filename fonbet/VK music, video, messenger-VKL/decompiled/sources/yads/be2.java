package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class be2 implements tt1 {
    public static final Parcelable.Creator<be2> CREATOR = new ae2();
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final byte[] i;

    public be2(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = bArr;
    }

    @Override // yads.tt1
    public final void a(jn1 jn1Var) {
        byte[] bArr = this.i;
        int i = this.b;
        if (jn1Var.j == null || mc3.a((Object) Integer.valueOf(i), (Object) 3) || !mc3.a((Object) jn1Var.k, (Object) 3)) {
            jn1Var.j = (byte[]) bArr.clone();
            jn1Var.k = Integer.valueOf(i);
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
        if (obj != null && be2.class == obj.getClass()) {
            be2 be2Var = (be2) obj;
            if (this.b == be2Var.b && this.c.equals(be2Var.c) && this.d.equals(be2Var.d) && this.e == be2Var.e && this.f == be2Var.f && this.g == be2Var.g && this.h == be2Var.h && Arrays.equals(this.i, be2Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.i) + ((((((((k4.a(this.d, k4.a(this.c, (this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31), 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.i);
    }

    public be2(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = (String) mc3.a((Object) parcel.readString());
        this.d = (String) mc3.a((Object) parcel.readString());
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (byte[]) mc3.a((Object) parcel.createByteArray());
    }
}
