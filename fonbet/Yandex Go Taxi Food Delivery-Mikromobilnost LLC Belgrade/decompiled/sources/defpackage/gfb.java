package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gfb {
    public final MoneyEntity a;
    public final String b;
    public final String c;

    public gfb(String str, String str2, MoneyEntity moneyEntity) {
        this.a = moneyEntity;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfb)) {
            return false;
        }
        gfb gfbVar = (gfb) obj;
        return jl40.l(this.a, gfbVar.a) && jl40.l(this.b, gfbVar.b) && jl40.l(this.c, gfbVar.c);
    }

    public final int hashCode() {
        MoneyEntity moneyEntity = this.a;
        int hashCode = (moneyEntity == null ? 0 : moneyEntity.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckCrossBorderCurrencyRateEntity(amount=");
        sb.append(this.a);
        sb.append(", uiText=");
        sb.append(this.b);
        sb.append(", convertationTemplate=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
