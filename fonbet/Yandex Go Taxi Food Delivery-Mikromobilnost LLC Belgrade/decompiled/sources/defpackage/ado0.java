package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersPassesSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ado0 {
    public final ScootersPassesSection a;
    public final String b;
    public final String c;

    public ado0(ScootersPassesSection scootersPassesSection, String str, String str2) {
        this.a = scootersPassesSection;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ado0)) {
            return false;
        }
        ado0 ado0Var = (ado0) obj;
        return this.a == ado0Var.a && jl40.l(this.b, ado0Var.b) && jl40.l(this.c, ado0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersPassesDeeplink(section=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", openReason=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
