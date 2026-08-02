package xsna;

import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import java.util.Map;
import kotlin.Pair;

/* compiled from: DialogFullscreenPortraitMotionState.kt */
/* loaded from: classes7.dex */
public final class wdm extends ob30<uig> {
    public final vig c;

    public wdm(wvs0 wvs0Var) {
        super(DiscoveryScreenMotionStates$Portrait.DialogFullscreen);
        this.c = new vig(wvs0Var);
    }

    @Override // xsna.pny
    public final Map a(wny wnyVar) {
        uig uigVar = (uig) wnyVar;
        kxj0 kxj0Var = uigVar.a;
        int i = kxj0Var.a;
        int b = an10.b(i / 1.7777778f);
        kxj0 kxj0Var2 = new kxj0(i, b);
        h4x h4xVar = uigVar.b;
        int i2 = h4xVar.b;
        lzb0 lzb0Var = new lzb0(0, i2);
        int i3 = kxj0Var.a;
        int i4 = kxj0Var.b;
        int i5 = h4xVar.d;
        kxj0 kxj0Var3 = new kxj0(i3, Math.max(0, ((i4 - b) - i2) - i5));
        int i6 = h4xVar.b;
        kxj0 kxj0Var4 = new kxj0(i3, Math.max(0, (i4 - i6) - i5));
        lzb0 lzb0Var2 = new lzb0(0, b + i2);
        return pn00.i(new Pair(DiscoveryLayoutNodes.PlayerContainer, new upy(lzb0Var, kxj0Var2, 1.0f)), new Pair(DiscoveryLayoutNodes.ContentContainer, new upy(lzb0Var2, kxj0Var3, 1.0f)), new Pair(DiscoveryLayoutNodes.ContentContainerBackground, new upy(lzb0Var2, kxj0Var3, 1.0f)), new Pair(DiscoveryLayoutNodes.DialogContainer, new upy(new lzb0(0, i6), kxj0Var4, 1.0f)), new Pair(DiscoveryLayoutNodes.FragmentContainerShadow, new upy(lzb0.c, uigVar.a, 1.0f)));
    }

    @Override // xsna.pny
    public final nc b() {
        return this.c;
    }
}
