package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class mv51 {
    public static final mv51 f = new mv51(BigDecimal.ZERO, "", "", "", null);
    public final BigDecimal a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public mv51(BigDecimal bigDecimal, String str, String str2, String str3, String str4) {
        this.a = bigDecimal;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final BigDecimal a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv51)) {
            return false;
        }
        mv51 mv51Var = (mv51) obj;
        return jl40.l(this.a, mv51Var.a) && jl40.l(this.b, mv51Var.b) && jl40.l(this.c, mv51Var.c) && jl40.l(this.d, mv51Var.d) && jl40.l(this.e, mv51Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YbSdkBalance(balance=");
        sb.append(this.a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", formattedBalance=");
        g8e.D(sb, this.c, ", formattedBalanceWithoutCurrency=", this.d, ", currencySign=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
