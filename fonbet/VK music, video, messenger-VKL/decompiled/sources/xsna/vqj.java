package xsna;

import com.vk.fullscreenvideo.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ControlsIcons.kt */
/* loaded from: classes16.dex */
public final class vqj {
    public static final Integer a(eqj eqjVar, a.d dVar, int i) {
        Integer num;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1931331729, i, -1, "com.vk.fullscreenvideo.icons.getContentDescriptionForIcon (ControlsIcons.kt:10)");
        }
        if (dVar.equals(a.d.C1074d.a)) {
            num = Integer.valueOf(R.string.video_menu_scale_content_description);
        } else if (dVar.equals(a.d.h.a)) {
            num = Integer.valueOf(R.string.video_menu_cast_content_description);
        } else if (dVar.equals(a.d.i.a)) {
            num = Integer.valueOf(R.string.video_menu_settings_content_description);
        } else if (dVar instanceof a.d.b.C1072a) {
            num = Integer.valueOf(R.string.video_menu_comments_content_description);
        } else if (dVar.equals(a.d.c.a)) {
            num = Integer.valueOf(R.string.video_menu_download_content_description);
        } else if (dVar instanceof a.d.b.C1073b) {
            num = Integer.valueOf(R.string.video_menu_like_content_description);
        } else if (dVar.equals(a.d.f.a)) {
            num = Integer.valueOf(R.string.video_menu_playlist_content_description);
        } else if (dVar instanceof a.d.b.c) {
            num = Integer.valueOf(R.string.video_menu_share_content_description);
        } else if (dVar.equals(a.d.j.a)) {
            num = Integer.valueOf(eqjVar.b ? R.string.video_menu_remove_from_watch_later_content_description : R.string.video_menu_add_to_watch_later_content_description);
        } else if (dVar.equals(a.d.e.a)) {
            num = Integer.valueOf(R.string.video_menu_more_content_description);
        } else if (dVar.equals(a.d.g.a)) {
            num = Integer.valueOf(R.string.video_menu_rate_content_description);
        } else {
            if (!dVar.equals(a.d.C1071a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            num = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return num;
    }
}
