package xsna;

import android.content.Context;
import com.ironsource.Z3;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayEntitySource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.List;
import ru.ok.proto.PublisherConfiguration;
import xsna.k840;

/* compiled from: AudioController.kt */
/* loaded from: classes4.dex */
public final class lm4 {
    public final u2b0 a;
    public final a630 b;
    public final ModernPlaylistModel c;
    public final io.reactivex.rxjava3.disposables.b d;

    public lm4() {
        this(null, null, null, 15);
    }

    public static boolean j(lm4 lm4Var, AudioPlaylistAttachment audioPlaylistAttachment, u750 u750Var, feb0 feb0Var) {
        ShuffleMode shuffleMode = ShuffleMode.SHUFFLE_AUTO;
        lm4Var.getClass();
        Playlist playlist = audioPlaylistAttachment.f;
        u2b0 u2b0Var = lm4Var.a;
        com.vk.music.player.f H = u2b0Var.H();
        if (H != null && H.m() && lm4Var.d(playlist)) {
            boolean h = u2b0Var.h();
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
            return !h;
        }
        u750Var.f0("all");
        feb0Var.b(playlist, MusicPlaybackLaunchContext.Fb(audioPlaylistAttachment.g), 0, null, shuffleMode);
        return true;
    }

    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        this.d.b(cVar);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b1 b(MusicTrack musicTrack, String str) {
        io.reactivex.rxjava3.core.q<Integer> e1 = this.b.e1(musicTrack, MusicPlaybackLaunchContext.Fb(str), true);
        e1.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.b1(e1);
    }

    public final boolean c(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        MusicTrack b;
        MusicTrack b2;
        if (musicTrack.g == 3) {
            return false;
        }
        boolean Vb = musicTrack.Vb();
        u2b0 u2b0Var = this.a;
        if (Vb && ((b2 = u2b0Var.b()) == null || !b2.Vb())) {
            return false;
        }
        if (!musicTrack.Vb() && (b = u2b0Var.b()) != null && b.Vb()) {
            return false;
        }
        List<PlayerTrack> g = u2b0Var.g();
        int size = g.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (epx.f(g.get(size).b, musicTrack)) {
                    return false;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return hd60.a().K0(musicTrack, musicPlaybackLaunchContext);
    }

    public final boolean d(Playlist playlist) {
        String Ib;
        if (playlist == null || (Ib = playlist.Ib()) == null) {
            return false;
        }
        String Kb = this.a.x0().Kb();
        return Ib.equals(Kb) || epx.f(playlist.Hb(), Kb);
    }

    public final void e(com.vk.music.player.e eVar) {
        this.a.P0(eVar, true);
    }

    public final void f(com.vk.music.player.e eVar) {
        this.a.n0(eVar);
        this.d.e();
    }

    public final void g(Context context, MusicTrack musicTrack, List<MusicTrack> list, String str, PostInteract postInteract, int i, AdsAudioPixelsContainer adsAudioPixelsContainer) {
        MusicTrack musicTrack2;
        MusicTrack b = this.a.b();
        if (b == null || !b.equals(musicTrack)) {
            musicTrack2 = musicTrack;
            m(musicTrack2, list, MusicPlaybackLaunchContext.Fb(str), postInteract, adsAudioPixelsContainer, i);
        } else {
            musicTrack2 = musicTrack;
        }
        if (musicTrack2 == null || !musicTrack2.B()) {
            fl4 g = lyd.g();
            int i2 = fl4.a;
            g.x(context, false);
        }
    }

    public final void i(MusicTrack musicTrack, ArrayList<MusicTrack> arrayList, String str, PostInteract postInteract, AdsAudioPixelsContainer adsAudioPixelsContainer) {
        u2b0 u2b0Var = this.a;
        MusicTrack b = u2b0Var.b();
        boolean z = b != null && b.equals(musicTrack);
        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(str);
        if (!z) {
            m(musicTrack, arrayList, Fb, postInteract, adsAudioPixelsContainer, 0);
            return;
        }
        Fb.getClass();
        u2b0Var.N0(new lqk0(new StartPlayEntitySource((Fb == MusicPlaybackLaunchContext.d || Fb == MusicPlaybackLaunchContext.i || Fb == MusicPlaybackLaunchContext.l) ? StartPlayEntitySource.PlayEntitySource.WALL : StartPlayEntitySource.PlayEntitySource.FEED, postInteract != null ? postInteract.c : null, false, 4, null), musicTrack, arrayList, Fb, 0, ShuffleMode.SHUFFLE_AUTO, (PlayRequestTrigger) null, adsAudioPixelsContainer, 0L, 640));
    }

    public final void k(PodcastAttachment podcastAttachment, NewsEntry newsEntry, String str, PostInteract postInteract) {
        MusicTrack musicTrack = podcastAttachment.f;
        u2b0 u2b0Var = this.a;
        if (epx.f(u2b0Var.b(), musicTrack) && u2b0Var.m0() == PlayState.PLAYING) {
            u2b0Var.pause(6);
            return;
        }
        if (epx.f(str, "fave")) {
            qrq.a(newsEntry, podcastAttachment);
        }
        u2b0Var.N0(new lqk0((StartPlaySource) null, musicTrack, (List) null, MusicPlaybackLaunchContext.Fb(str), 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, Z3.i));
        if (postInteract != null) {
            postInteract.zb(PostInteract.Type.open_audio);
        }
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b1 l(MusicTrack musicTrack) {
        io.reactivex.rxjava3.core.q<List<String>> u1 = this.b.u1(musicTrack, true);
        u1.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.b1(u1);
    }

    public final void m(MusicTrack musicTrack, List<MusicTrack> list, MusicPlaybackLaunchContext musicPlaybackLaunchContext, PostInteract postInteract, AdsAudioPixelsContainer adsAudioPixelsContainer, int i) {
        this.a.N0(new lqk0(new StartPlayEntitySource((musicPlaybackLaunchContext == MusicPlaybackLaunchContext.d || musicPlaybackLaunchContext == MusicPlaybackLaunchContext.i || musicPlaybackLaunchContext == MusicPlaybackLaunchContext.l) ? StartPlayEntitySource.PlayEntitySource.WALL : StartPlayEntitySource.PlayEntitySource.FEED, postInteract != null ? postInteract.c : null, false, 4, null), musicTrack, list, musicPlaybackLaunchContext, i, (ShuffleMode) null, (PlayRequestTrigger) null, adsAudioPixelsContainer, 0L, PublisherConfiguration.DEFAULT_MAX_RES));
        if (postInteract != null) {
            postInteract.zb(PostInteract.Type.open_audio);
        }
    }

    public lm4(u2b0 u2b0Var, a630 a630Var, ModernPlaylistModel modernPlaylistModel, int i) {
        u2b0Var = (i & 1) != 0 ? k840.a.g().b() : u2b0Var;
        a630Var = (i & 2) != 0 ? new com.vk.music.track.a() : a630Var;
        modernPlaylistModel = (i & 8) != 0 ? k840.c.d() : modernPlaylistModel;
        this.a = u2b0Var;
        this.b = a630Var;
        this.c = modernPlaylistModel;
        this.d = new io.reactivex.rxjava3.disposables.b();
    }
}
