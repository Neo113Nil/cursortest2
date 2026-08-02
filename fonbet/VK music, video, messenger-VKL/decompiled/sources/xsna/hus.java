package xsna;

import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import java.util.Map;
import kotlin.Pair;

/* compiled from: FromHiddenToDiscoveryTransition.kt */
/* loaded from: classes7.dex */
public final class hus extends vmp0 {

    /* compiled from: FromHiddenToDiscoveryTransition.kt */
    public static final class a extends pny<yig> {
        public final zig b;

        public a(wvs0 wvs0Var) {
            this.b = new zig(wvs0Var);
        }

        @Override // xsna.pny
        public final Map a(yig yigVar) {
            yig yigVar2 = yigVar;
            kxj0 kxj0Var = yigVar2.a;
            int i = kxj0Var.a;
            int b = an10.b(i / 1.7777778f);
            kxj0 kxj0Var2 = new kxj0(i, b);
            int i2 = kxj0Var.b;
            h4x h4xVar = yigVar2.b;
            int i3 = i2 - h4xVar.d;
            int i4 = i3 - b;
            lzb0 lzb0Var = new lzb0(0, i4);
            kxj0 kxj0Var3 = new kxj0(kxj0Var.a, (i3 - h4xVar.b) - b);
            lzb0 lzb0Var2 = new lzb0(0, i4 + b);
            return pn00.k(new Pair(DiscoveryLayoutNodes.PlayerContainer, new upy(lzb0Var, kxj0Var2, 1.0f)), new Pair(DiscoveryLayoutNodes.FragmentContainerShadow, new upy(lzb0.c, yigVar2.a, 1.0f)), new Pair(DiscoveryLayoutNodes.ContentContainer, new upy(lzb0Var2, kxj0Var3, 1.0f)), new Pair(DiscoveryLayoutNodes.ContentContainerBackground, new upy(lzb0Var2, kxj0Var3, 1.0f)));
        }

        @Override // xsna.pny
        public final nc b() {
            return this.b;
        }
    }
}
