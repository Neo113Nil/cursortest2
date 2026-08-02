package xsna;

import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;

/* compiled from: AutoPlayStateProviderImpl.kt */
/* loaded from: classes2.dex */
public final class li5 implements ki5 {
    public final VideoAutoPlay a;
    public final nm60 b;

    public li5(VideoAutoPlay videoAutoPlay, nm60 nm60Var) {
        this.a = videoAutoPlay;
        this.b = nm60Var;
    }

    public final boolean a() {
        return this.a.R0() == AutoPlayMinifiedState.PIP;
    }

    @Override // xsna.ki5
    public final VideoTextureView getVideoView() {
        return (VideoTextureView) this.b.invoke();
    }

    @Override // xsna.ki5
    public final boolean h() {
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        return b.C1208b.a().h(this.a);
    }
}
