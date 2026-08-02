package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersPromocodesSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class eno0 {
    public final ScootersPromocodesSection a;
    public final String b;

    public eno0(ScootersPromocodesSection scootersPromocodesSection, String str) {
        this.a = scootersPromocodesSection;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eno0)) {
            return false;
        }
        eno0 eno0Var = (eno0) obj;
        return this.a == eno0Var.a && jl40.l(this.b, eno0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ScootersPromocodesDeeplink(section=" + this.a + ", code=" + this.b + Extension.C_BRAKE;
    }
}
