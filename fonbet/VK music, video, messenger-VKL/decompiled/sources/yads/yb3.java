package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes10.dex */
public final class yb3 extends x21 {
    public static final Parcelable.Creator<yb3> CREATOR = new xb3();
    public final String c;
    public final String d;

    public yb3(Parcel parcel) {
        super((String) mc3.a((Object) parcel.readString()));
        this.c = parcel.readString();
        this.d = (String) mc3.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yb3.class == obj.getClass()) {
            yb3 yb3Var = (yb3) obj;
            if (this.b.equals(yb3Var.b) && mc3.a(this.c, yb3Var.c) && mc3.a(this.d, yb3Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a = k4.a(this.b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.c;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.x21
    public final String toString() {
        return this.b + ": url=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public yb3(String str, String str2, String str3) {
        super(str);
        this.c = str2;
        this.d = str3;
    }
}
