package xsna;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import java.util.List;

/* compiled from: BillingManager.kt */
/* loaded from: classes15.dex */
public final class k27 {
    public final BillingResult a;
    public final List<ProductDetails> b;

    public k27(BillingResult billingResult, List<ProductDetails> list) {
        this.a = billingResult;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k27)) {
            return false;
        }
        k27 k27Var = (k27) obj;
        return epx.f(this.a, k27Var.a) && epx.f(this.b, k27Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List<ProductDetails> list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductResponse(billingResult=");
        sb.append(this.a);
        sb.append(", productDetailsList=");
        return ms9.a(')', sb, this.b);
    }
}
