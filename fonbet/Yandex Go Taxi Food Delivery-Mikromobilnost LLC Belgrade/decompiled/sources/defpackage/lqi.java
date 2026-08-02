package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lqi {
    public final Long a;
    public final Long b;
    public final List c;
    public final b9n d;
    public final sa91 e;

    public lqi(Long l, Long l2, List list, b9n b9nVar, sa91 sa91Var) {
        this.a = l;
        this.b = l2;
        this.c = list;
        this.d = b9nVar;
        this.e = sa91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqi)) {
            return false;
        }
        lqi lqiVar = (lqi) obj;
        return jl40.l(this.a, lqiVar.a) && jl40.l(this.b, lqiVar.b) && this.c.equals(lqiVar.c) && jl40.l(this.d, lqiVar.d) && this.e.equals(lqiVar.e);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int c = unr0.c((hashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.c);
        b9n b9nVar = this.d;
        return this.e.hashCode() + ((c + (b9nVar != null ? b9nVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PerformerSearch(startTime=" + this.a + ", estimateMs=" + this.b + ", dynamicSearchStatus=" + this.c + ", dynamicSearchTimeline=" + this.d + ", mapAnimation=" + this.e + Extension.C_BRAKE;
    }
}
