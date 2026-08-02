package xsna;

import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import java.util.Map;
import kotlin.Pair;

/* compiled from: MiniplayerPortraitMotionState.kt */
/* loaded from: classes7.dex */
public final class js20 extends ob30<yig> {
    public final zig c;

    public js20(wvs0 wvs0Var) {
        super(DiscoveryScreenMotionStates$Portrait.Miniplayer);
        this.c = new zig(wvs0Var);
    }

    @Override // xsna.pny
    public final Map a(wny wnyVar) {
        yig yigVar = (yig) wnyVar;
        kxj0 kxj0Var = yigVar.a;
        int i = kxj0Var.a;
        int i2 = yigVar.c;
        kxj0 kxj0Var2 = new kxj0(i, i2);
        return pn00.i(new Pair(DiscoveryLayoutNodes.PlayerContainer, new upy(new lzb0(0, (kxj0Var.b - yigVar.b.d) - i2), kxj0Var2, 1.0f)));
    }

    @Override // xsna.pny
    public final nc b() {
        return this.c;
    }
}
