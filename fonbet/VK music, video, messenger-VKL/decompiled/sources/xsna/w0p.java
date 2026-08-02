package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.DisabledClickException;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vkontakte.android.R;

/* compiled from: EditPrivacyClip.kt */
/* loaded from: classes2.dex */
public final class w0p extends h6s0 {
    public static final w0p c = new w0p(VideoBottomSheetOptions.EDIT_PRIVACY_CLIP.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        if ((!hg10.g(s6s0Var) && !hg10.h(s6s0Var)) || ((!videoFile.t0() && !hg10.c(s6s0Var)) || !xg5.a().e(videoFile.I0()) || !hg10.o(s6s0Var) || videoFile.k1() != 0)) {
            return null;
        }
        int i = (s6s0Var.a.t0() || !hg10.c(s6s0Var)) ? R.drawable.vk_icon_lock_outline_28 : R.drawable.vk_icon_block_outline_28;
        boolean z = videoFile.t0() || hg10.c(s6s0Var);
        int i2 = this.b;
        return new e520(i2, i, R.string.clip_edit_privacy, i2, false, 0, 0, false, null, 0, null, z, 4080);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        if (videoFile.t0() || !hg10.c(s6s0Var)) {
            if (y6s0Var != null) {
                y6s0Var.b(VideoBottomSheetSideEffectOptions.EDIT_PRIVACY_CLIP, videoFile);
            }
        } else if (y6s0Var != null) {
            VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions = VideoBottomSheetSideEffectOptions.EDIT_PRIVACY_CLIP;
            int i = DisabledClickException.b;
            y6s0Var.a(videoBottomSheetSideEffectOptions, videoFile);
        }
    }
}
