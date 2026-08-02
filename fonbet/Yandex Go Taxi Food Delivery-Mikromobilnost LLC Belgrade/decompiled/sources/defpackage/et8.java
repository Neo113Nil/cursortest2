package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class et8 {
    public final String a;
    public final Map b;

    public et8(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et8)) {
            return false;
        }
        et8 et8Var = (et8) obj;
        return jl40.l(this.a, et8Var.a) && this.b.equals(et8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("Custom(careUrlPath=", this.a, ", queryParams=", Extension.C_BRAKE, this.b);
    }
}
