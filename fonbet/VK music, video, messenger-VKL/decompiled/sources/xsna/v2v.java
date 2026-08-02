package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import java.util.Map;
import kotlin.Pair;

/* compiled from: HiddenPortraitMotionState.kt */
/* loaded from: classes7.dex */
public final class v2v extends ob30<yig> {
    public final zig c;

    public v2v(wvs0 wvs0Var) {
        super(DiscoveryScreenMotionStates$Portrait.Hidden);
        this.c = new zig(wvs0Var);
    }

    @Override // xsna.pny
    public final Map a(wny wnyVar) {
        yig yigVar = (yig) wnyVar;
        kxj0 kxj0Var = yigVar.a;
        int b = an10.b(kxj0Var.a / 1.7777778f);
        int i = kxj0Var.b;
        h4x h4xVar = yigVar.b;
        int i2 = h4xVar.d;
        int i3 = yigVar.c;
        int i4 = (i - i2) - i3;
        lzb0 lzb0Var = new lzb0(0, i4);
        int i5 = kxj0Var.a;
        kxj0 kxj0Var2 = new kxj0(i5, ((i - b) - h4xVar.b) - i2);
        lzb0 lzb0Var2 = new lzb0(0, i4 + i3);
        return pn00.k(new Pair(DiscoveryLayoutNodes.PlayerContainer, new upy(lzb0Var, new kxj0(i5, i3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new Pair(DiscoveryLayoutNodes.FragmentContainerShadow, new upy(lzb0.c, yigVar.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new Pair(DiscoveryLayoutNodes.ContentContainerBackground, new upy(lzb0Var2, kxj0Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new Pair(DiscoveryLayoutNodes.ContentContainer, new upy(lzb0Var2, kxj0Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new Pair(DiscoveryLayoutNodes.DialogContainer, new upy(lzb0Var2, kxj0Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
    }

    @Override // xsna.pny
    public final nc b() {
        return this.c;
    }
}
