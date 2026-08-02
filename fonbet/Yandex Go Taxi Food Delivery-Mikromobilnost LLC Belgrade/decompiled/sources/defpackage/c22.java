package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c22 {
    public final txz0 a;
    public final String b;
    public final String c;
    public final BigDecimal d;
    public final String e;

    public c22(txz0 txz0Var, String str, String str2, BigDecimal bigDecimal, String str3) {
        this.a = txz0Var;
        this.b = str;
        this.c = str2;
        this.d = bigDecimal;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c22)) {
            return false;
        }
        c22 c22Var = (c22) obj;
        return jl40.l(this.a, c22Var.a) && jl40.l(this.b, c22Var.b) && jl40.l(this.c, c22Var.c) && this.d.equals(c22Var.d) && jl40.l(this.e, c22Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + smw0.f(this.d, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountInputEntity(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", hint=");
        sb.append(this.c);
        sb.append(", defaultAmount=");
        sb.append(this.d);
        sb.append(", currencySymbol=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
