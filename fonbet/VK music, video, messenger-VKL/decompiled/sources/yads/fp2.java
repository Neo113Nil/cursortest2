package yads;

import java.util.Map;
import xsna.epx;

/* loaded from: classes10.dex */
public final class fp2 {
    public final String a;
    public final Map b;
    public final c c;

    public fp2(String str, Map map, c cVar) {
        this.a = str;
        this.b = map;
        this.c = cVar;
        map.put("sdk_version", "7.18.6");
    }

    public final c a() {
        return this.c;
    }

    public final Map b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp2)) {
            return false;
        }
        fp2 fp2Var = (fp2) obj;
        return epx.f(this.a, fp2Var.a) && epx.f(this.b, fp2Var.b) && epx.f(this.c, fp2Var.c);
    }

    public final int hashCode() {
        int a = xsna.v11.a(this.a.hashCode() * 31, 31, this.b);
        c cVar = this.c;
        return a + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "Report(eventName=" + this.a + ", data=" + this.b + ", abExperiments=" + this.c + ")";
    }
}
