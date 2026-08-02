package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class k4r {
    public final String a;
    public final Set b;
    public final Set c;

    public k4r(String str, Set set, Set set2) {
        this.a = str;
        this.b = set;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4r)) {
            return false;
        }
        k4r k4rVar = (k4r) obj;
        return jl40.l(this.a, k4rVar.a) && this.b.equals(k4rVar.b) && this.c.equals(k4rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g8e.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterEntity(filterId=");
        sb.append(this.a);
        sb.append(", chatTypesIds=");
        sb.append(this.b);
        sb.append(", namespaces=");
        return vfc.q(sb, this.c, Extension.C_BRAKE);
    }
}
