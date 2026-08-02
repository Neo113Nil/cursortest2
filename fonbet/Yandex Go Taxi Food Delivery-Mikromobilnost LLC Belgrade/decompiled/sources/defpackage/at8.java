package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class at8 {
    public final et8 a;
    public final Map c;
    public final ft8 d;
    public final String f;
    public final long b = 30000;
    public final gw2 e = gw2.a;
    public final int g = -1;

    public at8(String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ft8 ft8Var, String str2) {
        this.a = new et8(str, linkedHashMap2);
        this.c = linkedHashMap;
        this.d = ft8Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at8)) {
            return false;
        }
        at8 at8Var = (at8) obj;
        return jl40.l(this.a, at8Var.a) && this.b == at8Var.b && jl40.l(this.c, at8Var.c) && jl40.l(this.d, at8Var.d) && jl40.l(this.e, at8Var.e) && jl40.l(this.f, at8Var.f) && this.g == at8Var.g;
    }

    public final int hashCode() {
        int hashCode = (((this.d.hashCode() + unr0.d(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) + (this.e == null ? 0 : -522527316)) * 31;
        String str = this.f;
        return Integer.hashCode(this.g) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CareWebViewArgs(entryPoint=");
        sb.append(this.a);
        sb.append(", loadingTimeoutMs=");
        sb.append(this.b);
        sb.append(", headers=");
        sb.append(this.c);
        sb.append(", errorScreenText=");
        sb.append(this.d);
        sb.append(", appName=");
        sb.append(this.e);
        sb.append(", userAgent=");
        sb.append(this.f);
        return b64.q(sb, ", photoVerificationVersion=", this.g, Extension.C_BRAKE);
    }
}
