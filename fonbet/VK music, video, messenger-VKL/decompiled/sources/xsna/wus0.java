package xsna;

import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class wus0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ wus0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        yks0 yks0Var;
        switch (this.b) {
            case 0:
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = this.c.X;
                String str = (miniPlayerControllersWrapper == null || (yks0Var = miniPlayerControllersWrapper.t) == null) ? null : yks0Var.a;
                return str == null ? "" : str;
            default:
                return this.c.G0;
        }
    }
}
