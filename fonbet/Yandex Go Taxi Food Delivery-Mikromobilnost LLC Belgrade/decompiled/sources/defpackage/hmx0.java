package defpackage;

import java.util.LinkedHashSet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hmx0 {
    public final String a;
    public final String b;
    public final wu1 c;
    public final LinkedHashSet d;

    public hmx0(String str, String str2, wu1 wu1Var, LinkedHashSet linkedHashSet) {
        this.a = str;
        this.b = str2;
        this.c = wu1Var;
        this.d = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmx0)) {
            return false;
        }
        hmx0 hmx0Var = (hmx0) obj;
        return jl40.l(this.a, hmx0Var.a) && jl40.l(this.b, hmx0Var.b) && jl40.l(this.c, hmx0Var.c) && this.d.equals(hmx0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        wu1 wu1Var = this.c;
        return this.d.hashCode() + ((b + (wu1Var == null ? 0 : wu1Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TariffRequirementsEqualsKey(verticalId=", this.a, ", tariffClass=", this.b, ", altOptionGroup=");
        v.append(this.c);
        v.append(", supportedRequirements=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
