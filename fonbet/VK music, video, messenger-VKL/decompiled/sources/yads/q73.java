package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class q73 extends n33 {
    public static final Parcelable.Creator<q73> CREATOR = new p73();
    public final long b;
    public final long c;

    public q73(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public static long a(long j, kc2 kc2Var) {
        long m = kc2Var.m();
        return (128 & m) != 0 ? 8589934591L & ((((m & 1) << 32) | kc2Var.n()) + j) : C.TIME_UNSET;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
