package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes10.dex */
public final class v23 implements tt1 {
    public static final Parcelable.Creator<v23> CREATOR = new u23();
    public final float b;
    public final int c;

    public v23(int i, float f) {
        this.b = f;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v23.class == obj.getClass()) {
            v23 v23Var = (v23) obj;
            if (this.b == v23Var.b && this.c == v23Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.b).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.b + ", svcTemporalLayerCount=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c);
    }

    public v23(Parcel parcel) {
        this.b = parcel.readFloat();
        this.c = parcel.readInt();
    }
}
