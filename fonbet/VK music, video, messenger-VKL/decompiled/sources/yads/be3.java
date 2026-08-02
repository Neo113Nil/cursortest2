package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class be3 implements Parcelable {
    public static final Parcelable.Creator<be3> CREATOR = new zd3();
    public final ae3 b;
    public final float c;

    public be3(ae3 ae3Var, float f) {
        this.b = ae3Var;
        this.c = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ae3 ae3Var = this.b;
        parcel.writeInt(ae3Var != null ? ae3Var.ordinal() : -1);
        parcel.writeFloat(this.c);
    }
}
