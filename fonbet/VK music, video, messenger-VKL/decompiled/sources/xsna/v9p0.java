package xsna;

import xsna.wkj;

/* compiled from: TopshelfCardBackground.kt */
/* loaded from: classes2.dex */
public final class v9p0 {
    public final dt1 a;
    public final wkj b;

    public v9p0(dt1 dt1Var, wkj.a.C3940a c3940a) {
        this.a = dt1Var;
        this.b = c3940a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9p0)) {
            return false;
        }
        v9p0 v9p0Var = (v9p0) obj;
        return epx.f(this.a, v9p0Var.a) && epx.f(this.b, v9p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopshelfBackgroundParams(alignment=" + this.a + ", contentScale=" + this.b + ')';
    }
}
