package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersDvizhSubscriptionSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ox9 {
    public final ChargersDvizhSubscriptionSection a;
    public final String b;

    public ox9(ChargersDvizhSubscriptionSection chargersDvizhSubscriptionSection, String str) {
        this.a = chargersDvizhSubscriptionSection;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox9)) {
            return false;
        }
        ox9 ox9Var = (ox9) obj;
        return this.a == ox9Var.a && jl40.l(this.b, ox9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ChargersDvizhSubscriptionDeeplink(section=" + this.a + ", offerTariffName=" + this.b + Extension.C_BRAKE;
    }
}
