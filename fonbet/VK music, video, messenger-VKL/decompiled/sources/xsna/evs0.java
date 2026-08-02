package xsna;

import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class evs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ evs0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
        switch (i) {
            case 0:
                VideoAnnounceState videoAnnounceState = (VideoAnnounceState) obj;
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                if (miniPlayerControllersWrapper != null) {
                    miniPlayerControllersWrapper.a2(videoAnnounceState);
                }
                com.vk.video.ui.discovery.minimizable.announce.a aVar = videoMinimizableDiscoveryFragment.W;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.f(aVar.m, videoAnnounceState);
                aVar.n = videoAnnounceState;
                com.vk.video.ui.discovery.minimizable.m mVar = videoMinimizableDiscoveryFragment.J0;
                if (mVar != null) {
                    mVar.j = videoAnnounceState;
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                xn50.a.c(videoMinimizableDiscoveryFragment, new c.l.C1975c(booleanValue));
                break;
        }
        return s3q0.a;
    }
}
