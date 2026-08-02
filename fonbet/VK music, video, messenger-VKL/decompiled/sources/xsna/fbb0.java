package xsna;

import com.vk.core.compose.generated.VkColorToken;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.vab0;
import xsna.zab0;

/* compiled from: PlaylistMenuReducer.kt */
/* loaded from: classes3.dex */
public final class fbb0 implements izs<ibb0, wow<zab0>> {
    public static final fbb0 b = new fbb0();

    @Override // xsna.izs
    public final wow<zab0> invoke(ibb0 ibb0Var) {
        zab0 aVar;
        ibb0 ibb0Var2 = ibb0Var;
        List<vab0.b> list = ibb0Var2.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (vab0.b bVar : list) {
            boolean Eb = ibb0Var2.b.Eb();
            if (bVar instanceof vab0.b.h) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_edit_outline_28, R.string.music_edit_playlist_button);
            } else if (bVar instanceof vab0.b.c) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_add_outline_28, Eb ? R.string.music_add_album_to_my_albums : R.string.music_add_playlist_to_my_playlists);
            } else if (bVar instanceof vab0.b.a) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_add_outline_28, R.string.music_add_to_my_collection);
            } else if (bVar instanceof vab0.b.C3877b) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_like_outline_28, R.string.music_add_to_my_collection);
            } else if (bVar instanceof vab0.b.n) {
                aVar = new zab0.b((vab0.b.n) bVar, R.drawable.vk_icon_delete_outline_28, Eb ? R.string.music_remove_albums_from_my_albums : R.string.music_remove_playlist_from_my_playlists, VkColorToken.IconNegative);
            } else if (bVar instanceof vab0.b.f) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_delete_outline_28, R.string.music_menu_playlist_delete_redesign, VkColorToken.IconNegative);
            } else if (bVar instanceof vab0.b.m) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_delete_outline_28, R.string.music_menu_playlist_unfollow_from_collection, VkColorToken.IconNegative);
            } else if (bVar instanceof vab0.b.k) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_list_play_outline_28, R.string.music_play_next_redesigned);
            } else if (bVar instanceof vab0.b.j) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_music_mic_outline_28, R.string.music_artist_action_to_artist);
            } else if (bVar instanceof vab0.b.i) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_music_mic_outline_28, R.string.music_artist_action_to_artist_search);
            } else if (bVar instanceof vab0.b.g) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_download_outline_24, R.string.music_menu_playlist_download);
            } else if (bVar instanceof vab0.b.o) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_download_cancel_outline_28, R.string.music_action_remove_from_storage_description);
            } else if (bVar instanceof vab0.b.q) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_story_outline_28, R.string.music_share_to_story);
            } else if (bVar instanceof vab0.b.p) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_share_outline_28, R.string.music_share);
            } else if (bVar instanceof vab0.b.e) {
                aVar = new zab0.b(bVar, R.drawable.vk_icon_copy_outline_28, R.string.copy_link);
            } else if (bVar instanceof vab0.b.l) {
                aVar = new zab0.a(R.string.music_mix_by_playlist_title);
            } else {
                if (!(bVar instanceof vab0.b.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new zab0.a(R.string.music_mix_by_album_title);
            }
            arrayList.add(aVar);
        }
        return new wow<>(arrayList);
    }
}
