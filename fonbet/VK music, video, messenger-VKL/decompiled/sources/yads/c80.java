package yads;

import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class c80 {
    public final List a;
    public final List b;

    public c80(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c80)) {
            return false;
        }
        c80 c80Var = (c80) obj;
        return epx.f(this.a, c80Var.a) && epx.f(this.b, c80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelLogsData(sdkLogs=" + this.a + ", networkLogs=" + this.b + ")";
    }
}
