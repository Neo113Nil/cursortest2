package yads;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class b80 {
    public final m50 a;
    public final t80 b;
    public final List c;
    public final t50 d;
    public final u70 e;
    public final c80 f;

    public b80(m50 m50Var, t80 t80Var, ArrayList arrayList, t50 t50Var, u70 u70Var, c80 c80Var) {
        this.a = m50Var;
        this.b = t80Var;
        this.c = arrayList;
        this.d = t50Var;
        this.e = u70Var;
        this.f = c80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b80)) {
            return false;
        }
        b80 b80Var = (b80) obj;
        return epx.f(this.a, b80Var.a) && epx.f(this.b, b80Var.b) && epx.f(this.c, b80Var.c) && epx.f(this.d, b80Var.d) && epx.f(this.e, b80Var.e) && epx.f(this.f, b80Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + eb.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31)) * 31;
        c80 c80Var = this.f;
        return hashCode + (c80Var == null ? 0 : c80Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelLocalData(appData=" + this.a + ", sdkData=" + this.b + ", mediationNetworksData=" + this.c + ", consentsData=" + this.d + ", debugErrorIndicatorData=" + this.e + ", logsData=" + this.f + ")";
    }
}
