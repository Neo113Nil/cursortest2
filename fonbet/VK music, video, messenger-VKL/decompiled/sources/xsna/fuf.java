package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ClipsWrapperTitleMviStateMapper.kt */
/* loaded from: classes17.dex */
public final class fuf {
    public static euf a(euf eufVar) {
        return euf.o(eufVar, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, 1011);
    }

    public static euf b(euf eufVar, zrf zrfVar) {
        tlo0 d;
        wrf h = zrfVar.h();
        if (h == null || (d = h.b()) == null) {
            d = oq.d(tlo0.Companion, "");
        }
        tlo0 tlo0Var = d;
        boolean m = zrfVar.m();
        return (tlo0Var.equals(eufVar.b) && m == eufVar.e && epx.f(zrfVar.b, eufVar.f)) ? eufVar : euf.o(eufVar, tlo0Var, null, false, m, zrfVar, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, 998);
    }
}
