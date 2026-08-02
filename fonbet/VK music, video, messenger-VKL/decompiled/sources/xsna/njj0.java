package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoAdsType;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vkontakte.android.R;

/* compiled from: ShowStatistics.kt */
/* loaded from: classes2.dex */
public final class njj0 extends h6s0 {
    public static final njj0 c = new njj0(VideoBottomSheetOptions.SHOW_STATISTIC.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        cpu a = xg5.a();
        VideoFile videoFile = s6s0Var.a;
        if (a.e(videoFile.I0())) {
            VideoAdInfo X0 = videoFile.X0();
            if ((X0 != null ? X0.h : null) != VideoAdsType.MY_TARGET_VIDEO && hg10.o(s6s0Var) && hg10.g(s6s0Var) && videoFile.k1() == 0 && !videoFile.Q0()) {
                int i = this.b;
                return new e520(i, R.drawable.vk_icon_statistics_outline_28, R.string.clips_show_statistic, i, false, 0, 0, false, null, 0, null, false, 8176);
            }
        }
        return null;
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        if (y6s0Var != null) {
            y6s0Var.b(VideoBottomSheetSideEffectOptions.SHOW_STATISTIC, s6s0Var.a);
        }
    }
}
