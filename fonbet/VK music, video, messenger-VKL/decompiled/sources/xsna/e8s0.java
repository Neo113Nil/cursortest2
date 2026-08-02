package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoCancelDownload.kt */
/* loaded from: classes2.dex */
public final class e8s0 extends shs0 {
    public static final e8s0 c = new e8s0(VideoBottomSheetOptions.CANCEL_DOWNLOAD.ordinal());

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        ezs0 s = fxc0.B().s();
        VideoFile videoFile = s6s0Var.a;
        DownloadInfo x = s.x(videoFile);
        if (x == null || x.c == DownloadInfo.State.STATE_COMPLETED) {
            return;
        }
        fxc0.B().L(videoFile, s6s0Var.u);
    }

    @Override // xsna.shs0
    public final e520 e(s6s0 s6s0Var) {
        String str = lan.a(s6s0Var) ? null : "download_pause_resume_group";
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_cancel_outline_28, R.string.video_download_cancel, i, false, 0, 0, false, str, 0, null, false, 7664);
    }
}
