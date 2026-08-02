package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ii10 {
    public final String a;
    public final Map b;

    public ii10(String str, Map map) {
        this.a = str;
        this.b = vng.M(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii10)) {
            return false;
        }
        ii10 ii10Var = (ii10) obj;
        return jl40.l(this.a, ii10Var.a) && jl40.l(this.b, ii10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("Key(key=", this.a, ", extras=", Extension.C_BRAKE, this.b);
    }
}
