package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class f90 implements g90 {
    public final String a;

    public f90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f90) && epx.f(this.a, ((f90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("OnWarningButtonClick(waring=", this.a, ")");
    }
}
