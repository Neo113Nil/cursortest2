package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class tz2 {
    public final long a;
    public final String b;
    public final int c;
    public final uz2 d;

    public tz2(int i, long j, uz2 uz2Var, String str) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = uz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz2)) {
            return false;
        }
        tz2 tz2Var = (tz2) obj;
        return this.a == tz2Var.a && epx.f(this.b, tz2Var.b) && this.c == tz2Var.c && this.d == tz2Var.d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + re3.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowNotice(delay=" + this.a + ", url=" + this.b + ", visibilityPercent=" + this.c + ", type=" + this.d + ")";
    }
}
