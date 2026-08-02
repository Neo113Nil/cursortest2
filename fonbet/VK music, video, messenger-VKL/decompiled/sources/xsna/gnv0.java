package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VkStoriesMusicTrackBottomSheetActionsFactory.kt */
/* loaded from: classes3.dex */
public final class gnv0 implements gc40<MusicTrack> {
    public final MusicTrack b;
    public final ia50 c;
    public final bpn0 d = new bpn0(new cem0(5));

    public gnv0(MusicTrack musicTrack, ia50 ia50Var) {
        this.b = musicTrack;
        this.c = ia50Var;
    }

    @Override // xsna.gc40
    public final List<ec40<MusicTrack>> a() {
        int i;
        ArrayList arrayList = new ArrayList();
        ia50 ia50Var = this.c;
        MusicTrack musicTrack = this.b;
        boolean i2 = ia50Var.i(musicTrack);
        if (i2) {
            arrayList.add(new ec40(R.id.music_action_add_to_my_music, this.b, R.string.music_add_to_my_music, R.drawable.vk_icon_add_outline_28, false, false, 496));
        }
        if (ia50Var.G(musicTrack)) {
            boolean y = ia50Var.y(musicTrack);
            arrayList.add(new ec40(R.id.music_action_add_to_playlist, this.b, R.string.music_add_to_playlist, R.drawable.vk_icon_list_add_outline_28, y, !y, 112));
        }
        bpn0 bpn0Var = this.d;
        if (sp.f((u2b0) bpn0Var.getValue()) && !((u2b0) bpn0Var.getValue()).c1() && !musicTrack.B()) {
            arrayList.add(new ec40(R.id.music_action_play_next, this.b, R.string.music_play_next, R.drawable.vk_icon_list_play_outline_28, false, false, 496));
        }
        if (!i2 && ia50Var.i0(musicTrack)) {
            Playlist playlist = ia50Var.c;
            if (playlist != null) {
                Playlist Bb = playlist.Bb(o25.a().c());
                if (xx1.w(Bb) && !xx1.x(Bb)) {
                    i = R.string.music_remove_from_playlist;
                    arrayList.add(new ec40(R.id.music_action_remove_from_my_music, this.b, i, R.drawable.vk_icon_delete_outline_28, false, false, 496));
                }
            }
            i = R.string.music_remove_from_my_music;
            arrayList.add(new ec40(R.id.music_action_remove_from_my_music, this.b, i, R.drawable.vk_icon_delete_outline_28, false, false, 496));
        }
        if (ia50Var.d instanceof MusicBottomSheetLaunchPoint.Player) {
            arrayList.add(new ec40(R.id.music_action_remove_from_current_playlist, this.b, R.string.music_remove_from_next, R.drawable.vk_icon_cancel_24, false, false, 496));
        }
        return arrayList;
    }

    @Override // xsna.gc40
    public final EmptyList c() {
        return EmptyList.b;
    }
}
