package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoRemoveDownload.kt */
/* loaded from: classes2.dex */
public final class pct0 extends h6s0 {
    public static final pct0 c = new pct0(VideoBottomSheetOptions.REMOVE_DOWNLOAD.ordinal());
    public static final boolean d = fxc0.B().J().A0();

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        boolean k;
        if (!hg10.g(s6s0Var)) {
            VideoFile videoFile = s6s0Var.a;
            DownloadInfo x = fxc0.B().s().x(videoFile);
            boolean z = d;
            if (z) {
                k = (x != null ? x.c : null) == DownloadInfo.State.STATE_COMPLETED;
            } else {
                k = fxc0.B().s().k(videoFile);
            }
            if (fxc0.B().s().isEnabled() && gpt0.x(videoFile) && k) {
                int i = z ? R.color.vk_red : 0;
                int i2 = z ? R.drawable.vk_icon_delete_saved_outline_28 : R.drawable.vk_icon_download_cancel_outline_28;
                int i3 = this.b;
                return new e520(i3, i2, R.string.video_download_delete, i3, false, i, i, false, null, 0, null, false, 8080);
            }
        }
        return null;
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        bfs0.d(activity, R.string.video_download_delete_confirm, null, new gbt0(s6s0Var, 1), 8);
    }
}
