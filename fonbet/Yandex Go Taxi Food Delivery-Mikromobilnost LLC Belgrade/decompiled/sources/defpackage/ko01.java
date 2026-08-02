package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ko01 {
    public final boolean a;
    public final Map b;

    public ko01(boolean z, Map map) {
        this.a = z;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko01)) {
            return false;
        }
        ko01 ko01Var = (ko01) obj;
        return this.a == ko01Var.a && jl40.l(this.b, ko01Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "TransfersDashboardDescriptionConfig(isEnabled=" + this.a + ", descriptionTextsByOrigin=" + this.b + Extension.C_BRAKE;
    }
}
