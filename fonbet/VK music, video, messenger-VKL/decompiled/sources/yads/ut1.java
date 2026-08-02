package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class ut1 implements Parcelable {
    public static final Parcelable.Creator<ut1> CREATOR = new st1();
    public final tt1[] b;

    public ut1(Parcel parcel) {
        this.b = new tt1[parcel.readInt()];
        int i = 0;
        while (true) {
            tt1[] tt1VarArr = this.b;
            if (i >= tt1VarArr.length) {
                return;
            }
            tt1VarArr[i] = (tt1) parcel.readParcelable(tt1.class.getClassLoader());
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ut1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((ut1) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b.length);
        for (tt1 tt1Var : this.b) {
            parcel.writeParcelable(tt1Var, 0);
        }
    }

    public ut1(List list) {
        this.b = (tt1[]) list.toArray(new tt1[0]);
    }

    public ut1(tt1... tt1VarArr) {
        this.b = tt1VarArr;
    }
}
