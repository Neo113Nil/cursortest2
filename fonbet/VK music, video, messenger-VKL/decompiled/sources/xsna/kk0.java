package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vkontakte.android.R;

/* compiled from: AddAsClip.kt */
/* loaded from: classes2.dex */
public final class kk0 extends h6s0 {
    public static final kk0 c;
    public static final e520 d;

    static {
        int ordinal = VideoBottomSheetOptions.ADD_AS_CLIP.ordinal();
        c = new kk0(ordinal);
        d = new e520(ordinal, R.drawable.vk_icon_logo_clips_outline_28, R.string.video_add_as_clip, ordinal, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        gpt0 gpt0Var = gpt0.a;
        VideoFile videoFile = s6s0Var.a;
        if (gpt0.a(videoFile) && gpt0.x(videoFile)) {
            return d;
        }
        return null;
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.ADD_AS_CLIP);
        }
        if (y6s0Var != null) {
            y6s0Var.b(VideoBottomSheetSideEffectOptions.ADD_AS_CLIP, videoFile);
        }
        fxc0.B().A(activity, videoFile);
    }
}
