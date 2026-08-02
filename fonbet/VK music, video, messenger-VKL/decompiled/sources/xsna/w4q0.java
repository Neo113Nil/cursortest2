package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vkontakte.android.R;

/* compiled from: UnpinClip.kt */
/* loaded from: classes2.dex */
public final class w4q0 extends h6s0 {
    public static final w4q0 c = new w4q0(VideoBottomSheetOptions.UNPIN_CLIP.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        boolean z = false;
        boolean z2 = hg10.g(s6s0Var) && fxc0.B().J().y0();
        boolean e = xg5.a().e(videoFile.I0());
        Boolean Aa = videoFile.Aa();
        Boolean bool = Boolean.TRUE;
        if (epx.f(Aa, bool) && epx.f(videoFile.Q(), bool)) {
            z = true;
        }
        if (!z2 || !z || !e) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_pin_slash_outline_28, R.string.clips_unpin_from_channel, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        if (y6s0Var != null) {
            y6s0Var.b(VideoBottomSheetSideEffectOptions.UNPIN_CLIP, s6s0Var.a);
        }
    }
}
