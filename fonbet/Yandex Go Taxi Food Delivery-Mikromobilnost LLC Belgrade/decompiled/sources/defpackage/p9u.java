package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class p9u implements r9u {
    public final Map a;
    public final dxt b;
    public final dxt c;

    public p9u(Map map, dxt dxtVar, dxt dxtVar2) {
        this.a = map;
        this.b = dxtVar;
        this.c = dxtVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9u)) {
            return false;
        }
        p9u p9uVar = (p9u) obj;
        return jl40.l(this.a, p9uVar.a) && jl40.l(this.b, p9uVar.b) && jl40.l(this.c, p9uVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dxt dxtVar = this.b;
        int hashCode2 = (hashCode + (dxtVar == null ? 0 : dxtVar.hashCode())) * 31;
        dxt dxtVar2 = this.c;
        return hashCode2 + (dxtVar2 != null ? dxtVar2.hashCode() : 0);
    }

    public final String toString() {
        return "CustomHeaderGradientConfig(segments=" + this.a + ", topGradient=" + this.b + ", bottomGradient=" + this.c + Extension.C_BRAKE;
    }
}
