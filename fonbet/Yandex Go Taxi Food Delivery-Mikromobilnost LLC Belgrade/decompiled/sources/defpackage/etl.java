package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class etl extends see {
    public final n5o a;
    public final Map b;
    public final String c;
    public final dtl d;

    public etl(n5o n5oVar, Map map, String str, dtl dtlVar) {
        this.a = n5oVar;
        this.b = map;
        this.c = str;
        this.d = dtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!etl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        etl etlVar = (etl) obj;
        return jl40.l(this.a, etlVar.a) && jl40.l(this.b, etlVar.b) && jl40.l(this.c, etlVar.c) && jl40.l(this.d, etlVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        dtl dtlVar = this.d;
        return hashCode3 + (dtlVar != null ? dtlVar.hashCode() : 0);
    }

    public final String toString() {
        return "DivkitContent(divData=" + this.a + ", actions=" + this.b + ", divDataTag=" + this.c + ", animations=" + this.d + Extension.C_BRAKE;
    }
}
