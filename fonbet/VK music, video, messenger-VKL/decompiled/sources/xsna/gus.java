package xsna;

import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import java.util.Map;
import kotlin.Pair;

/* compiled from: FromFullscreenToFullscreenWithDialogTransition.kt */
/* loaded from: classes7.dex */
public final class gus extends vmp0 {

    /* compiled from: FromFullscreenToFullscreenWithDialogTransition.kt */
    public static final class a extends pny<wig> {
        public final xig b;

        public a(wvs0 wvs0Var) {
            this.b = new xig(wvs0Var);
        }

        @Override // xsna.pny
        public final Map a(wig wigVar) {
            wig wigVar2 = wigVar;
            int i = wigVar2.b;
            kxj0 kxj0Var = wigVar2.a;
            return pn00.k(new Pair(DiscoveryLayoutNodes.PlayerContainer, new upy(lzb0.c, kxj0Var, 1.0f)), new Pair(DiscoveryLayoutNodes.DialogContainer, new upy(new lzb0(kxj0Var.a, 0), new kxj0(i, kxj0Var.b), 1.0f)));
        }

        @Override // xsna.pny
        public final nc b() {
            return this.b;
        }
    }
}
