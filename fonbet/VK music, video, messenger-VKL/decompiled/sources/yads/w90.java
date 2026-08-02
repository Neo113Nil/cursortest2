package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class w90 extends ba0 {
    public final String a;

    public w90(String str) {
        super(0);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w90) && epx.f(this.a, ((w90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("Header(text=", this.a, ")");
    }
}
