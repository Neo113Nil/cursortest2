package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;

/* compiled from: AutoplayTimeCodeSeekStrategy.kt */
/* loaded from: classes2.dex */
public final class vo5 implements nto0 {
    public final yg5 b;

    public vo5(VideoFile videoFile) {
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        this.b = b.C1208b.a().e(videoFile, null);
    }

    @Override // xsna.nto0
    public final void seekTo(long j) {
        this.b.seek(j);
    }
}
