package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: RemoveFromLiked.kt */
/* loaded from: classes2.dex */
public final class cxf0 extends h6s0 {
    public static final cxf0 c = new cxf0(VideoBottomSheetOptions.REMOVE_FROM_LIKED.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        if (!s6s0Var.l) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_delete_outline_28, R.string.remove_video_from_liked_menu_item, i, false, 0, 0, false, null, 0, null, false, 8144);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        videoFile.f0(true);
        w1s0.e(activity, videoFile, null, new myd0(activity, 5), new vqf0(1));
    }
}
