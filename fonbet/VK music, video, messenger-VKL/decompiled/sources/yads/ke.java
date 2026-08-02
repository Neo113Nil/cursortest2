package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class ke {
    public final vd a;

    public ke(vd vdVar) {
        this.a = vdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke) && epx.f(this.a, ((ke) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(advertisingInfoHolder=" + this.a + ")";
    }
}
