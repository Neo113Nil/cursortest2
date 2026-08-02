package xsna;

import com.vk.core.compose.generated.VkColorToken;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.tfp0;
import xsna.uc50;

/* compiled from: TrackMenuReducer.kt */
/* loaded from: classes3.dex */
public final class cgp0 implements izs<fgp0, wow<uc50>> {
    public static final cgp0 b = new cgp0();

    @Override // xsna.izs
    public final wow<uc50> invoke(fgp0 fgp0Var) {
        uc50 uc50Var;
        uc50 bVar;
        List<tfp0.b> list = fgp0Var.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (tfp0.b bVar2 : list) {
            if (bVar2.equals(tfp0.b.q.b)) {
                uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_share_outline_28, R.string.music_track_menu_share, null);
            } else if (bVar2.equals(tfp0.b.c.b)) {
                uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_add_outline_28, R.string.music_add_to_my_tracks, null);
            } else if (bVar2.equals(tfp0.b.a.b)) {
                uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_add_outline_28, R.string.music_add_to_my_collection, null);
            } else if (bVar2.equals(tfp0.b.C3742b.b)) {
                uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_like_outline_24, R.string.music_add_to_my_collection, null);
            } else if (bVar2.equals(tfp0.b.e.b)) {
                uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_list_add_outline_28, R.string.music_add_to_playlist, null);
            } else if (bVar2 instanceof tfp0.b.g) {
                uc50Var = uc50.a.a;
            } else if (bVar2.equals(tfp0.b.i.b)) {
                uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_vinyl_outline_28, R.string.music_track_menu_go_to_album, null);
            } else if (bVar2.equals(tfp0.b.j.b)) {
                uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_music_mic_outline_28, R.string.music_artist_action_to_singer, null);
            } else if (bVar2.equals(tfp0.b.h.b)) {
                uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_music_mic_outline_28, R.string.music_artist_action_to_singer_search, null);
            } else if (bVar2.equals(tfp0.b.k.b)) {
                uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_list_insert_first_outline_20, R.string.music_play_next, null);
            } else if (bVar2.equals(tfp0.b.d.b)) {
                uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_list_insert_last_outline_28, R.string.music_add_to_playback_queue, null);
            } else {
                if (bVar2.equals(tfp0.b.m.b)) {
                    bVar = new uc50.b(bVar2, R.drawable.vk_icon_delete_outline_28, R.string.music_remove_from_my_tracks, null, VkColorToken.IconNegative);
                } else if (bVar2.equals(tfp0.b.l.b)) {
                    bVar = new uc50.b(bVar2, R.drawable.vk_icon_delete_outline_28, R.string.music_remove_from_my_collection, null, VkColorToken.IconNegative);
                } else if (bVar2.equals(tfp0.b.n.b)) {
                    uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_delete_outline_28, R.string.music_remove_from_playlist, null);
                } else if (bVar2.equals(tfp0.b.p.b)) {
                    uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_settings_outline_28, R.string.open_playback_settings_menu, null);
                } else if (bVar2 instanceof tfp0.b.f) {
                    uc50Var = ((tfp0.b.f) bVar2).b ? new uc50.b(bVar2, R.drawable.vk_icon_thumbs_down_28, R.string.music_dislike_track, Integer.valueOf(R.string.music_talkback_dislike_track_active)) : new uc50.b(bVar2, R.drawable.vk_icon_thumbs_down_outline_28, R.string.music_dislike_track, Integer.valueOf(R.string.music_talkback_dislike_track_not_active));
                } else if (bVar2.equals(tfp0.b.r.b)) {
                    uc50Var = new uc50.b(bVar2, R.drawable.vk_icon_logo_vk_music_outline_28, R.string.music_without_ad, null);
                } else if (bVar2.equals(tfp0.b.o.b)) {
                    uc50Var = uc50.c.a;
                } else {
                    if (!bVar2.equals(tfp0.b.s.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uc50Var = uc50.d.a;
                }
                uc50Var = bVar;
            }
            arrayList.add(uc50Var);
        }
        return new wow<>(arrayList);
    }
}
