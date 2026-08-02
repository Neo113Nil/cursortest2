package defpackage;

import com.yandex.plus.core.graphql.type.CURRENCY;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class ct60 {
    public final CURRENCY a;
    public final BigDecimal b;

    public ct60(CURRENCY currency, BigDecimal bigDecimal) {
        this.a = currency;
        this.b = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct60)) {
            return false;
        }
        ct60 ct60Var = (ct60) obj;
        return this.a == ct60Var.a && this.b.equals(ct60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OfferPrice(currency=" + this.a + ", amount=" + this.b + ')';
    }
}
