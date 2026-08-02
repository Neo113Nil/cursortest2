package yads;

import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class v70 {
    public final List a;
    public final m50 b;
    public final u80 c;
    public final b40 d;
    public final d50 e;
    public final t50 f;
    public final u70 g;

    public v70(List list, m50 m50Var, u80 u80Var, b40 b40Var, d50 d50Var, t50 t50Var, u70 u70Var) {
        this.a = list;
        this.b = m50Var;
        this.c = u80Var;
        this.d = b40Var;
        this.e = d50Var;
        this.f = t50Var;
        this.g = u70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return epx.f(this.a, v70Var.a) && epx.f(this.b, v70Var.b) && epx.f(this.c, v70Var.c) && epx.f(this.d, v70Var.d) && epx.f(this.e, v70Var.e) && epx.f(this.f, v70Var.f) && epx.f(this.g, v70Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + eb.a(this.e.a, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelFeedData(alertsData=" + this.a + ", appData=" + this.b + ", sdkIntegrationData=" + this.c + ", adNetworkSettingsData=" + this.d + ", adaptersData=" + this.e + ", consentsData=" + this.f + ", debugErrorIndicatorData=" + this.g + ")";
    }
}
