package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q031 implements v031 {
    public final xvz0 a;
    public final rr51 b;
    public final List c;

    public q031(xvz0 xvz0Var, rr51 rr51Var, List list) {
        this.a = xvz0Var;
        this.b = rr51Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q031)) {
            return false;
        }
        q031 q031Var = (q031) obj;
        return jl40.l(this.a, q031Var.a) && jl40.l(this.b, q031Var.b) && jl40.l(this.c, q031Var.c);
    }

    public final int hashCode() {
        xvz0 xvz0Var = this.a;
        int hashCode = (xvz0Var == null ? 0 : xvz0Var.hashCode()) * 31;
        rr51 rr51Var = this.b;
        int hashCode2 = (hashCode + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotAllowed(tooltip=");
        sb.append(this.a);
        sb.append(", divkitWidget=");
        sb.append(this.b);
        sb.append(", agreementsChipText=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
