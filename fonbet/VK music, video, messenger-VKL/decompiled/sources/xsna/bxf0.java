package xsna;

import android.app.Activity;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: RemoveFromCommunityPlaylist.kt */
/* loaded from: classes2.dex */
public final class bxf0 extends h6s0 {
    public static final bxf0 c = new bxf0(VideoBottomSheetOptions.REMOVE_FROM_PLAYLIST_COMMUNITY.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        if (!hg10.g(s6s0Var) && !hg10.j(s6s0Var, false)) {
            if (s6s0Var.d.b >= 0) {
                return null;
            }
            if (s6s0Var.g) {
                int i = this.b;
                return new e520(i, R.drawable.vk_icon_cancel_outline_28, R.string.video_remove_from_playlist, i, false, R.color.vk_red, 0, false, null, 0, null, false, 8144);
            }
        }
        return null;
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        Integer valueOf = Integer.valueOf(R.string.video_alert_title);
        k78 k78Var = s6s0Var.e;
        bfs0.c(activity, valueOf, R.string.delete_video_confirm_playlist, k78Var != null ? new l78(k78Var) : null, new axf0(s6s0Var, activity, y6s0Var, 0));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bxf0);
    }

    public final int hashCode() {
        return -172824298;
    }

    public final String toString() {
        return "RemoveFromCommunityPlaylist";
    }
}
