package xsna;

import android.app.Activity;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: OpenAsClip.kt */
/* loaded from: classes2.dex */
public final class up80 extends h6s0 {
    public static final up80 c = new up80(VideoBottomSheetOptions.OPEN_AS_CLIP.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        if (s6s0Var.a.o0() == 0 || !hg10.g(s6s0Var)) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_logo_clips_outline_28, R.string.video_open_as_clip, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        g620.f().a().h(activity, s6s0Var.a);
    }
}
