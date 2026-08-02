package yads;

import xsna.epx;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class gc {
    public final String a;
    public final String b;
    public final jk c;

    public gc(String str, String str2, jk jkVar) {
        this.a = str;
        this.b = str2;
        this.c = jkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return epx.f(this.a, gcVar.a) && epx.f(this.b, gcVar.b) && epx.f(this.c, gcVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jk jkVar = this.c;
        return hashCode2 + (jkVar != null ? jkVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        jk jkVar = this.c;
        StringBuilder a = xe9.a("AdditionalInfo(skuId=", str, ", performanceOpeningUrl=", str2, ", attributes=");
        a.append(jkVar);
        a.append(")");
        return a.toString();
    }
}
