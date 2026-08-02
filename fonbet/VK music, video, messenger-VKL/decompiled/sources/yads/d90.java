package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class d90 implements g90 {
    public final y90 a;

    public d90(y90 y90Var) {
        this.a = y90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d90) && epx.f(this.a, ((d90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnMediationNetworkClick(uiUnit=" + this.a + ")";
    }
}
