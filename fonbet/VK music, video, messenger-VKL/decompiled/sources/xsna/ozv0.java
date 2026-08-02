package xsna;

import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;

/* compiled from: VkVideoBridge.kt */
/* loaded from: classes11.dex */
public final class ozv0 implements ows0 {
    public final io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b;

    public ozv0(kzv0 kzv0Var) {
        this.b = ((VideoMinimizablePlayerComponent) ((k7m) m7m.f(kzv0Var)).a(fpf0.a(VideoMinimizablePlayerComponent.class))).b3();
    }

    @Override // xsna.ows0
    public final io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3() {
        return this.b;
    }
}
