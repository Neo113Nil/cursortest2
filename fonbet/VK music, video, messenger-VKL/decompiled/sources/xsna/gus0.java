package xsna;

import com.vk.libvideo.api.minimizable.VideoMinimizableState;

/* compiled from: VideoMinimizableDiscoveryFeature.kt */
/* loaded from: classes7.dex */
public final class gus0 implements ows0 {
    public final /* synthetic */ com.vk.video.ui.discovery.minimizable.g b;

    public gus0(com.vk.video.ui.discovery.minimizable.g gVar) {
        this.b = gVar;
    }

    @Override // xsna.ows0
    public final io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3() {
        return this.b.z.b3();
    }
}
