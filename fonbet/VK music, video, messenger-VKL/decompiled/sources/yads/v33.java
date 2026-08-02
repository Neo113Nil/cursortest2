package yads;

import android.os.Parcel;

/* loaded from: classes10.dex */
public final class v33 {
    public final int a;
    public final long b;

    public v33(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static v33 a(Parcel parcel) {
        return new v33(parcel.readInt(), parcel.readLong());
    }
}
