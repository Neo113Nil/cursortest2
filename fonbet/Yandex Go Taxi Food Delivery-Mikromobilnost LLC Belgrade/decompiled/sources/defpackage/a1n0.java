package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersBiometricAuthorizationSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class a1n0 {
    public final ScootersBiometricAuthorizationSection a;
    public final String b;
    public final String c;

    public a1n0(ScootersBiometricAuthorizationSection scootersBiometricAuthorizationSection, String str, String str2) {
        this.a = scootersBiometricAuthorizationSection;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1n0)) {
            return false;
        }
        a1n0 a1n0Var = (a1n0) obj;
        return this.a == a1n0Var.a && jl40.l(this.b, a1n0Var.b) && jl40.l(this.c, a1n0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersBiometricAuthorizationDeeplink(section=");
        sb.append(this.a);
        sb.append(", storyId=");
        sb.append(this.b);
        sb.append(", flow=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
