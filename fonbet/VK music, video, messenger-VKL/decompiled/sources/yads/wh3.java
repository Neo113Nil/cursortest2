package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class wh3 extends yh3 {
    public final ff3 a;

    public wh3(ff3 ff3Var) {
        super(0);
        this.a = ff3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh3) && epx.f(this.a, ((wh3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
