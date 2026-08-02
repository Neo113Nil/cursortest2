package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class af00 {
    public static final af00 f = new af00(null, null, BigDecimal.valueOf(0L), BigDecimal.valueOf(0L), "");
    public final String a;
    public final String b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final String e;

    public af00(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = bigDecimal;
        this.d = bigDecimal2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af00)) {
            return false;
        }
        af00 af00Var = (af00) obj;
        return jl40.l(this.a, af00Var.a) && jl40.l(this.b, af00Var.b) && this.c.equals(af00Var.c) && this.d.equals(af00Var.d) && jl40.l(this.e, af00Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.e.hashCode() + smw0.f(this.d, smw0.f(this.c, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ManualTipConfig(inputTitle=", this.a, ", initialValue=", this.b, ", minTipsValue=");
        v.append(this.c);
        v.append(", maxTipsValue=");
        v.append(this.d);
        v.append(", choiceId=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
