package xsna;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import java.util.List;

/* compiled from: BillingManager.kt */
/* loaded from: classes15.dex */
public final class l27 {
    public final BillingResult a;
    public final List<Purchase> b;

    /* JADX WARN: Multi-variable type inference failed */
    public l27(BillingResult billingResult, List<? extends Purchase> list) {
        this.a = billingResult;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l27)) {
            return false;
        }
        l27 l27Var = (l27) obj;
        return epx.f(this.a, l27Var.a) && epx.f(this.b, l27Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchasesResult(billingResult=");
        sb.append(this.a);
        sb.append(", purchaseList=");
        return ms9.a(')', sb, this.b);
    }
}
