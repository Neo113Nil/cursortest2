package defpackage;

import com.ybsdk.core.analytics.generated.delegates.ProductsScreenEvents$ProductsScreenProductNfcShownNfcState;

/* loaded from: classes3.dex */
public final class kcf0 {
    public final String a;
    public final ProductsScreenEvents$ProductsScreenProductNfcShownNfcState b;

    public kcf0(String str, ProductsScreenEvents$ProductsScreenProductNfcShownNfcState productsScreenEvents$ProductsScreenProductNfcShownNfcState) {
        this.a = str;
        this.b = productsScreenEvents$ProductsScreenProductNfcShownNfcState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcf0)) {
            return false;
        }
        kcf0 kcf0Var = (kcf0) obj;
        return jl40.l(this.a, kcf0Var.a) && this.b == kcf0Var.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "NfcBadgeStateForAnalytics(productType=" + this.a + ", nfcState=" + this.b + ", rejectReason=null)";
    }
}
