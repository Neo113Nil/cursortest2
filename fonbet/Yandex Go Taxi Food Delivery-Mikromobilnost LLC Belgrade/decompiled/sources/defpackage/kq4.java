package defpackage;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class kq4 {
    public final BigDecimal a;
    public final String b;

    static {
        BigDecimal bigDecimal = BigDecimal.ZERO;
    }

    public kq4(BigDecimal bigDecimal, String str) {
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq4)) {
            return false;
        }
        kq4 kq4Var = (kq4) obj;
        return this.a.equals(kq4Var.a) && this.b.equals(kq4Var.b);
    }

    public final int hashCode() {
        return unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "BankMoney(amount=" + this.a + ", currency=" + this.b + ", formattedAmount=)";
    }
}
