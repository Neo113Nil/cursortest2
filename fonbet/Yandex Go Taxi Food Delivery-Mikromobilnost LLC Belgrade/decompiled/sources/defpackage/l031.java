package defpackage;

import java.util.List;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l031 implements v031 {
    public final String a;
    public final xvz0 b;
    public final rzj0 c;
    public final rr51 d;
    public final List e;
    public final String f;
    public final String g = UUID.randomUUID().toString();

    public l031(String str, xvz0 xvz0Var, rzj0 rzj0Var, rr51 rr51Var, List list, String str2) {
        this.a = str;
        this.b = xvz0Var;
        this.c = rzj0Var;
        this.d = rr51Var;
        this.e = list;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l031)) {
            return false;
        }
        l031 l031Var = (l031) obj;
        return jl40.l(this.a, l031Var.a) && jl40.l(this.b, l031Var.b) && jl40.l(this.c, l031Var.c) && jl40.l(this.d, l031Var.d) && jl40.l(this.e, l031Var.e) && jl40.l(this.f, l031Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xvz0 xvz0Var = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (xvz0Var == null ? 0 : xvz0Var.hashCode())) * 31)) * 31;
        rr51 rr51Var = this.d;
        int hashCode3 = (hashCode2 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        List list = this.e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Allowed(checkId=");
        sb.append(this.a);
        sb.append(", tooltip=");
        sb.append(this.b);
        sb.append(", resultPageData=");
        sb.append(this.c);
        sb.append(", divkitWidget=");
        sb.append(this.d);
        sb.append(", agreementsChipText=");
        return n.l(", repaymentPlanId=", this.f, Extension.C_BRAKE, sb, this.e);
    }
}
