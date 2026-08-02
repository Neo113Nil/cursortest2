package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class m80 {
    public static final l80 Companion = new l80();
    public static final KSerializer[] g = {null, null, new xsna.yk3(xr1.a), null, new xsna.yk3(yv1.a), new xsna.yk3(gv1.a)};
    public final m50 a;
    public final t80 b;
    public final List c;
    public final t50 d;
    public final List e;
    public final List f;

    public /* synthetic */ m80(int i, m50 m50Var, t80 t80Var, List list, t50 t50Var, List list2, List list3) {
        if (63 != (i & 63)) {
            xsna.sp.x(i, 63, k80.a.getDescriptor());
            throw null;
        }
        this.a = m50Var;
        this.b = t80Var;
        this.c = list;
        this.d = t50Var;
        this.e = list2;
        this.f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m80)) {
            return false;
        }
        m80 m80Var = (m80) obj;
        return epx.f(this.a, m80Var.a) && epx.f(this.b, m80Var.b) && epx.f(this.c, m80Var.c) && epx.f(this.d, m80Var.d) && epx.f(this.e, m80Var.e) && epx.f(this.f, m80Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + eb.a(this.e, (this.d.hashCode() + eb.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        m50 m50Var = this.a;
        t80 t80Var = this.b;
        List list = this.c;
        t50 t50Var = this.d;
        List list2 = this.e;
        List list3 = this.f;
        StringBuilder sb = new StringBuilder("DebugPanelReportData(appData=");
        sb.append(m50Var);
        sb.append(", sdkData=");
        sb.append(t80Var);
        sb.append(", networksData=");
        sb.append(list);
        sb.append(", consentsData=");
        sb.append(t50Var);
        sb.append(", sdkLogs=");
        return com.vk.movika.sdk.base.model.n.b(sb, list2, ", networkLogs=", list3, ")");
    }

    public m80(m50 m50Var, t80 t80Var, List list, t50 t50Var, List list2, List list3) {
        this.a = m50Var;
        this.b = t80Var;
        this.c = list;
        this.d = t50Var;
        this.e = list2;
        this.f = list3;
    }
}
