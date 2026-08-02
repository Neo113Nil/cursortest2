package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class j90 implements m90 {
    public final String a;

    public j90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j90) && epx.f(this.a, ((j90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("Message(text=", this.a, ")");
    }
}
