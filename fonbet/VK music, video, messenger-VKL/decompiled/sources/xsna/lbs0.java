package xsna;

/* compiled from: VideoColdStartDelayConfig.kt */
/* loaded from: classes.dex */
public final class lbs0 {
    public static final a f = new a();
    public final boolean a;
    public final boolean b;
    public final long c;
    public final Long d;
    public final Long e;

    /* compiled from: VideoColdStartDelayConfig.kt */
    public static final class a {
    }

    public lbs0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbs0)) {
            return false;
        }
        lbs0 lbs0Var = (lbs0) obj;
        return this.a == lbs0Var.a && this.b == lbs0Var.b && this.c == lbs0Var.c && epx.f(this.d, lbs0Var.d) && epx.f(this.e, lbs0Var.e);
    }

    public final int hashCode() {
        int a2 = bh10.a(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, false), 31, this.c);
        Long l = this.d;
        int hashCode = (a2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoColdStartDelayConfig(isAutoplayPreloadForbidden=");
        sb.append(this.a);
        sb.append(", isAutoplayDelayedTillAllImagesShown=");
        sb.append(this.b);
        sb.append(", isBackgroundLoadingByDeeplinkForbidden=false, maxImagesWaitingTimeoutMs=");
        sb.append(this.c);
        sb.append(", lowNetworkBandwidthPreload=");
        sb.append(this.d);
        sb.append(", lowNetworkBandwidthAutoplay=");
        return iq.b(sb, this.e, ')');
    }

    public /* synthetic */ lbs0(int i) {
        this(false, false, 0L, null, null);
    }

    public lbs0(boolean z, boolean z2, long j, Long l, Long l2) {
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = l;
        this.e = l2;
    }
}
