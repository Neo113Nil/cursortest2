package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes2.dex */
public final class h1u0 implements b050 {
    public final String a;

    public h1u0(String str) {
        this.a = str;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("id");
        foe foeVar = l80.a;
        bfxVar.r0(this.a);
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(i1u0.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "mutation StartInvoice($id: ID!) { invoice { externalStart(id: $id) { __typename ...invoice } } }  fragment invoicePrice on Price { currency amount }  fragment invoicePayment on Payment { id respCode respDesc status }  fragment invoice on Invoice { id invoiceStatus form paymentMethodId paidAmount { __typename ...invoicePrice } payment { __typename ...invoicePayment } totalAmount { __typename ...invoicePrice } invoicePollingParams { retryDelayMillis timeoutMillis } widgetQrCodeParams { widgetUrl underlineText } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1u0) && jl40.l(this.a, ((h1u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.fc70
    public final String id() {
        return "50574c20f21c177593e0de72cdf6f68f0865ddd47e0d5f6eff9bc11d6f2505d8";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "StartInvoice";
    }

    public final String toString() {
        return b64.p(new StringBuilder("StartInvoiceMutation(id="), this.a, ')');
    }
}
