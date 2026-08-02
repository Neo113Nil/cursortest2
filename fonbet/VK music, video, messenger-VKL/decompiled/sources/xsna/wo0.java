package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: AddToPlaylist.kt */
/* loaded from: classes2.dex */
public final class wo0 extends h6s0 {
    public static final wo0 c = new wo0(VideoBottomSheetOptions.ADD_TO_PLAYLIST.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        if (!s6s0Var.a.i9() || !hg10.o(s6s0Var) || hg10.h(s6s0Var)) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_list_add_outline_28, R.string.video_add_to_playlist, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        Owner s;
        UserId userId;
        VideoFile videoFile = s6s0Var.a;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.ADD_TO_PLAYLIST);
        }
        UserId c2 = videoFile.t0() ? s6s0Var.d : o25.a().c();
        if (fxc0.B().J().i1() && (s = videoFile.s()) != null && (userId = s.b) != null && fkq0.b(userId) && videoFile.t0()) {
            fxc0.B().getClass();
            return;
        }
        g7s0 B = fxc0.B();
        VideoFile videoFile2 = s6s0Var.a;
        boolean z = s6s0Var.f;
        k78 k78Var = s6s0Var.e;
        B.k0(activity, videoFile2, z, c2, k78Var != null ? new l78(k78Var) : null);
    }
}
