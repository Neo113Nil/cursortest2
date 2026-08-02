package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.music.stats.AdsAudioPixelsContainer;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;

/* compiled from: PlaylistSnippetModel.kt */
/* loaded from: classes4.dex */
public final class feb0 {
    public final u2b0 a;
    public final ModernPlaylistModel b;
    public io.reactivex.rxjava3.disposables.c c;

    public feb0(u2b0 u2b0Var, ModernPlaylistModel modernPlaylistModel) {
        this.a = u2b0Var;
        this.b = modernPlaylistModel;
    }

    public static StartPlayPlaylistSource a(Playlist playlist) {
        String str = playlist.x;
        String str2 = playlist.h;
        if (str2 == null) {
            str2 = "";
        }
        return new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str2, playlist.Eb(), playlist.c, playlist.b, 0, null, 48, null), null, null, str, 6, null);
    }

    public final void b(Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext, int i, MusicTrack musicTrack, ShuffleMode shuffleMode) {
        this.a.N0(new lqk0(a(playlist), musicTrack, (List) null, musicPlaybackLaunchContext.Db(playlist), i, shuffleMode, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 788));
    }

    public final void d(Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        if (this.c != null) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = this.b.J(playlist, musicPlaybackLaunchContext.Db(playlist)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        c2y c2yVar = new c2y(new dam(21), 10);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.c = itg0.m(new io.reactivex.rxjava3.internal.operators.observable.a0(a0.E(c2yVar, lVar, kVar, kVar).F(new xk30(new cd10(2), 5)), new h9b(this, 3)));
    }
}
