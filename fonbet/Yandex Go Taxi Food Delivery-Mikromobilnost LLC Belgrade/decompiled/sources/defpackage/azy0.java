package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class azy0 extends bzy0 {
    public final hj40 a;
    public final List b;
    public final vjx c;

    public azy0(hj40 hj40Var, List list, vjx vjxVar) {
        this.a = hj40Var;
        this.b = list;
        this.c = vjxVar;
    }

    @Override // defpackage.bzy0
    public final hj40 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azy0)) {
            return false;
        }
        azy0 azy0Var = (azy0) obj;
        return jl40.l(this.a, azy0Var.a) && jl40.l(this.b, azy0Var.b) && jl40.l(this.c, azy0Var.c);
    }

    public final int hashCode() {
        hj40 hj40Var = this.a;
        int c = unr0.c((hj40Var == null ? 0 : hj40Var.hashCode()) * 31, 31, this.b);
        vjx vjxVar = this.c;
        return c + (vjxVar != null ? vjxVar.hashCode() : 0);
    }

    public final String toString() {
        return "SuburbanThreadsState(stop=" + this.a + ", threads=" + this.b + ", routeInfo=" + this.c + Extension.C_BRAKE;
    }
}
