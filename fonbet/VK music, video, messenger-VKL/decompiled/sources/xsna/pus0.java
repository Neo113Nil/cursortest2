package xsna;

import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class pus0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ pus0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        yks0 yks0Var;
        int i = this.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
        switch (i) {
            case 0:
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                if (miniPlayerControllersWrapper != null && (yks0Var = miniPlayerControllersWrapper.t) != null) {
                    videoMinimizableDiscoveryFragment.go(videoMinimizableDiscoveryFragment.requireContext(), yks0Var.e);
                }
                break;
            default:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                c.a1.e eVar = c.a1.e.b;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, eVar);
                break;
        }
        return s3q0.a;
    }
}
