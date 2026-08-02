package defpackage;

import com.yandex.plus.pay.repository.api.model.invoice.Invoice$Status;
import com.yandex.plus.pay.repository.api.model.offers.Price;

/* loaded from: classes2.dex */
public final class kxw {
    public final String a;
    public final Invoice$Status b;
    public final String c;
    public final Price d;
    public final exw e;
    public final Price f;
    public final String g;
    public final gxw h;
    public final ixw i;

    public kxw(String str, Invoice$Status invoice$Status, String str2, Price price, exw exwVar, Price price2, String str3, gxw gxwVar, ixw ixwVar) {
        this.a = str;
        this.b = invoice$Status;
        this.c = str2;
        this.d = price;
        this.e = exwVar;
        this.f = price2;
        this.g = str3;
        this.h = gxwVar;
        this.i = ixwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxw)) {
            return false;
        }
        kxw kxwVar = (kxw) obj;
        return this.a.equals(kxwVar.a) && this.b == kxwVar.b && jl40.l(this.c, kxwVar.c) && this.d.equals(kxwVar.d) && jl40.l(this.e, kxwVar.e) && this.f.equals(kxwVar.f) && jl40.l(this.g, kxwVar.g) && this.h.equals(kxwVar.h) && jl40.l(this.i, kxwVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        exw exwVar = this.e;
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + (exwVar == null ? 0 : exwVar.hashCode())) * 31)) * 31;
        String str2 = this.g;
        int hashCode4 = (this.h.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        ixw ixwVar = this.i;
        return hashCode4 + (ixwVar != null ? ixwVar.hashCode() : 0);
    }

    public final String toString() {
        return "Invoice(id=" + this.a + ", invoiceStatus=" + this.b + ", paymentMethodId=" + this.c + ", paidAmount=" + this.d + ", payment=" + this.e + ", totalAmount=" + this.f + ", trustFormUrl=" + this.g + ", pollingConfiguration=" + this.h + ", widgetQrParams=" + this.i + ')';
    }
}
