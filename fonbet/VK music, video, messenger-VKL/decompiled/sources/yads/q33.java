package yads;

import android.os.Parcel;

/* loaded from: classes10.dex */
public final class q33 {
    public final int a;
    public final long b;
    public final long c;

    public q33(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public static q33 a(Parcel parcel) {
        return new q33(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }
}
