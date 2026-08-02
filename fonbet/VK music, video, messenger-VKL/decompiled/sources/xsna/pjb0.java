package xsna;

import android.content.Context;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.List;

/* compiled from: PodcastTimeCodeLinkClickListener.kt */
/* loaded from: classes7.dex */
public final class pjb0 implements taz {
    public final Context b;
    public final u2b0 c;
    public MusicTrack d;
    public MusicPlaybackLaunchContext e;

    public pjb0(Context context, u2b0 u2b0Var) {
        this.b = context;
        this.c = u2b0Var;
    }

    @Override // xsna.taz
    public final void a(long j) {
        u2b0 u2b0Var = this.c;
        PlayState m0 = u2b0Var.m0();
        MusicTrack musicTrack = this.d;
        Episode episode = (musicTrack == null ? null : musicTrack).w;
        if (episode != null) {
            episode.d = j;
        }
        if (musicTrack == null) {
            musicTrack = null;
        }
        if (u2b0Var.y0(musicTrack) && m0 != PlayState.IDLE) {
            u2b0Var.G0((int) j, new PlaybackActionMeta(26, 0L, 2, null));
            if (m0 == PlayState.PAUSED || m0 == PlayState.STOPPED) {
                u2b0Var.f(new PlaybackActionMeta(6, 0L, 2, null));
                return;
            }
            return;
        }
        MusicTrack musicTrack2 = this.d;
        MusicTrack musicTrack3 = musicTrack2 == null ? null : musicTrack2;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.e;
        u2b0Var.N0(new lqk0((StartPlaySource) null, musicTrack3, (List) null, musicPlaybackLaunchContext == null ? null : musicPlaybackLaunchContext, (int) j, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 981));
        fl4 g = lyd.g();
        int i = fl4.a;
        g.x(this.b, false);
    }
}
