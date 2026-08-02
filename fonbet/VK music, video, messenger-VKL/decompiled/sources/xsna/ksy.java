package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: LazyItemScope.kt */
/* loaded from: classes11.dex */
public interface ksy {
    static q630 c(ksy ksyVar, q630 q630Var, int i) {
        xmk0 xmk0Var;
        xmk0 c = (i & 1) != 0 ? jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5) : null;
        if ((i & 2) != 0) {
            long j = 1;
            xmk0Var = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new h9x((j & 4294967295L) | (j << 32)), 1);
        } else {
            xmk0Var = null;
        }
        return ksyVar.e(q630Var, c, xmk0Var, (i & 4) != 0 ? jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5) : null);
    }

    q630 a(q630 q630Var);

    q630 b(q630 q630Var);

    q630 d();

    default q630 e(q630 q630Var, phr<Float> phrVar, phr<h9x> phrVar2, phr<Float> phrVar3) {
        return q630Var;
    }
}
