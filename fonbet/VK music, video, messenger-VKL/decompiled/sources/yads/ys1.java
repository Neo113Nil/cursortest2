package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class ys1 implements Parcelable {
    public final String b;
    public final List c;
    public static final ws1 Companion = new ws1();
    public static final Parcelable.Creator<ys1> CREATOR = new xs1();
    public static final KSerializer[] d = {null, new xsna.yk3(at1.a)};

    public /* synthetic */ ys1(int i, String str, List list) {
        if (3 != (i & 3)) {
            xsna.sp.x(i, 3, vs1.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys1)) {
            return false;
        }
        ys1 ys1Var = (ys1) obj;
        return epx.f(this.b, ys1Var.b) && epx.f(this.c, ys1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnit(adUnitId=" + this.b + ", networks=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Iterator a = xsna.ao.a(parcel, this.c);
        while (a.hasNext()) {
            ((dt1) a.next()).writeToParcel(parcel, i);
        }
    }

    public ys1(String str, ArrayList arrayList) {
        this.b = str;
        this.c = arrayList;
    }
}
