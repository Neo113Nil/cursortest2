package defpackage;

import com.yandex.plus.pay.repository.api.model.offers.LegalInfo;
import com.yandex.plus.pay.repository.api.model.offers.RichText;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class old {
    public final lld a;
    public final List b;
    public final LegalInfo c;
    public final RichText d;
    public final hld e;
    public final kld f;
    public final ArrayList g;
    public final Boolean h;
    public final ArrayList i;
    public final String j;
    public final String k;
    public final String l;
    public final ArrayList m;
    public final em0 n;

    public old(lld lldVar, List list, LegalInfo legalInfo, RichText richText, hld hldVar, kld kldVar, ArrayList arrayList, Boolean bool, ArrayList arrayList2, String str, String str2, String str3, ArrayList arrayList3, em0 em0Var) {
        this.a = lldVar;
        this.b = list;
        this.c = legalInfo;
        this.d = richText;
        this.e = hldVar;
        this.f = kldVar;
        this.g = arrayList;
        this.h = bool;
        this.i = arrayList2;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = arrayList3;
        this.n = em0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof old)) {
            return false;
        }
        old oldVar = (old) obj;
        return jl40.l(this.a, oldVar.a) && this.b.equals(oldVar.b) && jl40.l(this.c, oldVar.c) && jl40.l(this.d, oldVar.d) && this.e.equals(oldVar.e) && this.f.equals(oldVar.f) && this.g.equals(oldVar.g) && jl40.l(this.h, oldVar.h) && this.i.equals(oldVar.i) && jl40.l(this.j, oldVar.j) && jl40.l(this.k, oldVar.k) && jl40.l(this.l, oldVar.l) && this.m.equals(oldVar.m) && this.n.equals(oldVar.n);
    }

    public final int hashCode() {
        lld lldVar = this.a;
        int c = unr0.c((lldVar == null ? 0 : lldVar.hashCode()) * 31, 31, this.b);
        LegalInfo legalInfo = this.c;
        int hashCode = (c + (legalInfo == null ? 0 : legalInfo.hashCode())) * 31;
        RichText richText = this.d;
        int b = ly3.b((this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (richText == null ? 0 : richText.hashCode())) * 31)) * 31)) * 31, 31, this.g);
        Boolean bool = this.h;
        int b2 = ly3.b((b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.i);
        String str = this.j;
        int hashCode2 = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        return this.n.hashCode() + ly3.b((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.m);
    }

    public final String toString() {
        return "CompositeOfferDetails(tariff=" + this.a + ", option=" + this.b + ", legalInfo=" + this.c + ", promoLegalInfo=" + this.d + ", paymentText=" + this.e + ", successScreen=" + this.f + ", invoices=" + this.g + ", isSilentInvoiceAvailable=" + this.h + ", paymentMethods=" + this.i + ", mainPaymentMethod=" + this.j + ", posId=" + this.k + ", serviceToken=" + this.l + ", paymentMethodsGroups=" + this.m + ", additionalOffers=" + this.n + ')';
    }
}
