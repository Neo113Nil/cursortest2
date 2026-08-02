package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.Pair;
import xsna.w0g;

/* compiled from: CollageGrid.kt */
/* loaded from: classes4.dex */
public final class peu implements w0g {
    public static final peu a = new peu();
    public static final Object b;

    static {
        h2k0 h2k0Var = h2k0.a;
        Pair pair = new Pair(h2k0Var, new w0g.a(h2k0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f));
        i2k0 i2k0Var = i2k0.a;
        b = pn00.k(pair, new Pair(i2k0Var, new w0g.a(i2k0Var, 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<xsna.n2k0, xsna.w0g$a>] */
    @Override // xsna.w0g
    public final Map<n2k0, w0g.a> a() {
        return b;
    }

    public final String toString() {
        return "Grid2Vertical";
    }
}
