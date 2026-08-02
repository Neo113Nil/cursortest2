package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: AccessibilityUtil.kt */
/* loaded from: classes11.dex */
public final class vm {
    public static final float a;
    public static final float b;
    public static final q630 c;
    public static final q630 d;

    static {
        float f = 10;
        a = f;
        b = f;
        pm pmVar = new pm(0);
        q630.a aVar = q630.a.a;
        c = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, egi0.b(dd80.i(aVar, pmVar), true, new qm(0)));
        d = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, egi0.b(dd80.i(aVar, new rm(0)), true, new sm(0)));
    }
}
