package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ab7 {
    public final boolean a;
    public final Double b;
    public final Double c;
    public final Set d;
    public final String e;

    public ab7(boolean z, Double d, Double d2, Set set, String str) {
        this.a = z;
        this.b = d;
        this.c = d2;
        this.d = set;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ab7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ab7 ab7Var = (ab7) obj;
        return this.a == ab7Var.a && jl40.i(this.b, ab7Var.b) && jl40.i(this.c, ab7Var.c) && jl40.l(this.d, ab7Var.d) && jl40.l(this.e, ab7Var.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.c;
        int e = g8e.e(this.d, (hashCode2 + (d2 != null ? d2.hashCode() : 0)) * 31, 31);
        String str = this.e;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheControlHeaderData(allowCache=");
        sb.append(this.a);
        sb.append(", freshTime=");
        sb.append(this.b);
        sb.append(", staleTime=");
        sb.append(this.c);
        sb.append(", cacheModes=");
        sb.append(this.d);
        sb.append(", cacheLabel=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
