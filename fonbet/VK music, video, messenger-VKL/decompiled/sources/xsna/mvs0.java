package xsna;

import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;

/* compiled from: VideoMinimizableDiscoveryFragment.kt */
/* loaded from: classes7.dex */
public final class mvs0 implements ows0 {
    public final /* synthetic */ VideoMinimizableDiscoveryFragment b;

    public mvs0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment) {
        this.b = videoMinimizableDiscoveryFragment;
    }

    @Override // xsna.ows0
    public final io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3() {
        return this.b.b3();
    }
}
