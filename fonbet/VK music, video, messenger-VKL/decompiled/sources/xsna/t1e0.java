package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes11.dex */
public final class t1e0 {
    public static final t1e0 d = new t1e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 0);
    public final float a;
    public final bwf<Float> b;
    public final int c;

    /* compiled from: SemanticsProperties.kt */
    public static final class a {
    }

    public t1e0(float f, bwf<Float> bwfVar, int i) {
        this.a = f;
        this.b = bwfVar;
        this.c = i;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final bwf<Float> a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1e0)) {
            return false;
        }
        t1e0 t1e0Var = (t1e0) obj;
        return this.a == t1e0Var.a && epx.f(this.b, t1e0Var.b) && this.c == t1e0Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return vu5.b(sb, this.c, ')');
    }
}
