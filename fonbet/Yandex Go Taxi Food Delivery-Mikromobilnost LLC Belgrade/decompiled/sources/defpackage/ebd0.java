package defpackage;

import com.yandex.plus.core.config.Environment;
import java.util.List;

/* loaded from: classes2.dex */
public final class ebd0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Environment e;
    public final List f;

    public ebd0(String str, String str2, String str3, String str4, Environment environment, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = environment;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebd0)) {
            return false;
        }
        ebd0 ebd0Var = (ebd0) obj;
        return jl40.l(this.a, ebd0Var.a) && jl40.l(this.b, ebd0Var.b) && this.c.equals(ebd0Var.c) && jl40.l(this.d, ebd0Var.d) && this.e == ebd0Var.e && this.f.equals(ebd0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + unr0.e(unr0.b(unr0.b((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + 1986582806) * 31, 31, this.c), 31, this.d), 31, false)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayDebugInfo(puid=");
        sb.append(this.a);
        sb.append(", deviceId=");
        sb.append(this.b);
        sb.append(", sdkVersion=110.0.2, appVersion=");
        sb.append(this.c);
        sb.append(", serviceName=");
        sb.append(this.d);
        sb.append(", isBdui=false, environment=");
        sb.append(this.e);
        sb.append(", activeFlags=");
        return unr0.t(sb, this.f, ')');
    }
}
