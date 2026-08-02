package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.lc50;

/* compiled from: MusicTrackMenuItem.kt */
/* loaded from: classes3.dex */
public final class tc50 {
    public final int a;
    public final lc50.c b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    /* compiled from: MusicTrackMenuItem.kt */
    public static final class a {
        public static tc50 a(lc50.c cVar) {
            if (cVar instanceof lc50.c.C3262c) {
                return new tc50(R.id.music_action_add_to_my_music, cVar, R.drawable.vk_icon_add_outline_28, R.string.music_add_to_my_music, R.string.music_talkback_add_to_my_music, 480);
            }
            if (cVar instanceof lc50.c.b) {
                return new tc50(R.id.music_action_add_to_my_music, cVar, R.drawable.vk_icon_add_outline_28, R.string.music_add_to_my_collection, R.string.music_talkback_add_to_my_collection, 480);
            }
            if (cVar instanceof lc50.c.d) {
                return new tc50(R.id.music_action_add_to_playlist, cVar, R.drawable.vk_icon_list_add_outline_28, R.string.music_add_to_playlist, R.string.music_talkback_add_to_playlist, 480);
            }
            if (cVar instanceof lc50.c.k) {
                return new tc50(R.id.music_action_play_next, cVar, R.drawable.vk_icon_list_insert_last_outline_28, R.string.music_play_next, R.string.music_talkback_play_next, 480);
            }
            if (cVar instanceof lc50.c.h) {
                return new tc50(R.id.music_action_go_to_artists, cVar, R.drawable.vk_icon_music_mic_outline_28, R.string.music_artist_action_to_artist, R.string.music_talkback_go_to_artist, 480);
            }
            if (cVar instanceof lc50.c.f) {
                return new tc50(R.id.music_action_go_to_artists, cVar, R.drawable.vk_icon_music_mic_outline_28, R.string.music_artist_action_to_artist_search, R.string.music_talkback_to_artist_search, 480);
            }
            if (cVar instanceof lc50.c.g) {
                return new tc50(R.id.music_action_go_to_album, cVar, R.drawable.vk_icon_vinyl_outline_28, R.string.music_track_menu_go_to_album, R.string.music_track_menu_talkback_go_to_album, 480);
            }
            if (cVar instanceof lc50.c.t) {
                return new tc50(R.id.music_action_share_cover_to_story, cVar, R.drawable.vk_icon_story_outline_28, R.string.music_share_to_story, R.string.music_talkback_share_to_story, 480);
            }
            if (cVar instanceof lc50.c.l) {
                return new tc50(R.id.music_action_play_similar, cVar, R.drawable.vk_icon_stars_outline_28, R.string.music_play_similar_redesign, R.string.music_talkback_play_similar, 480);
            }
            if (cVar instanceof lc50.c.i) {
                return new tc50(R.id.music_action_mix_by_track, cVar, R.drawable.vk_icon_music_note_wave_outline_28, R.string.music_mix_by_track_title, R.string.music_mix_by_track_title, 480);
            }
            if (cVar instanceof lc50.c.s) {
                return new tc50(R.id.music_action_setting_player_timer, cVar, R.drawable.vk_icon_recent_outline_28, R.string.music_sleep_timer, R.string.music_talkback_music_sleep_timer, 480);
            }
            if (cVar instanceof lc50.c.p) {
                return new tc50(R.id.music_action_remove_from_current_playlist, cVar, R.drawable.vk_icon_cancel_28, R.string.music_remove_from_next, R.string.music_talkback_remove_from_next, 448);
            }
            if (cVar instanceof lc50.c.n) {
                return new tc50(R.id.music_action_remove_from_my_music, cVar, R.drawable.vk_icon_delete_outline_28, R.string.music_remove_from_my_music, R.string.music_talkback_remove_from_my_music, 448);
            }
            if (cVar instanceof lc50.c.m) {
                return new tc50(R.id.music_action_remove_from_my_music, cVar, R.drawable.vk_icon_delete_outline_28, R.string.music_remove_from_my_collection, R.string.music_talkback_remove_from_my_collection, 448);
            }
            if (cVar instanceof lc50.c.o) {
                return new tc50(R.id.music_action_remove_from_my_music, cVar, R.drawable.vk_icon_delete_outline_28, R.string.music_remove_from_playlist, R.string.music_talkback_remove_from_playlist, 448);
            }
            if (cVar.equals(lc50.c.r.b)) {
                return new tc50(R.id.music_action_separator, cVar, 0, 0, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
            }
            if (cVar instanceof lc50.c.e) {
                return new tc50(R.id.music_action_change_volume, cVar, R.drawable.vk_icon_volume_outline_28, 0, 0, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            }
            if (cVar instanceof lc50.c.j) {
                return new tc50(R.id.music_action_open_player_settings_menu, cVar, R.drawable.vk_icon_settings_outline_28, R.string.open_player_settings_menu, R.string.open_player_settings_menu, 480);
            }
            if (cVar instanceof lc50.c.a) {
                return new tc50(R.id.music_action_add_radio, cVar, R.drawable.vk_icon_add_outline_28, R.string.music_add_to_radio, R.string.music_add_to_radio, 480);
            }
            if (cVar instanceof lc50.c.q) {
                return new tc50(R.id.music_action_remove_radio, cVar, R.drawable.vk_icon_delete_outline_28, R.string.music_remove_radio, R.string.music_remove_radio, 448);
            }
            if (cVar instanceof lc50.c.u.a) {
                return new tc50(R.id.music_action_equalizer, cVar, R.drawable.vk_icon_sliders_vertical_outline_28, R.string.equalizer_settings_menu, R.string.equalizer_settings_menu, 480);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public tc50(int i, lc50.c cVar, int i2, int i3, int i4, int i5) {
        i2 = (i5 & 4) != 0 ? 0 : i2;
        i3 = (i5 & 8) != 0 ? 0 : i3;
        i4 = (i5 & 16) != 0 ? 0 : i4;
        int i6 = (i5 & 32) != 0 ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_negative;
        this.a = i;
        this.b = cVar;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc50)) {
            return false;
        }
        tc50 tc50Var = (tc50) obj;
        return this.a == tc50Var.a && epx.f(this.b, tc50Var.b) && this.c == tc50Var.c && this.d == tc50Var.d && this.e == tc50Var.e && this.f == tc50Var.f;
    }

    public final int hashCode() {
        return shy.a(R.attr.vk_ui_text_secondary, shy.a(R.attr.vk_ui_text_primary, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicTrackMenuItem(id=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", iconRes=");
        sb.append(this.c);
        sb.append(", titleRes=");
        sb.append(this.d);
        sb.append(", contentDescriptionRes=");
        sb.append(this.e);
        sb.append(", tintIconRes=");
        return h5s.c(this.f, ", tintTextRes=2130971857, tintSubTextRes=2130971860, hintId=null)", sb);
    }
}
