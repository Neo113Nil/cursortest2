package xsna;

import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import java.util.Map;
import kotlin.Pair;

/* compiled from: FromDiscoveryToFullscreenTransition.kt */
/* loaded from: classes7.dex */
public final class dus extends vmp0 {

    /* compiled from: FromDiscoveryToFullscreenTransition.kt */
    public static final class a extends pny<uig> {
        public final vig b;

        public a(wvs0 wvs0Var) {
            this.b = new vig(wvs0Var);
        }

        @Override // xsna.pny
        public final Map a(uig uigVar) {
            uig uigVar2 = uigVar;
            int b = an10.b(uigVar2.a.a / 1.7777778f);
            lzb0 lzb0Var = new lzb0(0, 0);
            kxj0 kxj0Var = uigVar2.a;
            int i = kxj0Var.a;
            int i2 = kxj0Var.b;
            h4x h4xVar = uigVar2.b;
            kxj0 kxj0Var2 = new kxj0(i, ((i2 - b) - h4xVar.b) - h4xVar.d);
            lzb0 lzb0Var2 = new lzb0(0, i2);
            return pn00.k(new Pair(DiscoveryLayoutNodes.PlayerContainer, new upy(lzb0Var, kxj0Var, 1.0f)), new Pair(DiscoveryLayoutNodes.ContentContainer, new upy(lzb0Var2, kxj0Var2, 1.0f)), new Pair(DiscoveryLayoutNodes.ContentContainerBackground, new upy(lzb0Var2, kxj0Var2, 1.0f)));
        }

        @Override // xsna.pny
        public final nc b() {
            return this.b;
        }
    }
}
