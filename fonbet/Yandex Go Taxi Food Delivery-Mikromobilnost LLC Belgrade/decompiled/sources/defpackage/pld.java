package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class pld {
    public final mld a;
    public final List b;
    public final zkd c;
    public final ild d;
    public final jld e;
    public final ArrayList f;
    public final Boolean g;

    public pld(mld mldVar, List list, zkd zkdVar, ild ildVar, jld jldVar, ArrayList arrayList, Boolean bool) {
        this.a = mldVar;
        this.b = list;
        this.c = zkdVar;
        this.d = ildVar;
        this.e = jldVar;
        this.f = arrayList;
        this.g = bool;
    }

    public final Boolean a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pld)) {
            return false;
        }
        pld pldVar = (pld) obj;
        return jl40.l(this.a, pldVar.a) && jl40.l(this.b, pldVar.b) && jl40.l(this.c, pldVar.c) && this.d.equals(pldVar.d) && this.e.equals(pldVar.e) && this.f.equals(pldVar.f) && jl40.l(this.g, pldVar.g);
    }

    public final int hashCode() {
        mld mldVar = this.a;
        int hashCode = (mldVar == null ? 0 : mldVar.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        zkd zkdVar = this.c;
        int b = ly3.b((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (zkdVar == null ? 0 : zkdVar.hashCode())) * 31)) * 31)) * 31, 31, this.f);
        Boolean bool = this.g;
        return b + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompositeOfferDetails(tariffOffer=");
        sb.append(this.a);
        sb.append(", optionOffers=");
        sb.append(this.b);
        sb.append(", legalInfo=");
        sb.append(this.c);
        sb.append(", paymentText=");
        sb.append(this.d);
        sb.append(", successScreen=");
        sb.append(this.e);
        sb.append(", invoices=");
        sb.append(this.f);
        sb.append(", silentInvoiceAvailable=");
        return oo31.i(sb, this.g, ')');
    }
}
