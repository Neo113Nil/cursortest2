package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AuthorHeaderMediaPagerState.kt */
/* loaded from: classes5.dex */
public final class la5 {
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    public la5() {
        this(0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static la5 a(la5 la5Var, int i, int i2, float f, int i3) {
        int i4 = la5Var.a;
        if ((i3 & 2) != 0) {
            i = la5Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = la5Var.c;
        }
        if ((i3 & 8) != 0) {
            f = la5Var.d;
        }
        la5Var.getClass();
        return new la5(i4, i, i2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la5)) {
            return false;
        }
        la5 la5Var = (la5) obj;
        return this.a == la5Var.a && this.b == la5Var.b && this.c == la5Var.c && Float.compare(this.d, la5Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorHeaderPaginationState(totalPages=");
        sb.append(this.a);
        sb.append(", currentPage=");
        sb.append(this.b);
        sb.append(", settledPage=");
        sb.append(this.c);
        sb.append(", progress=");
        return xq.c(')', this.d, sb);
    }

    public la5(int i, int i2, int i3, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }
}
