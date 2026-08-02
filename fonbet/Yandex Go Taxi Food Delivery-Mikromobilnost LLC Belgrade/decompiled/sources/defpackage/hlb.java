package defpackage;

import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hlb {
    public final String a;
    public final String b;
    public final CurrencyRulesDto c;

    public hlb(String str, String str2, CurrencyRulesDto currencyRulesDto) {
        this.a = str;
        this.b = str2;
        this.c = currencyRulesDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlb)) {
            return false;
        }
        hlb hlbVar = (hlb) obj;
        return jl40.l(this.a, hlbVar.a) && jl40.l(this.b, hlbVar.b) && jl40.l(this.c, hlbVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CurrencyRulesDto currencyRulesDto = this.c;
        return hashCode2 + (currencyRulesDto != null ? currencyRulesDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CheckoutPriceInfo(price=", this.a, ", discountedPrice=", this.b, ", currencyRulesDto=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
