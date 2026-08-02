package xsna;

import com.vk.dto.common.VideoFile;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoDownloadInterruptAction.kt */
/* loaded from: classes2.dex */
public abstract class shs0 extends h6s0 {
    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        DownloadInfo x;
        DownloadInfo.State state;
        if (!hg10.g(s6s0Var)) {
            VideoFile videoFile = s6s0Var.a;
            if (fxc0.B().s().isEnabled() && gpt0.x(videoFile) && fxc0.B().J().A0() && (x = fxc0.B().s().x(videoFile)) != null && (state = x.c) != null && state != DownloadInfo.State.STATE_COMPLETED) {
                return e(s6s0Var);
            }
        }
        return null;
    }

    public abstract e520 e(s6s0 s6s0Var);
}
