package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes10.dex */
public class bo3 implements tt1 {
    public static final Parcelable.Creator<bo3> CREATOR = new zn3();
    public final String b;
    public final String c;

    public bo3(Parcel parcel) {
        this.b = (String) mc3.a((Object) parcel.readString());
        this.c = (String) mc3.a((Object) parcel.readString());
    }

    @Override // yads.tt1
    public final void a(jn1 jn1Var) {
        String str = this.b;
        str.getClass();
        switch (str) {
            case "ALBUM":
                jn1Var.c = this.c;
                break;
            case "TITLE":
                jn1Var.a = this.c;
                break;
            case "DESCRIPTION":
                jn1Var.g = this.c;
                break;
            case "ALBUMARTIST":
                jn1Var.d = this.c;
                break;
            case "ARTIST":
                jn1Var.b = this.c;
                break;
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
        if (obj != null && getClass() == obj.getClass()) {
            bo3 bo3Var = (bo3) obj;
            if (this.b.equals(bo3Var.b) && this.c.equals(bo3Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + k4.a(this.b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    public final String toString() {
        return "VC: " + this.b + "=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public bo3(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
