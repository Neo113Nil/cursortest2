package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: RemoveFromViewHistory.kt */
/* loaded from: classes2.dex */
public final class hxf0 extends h6s0 {
    public static final hxf0 c = new hxf0(VideoBottomSheetOptions.REMOVE_FROM_VIEW_HISTORY.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        if (!s6s0Var.j || hg10.g(s6s0Var)) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_delete_outline_28, R.string.video_remove_from_view_history, i, false, R.color.vk_red, 0, false, null, 0, null, false, 8144);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.REMOVE_FROM_VIEW_HISTORY);
        }
        w1s0.h(videoFile);
    }
}
