package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class b31 {
    public final tg a;
    public final String b;
    public final g31 c;

    public b31(tg tgVar, String str, g31 g31Var) {
        this.a = tgVar;
        this.b = str;
        this.c = g31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b31)) {
            return false;
        }
        b31 b31Var = (b31) obj;
        return epx.f(this.a, b31Var.a) && epx.f(this.b, b31Var.b) && this.c == b31Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k4.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Identifiers(appMetricaIdentifiers=" + this.a + ", mauid=" + this.b + ", identifiersType=" + this.c + ")";
    }
}
