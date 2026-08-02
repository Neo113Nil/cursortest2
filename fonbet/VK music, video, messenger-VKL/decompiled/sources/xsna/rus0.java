package xsna;

import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rus0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ rus0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
        switch (i) {
            case 0:
                VideoMinimizableDiscoveryFragment.b bVar = videoMinimizableDiscoveryFragment.U;
                if (bVar == null) {
                    bVar = null;
                }
                return bVar.b.g.f;
            default:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                xn50.a.c(videoMinimizableDiscoveryFragment, new c.a1.b(true));
                return s3q0.a;
        }
    }
}
