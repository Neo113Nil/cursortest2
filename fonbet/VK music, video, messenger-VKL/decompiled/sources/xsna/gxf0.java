package xsna;

import android.app.Activity;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: RemoveFromPlaylist.kt */
/* loaded from: classes2.dex */
public final class gxf0 extends h6s0 {
    public static final gxf0 c = new gxf0(VideoBottomSheetOptions.REMOVE_FROM_PLAYLIST.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        boolean a = lan.a(s6s0Var);
        if (!s6s0Var.a.j0() || !hg10.o(s6s0Var) || !hg10.a(s6s0Var)) {
            return null;
        }
        int i = a ? R.drawable.vk_icon_delete_outline_28 : R.drawable.vk_icon_cancel_outline_28;
        int i2 = a ? R.color.vk_red : 0;
        int i3 = this.b;
        return new e520(i3, i, R.string.video_remove_from_playlist, i3, false, R.color.vk_red, i2, false, null, 0, null, false, 8080);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        Integer valueOf = Integer.valueOf(R.string.video_alert_title);
        k78 k78Var = s6s0Var.e;
        bfs0.c(activity, valueOf, R.string.delete_video_confirm_playlist, k78Var != null ? new l78(k78Var) : null, new xo8(s6s0Var, activity, y6s0Var, 6));
    }
}
