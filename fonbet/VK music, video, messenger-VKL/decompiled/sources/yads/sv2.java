package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class sv2 implements uv2 {
    public final l4 a;

    public sv2(l4 l4Var) {
        this.a = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sv2) && epx.f(this.a, ((sv2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
