package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ProgressSemantics.kt */
/* loaded from: classes11.dex */
public final class j3e0 {
    public static q630 a(q630 q630Var, float f) {
        return egi0.b(q630Var, true, new i3e0(f, new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), 0));
    }
}
