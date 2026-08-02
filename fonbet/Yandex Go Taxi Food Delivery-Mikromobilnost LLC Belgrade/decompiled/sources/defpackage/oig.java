package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class oig {
    public final List a;
    public final List b;
    public final Object c;
    public final String d;

    public oig(List list, List list2, Object obj, String str) {
        this.a = list;
        this.b = list2;
        this.c = obj;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oig)) {
            return false;
        }
        oig oigVar = (oig) obj;
        return this.a.equals(oigVar.a) && jl40.l(this.b, oigVar.b) && jl40.l(this.c, oigVar.c) && jl40.l(this.d, oigVar.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        int hashCode = (c + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = qv10.v("DashboardDomainModel(sections=", this.a, ", stickyWidgets=", this.b, ", meta=");
        v.append(this.c);
        v.append(", metricaLabel=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
