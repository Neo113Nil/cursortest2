package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ov1 implements wv1 {
    public final List a;
    public final qe50 b;
    public final r901 c;
    public final e68 d;

    public ov1(List list, qe50 qe50Var, r901 r901Var, e68 e68Var) {
        this.a = list;
        this.b = qe50Var;
        this.c = r901Var;
        this.d = e68Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov1)) {
            return false;
        }
        ov1 ov1Var = (ov1) obj;
        return this.a.equals(ov1Var.a) && jl40.l(this.b, ov1Var.b) && jl40.l(this.c, ov1Var.c) && jl40.l(this.d, ov1Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qe50 qe50Var = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (qe50Var == null ? 0 : qe50Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Content(altRoutes=" + this.a + ", routeInfo=" + this.b + ", trafficState=" + this.c + ", carParksState=" + this.d + Extension.C_BRAKE;
    }
}
