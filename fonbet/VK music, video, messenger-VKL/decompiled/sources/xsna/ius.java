package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import java.util.Map;
import kotlin.Pair;

/* compiled from: FromMiniplayerToHiddenTransition.kt */
/* loaded from: classes7.dex */
public final class ius extends vmp0 {

    /* compiled from: FromMiniplayerToHiddenTransition.kt */
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
            int i2 = yigVar2.c;
            kxj0 kxj0Var2 = new kxj0(i, i2);
            return on00.f(new Pair(DiscoveryLayoutNodes.PlayerContainer, new upy(new lzb0(0, (kxj0Var.b - yigVar2.b.d) - i2), kxj0Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
        }

        @Override // xsna.pny
        public final nc b() {
            return this.b;
        }
    }
}
