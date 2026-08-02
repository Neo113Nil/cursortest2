package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class diz {
    public final String a;
    public final Map b;

    public diz(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final Map a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diz)) {
            return false;
        }
        diz dizVar = (diz) obj;
        return jl40.l(this.a, dizVar.a) && jl40.l(this.b, dizVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return xvz.j("AnalyticsData(status=", this.a, ", meta=", Extension.C_BRAKE, this.b);
    }
}
