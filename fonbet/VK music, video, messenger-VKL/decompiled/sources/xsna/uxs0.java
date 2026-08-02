package xsna;

import android.net.Uri;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.player.VideoTracker;
import com.vk.metrics.trackers.my.event.ServiceEvent;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: VideoMyTrackerAnalyticsListener.kt */
/* loaded from: classes3.dex */
public final class uxs0 {
    public OneVideoPlayer a;
    public final a b = new a();
    public final b c = new b();

    /* compiled from: VideoMyTrackerAnalyticsListener.kt */
    public static final class b implements OneVideoPlayer.d {
        @Override // one.video.player.OneVideoPlayer.d
        public final void C(BaseVideoPlayer baseVideoPlayer, long j) {
            if (!VideoTracker.g || (System.currentTimeMillis() - VideoTracker.d) + VideoTracker.c <= ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS || VideoTracker.e) {
                return;
            }
            VideoTracker.e = true;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"send start timespent with id 77"});
            }
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
            jt50.d(ServiceEvent.VIDEO_PLAYER_30S);
        }
    }

    public final void a(OneVideoPlayer oneVideoPlayer) {
        if (epx.f(this.a, oneVideoPlayer)) {
            return;
        }
        OneVideoPlayer oneVideoPlayer2 = this.a;
        a aVar = this.b;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.c0(aVar);
        }
        OneVideoPlayer oneVideoPlayer3 = this.a;
        b bVar = this.c;
        if (oneVideoPlayer3 != null) {
            oneVideoPlayer3.T(bVar);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.d0(aVar);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.s(bVar);
        }
        this.a = oneVideoPlayer;
    }

    /* compiled from: VideoMyTrackerAnalyticsListener.kt */
    public static final class a implements one.video.player.f {
        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
            if (discontinuityReason != OneVideoPlayer.DiscontinuityReason.REMOVE) {
                VideoTracker.c = (System.currentTimeMillis() - VideoTracker.d) + VideoTracker.c;
                VideoTracker.d = System.currentTimeMillis();
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void f(OneVideoPlayer oneVideoPlayer) {
            if (BuildInfo.a == BuildInfo.Client.VK_TV) {
                VideoTracker.b.clear();
                VideoTracker.b();
                return;
            }
            sht0 j = oneVideoPlayer.j();
            if (j != null) {
                Set<Uri> set = VideoTracker.b;
                Uri uri = j.b;
                if (set.contains(uri)) {
                    set.remove(uri);
                }
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void h(OneVideoPlayer oneVideoPlayer) {
            sht0 j = oneVideoPlayer.j();
            if (j != null) {
                Uri uri = j.b;
                Set<Uri> set = VideoTracker.a;
                if (!set.contains(uri)) {
                    VideoTracker.b();
                    VideoTracker.f = uri;
                }
                set.add(uri);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void j(OneVideoPlayer oneVideoPlayer) {
            sht0 j = oneVideoPlayer.j();
            if (j != null) {
                VideoTracker.a(j);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
            sht0 j = oneVideoPlayer.j();
            if (j != null) {
                Set<Uri> set = VideoTracker.a;
                Uri uri = j.b;
                if (set.contains(uri)) {
                    return;
                }
                VideoTracker.b();
                VideoTracker.f = uri;
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void r(OneVideoPlayer oneVideoPlayer) {
            sht0 j = oneVideoPlayer.j();
            if (j != null) {
                Set<Uri> set = VideoTracker.a;
                Uri uri = j.b;
                if (set.contains(uri)) {
                    return;
                }
                VideoTracker.b();
                VideoTracker.f = uri;
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void s(OneVideoPlayer oneVideoPlayer) {
            if (oneVideoPlayer.j() == null || !oneVideoPlayer.f0()) {
                return;
            }
            Set<Uri> set = VideoTracker.a;
            sht0 j = oneVideoPlayer.j();
            if (VideoTracker.a.contains(j.b)) {
                VideoTracker.a(j);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void w(BaseVideoPlayer baseVideoPlayer) {
            sht0 j = baseVideoPlayer.j();
            if (j != null) {
                VideoTracker.a.add(j.b);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void d(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void l(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void p(OneVideoPlayer oneVideoPlayer) {
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
        public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
        }
    }
}
