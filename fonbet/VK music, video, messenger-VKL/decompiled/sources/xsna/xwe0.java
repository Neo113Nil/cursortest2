package xsna;

import java.util.List;

/* compiled from: RateLimiterConfig.kt */
/* loaded from: classes6.dex */
public final class xwe0 {
    public final axe0 a;
    public final Object b;

    public xwe0(axe0 axe0Var, List<String> list) {
        this.a = axe0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwe0)) {
            return false;
        }
        xwe0 xwe0Var = (xwe0) obj;
        return this.a.equals(xwe0Var.a) && this.b.equals(xwe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RateLimitFunnel(entry=");
        sb.append(this.a);
        sb.append(", steps=");
        return k73.c(sb, this.b, ')');
    }
}
