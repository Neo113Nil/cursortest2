package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.Pair;
import xsna.w0g;

/* compiled from: CollageGrid.kt */
/* loaded from: classes4.dex */
public final class zeu implements w0g {
    public static final zeu a = new zeu();
    public static final Object b;

    static {
        h2k0 h2k0Var = h2k0.a;
        Pair pair = new Pair(h2k0Var, new w0g.a(h2k0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 0.5f));
        i2k0 i2k0Var = i2k0.a;
        Pair pair2 = new Pair(i2k0Var, new w0g.a(i2k0Var, 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 0.5f));
        j2k0 j2k0Var = j2k0.a;
        Pair pair3 = new Pair(j2k0Var, new w0g.a(j2k0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 0.34f, 0.5f));
        k2k0 k2k0Var = k2k0.a;
        Pair pair4 = new Pair(k2k0Var, new w0g.a(k2k0Var, 0.33f, 0.5f, 0.34f, 0.5f));
        l2k0 l2k0Var = l2k0.a;
        b = pn00.k(pair, pair2, pair3, pair4, new Pair(l2k0Var, new w0g.a(l2k0Var, 0.66f, 0.5f, 0.34f, 0.5f)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<xsna.n2k0, xsna.w0g$a>] */
    @Override // xsna.w0g
    public final Map<n2k0, w0g.a> a() {
        return b;
    }

    public final String toString() {
        return "Grid5Bottom";
    }
}
