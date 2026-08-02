package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import java.util.Map;
import kotlin.Pair;

/* compiled from: ReadyToStartPortraitMotionState.kt */
/* loaded from: classes7.dex */
public final class c8f0 extends ob30<a.C2648a> {
    public final a c;

    /* compiled from: ReadyToStartPortraitMotionState.kt */
    public static final class a extends nc {
        public final wvs0 c;

        /* compiled from: ReadyToStartPortraitMotionState.kt */
        /* renamed from: xsna.c8f0$a$a, reason: collision with other inner class name */
        public static final class C2648a implements wny {
            public final kxj0 a;
            public final h4x b;

            public C2648a(kxj0 kxj0Var, h4x h4xVar) {
                this.a = kxj0Var;
                this.b = h4xVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2648a)) {
                    return false;
                }
                C2648a c2648a = (C2648a) obj;
                return epx.f(this.a, c2648a.a) && epx.f(this.b, c2648a.b);
            }

            public final int hashCode() {
                return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            }

            public final String toString() {
                return "ReadyToStartDependency(containerSize=" + this.a + ", insets=" + this.b + ", playerStartYOffest=null)";
            }
        }

        public a(wvs0 wvs0Var) {
            super(1);
            this.c = wvs0Var;
        }

        @Override // xsna.nc
        public final wny S() {
            wvs0 wvs0Var = this.c;
            return new C2648a(wvs0Var.c, wvs0Var.d);
        }
    }

    public c8f0(wvs0 wvs0Var) {
        super(DiscoveryScreenMotionStates$Portrait.ReadyToStart);
        this.c = new a(wvs0Var);
    }

    @Override // xsna.pny
    public final Map a(wny wnyVar) {
        a.C2648a c2648a = (a.C2648a) wnyVar;
        kxj0 kxj0Var = c2648a.a;
        int i = kxj0Var.a;
        int b = an10.b(i / 1.7777778f);
        kxj0 kxj0Var2 = new kxj0(i, b);
        h4x h4xVar = c2648a.b;
        int i2 = h4xVar.b;
        lzb0 lzb0Var = new lzb0(0, i2);
        kxj0 kxj0Var3 = new kxj0(kxj0Var.a, Math.max(0, ((kxj0Var.b - b) - i2) - h4xVar.d));
        lzb0 lzb0Var2 = new lzb0(0, b + i2);
        return pn00.i(new Pair(DiscoveryLayoutNodes.PlayerContainer, new upy(lzb0Var, kxj0Var2, 1.0f)), new Pair(DiscoveryLayoutNodes.FragmentContainerShadow, new upy(lzb0.c, c2648a.a, 1.0f)), new Pair(DiscoveryLayoutNodes.ContentContainer, new upy(lzb0Var2, kxj0Var3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new Pair(DiscoveryLayoutNodes.ContentContainerBackground, new upy(lzb0Var2, kxj0Var3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
    }

    @Override // xsna.pny
    public final nc b() {
        return this.c;
    }
}
