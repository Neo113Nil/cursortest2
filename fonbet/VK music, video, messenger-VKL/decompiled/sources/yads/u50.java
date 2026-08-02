package yads;

import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class u50 {
    public final m50 a;
    public final t80 b;
    public final b40 c;
    public final d50 d;
    public final t50 e;
    public final u70 f;
    public final List g;
    public final List h;

    public u50(m50 m50Var, t80 t80Var, b40 b40Var, d50 d50Var, t50 t50Var, u70 u70Var, List list, List list2) {
        this.a = m50Var;
        this.b = t80Var;
        this.c = b40Var;
        this.d = d50Var;
        this.e = t50Var;
        this.f = u70Var;
        this.g = list;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u50)) {
            return false;
        }
        u50 u50Var = (u50) obj;
        return epx.f(this.a, u50Var.a) && epx.f(this.b, u50Var.b) && epx.f(this.c, u50Var.c) && epx.f(this.d, u50Var.d) && epx.f(this.e, u50Var.e) && epx.f(this.f, u50Var.f) && epx.f(this.g, u50Var.g) && epx.f(this.h, u50Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + eb.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + eb.a(this.d.a, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        m50 m50Var = this.a;
        t80 t80Var = this.b;
        b40 b40Var = this.c;
        d50 d50Var = this.d;
        t50 t50Var = this.e;
        u70 u70Var = this.f;
        List list = this.g;
        List list2 = this.h;
        StringBuilder sb = new StringBuilder("DebugPanelData(appData=");
        sb.append(m50Var);
        sb.append(", sdkData=");
        sb.append(t80Var);
        sb.append(", networkSettingsData=");
        sb.append(b40Var);
        sb.append(", adaptersData=");
        sb.append(d50Var);
        sb.append(", consentsData=");
        sb.append(t50Var);
        sb.append(", debugErrorIndicatorData=");
        sb.append(u70Var);
        sb.append(", adUnits=");
        return com.vk.movika.sdk.base.model.n.b(sb, list, ", alerts=", list2, ")");
    }
}
