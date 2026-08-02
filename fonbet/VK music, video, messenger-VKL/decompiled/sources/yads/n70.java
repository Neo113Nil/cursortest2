package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class n70 extends s70 {
    public final String b;

    public n70(String str) {
        super("Ad Units", 0);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n70) && epx.f(this.b, ((n70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("AdUnit(unitId=", this.b, ")");
    }
}
