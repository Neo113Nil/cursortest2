package defpackage;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class nze0 {
    public final BigDecimal a;
    public final Object b;

    public nze0(BigDecimal bigDecimal, String str) {
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nze0)) {
            return false;
        }
        nze0 nze0Var = (nze0) obj;
        return jl40.l(this.a, nze0Var.a) && jl40.l(this.b, nze0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PriceISO4217Input(amount=");
        sb.append(this.a);
        sb.append(", currency=");
        return qv10.r(sb, this.b, ')');
    }
}
