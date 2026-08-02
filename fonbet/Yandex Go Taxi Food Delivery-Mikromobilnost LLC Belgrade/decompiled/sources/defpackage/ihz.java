package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ihz {
    public final String a;
    public final String b;
    public final Map c;
    public final List d;

    public ihz(String str, String str2, List list, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = list;
    }

    public final Map a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihz)) {
            return false;
        }
        ihz ihzVar = (ihz) obj;
        return jl40.l(this.a, ihzVar.a) && this.b.equals(ihzVar.b) && jl40.l(this.c, ihzVar.c) && jl40.l(this.d, ihzVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        return this.d.hashCode() + ((b + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("LogisticAnalyticsData(orderKey=", this.a, ", orderStatus=", this.b, ", meta=");
        v.append(this.c);
        v.append(", visibleButtons=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
