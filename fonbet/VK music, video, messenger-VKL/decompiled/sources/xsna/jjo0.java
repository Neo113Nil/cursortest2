package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: TextLayoutHelper.kt */
/* loaded from: classes11.dex */
public final class jjo0 {
    public static final float a(ljo0 ljo0Var, int i) {
        if (i < 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        kjo0 kjo0Var = ljo0Var.a;
        m540 m540Var = ljo0Var.b;
        if (kjo0Var.a.c.length() == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int min = Math.min(m540Var.d(i), Math.min(m540Var.b - 1, m540Var.f - 1));
        if (i > m540Var.c(min, false)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        m540Var.n(min);
        ArrayList arrayList = m540Var.h;
        ah90 ah90Var = (ah90) arrayList.get(c4g0.o(min, arrayList));
        ya2 ya2Var = ah90Var.a;
        int i2 = min - ah90Var.d;
        fjo0 fjo0Var = ya2Var.d;
        return fjo0Var.e(i2) - fjo0Var.g(i2);
    }
}
