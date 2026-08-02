package xsna;

import android.content.Context;
import com.vk.libvideo.autoplay.b;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.growth.VideoGrowthButtons;

/* compiled from: VideoMinimizableDiscoveryFragment.kt */
/* loaded from: classes7.dex */
public final class pvs0 implements VideoGrowthButtons.a {
    public final /* synthetic */ VideoMinimizableDiscoveryFragment a;

    public pvs0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment) {
        this.a = videoMinimizableDiscoveryFragment;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.video.ui.discovery.minimizable.growth.VideoGrowthButtons.a
    public final void a() {
        int i = VideoMinimizableDiscoveryFragment.p1;
        ((VideoGrowthComponent) this.a.ko().f.getValue()).z6().d();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.video.ui.discovery.minimizable.growth.VideoGrowthButtons.a
    public final void onClick() {
        int i = VideoMinimizableDiscoveryFragment.p1;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        dos0 z6 = ((VideoGrowthComponent) videoMinimizableDiscoveryFragment.ko().f.getValue()).z6();
        Context requireContext = videoMinimizableDiscoveryFragment.requireContext();
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        z6.c(requireContext, s490.f(b.C1208b.a()));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.video.ui.discovery.minimizable.growth.VideoGrowthButtons.a
    public final void onClose() {
        int i = VideoMinimizableDiscoveryFragment.p1;
        ((VideoGrowthComponent) this.a.ko().f.getValue()).z6().b();
    }
}
