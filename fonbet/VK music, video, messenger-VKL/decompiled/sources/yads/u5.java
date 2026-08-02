package yads;

import java.util.Map;
import xsna.epx;

/* loaded from: classes10.dex */
public final class u5 {
    public final v5 a;
    public final Map b;

    public u5(v5 v5Var, Map map) {
        this.a = v5Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return this.a == u5Var.a && epx.f(this.b, u5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadingPhase(adLoadingPhaseType=" + this.a + ", reportParameters=" + this.b + ")";
    }
}
