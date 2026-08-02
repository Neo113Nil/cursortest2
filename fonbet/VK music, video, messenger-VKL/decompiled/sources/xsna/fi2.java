package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Lambda;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class fi2 extends Lambda implements wzs<q9x, q9x, xmk0<q9x>> {
    public static final fi2 i = new fi2(2);

    @Override // xsna.wzs
    public final xmk0<q9x> invoke(q9x q9xVar, q9x q9xVar2) {
        long j = q9xVar.a;
        long j2 = q9xVar2.a;
        long j3 = 1;
        return jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new q9x((j3 & 4294967295L) | (j3 << 32)), 1);
    }
}
