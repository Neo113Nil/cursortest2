package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.collage.model.CollageAspectRatioFormat;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: CollageParams.kt */
/* loaded from: classes4.dex */
public final class gfp extends w1g {
    public final boolean i;

    public gfp(e4p e4pVar) {
        super(e4pVar, neu.a, CollageAspectRatioFormat.CollageOriginal, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f0g.e, new g2g(on00.f(new Pair(h2k0.a, new c2g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e4pVar)))), ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.i = true;
    }

    @Override // xsna.w1g, xsna.g5p
    public final boolean I() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gfp)) {
            return false;
        }
        Map<n2k0, c2g> map = this.g.a;
        h2k0 h2k0Var = h2k0.a;
        c2g c2gVar = map.get(h2k0Var);
        c2g c2gVar2 = ((gfp) obj).g.a.get(h2k0Var);
        return epx.f(c2gVar != null ? c2gVar.i : null, c2gVar2 != null ? c2gVar2.i : null);
    }
}
