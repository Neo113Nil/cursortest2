package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: Shadow.kt */
/* loaded from: classes11.dex */
public final class v4j0 {
    public static final v4j0 d = new v4j0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7);
    public final long a;
    public final long b;
    public final float c;

    public v4j0(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public static v4j0 a(v4j0 v4j0Var, long j) {
        long j2 = v4j0Var.b;
        float f = v4j0Var.c;
        v4j0Var.getClass();
        return new v4j0(j, j2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4j0)) {
            return false;
        }
        v4j0 v4j0Var = (v4j0) obj;
        return l5g.d(this.a, v4j0Var.a) && ov70.c(this.b, v4j0Var.b) && this.c == v4j0Var.c;
    }

    public final int hashCode() {
        int i = l5g.l;
        return Float.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        dn.h(this.a, ", offset=", sb);
        sb.append((Object) ov70.h(this.b));
        sb.append(", blurRadius=");
        return xq.c(')', this.c, sb);
    }

    public /* synthetic */ v4j0(float f, int i) {
        this(f870.d(4278190080L), 0L, (i & 4) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f);
    }
}
