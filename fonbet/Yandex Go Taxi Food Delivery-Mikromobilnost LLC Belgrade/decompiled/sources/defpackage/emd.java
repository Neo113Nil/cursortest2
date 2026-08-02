package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class emd {
    public final String a;
    public final ArrayList b;
    public final List c;
    public final String d;
    public final kmd e;

    public emd(String str, ArrayList arrayList, List list, String str2, kmd kmdVar) {
        this.a = str;
        this.b = arrayList;
        this.c = list;
        this.d = str2;
        this.e = kmdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emd)) {
            return false;
        }
        emd emdVar = (emd) obj;
        return this.a.equals(emdVar.a) && this.b.equals(emdVar.b) && jl40.l(this.c, emdVar.c) && this.d.equals(emdVar.d) && jl40.l(this.e, emdVar.e);
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        int b2 = unr0.b((b + (list == null ? 0 : list.hashCode())) * 31, 31, this.d);
        kmd kmdVar = this.e;
        return b2 + (kmdVar != null ? kmdVar.hashCode() : 0);
    }

    public final String toString() {
        return "CheckoutAdditionalOffers(eventSessionId=" + this.a + ", offers=" + this.b + ", passedUpsaleSteps=" + this.c + ", title=" + this.d + ", offerSwitchToggle=" + this.e + ')';
    }
}
