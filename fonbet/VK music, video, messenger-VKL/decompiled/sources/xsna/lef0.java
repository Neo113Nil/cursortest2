package xsna;

import android.content.Context;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.block.music.impl.recommended.entity.RecommendedPlaylistState;
import com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: RecommendedPlaylistViewStateMapper.kt */
/* loaded from: classes.dex */
public final class lef0 implements s2a<RecommendedPlaylistState, kef0> {
    public final Context b;

    public lef0(Context context) {
        this.b = context;
    }

    @Override // xsna.s2a
    public final kef0 a(RecommendedPlaylistState recommendedPlaylistState) {
        String str;
        String str2;
        PlaylistOwner playlistOwner;
        Image zb;
        ImageSize Cb;
        RecommendedPlaylistState recommendedPlaylistState2 = recommendedPlaylistState;
        boolean z = recommendedPlaylistState2.i;
        PlayingState playingState = recommendedPlaylistState2.g;
        BlockId blockId = recommendedPlaylistState2.b;
        Float f = recommendedPlaylistState2.e;
        Context context = this.b;
        String b = c9b0.b(context, f);
        String c = c9b0.c(context, recommendedPlaylistState2.f);
        Playlist playlist = recommendedPlaylistState2.h;
        String str3 = playlist.h;
        if (str3 == null) {
            str3 = "";
        }
        PlayPauseButtonState playPauseButtonState = new PlayPauseButtonState(playingState, PlayPauseButtonState.Size.SIZE_40);
        List H0 = j5g.H0(playlist.y, 3);
        ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
        Iterator it = H0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MusicTrack musicTrack = (MusicTrack) it.next();
            CharSequence d = fai.d(musicTrack);
            String Fb = musicTrack.Fb();
            Thumb Jb = musicTrack.Jb();
            boolean z2 = z;
            str = Jb != null ? Jb.Ab(iah0.a(48), false) : null;
            if (str == null) {
                str = "";
            }
            String obj = d.toString();
            String str4 = musicTrack.d;
            String str5 = str4 == null ? "" : str4;
            String str6 = musicTrack.e;
            arrayList.add(new ee50(Fb, str, obj, str5, str6 == null ? "" : str6, musicTrack.Lb(), (musicTrack.B() || musicTrack.Pb()) ? false : true, epx.f(recommendedPlaylistState2.k, musicTrack.Fb()) ? playingState : PlayingState.NONE, di40.a(musicTrack.J), musicTrack.f, musicTrack.B));
            playingState = playingState;
            z = z2;
        }
        boolean z3 = z;
        if (z3) {
            str2 = c9b0.g(context, playlist);
            if (playlist.J) {
                str2 = context.getString(R.string.music_recommended_playlist_curator, str2);
            }
        } else {
            str2 = null;
        }
        if (z3 && (playlistOwner = playlist.q) != null && (zb = playlistOwner.zb()) != null && (Cb = zb.Cb(iah0.a(16), true, false)) != null) {
            str = Cb.getUrl();
        }
        return new kef0(blockId, b, c, str3, playPauseButtonState, arrayList, str2, str, recommendedPlaylistState2.j);
    }
}
