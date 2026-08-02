package xsna;

import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class nus0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ nus0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r0.j() == true) goto L12;
     */
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
                com.vk.video.ui.discovery.minimizable.m mVar = videoMinimizableDiscoveryFragment.J0;
                if (mVar != null) {
                    z = true;
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                c.o0.f fVar = c.o0.f.b;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, fVar);
                return s3q0.a;
        }
    }
}
