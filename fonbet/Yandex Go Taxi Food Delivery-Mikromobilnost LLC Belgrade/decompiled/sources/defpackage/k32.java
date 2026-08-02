package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class k32 {
    public final String a;
    public final Map b;

    public k32(String str, fex fexVar) {
        this.a = str;
        this.b = fexVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k32)) {
            return false;
        }
        k32 k32Var = (k32) obj;
        return jl40.l(this.a, k32Var.a) && jl40.l(this.b, k32Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("AnalyticsEntity(eventName=", this.a, ", params=", Extension.C_BRAKE, this.b);
    }
}
