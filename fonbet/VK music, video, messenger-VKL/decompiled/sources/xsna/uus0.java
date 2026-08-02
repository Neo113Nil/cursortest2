package xsna;

import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import kotlin.collections.EmptyList;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class uus0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ uus0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
        switch (i) {
            case 0:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, c.l.a.b);
                return s3q0.a;
            default:
                kfs0 kfs0Var = videoMinimizableDiscoveryFragment.G0;
                return kfs0Var != null ? kfs0Var.h.f : EmptyList.b;
        }
    }
}
