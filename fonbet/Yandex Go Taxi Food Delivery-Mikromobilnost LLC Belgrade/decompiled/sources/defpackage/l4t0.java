package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = p4t0.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ll4t0;", "Lx4t0;", "Companion", "k4t0", "flex-snippet-behaviour_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class l4t0 extends x4t0 {
    public static final k4t0 Companion = new k4t0();
    public final d2t0 a;
    public final d2t0 b;
    public final t1t0 c;

    public l4t0(d2t0 d2t0Var, d2t0 d2t0Var2, t1t0 t1t0Var) {
        this.a = d2t0Var;
        this.b = d2t0Var2;
        this.c = t1t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l4t0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l4t0 l4t0Var = (l4t0) obj;
        return jl40.l(this.a, l4t0Var.a) && jl40.l(this.b, l4t0Var.b) && jl40.l(this.c, l4t0Var.c);
    }

    public final int hashCode() {
        d2t0 d2t0Var = this.a;
        int hashCode = (d2t0Var != null ? d2t0Var.hashCode() : 0) * 31;
        d2t0 d2t0Var2 = this.b;
        int hashCode2 = (hashCode + (d2t0Var2 != null ? d2t0Var2.hashCode() : 0)) * 31;
        t1t0 t1t0Var = this.c;
        return hashCode2 + (t1t0Var != null ? t1t0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Snapping(snippetStart=" + this.a + ", snippetEnd=" + this.b + ", callbacks=" + this.c + Extension.C_BRAKE;
    }

    public l4t0() {
        this(null, null, null);
    }
}
