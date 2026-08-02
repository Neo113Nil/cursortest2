package yads;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public final class kg3 {
    public final cl3 a;
    public boolean b;

    public kg3(lg3 lg3Var, cl3 cl3Var) {
        this.a = cl3Var;
        this.b = lg3Var.getVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
