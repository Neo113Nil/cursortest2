package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import xsna.j3b0;

/* compiled from: PlayerSettingsMenuReducer.kt */
/* loaded from: classes3.dex */
public final class k3b0 extends dm50<m3b0, j3b0, l3b0> {
    @Override // xsna.dm50
    public final l3b0 c(l3b0 l3b0Var, j3b0 j3b0Var) {
        l3b0 l3b0Var2 = l3b0Var;
        j3b0 j3b0Var2 = j3b0Var;
        if (j3b0Var2 instanceof j3b0.b) {
            j3b0.b bVar = (j3b0.b) j3b0Var2;
            return l3b0.a(l3b0Var2, false, bVar.b, bVar.c, bVar.d, bVar.e, null, bVar.f, bVar.g, bVar.h, bVar.i, 33);
        }
        if (j3b0Var2 instanceof j3b0.f) {
            return l3b0.a(l3b0Var2, false, false, false, null, ((j3b0.f) j3b0Var2).b, null, false, false, false, false, 1007);
        }
        if (j3b0Var2 instanceof j3b0.e) {
            return l3b0.a(l3b0Var2, false, false, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((j3b0.e) j3b0Var2).b, false, false, false, false, 991);
        }
        if (j3b0Var2 instanceof j3b0.d) {
            return l3b0.a(l3b0Var2, ((j3b0.d) j3b0Var2).b, false, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, false, false, false, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        }
        if (j3b0Var2 instanceof j3b0.a) {
            return l3b0.a(l3b0Var2, false, false, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, ((j3b0.a) j3b0Var2).b, false, false, false, 959);
        }
        if (j3b0Var2 instanceof j3b0.c) {
            return l3b0.a(l3b0Var2, false, false, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, false, ((j3b0.c) j3b0Var2).b, false, 767);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final m3b0 d() {
        return new m3b0(e(new mga0(this, 1)));
    }

    @Override // xsna.dm50
    public final void h(l3b0 l3b0Var, m3b0 m3b0Var) {
        f(m3b0Var.a, l3b0Var);
    }
}
