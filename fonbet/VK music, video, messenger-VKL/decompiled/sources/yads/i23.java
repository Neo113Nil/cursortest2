package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class i23 implements Parcelable {
    public static final Parcelable.Creator<i23> CREATOR = new h23();
    public final long b;
    public final long c;
    public final int d;

    public i23(int i, long j, long j2) {
        ni.a(j < j2);
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i23.class == obj.getClass()) {
            i23 i23Var = (i23) obj;
            if (this.b == i23Var.b && this.c == i23Var.c && this.d == i23Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        int i = this.d;
        int i2 = mc3.a;
        Locale locale = Locale.US;
        StringBuilder b = xsna.fp.b(j, "Segment: startTimeMs=", ", endTimeMs=");
        b.append(j2);
        b.append(", speedDivisor=");
        b.append(i);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
    }
}
