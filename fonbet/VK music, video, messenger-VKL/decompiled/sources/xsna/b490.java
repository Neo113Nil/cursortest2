package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: OverscrollConfiguration.android.kt */
@ozl
/* loaded from: classes11.dex */
public final class b490 {
    public final long a;
    public final u890 b;

    public b490() {
        long d = f870.d(4284900966L);
        u890 m = s200.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        this.a = d;
        this.b = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b490.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        b490 b490Var = (b490) obj;
        return l5g.d(this.a, b490Var.a) && epx.f(this.b, b490Var.b);
    }

    public final int hashCode() {
        int i = l5g.l;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        dn.h(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
