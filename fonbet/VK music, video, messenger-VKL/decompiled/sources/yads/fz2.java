package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class fz2 {
    public final String a;

    public fz2(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz2) && epx.f(this.a, ((fz2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("SessionParameters(token=", this.a, ")");
    }
}
