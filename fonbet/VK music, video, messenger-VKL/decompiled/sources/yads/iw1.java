package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes10.dex */
public final class iw1 implements tt1 {
    public static final Parcelable.Creator<iw1> CREATOR = new hw1();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public iw1(long j, long j2, long j3, long j4, long j5) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iw1.class == obj.getClass()) {
            iw1 iw1Var = (iw1) obj;
            if (this.b == iw1Var.b && this.c == iw1Var.c && this.d == iw1Var.d && this.e == iw1Var.e && this.f == iw1Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        int i = (((int) (j ^ (j >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.e;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f;
        return i4 + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.b + ", photoSize=" + this.c + ", photoPresentationTimestampUs=" + this.d + ", videoStartPosition=" + this.e + ", videoSize=" + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
    }

    public iw1(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
    }
}
