package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class n2d0 {
    public final List a;
    public final List b;
    public final String c;

    public n2d0(String str, List list, List list2) {
        this.a = list;
        this.b = list2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2d0)) {
            return false;
        }
        n2d0 n2d0Var = (n2d0) obj;
        return jl40.l(this.a, n2d0Var.a) && jl40.l(this.b, n2d0Var.b) && jl40.l(this.c, n2d0Var.c);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(qv10.v("PlusFilters(features=", this.a, ", options=", this.b, ", tariffId="), this.c, Extension.C_BRAKE);
    }
}
