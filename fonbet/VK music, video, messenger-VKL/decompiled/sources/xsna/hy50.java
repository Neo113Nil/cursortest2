package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: NavigationEvent.kt */
/* loaded from: classes12.dex */
public final class hy50 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public hy50() {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hy50.class == obj.getClass()) {
            hy50 hy50Var = (hy50) obj;
            return this.c == hy50Var.c && this.d == hy50Var.d && this.b == hy50Var.b && this.a == hy50Var.a && this.e == hy50Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + shy.a(this.a, io.reactivex.rxjava3.subjects.b.a(this.b, io.reactivex.rxjava3.subjects.b.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent(touchX=");
        sb.append(this.c);
        sb.append(", touchY=");
        sb.append(this.d);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", swipeEdge=");
        sb.append(this.a);
        sb.append(", frameTimeMillis=");
        return vu5.a(')', this.e, sb);
    }

    public hy50(float f, float f2, float f3, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }
}
