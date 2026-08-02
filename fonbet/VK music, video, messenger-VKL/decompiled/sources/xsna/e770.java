package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: NotRecommendOwner.kt */
/* loaded from: classes2.dex */
public final class e770 extends h6s0 {
    public static final e770 c = new e770(VideoBottomSheetOptions.NOT_RECOMMEND_OWNER.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        if (!fxc0.B().J().U() || hg10.j(s6s0Var, false) || s6s0Var.b == null || !videoFile.H3() || !fxc0.B().J().U() || !videoFile.H3()) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_user_slash_outline_28, R.string.video_not_recommend_author, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.NOT_RECOMMEND_OWNER);
        }
        g7s0 B = fxc0.B();
        s6s0Var.b();
        B.getClass();
    }
}
