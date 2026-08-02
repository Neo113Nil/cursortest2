package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.yk8;

/* compiled from: TransparentDisappearingHelper.kt */
/* loaded from: classes5.dex */
public final class lop0 {
    public final y7z a;

    public lop0(float f) {
        this.a = yk8.a.g(e43.l(new l5g(l5g.b), new l5g(l5g.j)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 10);
    }

    public final void a(ggj ggjVar, float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L));
        y7z y7zVar = this.a;
        float intBitsToFloat2 = (intBitsToFloat - Float.intBitsToFloat((int) (4294967295L & y7zVar.b()))) - f;
        ggjVar.a0().a.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat2);
        try {
            oio.x1(ggjVar, y7zVar, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 6, 62);
        } finally {
            ggjVar.a0().a.l(-0.0f, -intBitsToFloat2);
        }
    }
}
