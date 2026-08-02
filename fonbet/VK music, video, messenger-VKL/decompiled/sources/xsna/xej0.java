package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.libvideo.autoplay.b;

/* compiled from: ShopsClipsGridBlockAutoPlayProvider.kt */
/* loaded from: classes17.dex */
public final class xej0 implements uae {
    public final z5e a;
    public final y5e b;

    public xej0(z5e z5eVar, y5e y5eVar) {
        this.a = z5eVar;
        this.b = y5eVar;
    }

    @Override // xsna.uae
    public final qi5 a(SdkClipVideoFile sdkClipVideoFile) {
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        return new qi5(b.C1208b.a().e(k15.z(sdkClipVideoFile), null));
    }

    @Override // xsna.uae
    public final oi5 b(SdkClipVideoFile sdkClipVideoFile) {
        return new oi5(this.a.a(), this.b.a, sdkClipVideoFile.r(), 8);
    }
}
