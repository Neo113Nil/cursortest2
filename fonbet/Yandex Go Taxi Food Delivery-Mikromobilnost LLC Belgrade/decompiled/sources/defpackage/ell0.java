package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ell0 {
    public final String a;
    public final Map b;

    public ell0(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ell0)) {
            return false;
        }
        ell0 ell0Var = (ell0) obj;
        return jl40.l(this.a, ell0Var.a) && jl40.l(this.b, ell0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("RythmEvent(eventGroupKey=", this.a, ", payload=", Extension.C_BRAKE, this.b);
    }
}
