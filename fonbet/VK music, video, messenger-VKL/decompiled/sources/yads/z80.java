package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class z80 implements g90 {
    public final String a;

    public z80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z80) && epx.f(this.a, ((z80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("OnAdUnitClick(id=", this.a, ")");
    }
}
