package xsna;

/* compiled from: TrackSelectorParamsConfig.kt */
/* loaded from: classes11.dex */
public final class dhp0 {
    public static final a g = new a();
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final float f;

    /* compiled from: TrackSelectorParamsConfig.kt */
    public static final class a {
    }

    public dhp0(float f, int i, int i2, long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = i2;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhp0)) {
            return false;
        }
        dhp0 dhp0Var = (dhp0) obj;
        return this.a == dhp0Var.a && this.b == dhp0Var.b && this.c == dhp0Var.c && this.d == dhp0Var.d && this.e == dhp0Var.e && Float.compare(this.f, dhp0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + shy.a(this.e, shy.a(this.d, bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackSelectorParamsConfig(minDurationForQualityIncreaseMs=");
        sb.append(this.a);
        sb.append(", maxDurationForQualityDecreaseMs=");
        sb.append(this.b);
        sb.append(", minDurationToRetainAfterDiscardMs=");
        sb.append(this.c);
        sb.append(", maxWidthToDiscard=");
        sb.append(this.d);
        sb.append(", maxHeightToDiscard=");
        sb.append(this.e);
        sb.append(", bufferedFractionToLiveEdgeForQualityIncrease=");
        return xq.c(')', this.f, sb);
    }
}
