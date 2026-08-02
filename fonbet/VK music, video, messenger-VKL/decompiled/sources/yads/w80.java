package yads;

import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class w80 {
    public final v80 a;
    public final List b;

    public w80(v80 v80Var, List list) {
        this.a = v80Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80Var = (w80) obj;
        return this.a == w80Var.a && epx.f(this.b, w80Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationStatusData(status=" + this.a + ", messages=" + this.b + ")";
    }
}
