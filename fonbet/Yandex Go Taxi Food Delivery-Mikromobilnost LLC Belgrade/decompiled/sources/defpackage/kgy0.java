package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kgy0 {
    public final String a;
    public final Map b;

    public kgy0(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgy0)) {
            return false;
        }
        kgy0 kgy0Var = (kgy0) obj;
        return jl40.l(this.a, kgy0Var.a) && jl40.l(this.b, kgy0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return xvz.j("TermEntity(token=", this.a, ", termWidgetVariables=", Extension.C_BRAKE, this.b);
    }
}
