package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hfb {
    public final MoneyEntity a;
    public final gfb b;
    public final ifb c;
    public final String d;

    public hfb(MoneyEntity moneyEntity, gfb gfbVar, ifb ifbVar, String str) {
        this.a = moneyEntity;
        this.b = gfbVar;
        this.c = ifbVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfb)) {
            return false;
        }
        hfb hfbVar = (hfb) obj;
        return jl40.l(this.a, hfbVar.a) && jl40.l(this.b, hfbVar.b) && jl40.l(this.c, hfbVar.c) && jl40.l(this.d, hfbVar.d);
    }

    public final int hashCode() {
        MoneyEntity moneyEntity = this.a;
        int hashCode = (moneyEntity == null ? 0 : moneyEntity.hashCode()) * 31;
        gfb gfbVar = this.b;
        int hashCode2 = (hashCode + (gfbVar == null ? 0 : gfbVar.hashCode())) * 31;
        ifb ifbVar = this.c;
        int hashCode3 = (hashCode2 + (ifbVar == null ? 0 : ifbVar.hashCode())) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CheckCrossBorderDataEntity(creditMoney=" + this.a + ", currencyRate=" + this.b + ", receiver=" + this.c + ", priorityMoneyType=" + this.d + Extension.C_BRAKE;
    }
}
