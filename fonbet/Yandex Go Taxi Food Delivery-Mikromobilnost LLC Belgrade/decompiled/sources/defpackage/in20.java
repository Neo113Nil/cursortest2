package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class in20 {
    public final String a;
    public final Map b;

    public in20(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in20)) {
            return false;
        }
        in20 in20Var = (in20) obj;
        return jl40.l(this.a, in20Var.a) && jl40.l(this.b, in20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("MobContourProvisions(contour=", oyr.p("MobContour(value=", this.a, Extension.C_BRAKE), ", provisions=", Extension.C_BRAKE, this.b);
    }
}
