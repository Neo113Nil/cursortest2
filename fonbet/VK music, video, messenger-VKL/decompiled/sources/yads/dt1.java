package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.jdz;
import xsna.oqm0;
import xsna.xn8;

@imi0
/* loaded from: classes10.dex */
public final class dt1 implements Parcelable {
    public static final KSerializer[] d;
    public final String b;
    public final Map c;
    public static final bt1 Companion = new bt1();
    public static final Parcelable.Creator<dt1> CREATOR = new ct1();

    static {
        oqm0 oqm0Var = oqm0.a;
        d = new KSerializer[]{null, new jdz(oqm0Var, xn8.a(oqm0Var))};
    }

    public /* synthetic */ dt1(int i, String str, Map map) {
        if (3 != (i & 3)) {
            xsna.sp.x(i, 3, at1.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt1)) {
            return false;
        }
        dt1 dt1Var = (dt1) obj;
        return epx.f(this.b, dt1Var.b) && epx.f(this.c, dt1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchNetwork(adapter=" + this.b + ", networkData=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Map map = this.c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public dt1(String str, LinkedHashMap linkedHashMap) {
        this.b = str;
        this.c = linkedHashMap;
    }
}
