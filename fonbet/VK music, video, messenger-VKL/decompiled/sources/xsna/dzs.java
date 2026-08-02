package xsna;

import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import java.util.Map;
import kotlin.Pair;

/* compiled from: FullscreenWithDialogLandscapeMotionState.kt */
/* loaded from: classes7.dex */
public final class dzs extends ob30<wig> {
    public final xig c;

    public dzs(wvs0 wvs0Var) {
        super(DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog);
        this.c = new xig(wvs0Var);
    }

    @Override // xsna.pny
    public final Map a(wny wnyVar) {
        wig wigVar = (wig) wnyVar;
        int i = wigVar.b;
        kxj0 kxj0Var = wigVar.a;
        int i2 = kxj0Var.b;
        kxj0 kxj0Var2 = new kxj0(i, i2);
        int i3 = kxj0Var.a - i;
        return pn00.k(new Pair(DiscoveryLayoutNodes.PlayerContainer, new upy(lzb0.c, new kxj0(i3, i2), 1.0f)), new Pair(DiscoveryLayoutNodes.DialogContainer, new upy(new lzb0(i3, 0), kxj0Var2, 1.0f)));
    }

    @Override // xsna.pny
    public final nc b() {
        return this.c;
    }
}
