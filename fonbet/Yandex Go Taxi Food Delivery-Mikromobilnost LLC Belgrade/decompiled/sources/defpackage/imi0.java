package defpackage;

import java.util.ArrayList;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class imi0 {
    public final Boolean a;
    public final ArrayList b;
    public final Set c;

    public imi0(Boolean bool, ArrayList arrayList, Set set) {
        this.a = bool;
        this.b = arrayList;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imi0)) {
            return false;
        }
        imi0 imi0Var = (imi0) obj;
        return jl40.l(this.a, imi0Var.a) && this.b.equals(imi0Var.b) && this.c.equals(imi0Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return this.c.hashCode() + ly3.b((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RedirectionConfig(chromeTabEnabled=");
        sb.append(this.a);
        sb.append(", hostApps=");
        sb.append(this.b);
        sb.append(", requiredFeatureFlags=");
        return vfc.q(sb, this.c, Extension.C_BRAKE);
    }
}
