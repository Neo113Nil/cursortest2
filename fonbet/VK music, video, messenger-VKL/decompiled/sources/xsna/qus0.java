package xsna;

import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import xsna.aa30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qus0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ qus0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if ((r0 != null ? r0 : null).b.g.f.getRecyclerView().canScrollVertically(-1) == false) goto L30;
     */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        int i = this.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
        switch (i) {
            case 0:
                VideoMinimizableDiscoveryFragment.b bVar = videoMinimizableDiscoveryFragment.U;
                if (bVar == null) {
                    bVar = null;
                }
                aa30 state = bVar.b.b.getState();
                aa30.a aVar = state instanceof aa30.a ? (aa30.a) state : null;
                nb30 nb30Var = aVar != null ? aVar.a : null;
                com.vk.video.ui.discovery.minimizable.m mVar = videoMinimizableDiscoveryFragment.J0;
                if (mVar != null) {
                    z = true;
                    if (mVar.j()) {
                        if (nb30Var != DiscoveryScreenMotionStates$Portrait.DiscoveryMatchVideoRatio) {
                            VideoMinimizableDiscoveryFragment.b bVar2 = videoMinimizableDiscoveryFragment.U;
                            break;
                        }
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                return ((MarketComponent) videoMinimizableDiscoveryFragment.ko().t.getValue()).l7();
        }
    }
}
