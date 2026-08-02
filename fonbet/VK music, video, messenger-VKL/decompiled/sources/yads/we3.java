package yads;

import java.util.List;
import xsna.epx;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class we3 {
    public final List a;
    public final qk3 b;
    public final x41 c;

    public we3(List list, qk3 qk3Var, x41 x41Var) {
        this.a = list;
        this.b = qk3Var;
        this.c = x41Var;
    }

    public final nf3 a() {
        return (nf3) j5g.Y(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we3)) {
            return false;
        }
        we3 we3Var = (we3) obj;
        return epx.f(this.a, we3Var.a) && epx.f(this.b, we3Var.b) && epx.f(this.c, we3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qk3 qk3Var = this.b;
        int hashCode2 = (hashCode + (qk3Var == null ? 0 : qk3Var.hashCode())) * 31;
        x41 x41Var = this.c;
        return hashCode2 + (x41Var != null ? x41Var.hashCode() : 0);
    }

    public final String toString() {
        return "Video(videoAdsInfo=" + this.a + ", videoSettings=" + this.b + ", preview=" + this.c + ")";
    }
}
