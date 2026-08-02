package xsna;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.player.PlayerError;
import com.vk.media.player.video.view.PlaylistPlayerVideoView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.VideoFeatures;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoDecoderReuseEvaluation;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoSourceException;
import one.video.player.model.FrameSize;
import xsna.q7r;

/* compiled from: SharedVideoPlayer.kt */
/* loaded from: classes6.dex */
public final class xaj0 implements x3t0 {
    public final PlaylistPlayerVideoView a;
    public w69 b;
    public boolean c;
    public vj0 d;
    public d9 e;
    public q7r.d f;
    public q7r.e g;
    public t34 h;
    public q7r.f i;
    public b47 j;
    public bhh k;
    public boolean m;
    public Long n;
    public int p;
    public boolean q;
    public final q2b0 r;
    public boolean s;
    public final boolean t;
    public boolean l = true;
    public final q8w o = new q8w(19);

    public xaj0(PlaylistPlayerVideoView playlistPlayerVideoView, p3h p3hVar) {
        this.a = playlistPlayerVideoView;
        q2b0 q2b0Var = new q2b0(playlistPlayerVideoView, p3hVar);
        this.r = q2b0Var;
        playlistPlayerVideoView.setPlayerListener(q2b0Var);
        b bVar = new b();
        p2b0 p2b0Var = playlistPlayerVideoView.l;
        if (p2b0Var != null) {
            p2b0Var.D(bVar);
        }
        VideoFeatures videoFeatures = VideoFeatures.REVERSE_EXP_RENDERER_THREAD;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            if (this.l) {
                playlistPlayerVideoView.setVisibility(0);
            }
            playlistPlayerVideoView.setAlpha(1.0E-4f);
        } else {
            vaj0 vaj0Var = new vaj0(this);
            p2b0 p2b0Var2 = playlistPlayerVideoView.l;
            if (p2b0Var2 != null) {
                p2b0Var2.D(vaj0Var);
            }
        }
        waj0 waj0Var = new waj0(this);
        p2b0 p2b0Var3 = playlistPlayerVideoView.l;
        if (p2b0Var3 != null) {
            p2b0Var3.D(waj0Var);
        }
        playlistPlayerVideoView.r = j5g.v0(new a(), (Collection) playlistPlayerVideoView.r);
        this.t = true;
    }

    public final void a(List<? extends StoryEntry> list) {
        ArrayList arrayList;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!((StoryEntry) obj).B) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                VideoFile videoFile = ((StoryEntry) it.next()).n;
                if (videoFile != null) {
                    arrayList3.add(videoFile);
                }
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                m7q m7qVar = (m7q) this.o.invoke((VideoFile) it2.next());
                if (m7qVar != null) {
                    arrayList.add(m7qVar);
                }
            }
        } else {
            arrayList = null;
        }
        PlaylistPlayerVideoView playlistPlayerVideoView = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            playlistPlayerVideoView.setSourceList(EmptyList.b);
            playlistPlayerVideoView.e();
            return;
        }
        List<m7q> videoFiles = playlistPlayerVideoView.getVideoFiles();
        if (videoFiles.size() == arrayList.size()) {
            Iterator<T> it3 = videoFiles.iterator();
            int i = 0;
            while (it3.hasNext()) {
                int i2 = i + 1;
                if (epx.f(((m7q) arrayList.get(i)).a, ((m7q) it3.next()).a)) {
                    i = i2;
                }
            }
            return;
        }
        playlistPlayerVideoView.setSourceList(arrayList);
        this.q = true;
        playlistPlayerVideoView.h(0, 0L);
        this.q = false;
        playlistPlayerVideoView.g();
    }

    public final void b(long j) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"VideoPlayer", defpackage.k0.a(j, "seekTo ")});
        }
        this.q = true;
        PlaylistPlayerVideoView playlistPlayerVideoView = this.a;
        playlistPlayerVideoView.h(playlistPlayerVideoView.z.a, j);
        this.q = false;
    }

    public final void c(boolean z) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"VideoPlayer", zhy0.a("setFitVideo ", z)});
        }
        this.a.setFitVideo(z);
    }

    public final void d(boolean z) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"VideoPlayer", zhy0.a("setMute ", z)});
        }
        PlaylistPlayerVideoView playlistPlayerVideoView = this.a;
        if (z) {
            playlistPlayerVideoView.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            playlistPlayerVideoView.setVolume(1.0f);
        }
    }

    public final void e(boolean z) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"VideoPlayer", zhy0.a("setPlayWhenReady ", z)});
        }
        this.a.setPlayWhenReady(z);
        this.s = z;
    }

    public final void f(RepeatMode repeatMode) {
        this.a.setRepeatMode(repeatMode);
    }

    public final void g(VideoFile videoFile, Uri uri, boolean z, long j, boolean z2) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"VideoPlayer", "setVideoUri " + z + ' ' + j + ' ' + z2 + ' ' + uri});
        }
        if (videoFile == null) {
            a(EmptyList.b);
            return;
        }
        m7q m7qVar = (m7q) this.o.invoke(videoFile);
        PlaylistPlayerVideoView playlistPlayerVideoView = this.a;
        if (m7qVar == null) {
            playlistPlayerVideoView.setSourceList(EmptyList.b);
            playlistPlayerVideoView.e();
            return;
        }
        Iterator<m7q> it = playlistPlayerVideoView.getVideoFiles().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (epx.f(it.next().a, m7qVar.a)) {
                break;
            } else {
                i++;
            }
        }
        this.p = i;
        this.q = true;
        if (i != -1) {
            playlistPlayerVideoView.h(i, j);
        } else {
            playlistPlayerVideoView.setSourceList(Collections.singletonList(m7qVar));
            playlistPlayerVideoView.h(0, 0L);
        }
        this.q = false;
    }

    @Override // xsna.x3t0
    public final long getCurrentPosition() {
        Long l = this.n;
        if (!this.m) {
            l = null;
        }
        return l != null ? l.longValue() : this.a.getPosition();
    }

    @Override // xsna.x3t0
    public final long getDuration() {
        Long l = this.n;
        if (!this.m) {
            l = null;
        }
        return l != null ? l.longValue() : this.a.getDuration();
    }

    @Override // xsna.x3t0
    public final void seekTo(int i) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"VideoPlayer", "seekTo 0"});
        }
        this.q = true;
        this.a.h(i, 0L);
        this.q = false;
    }

    /* compiled from: SharedVideoPlayer.kt */
    public final class b implements one.video.player.f {
        public int a;

        public b() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void d(OneVideoPlayer oneVideoPlayer) {
            d9 d9Var = xaj0.this.e;
            if (d9Var != null) {
                d9Var.b();
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
            cms0 cms0Var;
            int i;
            q7r.e eVar;
            q7r.e eVar2;
            if (cVar == null || (cms0Var = (cms0) cVar.c) == null || (i = cms0Var.f) == 0) {
                return;
            }
            int b = an10.b(cms0Var.g);
            int i2 = this.a;
            xaj0 xaj0Var = xaj0.this;
            if (i2 != 0 && i2 > i && (eVar2 = xaj0Var.g) != null) {
                eVar2.a(Integer.valueOf(b));
            }
            int i3 = this.a;
            if (i3 != 0 && i3 < i && (eVar = xaj0Var.g) != null) {
                eVar.b(Integer.valueOf(b));
            }
            this.a = i;
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void g(BaseVideoPlayer baseVideoPlayer, float f) {
            bhh bhhVar = xaj0.this.k;
            if (bhhVar != null) {
                bhhVar.invoke(Float.valueOf(f));
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void h(OneVideoPlayer oneVideoPlayer) {
            xaj0 xaj0Var = xaj0.this;
            if (!xaj0Var.c) {
                oneVideoPlayer.pause();
            }
            d9 d9Var = xaj0Var.e;
            if (d9Var != null) {
                d9Var.b();
            }
            xaj0Var.a.e();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void i(OneVideoPlayer oneVideoPlayer, int i) {
            cms0 cms0Var;
            one.video.player.tracks.c E = oneVideoPlayer.E();
            Integer valueOf = (E == null || (cms0Var = (cms0) E.c) == null) ? null : Integer.valueOf(an10.b(cms0Var.g));
            xaj0 xaj0Var = xaj0.this;
            w69 w69Var = xaj0Var.b;
            if (w69Var != null) {
                w69Var.invoke(oneVideoPlayer, valueOf);
            }
            xaj0Var.m = true;
            if (xaj0Var.p < i && i > 0 && !xaj0Var.q) {
                if (!xaj0Var.c) {
                    oneVideoPlayer.pause();
                }
                d9 d9Var = xaj0Var.e;
                if (d9Var != null) {
                    d9Var.b();
                }
            }
            xaj0Var.m = false;
            xaj0Var.n = Long.valueOf(oneVideoPlayer.getDuration());
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void j(OneVideoPlayer oneVideoPlayer) {
            xaj0 xaj0Var = xaj0.this;
            PlaylistPlayerVideoView playlistPlayerVideoView = xaj0Var.a;
            if (xaj0Var.l) {
                playlistPlayerVideoView.setVisibility(0);
            }
            playlistPlayerVideoView.setAlpha(1.0f);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void l(OneVideoPlayer oneVideoPlayer) {
            xaj0 xaj0Var = xaj0.this;
            if (xaj0Var.l) {
                xaj0Var.a.setVisibility(0);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
            PlayerError playerError;
            OneVideoSourceException.a g;
            Uri uri;
            q7r.d dVar;
            cms0 cms0Var;
            FrameSize b;
            xaj0 xaj0Var = xaj0.this;
            PlaylistPlayerVideoView playlistPlayerVideoView = xaj0Var.a;
            if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.UNRESOLVED) {
                playerError = PlayerError.ERROR_NOT_SUPPORT;
            } else if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.RENDERER) {
                playerError = PlayerError.ERROR_CANT_DECODE;
            } else {
                if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.SOURCE) {
                    OneVideoSourceException i = oneVideoPlaybackException.i();
                    if (((i == null || (g = i.g()) == null) ? null : Integer.valueOf(g.a)) != null) {
                        playerError = PlayerError.ERROR_SERVER;
                    }
                }
                playerError = oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.UNEXPECTED ? PlayerError.ERROR_NOT_SUPPORT_RESOLUTION : PlayerError.ERROR_NETWORK;
            }
            Context context = playlistPlayerVideoView.getContext();
            if (context != null) {
                Point z = y2r0.z(context);
                if (playlistPlayerVideoView.getVideoHeight() * playlistPlayerVideoView.getVideoWidth() > z.x * z.y) {
                    playerError = PlayerError.ERROR_NOT_SUPPORT_RESOLUTION;
                }
            }
            PlayerError playerError2 = playerError;
            OneVideoPlayer player = playlistPlayerVideoView.getPlayer();
            m7q m7qVar = player != null ? (m7q) j5g.b0(player.m0(), playlistPlayerVideoView.getVideoFiles()) : null;
            if (m7qVar != null) {
                int h = playerError2.h();
                int currentPosition = (int) oneVideoPlayer.getCurrentPosition();
                PlayerType playerType = PlayerType.FULLSCREEN;
                one.video.player.tracks.c E = oneVideoPlayer.E();
                new njt0(h, m7qVar, oneVideoPlaybackException, currentPosition, playerType, (E == null || (cms0Var = (cms0) E.c) == null || (b = cms0Var.b()) == null) ? 0 : b.getHeight(), d5b0.c(m7qVar.i), com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), true, qu5.c().k()).q();
            }
            if (sht0Var != null && (uri = sht0Var.b) != null && (dVar = xaj0Var.f) != null) {
                dVar.a(uri, uri, oneVideoPlaybackException);
            }
            t34 t34Var = xaj0Var.h;
            if (t34Var != null) {
                t34Var.b(playerError2, oneVideoPlaybackException);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void s(OneVideoPlayer oneVideoPlayer) {
            q7r.f fVar = xaj0.this.i;
            if (fVar != null) {
                fVar.onBufferingEnd();
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void v(OneVideoPlayer oneVideoPlayer) {
            q7r.f fVar = xaj0.this.i;
            if (fVar != null) {
                fVar.onBufferingStart();
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void x(OneVideoPlayer oneVideoPlayer) {
            cms0 cms0Var;
            Long valueOf = Long.valueOf(oneVideoPlayer.getDuration());
            xaj0 xaj0Var = xaj0.this;
            xaj0Var.n = valueOf;
            one.video.player.tracks.c E = oneVideoPlayer.E();
            Integer valueOf2 = (E == null || (cms0Var = (cms0) E.c) == null) ? null : Integer.valueOf(an10.b(cms0Var.g));
            vj0 vj0Var = xaj0Var.d;
            if (vj0Var != null) {
                vj0Var.p0(valueOf2);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
            b47 b47Var = xaj0.this.j;
            if (b47Var != null) {
                b47Var.invoke(state, state2);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void f(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void p(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void r(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void w(BaseVideoPlayer baseVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void b(OneVideoPlayer oneVideoPlayer, boolean z) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void c(BaseVideoPlayer baseVideoPlayer, hk0 hk0Var) {
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
        public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        }
    }

    /* compiled from: SharedVideoPlayer.kt */
    public final class a implements one.video.player.e {
        public a() {
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void f(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, long j, long j2, OneVideoPlayer.DataType dataType) {
            q7r.d dVar = xaj0.this.f;
            if (dVar != null) {
                dVar.c(j, j2);
            }
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void h(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, er10 er10Var) {
            q7r.d dVar = xaj0.this.f;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void c(OneVideoPlayer oneVideoPlayer, long j, int i) {
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void e(OneVideoPlayer oneVideoPlayer, er10 er10Var, OneVideoDecoderReuseEvaluation oneVideoDecoderReuseEvaluation) {
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void b(OneVideoPlayer oneVideoPlayer, int i, long j, long j2) {
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void d(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, IOException iOException) {
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void g(OneVideoPlayer oneVideoPlayer, int i, long j, long j2) {
        }
    }
}
