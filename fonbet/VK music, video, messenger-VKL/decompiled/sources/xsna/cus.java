package xsna;

import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import java.util.Map;
import kotlin.Pair;

/* compiled from: FromDiscoveryToDiscoveryWithDialogTransition.kt */
/* loaded from: classes7.dex */
public final class cus extends vmp0 {

    /* compiled from: FromDiscoveryToDiscoveryWithDialogTransition.kt */
    public static final class a extends pny<uig> {
        public final vig b;

        public a(wvs0 wvs0Var) {
            this.b = new vig(wvs0Var);
        }

        @Override // xsna.pny
        public final Map a(uig uigVar) {
            uig uigVar2 = uigVar;
            kxj0 kxj0Var = uigVar2.a;
            int i = kxj0Var.a;
            int b = an10.b(i / 1.7777778f);
            kxj0 kxj0Var2 = new kxj0(i, b);
            h4x h4xVar = uigVar2.b;
            int i2 = h4xVar.b;
            lzb0 lzb0Var = new lzb0(0, i2);
            int i3 = kxj0Var.a;
            int max = Math.max(0, ((kxj0Var.b - b) - i2) - h4xVar.d);
            kxj0 kxj0Var3 = new kxj0(i3, max);
            int i4 = b + i2;
            lzb0 lzb0Var2 = new lzb0(0, i4);
            return pn00.i(new Pair(DiscoveryLayoutNodes.PlayerContainer, new upy(lzb0Var, kxj0Var2, 1.0f)), new Pair(DiscoveryLayoutNodes.ContentContainer, new upy(lzb0Var2, kxj0Var3, 1.0f)), new Pair(DiscoveryLayoutNodes.ContentContainerBackground, new upy(lzb0Var2, kxj0Var3, 1.0f)), new Pair(DiscoveryLayoutNodes.FragmentContainerShadow, new upy(lzb0.c, uigVar2.a, 1.0f)), new Pair(DiscoveryLayoutNodes.DialogContainer, new upy(new lzb0(0, i4 + max), kxj0Var3, 1.0f)));
        }

        @Override // xsna.pny
        public final nc b() {
            return this.b;
        }
    }
}
