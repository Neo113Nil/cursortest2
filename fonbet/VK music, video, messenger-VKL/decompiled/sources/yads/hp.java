package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class hp implements Parcelable {
    public static final Parcelable.Creator<hp> CREATOR = new gp();
    public final List b;
    public final ht1 c;

    public hp(ArrayList arrayList, ht1 ht1Var) {
        this.b = arrayList;
        this.c = ht1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return epx.f(this.b, hpVar.b) && epx.f(this.c, hpVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        ht1 ht1Var = this.c;
        return hashCode + (ht1Var == null ? 0 : ht1Var.hashCode());
    }

    public final String toString() {
        return "BiddingSettings(adUnitIdBiddingSettingsList=" + this.b + ", mediationPrefetchSettings=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a = xsna.ao.a(parcel, this.b);
        while (a.hasNext()) {
            ((gb) a.next()).writeToParcel(parcel, i);
        }
        ht1 ht1Var = this.c;
        if (ht1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ht1Var.writeToParcel(parcel, i);
        }
    }
}
