package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class kk0 implements Parcelable {
    public static final Parcelable.Creator<kk0> CREATOR = new jk0();
    public int b;
    public final UUID c;
    public final String d;
    public final String e;
    public final byte[] f;

    public kk0(Parcel parcel) {
        this.c = new UUID(parcel.readLong(), parcel.readLong());
        this.d = parcel.readString();
        this.e = (String) mc3.a((Object) parcel.readString());
        this.f = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        return jr.a.equals(this.c) || uuid.equals(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kk0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        kk0 kk0Var = (kk0) obj;
        return mc3.a(this.d, kk0Var.d) && mc3.a(this.e, kk0Var.e) && mc3.a(this.c, kk0Var.c) && Arrays.equals(this.f, kk0Var.f);
    }

    public final int hashCode() {
        if (this.b == 0) {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            this.b = Arrays.hashCode(this.f) + k4.a(this.e, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.c.getMostSignificantBits());
        parcel.writeLong(this.c.getLeastSignificantBits());
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByteArray(this.f);
    }

    public kk0(UUID uuid, String str, String str2, byte[] bArr) {
        this.c = (UUID) ni.a(uuid);
        this.d = str;
        this.e = (String) ni.a((Object) str2);
        this.f = bArr;
    }
}
