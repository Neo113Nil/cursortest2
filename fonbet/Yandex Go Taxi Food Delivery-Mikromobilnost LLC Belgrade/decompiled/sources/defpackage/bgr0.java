package defpackage;

import skeletor.render.SkeletonContentView;

/* loaded from: classes.dex */
public final class bgr0 {
    public static final bgr0 d = new bgr0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public bgr0(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgr0)) {
            return false;
        }
        bgr0 bgr0Var = (bgr0) obj;
        return ldc.c(this.a, bgr0Var.a) && wu60.c(this.b, bgr0Var.b) && this.c == bgr0Var.c;
    }

    public final int hashCode() {
        int i = ldc.n;
        return Float.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        xvz.w(this.a, ", offset=", sb);
        sb.append((Object) wu60.h(this.b));
        sb.append(", blurRadius=");
        return n.n(sb, this.c, ')');
    }
}
