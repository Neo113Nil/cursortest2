package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class lk0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<lk0> CREATOR = new ik0();
    public final kk0[] b;
    public int c;
    public final String d;
    public final int e;

    public lk0(Parcel parcel) {
        this.d = parcel.readString();
        kk0[] kk0VarArr = (kk0[]) mc3.a((kk0[]) parcel.createTypedArray(kk0.CREATOR));
        this.b = kk0VarArr;
        this.e = kk0VarArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        kk0 kk0Var = (kk0) obj;
        kk0 kk0Var2 = (kk0) obj2;
        UUID uuid = jr.a;
        return uuid.equals(kk0Var.c) ? uuid.equals(kk0Var2.c) ? 0 : 1 : kk0Var.c.compareTo(kk0Var2.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lk0.class == obj.getClass()) {
            lk0 lk0Var = (lk0) obj;
            if (mc3.a(this.d, lk0Var.d) && Arrays.equals(this.b, lk0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == 0) {
            String str = this.d;
            this.c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.b);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeTypedArray(this.b, 0);
    }

    public lk0(String str, boolean z, kk0... kk0VarArr) {
        this.d = str;
        kk0VarArr = z ? (kk0[]) kk0VarArr.clone() : kk0VarArr;
        this.b = kk0VarArr;
        this.e = kk0VarArr.length;
        Arrays.sort(kk0VarArr, this);
    }
}
