package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jtq extends n351 {
    public final Integer c;
    public final zei0 d;
    public final Set e;
    public final cgz0 f;

    public jtq(Integer num, zei0 zei0Var, Set set, cgz0 cgz0Var) {
        super("feedback-key", false, 14);
        this.c = num;
        this.d = zei0Var;
        this.e = set;
        this.f = cgz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtq)) {
            return false;
        }
        jtq jtqVar = (jtq) obj;
        return jl40.l(this.c, jtqVar.c) && jl40.l(this.d, jtqVar.d) && this.e.equals(jtqVar.e) && jl40.l(this.f, jtqVar.f);
    }

    public final int hashCode() {
        Integer num = this.c;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        zei0 zei0Var = this.d;
        int e = g8e.e(this.e, (hashCode + (zei0Var == null ? 0 : zei0Var.hashCode())) * 31, 31);
        cgz0 cgz0Var = this.f;
        return e + (cgz0Var != null ? cgz0Var.hashCode() : 0);
    }

    public final String toString() {
        return "FeedbackModel(score=" + this.c + ", reasonList=" + this.d + ", reasonIds=" + this.e + ", tips=" + this.f + Extension.C_BRAKE;
    }
}
