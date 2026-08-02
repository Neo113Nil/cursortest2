package xsna;

import com.vk.superapp.bridges.SuperappPurchasesBridge$PurchaseResult;

/* compiled from: SuperappPurchasesBridge.kt */
/* loaded from: classes6.dex */
public final class mhn0 {
    public final SuperappPurchasesBridge$PurchaseResult a;
    public final Long b;

    public mhn0(SuperappPurchasesBridge$PurchaseResult superappPurchasesBridge$PurchaseResult, Long l) {
        this.a = superappPurchasesBridge$PurchaseResult;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhn0)) {
            return false;
        }
        mhn0 mhn0Var = (mhn0) obj;
        return this.a == mhn0Var.a && epx.f(this.b, mhn0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseResultData(result=");
        sb.append(this.a);
        sb.append(", orderId=");
        return iq.b(sb, this.b, ')');
    }
}
