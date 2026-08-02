package xsna;

import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.s;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class dvs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ dvs0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
        switch (i) {
            case 0:
                s.c cVar = (s.c) obj;
                tts0 tts0Var = videoMinimizableDiscoveryFragment.V;
                if (tts0Var == null) {
                    tts0Var = null;
                }
                tts0Var.d(cVar);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                xn50.a.c(videoMinimizableDiscoveryFragment, new c.l.d(booleanValue));
                break;
        }
        return s3q0.a;
    }
}
