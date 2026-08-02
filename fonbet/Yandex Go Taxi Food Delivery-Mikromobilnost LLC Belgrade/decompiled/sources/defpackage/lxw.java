package defpackage;

import com.yandex.plus.core.graphql.type.INVOICE_STATUS;

/* loaded from: classes2.dex */
public final class lxw {
    public final String a;
    public final INVOICE_STATUS b;
    public final String c;
    public final String d;
    public final dxw e;
    public final fxw f;
    public final hxw g;
    public final cxw h;
    public final jxw i;

    public lxw(String str, INVOICE_STATUS invoice_status, String str2, String str3, dxw dxwVar, fxw fxwVar, hxw hxwVar, cxw cxwVar, jxw jxwVar) {
        this.a = str;
        this.b = invoice_status;
        this.c = str2;
        this.d = str3;
        this.e = dxwVar;
        this.f = fxwVar;
        this.g = hxwVar;
        this.h = cxwVar;
        this.i = jxwVar;
    }

    public final String a() {
        return this.a;
    }

    public final INVOICE_STATUS b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxw)) {
            return false;
        }
        lxw lxwVar = (lxw) obj;
        return this.a.equals(lxwVar.a) && this.b == lxwVar.b && jl40.l(this.c, lxwVar.c) && jl40.l(this.d, lxwVar.d) && this.e.equals(lxwVar.e) && jl40.l(this.f, lxwVar.f) && this.g.equals(lxwVar.g) && this.h.equals(lxwVar.h) && jl40.l(this.i, lxwVar.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        INVOICE_STATUS invoice_status = this.b;
        int hashCode2 = (hashCode + (invoice_status == null ? 0 : invoice_status.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        fxw fxwVar = this.f;
        int hashCode5 = (this.h.hashCode() + ((this.g.hashCode() + ((hashCode4 + (fxwVar == null ? 0 : fxwVar.hashCode())) * 31)) * 31)) * 31;
        jxw jxwVar = this.i;
        return hashCode5 + (jxwVar != null ? jxwVar.hashCode() : 0);
    }

    public final String toString() {
        return "Invoice(id=" + this.a + ", invoiceStatus=" + this.b + ", form=" + this.c + ", paymentMethodId=" + this.d + ", paidAmount=" + this.e + ", payment=" + this.f + ", totalAmount=" + this.g + ", invoicePollingParams=" + this.h + ", widgetQrCodeParams=" + this.i + ')';
    }
}
