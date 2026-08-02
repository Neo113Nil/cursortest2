package xsna;

import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.log.L;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class u460 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ u460(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                if (NetworkPerformanceMeasurer.h && NetworkPerformanceMeasurer.j && NetworkPerformanceMeasurer.g != ConnectivityTracker.DEFAULT_UPLINK_BITRATE && NetworkPerformanceMeasurer.f > 5) {
                    NetworkPerformanceMeasurer.h = false;
                    hx90.b((int) NetworkPerformanceMeasurer.g);
                    L.e("NetworkPerformanceMeasurer", "persist network quality: " + NetworkPerformanceMeasurer.g);
                    break;
                }
                break;
            default:
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                com.vk.libvideo.autoplay.e.f(true);
                break;
        }
    }
}
