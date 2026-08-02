package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersDiscountsSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class iu9 {
    public final ChargersDiscountsSection a;
    public final String b;
    public final String c;

    public iu9(ChargersDiscountsSection chargersDiscountsSection, String str, String str2) {
        this.a = chargersDiscountsSection;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu9)) {
            return false;
        }
        iu9 iu9Var = (iu9) obj;
        return this.a == iu9Var.a && jl40.l(this.b, iu9Var.b) && jl40.l(this.c, iu9Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersDiscountsDeeplink(section=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", promoCode=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
