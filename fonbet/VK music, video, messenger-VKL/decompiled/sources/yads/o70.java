package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class o70 extends s70 {
    public final y90 b;

    public o70(y90 y90Var) {
        super(y90Var.c(), 0);
        this.b = y90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o70) && epx.f(this.b, ((o70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AdUnitMediationAdapter(adapter=" + this.b + ")";
    }
}
