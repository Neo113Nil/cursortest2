package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class r70 extends s70 {
    public final String b;

    public r70(String str) {
        super(str, 0);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r70) && epx.f(this.b, ((r70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("MediationNetwork(network=", this.b, ")");
    }
}
