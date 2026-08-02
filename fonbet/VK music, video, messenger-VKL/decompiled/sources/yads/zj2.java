package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class zj2 extends n33 {
    public static final Parcelable.Creator<zj2> CREATOR = new yj2();
    public final long b;
    public final long c;
    public final byte[] d;

    public zj2(long j, byte[] bArr, long j2) {
        this.b = j2;
        this.c = j;
        this.d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeByteArray(this.d);
    }

    public zj2(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = (byte[]) mc3.a((Object) parcel.createByteArray());
    }
}
