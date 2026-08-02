package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p670 extends mr {
    public final String a;
    public final String b;
    public final zi8 c;
    public final Map d;
    public final boolean e;

    public p670(String str, String str2, zi8 zi8Var, Map map, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = zi8Var;
        this.d = map;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p670)) {
            return false;
        }
        p670 p670Var = (p670) obj;
        return jl40.l(this.a, p670Var.a) && jl40.l(this.b, p670Var.b) && this.c.equals(p670Var.c) && jl40.l(this.d, p670Var.d) && this.e == p670Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Map map = this.d;
        return Boolean.hashCode(this.e) + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OpenOrderForm(mode=", this.a, ", scenario=", this.b, ", cardMode=");
        v.append(this.c);
        v.append(", state=");
        v.append(this.d);
        v.append(", shouldCacheState=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
