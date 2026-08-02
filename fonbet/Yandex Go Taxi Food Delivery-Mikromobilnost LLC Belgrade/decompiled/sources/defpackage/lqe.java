package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lqe {
    public final List a;
    public final rh4 b;
    public final h3q0 c;

    public lqe(List list, rh4 rh4Var, h3q0 h3q0Var) {
        this.a = list;
        this.b = rh4Var;
        this.c = h3q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqe)) {
            return false;
        }
        lqe lqeVar = (lqe) obj;
        return this.a.equals(lqeVar.a) && jl40.l(this.b, lqeVar.b) && jl40.l(this.c, lqeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rh4 rh4Var = this.b;
        int hashCode2 = (hashCode + (rh4Var == null ? 0 : rh4Var.hashCode())) * 31;
        h3q0 h3q0Var = this.c;
        return hashCode2 + (h3q0Var != null ? h3q0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CoreSectionModel(widgets=" + this.a + ", background=" + this.b + ", promoModel=" + this.c + Extension.C_BRAKE;
    }
}
