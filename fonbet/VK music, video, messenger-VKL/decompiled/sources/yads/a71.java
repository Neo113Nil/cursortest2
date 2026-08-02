package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class a71 implements d71 {
    public final String a;

    public a71(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a71) && epx.f(this.a, ((a71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("Failure(message=", this.a, ")");
    }
}
