package xsna;

import android.app.Activity;
import com.vk.dto.common.MusicVideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: GoToArtist.kt */
/* loaded from: classes2.dex */
public final class k3u extends h6s0 {
    public static final k3u c = new k3u(VideoBottomSheetOptions.GO_TO_ARTIST.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        if (!(s6s0Var.a instanceof MusicVideoFile)) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_music_mic_outline_28, R.string.video_artist_action_to_artist, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        fxc0.B().J().f();
        lyd.g().L(activity, s6s0Var.a);
    }
}
