package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class z43 implements Comparable, Parcelable {
    public static final Parcelable.Creator<z43> CREATOR = new y43();
    public final int b;
    public final int c;
    public final int d;

    public z43(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        z43 z43Var = (z43) obj;
        int i = this.b - z43Var.b;
        if (i != 0) {
            return i;
        }
        int i2 = this.c - z43Var.c;
        return i2 == 0 ? this.d - z43Var.d : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z43.class == obj.getClass()) {
            z43 z43Var = (z43) obj;
            if (this.b == z43Var.b && this.c == z43Var.c && this.d == z43Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return this.b + "." + this.c + "." + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public z43(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
