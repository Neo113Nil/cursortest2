package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class lu1 extends x21 {
    public static final Parcelable.Creator<lu1> CREATOR = new ku1();
    public final int c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;

    public lu1(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = iArr;
        this.g = iArr2;
    }

    @Override // yads.x21, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lu1.class == obj.getClass()) {
            lu1 lu1Var = (lu1) obj;
            if (this.c == lu1Var.c && this.d == lu1Var.d && this.e == lu1Var.e && Arrays.equals(this.f, lu1Var.f) && Arrays.equals(this.g, lu1Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.g) + xsna.dq.d((((((this.c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.d) * 31) + this.e) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.g);
    }

    public lu1(Parcel parcel) {
        super("MLLT");
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = (int[]) mc3.a(parcel.createIntArray());
        this.g = (int[]) mc3.a(parcel.createIntArray());
    }
}
