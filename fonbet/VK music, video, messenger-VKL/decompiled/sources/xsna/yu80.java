package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import xsna.q630;
import xsna.y8l;

/* compiled from: OrderIslands.kt */
/* loaded from: classes18.dex */
public final class yu80 {
    public static final float a = 20;
    public static final float b;

    static {
        float f = kqu0.a;
        b = kqu0.t;
    }

    public static final q630 a(q630 q630Var, long j, y8l y8lVar) {
        r5j0 r5j0Var;
        u890 n;
        boolean z = y8lVar instanceof y8l.a;
        if (z) {
            q630Var = q630Var.g(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b, 7));
        }
        float f = a;
        if (z) {
            r5j0Var = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3);
        } else if (y8lVar instanceof y8l.c) {
            r5j0Var = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
        } else {
            if (!(y8lVar instanceof y8l.b)) {
                throw new NoWhenBranchMatchedException();
            }
            r5j0Var = androidx.compose.ui.graphics.e.a;
        }
        q630 m = hr80.m(q630Var, j, r5j0Var);
        if (z) {
            n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((y8l.a) y8lVar).a, 7);
        } else if (y8lVar instanceof y8l.b) {
            n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((y8l.b) y8lVar).a, 7);
        } else {
            if (!(y8lVar instanceof y8l.c)) {
                throw new NoWhenBranchMatchedException();
            }
            n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((y8l.c) y8lVar).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
        }
        return s200.C(m, n);
    }
}
