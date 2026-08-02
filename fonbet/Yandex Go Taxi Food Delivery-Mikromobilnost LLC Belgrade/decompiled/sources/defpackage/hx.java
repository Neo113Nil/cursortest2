package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class hx {
    public final String a;
    public final Map b;
    public final Map c;

    public hx(Map map, String str, Map map2) {
        this.a = str;
        this.b = map;
        this.c = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hx.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        hx hxVar = (hx) obj;
        return jl40.l(this.a, hxVar.a) && this.b.equals(hxVar.b) && jl40.l(this.c, hxVar.c);
    }

    public final int hashCode() {
        int d = unr0.d(this.a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        return d + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionQuery(path=");
        sb.append(this.a);
        sb.append(", params=");
        sb.append(this.b);
        sb.append(", body=");
        return b64.r(sb, this.c, Extension.C_BRAKE);
    }
}
