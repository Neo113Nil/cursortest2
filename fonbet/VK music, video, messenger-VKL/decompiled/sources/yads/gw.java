package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class gw {
    public final fw a;
    public final String b;

    public gw(fw fwVar, String str) {
        this.a = fwVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return this.a == gwVar.a && epx.f(this.b, gwVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CloseButtonValue(type=" + this.a + ", text=" + this.b + ")";
    }
}
