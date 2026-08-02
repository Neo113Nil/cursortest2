package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;

/* compiled from: AutoSubtitles.kt */
/* loaded from: classes2.dex */
public final class sj5 extends h6s0 {
    public static final sj5 c = new sj5(VideoBottomSheetOptions.CLIPS_AUTO_SUBTITLES.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        hg10.g(s6s0Var);
        videoFile.t0();
        return null;
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        if (y6s0Var != null) {
            y6s0Var.b(VideoBottomSheetSideEffectOptions.CLIPS_AUTO_SUBTITLES, s6s0Var.a);
        }
    }
}
