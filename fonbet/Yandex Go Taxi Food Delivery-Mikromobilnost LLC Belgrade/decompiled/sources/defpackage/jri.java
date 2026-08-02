package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jri extends uri {
    public final jk51 a;
    public final zp1 b;
    public final zp1 c;
    public final ArrayList d;
    public final String e;

    public jri(jk51 jk51Var, zp1 zp1Var, zp1 zp1Var2, ArrayList arrayList, String str) {
        this.a = jk51Var;
        this.b = zp1Var;
        this.c = zp1Var2;
        this.d = arrayList;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jri) {
            jri jriVar = (jri) obj;
            if (jl40.l(this.a, jriVar.a) && this.b == jriVar.b && jl40.l(this.c, jriVar.c) && this.d.equals(jriVar.d) && jl40.l(this.e, jriVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        jk51 jk51Var = this.a;
        int hashCode = (this.b.hashCode() + ((jk51Var == null ? 0 : jk51Var.hashCode()) * 31)) * 31;
        zp1 zp1Var = this.c;
        int b = ly3.b((hashCode + (zp1Var == null ? 0 : zp1Var.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Details(leadIcon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", sections=");
        sb.append(this.d);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
