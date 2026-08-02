package defpackage;

import com.yandex.plus.core.graphql.type.CURRENCY;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class ayw {
    public final CURRENCY a;
    public final BigDecimal b;

    public ayw(CURRENCY currency, BigDecimal bigDecimal) {
        this.a = currency;
        this.b = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayw)) {
            return false;
        }
        ayw aywVar = (ayw) obj;
        return this.a == aywVar.a && this.b.equals(aywVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InvoicePrice(currency=" + this.a + ", amount=" + this.b + ')';
    }
}
