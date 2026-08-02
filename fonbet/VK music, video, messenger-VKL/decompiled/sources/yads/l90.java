package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class l90 implements m90 {
    public final String a;

    public l90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l90)) {
            return false;
        }
        l90 l90Var = (l90) obj;
        l90Var.getClass();
        return epx.f(this.a, l90Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 562735108;
    }

    public final String toString() {
        return xsna.zr.a("Warning(title=Warning, message=", this.a, ")");
    }
}
