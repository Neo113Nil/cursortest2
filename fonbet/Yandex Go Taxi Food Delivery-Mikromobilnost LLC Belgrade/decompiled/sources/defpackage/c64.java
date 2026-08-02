package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class c64 extends bvm {
    public final enw0 a;
    public final enw0 b;
    public final ArrayList c;

    public c64(enw0 enw0Var, enw0 enw0Var2, ArrayList arrayList) {
        if (enw0Var == null) {
            ny61.t("Null primarySurfaceEdge");
            throw null;
        }
        this.a = enw0Var;
        if (enw0Var2 == null) {
            ny61.t("Null secondarySurfaceEdge");
            throw null;
        }
        this.b = enw0Var2;
        this.c = arrayList;
    }

    @Override // defpackage.bvm
    public final List a() {
        return this.c;
    }

    @Override // defpackage.bvm
    public final enw0 b() {
        return this.a;
    }

    @Override // defpackage.bvm
    public final enw0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bvm)) {
            return false;
        }
        bvm bvmVar = (bvm) obj;
        return this.a.equals(bvmVar.b()) && this.b.equals(bvmVar.c()) && this.c.equals(bvmVar.a());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{primarySurfaceEdge=");
        sb.append(this.a);
        sb.append(", secondarySurfaceEdge=");
        sb.append(this.b);
        sb.append(", outConfigs=");
        return b64.n("}", sb, this.c);
    }
}
