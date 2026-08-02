package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class hk1 implements tt1 {
    public static final Parcelable.Creator<hk1> CREATOR = new gk1();
    public final String b;
    public final byte[] c;
    public final int d;
    public final int e;

    public hk1(int i, int i2, String str, byte[] bArr) {
        this.b = str;
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hk1.class == obj.getClass()) {
            hk1 hk1Var = (hk1) obj;
            if (this.b.equals(hk1Var.b) && Arrays.equals(this.c, hk1Var.c) && this.d == hk1Var.d && this.e == hk1Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.c) + k4.a(this.b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "mdta: key=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }

    public hk1(Parcel parcel) {
        this.b = (String) mc3.a((Object) parcel.readString());
        this.c = (byte[]) mc3.a((Object) parcel.createByteArray());
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }
}
