package xsna;

import android.content.SharedPreferences;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import xsna.ajt0;

/* compiled from: VideoAutoPlay.kt */
/* loaded from: classes2.dex */
public final class o3s0 implements one.video.player.f, OneVideoPlayer.e {
    public final /* synthetic */ VideoAutoPlay a;

    public o3s0(VideoAutoPlay videoAutoPlay) {
        this.a = videoAutoPlay;
    }

    @Override // one.video.player.OneVideoPlayer.e
    public final void C(ArrayList arrayList) {
        this.a.y.q(arrayList);
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
        who0 who0Var;
        VideoAutoPlay videoAutoPlay = this.a;
        ajt0 ajt0Var = videoAutoPlay.l;
        SubtitlesConfigurationMode subtitlesConfigurationMode = videoAutoPlay.Z0().m;
        boolean z2 = bVar != null;
        String str = (bVar == null || (who0Var = (who0) bVar.c) == null) ? null : who0Var.c;
        ajt0Var.getClass();
        bpn0 bpn0Var = ajt0Var.a;
        int i = ajt0.a.$EnumSwitchMapping$0[subtitlesConfigurationMode.ordinal()];
        if (i == 1) {
            qaj0.c((SharedPreferences) bpn0Var.getValue(), "subtitles-on", Boolean.valueOf(z2));
            qaj0.c((SharedPreferences) bpn0Var.getValue(), "subtitles-lang", str);
        } else if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void w(BaseVideoPlayer baseVideoPlayer) {
        VideoAutoPlay videoAutoPlay = this.a;
        videoAutoPlay.E1(baseVideoPlayer, videoAutoPlay.Z0().m);
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void d(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void f(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void h(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void j(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void l(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void p(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void r(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void s(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void v(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void x(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void b(OneVideoPlayer oneVideoPlayer, boolean z) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void c(BaseVideoPlayer baseVideoPlayer, hk0 hk0Var) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void g(BaseVideoPlayer baseVideoPlayer, float f) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void i(OneVideoPlayer oneVideoPlayer, int i) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void k(OneVideoPlayer oneVideoPlayer, long j) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void o(BaseVideoPlayer baseVideoPlayer, float f) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void u(BaseVideoPlayer baseVideoPlayer, RepeatMode repeatMode) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void y(OneVideoPlayer oneVideoPlayer, boolean z) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
    }
}
