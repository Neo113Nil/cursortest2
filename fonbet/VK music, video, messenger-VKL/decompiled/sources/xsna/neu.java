package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.Pair;
import xsna.w0g;

/* compiled from: CollageGrid.kt */
/* loaded from: classes4.dex */
public final class neu implements w0g {
    public static final neu a = new neu();
    public static final Map<n2k0, w0g.a> b;

    static {
        h2k0 h2k0Var = h2k0.a;
        b = on00.f(new Pair(h2k0Var, new w0g.a(h2k0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f)));
    }

    @Override // xsna.w0g
    public final Map<n2k0, w0g.a> a() {
        return b;
    }

    public final String toString() {
        return "Grid1";
    }
}
