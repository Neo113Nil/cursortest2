package xsna;

import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import java.util.Map;
import kotlin.Pair;

/* compiled from: FullscreenPortraitMotionState.kt */
/* loaded from: classes7.dex */
public final class uys extends ob30<oig> {
    public final pig c;

    public uys(wvs0 wvs0Var) {
        super(DiscoveryScreenMotionStates$Portrait.Fullscreen);
        this.c = new pig(wvs0Var);
    }

    @Override // xsna.pny
    public final Map a(wny wnyVar) {
        return on00.f(new Pair(DiscoveryLayoutNodes.PlayerContainer, new upy(lzb0.c, ((oig) wnyVar).a, 1.0f)));
    }

    @Override // xsna.pny
    public final nc b() {
        return this.c;
    }
}
