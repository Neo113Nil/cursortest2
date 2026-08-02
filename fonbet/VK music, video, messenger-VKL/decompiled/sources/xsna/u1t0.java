package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoPauseResumeDownload.kt */
/* loaded from: classes2.dex */
public final class u1t0 extends shs0 {
    public static final u1t0 c = new u1t0(VideoBottomSheetOptions.PAUSE_RESUME_DOWNLOAD.ordinal());

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoScreenMode videoScreenMode = s6s0Var.u;
        ezs0 s = fxc0.B().s();
        VideoFile videoFile = s6s0Var.a;
        DownloadInfo x = s.x(videoFile);
        if (x == null) {
            return;
        }
        if (w8o.d(x.c)) {
            fxc0.B().s().n(videoFile, videoScreenMode);
        } else {
            fxc0.B().s().d(videoFile, videoScreenMode);
        }
    }

    @Override // xsna.shs0
    public final e520 e(s6s0 s6s0Var) {
        DownloadInfo x = fxc0.B().s().x(s6s0Var.a);
        if (x == null) {
            return null;
        }
        DownloadInfo.State state = x.c;
        int i = w8o.d(state) ? R.drawable.vk_icon_pause_outline_28 : R.drawable.vk_icon_play_outline_28;
        int i2 = w8o.d(state) ? R.string.video_download_pause : R.string.video_download_resume;
        String str = lan.a(s6s0Var) ? null : "download_pause_resume_group";
        int i3 = this.b;
        return new e520(i3, i, i2, i3, false, 0, 0, false, str, 0, null, false, 7664);
    }
}
