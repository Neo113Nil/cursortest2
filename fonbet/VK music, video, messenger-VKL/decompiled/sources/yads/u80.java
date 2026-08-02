package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class u80 {
    public final String a;
    public final w80 b;

    public u80(String str, w80 w80Var) {
        this.a = str;
        this.b = w80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u80)) {
            return false;
        }
        u80 u80Var = (u80) obj;
        return epx.f(this.a, u80Var.a) && epx.f(this.b, u80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationData(sdkVersion=" + this.a + ", sdkIntegrationStatusData=" + this.b + ")";
    }
}
