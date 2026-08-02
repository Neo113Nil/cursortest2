package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.holders.MusicRecommendedPlaylistVh;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.stats.AdsAudioPixelsContainer;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hv00 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hv00(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        RecyclerView.o layoutManager;
        UIBlockMusicPlaylist uIBlockMusicPlaylist;
        int i = this.b;
        int i2 = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                iv00 iv00Var = (iv00) obj;
                int i3 = iv00.p1;
                kv00 kv00Var = new kv00(iv00Var.mo2getContext());
                kv00Var.setTargetPosition(i2);
                RecyclerView recyclerView = iv00Var.l1;
                if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                    layoutManager.startSmoothScroll(kv00Var);
                }
                break;
            case 1:
                MusicRecommendedPlaylistVh musicRecommendedPlaylistVh = (MusicRecommendedPlaylistVh) obj;
                u2b0 u2b0Var = musicRecommendedPlaylistVh.b;
                Playlist playlist = musicRecommendedPlaylistVh.i;
                if (playlist != null && (uIBlockMusicPlaylist = musicRecommendedPlaylistVh.g) != null && i2 >= 0 && i2 < playlist.y.size()) {
                    MusicTrack musicTrack = playlist.y.get(i2);
                    if (!epx.f(musicTrack, u2b0Var.b()) || !u2b0Var.h()) {
                        musicRecommendedPlaylistVh.f.a(new cfp0(uIBlockMusicPlaylist, musicTrack));
                    }
                    u2b0Var.N0(new lqk0(MusicRecommendedPlaylistVh.b(playlist, uIBlockMusicPlaylist), playlist.y.get(i2), playlist.y, MusicPlaybackLaunchContext.Fb(uIBlockMusicPlaylist.f).Db(playlist), 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
                }
                break;
            default:
                Context context = (Context) obj;
                ikv0.a aVar = new ikv0.a(context);
                aVar.e = 4000L;
                aVar.u = new ikv0.d(new ikv0.d.c(context.getString(i2), 2), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                aVar.n();
                break;
        }
        return s3q0.a;
    }
}
