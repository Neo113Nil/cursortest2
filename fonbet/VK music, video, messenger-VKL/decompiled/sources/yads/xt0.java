package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class xt0 {
    public final String a;

    public xt0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt0) && epx.f(this.a, ((xt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("FeedSessionData(value=", this.a, ")");
    }
}
