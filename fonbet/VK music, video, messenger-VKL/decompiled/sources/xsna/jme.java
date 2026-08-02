package xsna;

import com.vk.media.player.VideoPlayerType;
import com.vk.metrics.trackers.my.event.ForegroundEvent;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: ClipsMyTrackerAnalyticListener.kt */
/* loaded from: classes3.dex */
public final class jme {
    public OneVideoPlayer a;
    public boolean b;
    public boolean c;
    public final b d = new b();

    /* compiled from: ClipsMyTrackerAnalyticListener.kt */
    public static final class a {
        public static final AtomicBoolean a = new AtomicBoolean(false);
        public static final AtomicBoolean b = new AtomicBoolean(false);
    }

    public final void a(OneVideoPlayer oneVideoPlayer) {
        if (epx.f(this.a, oneVideoPlayer)) {
            return;
        }
        this.b = false;
        this.c = false;
        OneVideoPlayer oneVideoPlayer2 = this.a;
        b bVar = this.d;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.c0(bVar);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.d0(bVar);
        }
        this.a = oneVideoPlayer;
    }

    public final void b(VideoPlayerType videoPlayerType) {
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = videoPlayerType == VideoPlayerType.FULLSCREEN;
        if (z && (!z2 || !z3)) {
            if (z2) {
                boolean compareAndSet = a.a.compareAndSet(true, false);
                boolean compareAndSet2 = a.b.compareAndSet(false, true);
                if (compareAndSet && compareAndSet2) {
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                    jt50.e(ForegroundEvent.CLIP_PLAYER_FULLSCREEN);
                }
            } else if (z3) {
                boolean compareAndSet3 = a.a.compareAndSet(false, true);
                boolean compareAndSet4 = a.b.compareAndSet(true, false);
                if (compareAndSet3 && compareAndSet4) {
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView2 = jt50.a;
                    jt50.c(ForegroundEvent.CLIP_PLAYER_FULLSCREEN);
                }
            }
        }
        this.c = z3;
    }

    /* compiled from: ClipsMyTrackerAnalyticListener.kt */
    public static final class b implements one.video.player.f {
        public b() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void y(OneVideoPlayer oneVideoPlayer, boolean z) {
            jme jmeVar = jme.this;
            boolean z2 = jmeVar.b;
            boolean z3 = jmeVar.c;
            if (!z2 || !z) {
                if (z2 && z3) {
                    boolean compareAndSet = a.a.compareAndSet(true, false);
                    boolean z4 = a.b.get();
                    if (compareAndSet && z4) {
                        ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                        jt50.e(ForegroundEvent.CLIP_PLAYER_FULLSCREEN);
                    } else if (compareAndSet) {
                        ConcurrentHashMap.KeySetView<Object, Boolean> keySetView2 = jt50.a;
                        jt50.e(ForegroundEvent.CLIP_PLAYER_FULLSCREEN);
                        jt50.e(ForegroundEvent.CLIP_PLAYER_ANY);
                    }
                } else if (z2) {
                    boolean compareAndSet2 = a.b.compareAndSet(true, false);
                    boolean z5 = a.a.get();
                    if (compareAndSet2 && !z5) {
                        ConcurrentHashMap.KeySetView<Object, Boolean> keySetView3 = jt50.a;
                        jt50.e(ForegroundEvent.CLIP_PLAYER_ANY);
                    }
                } else if (z && z3) {
                    boolean compareAndSet3 = a.a.compareAndSet(false, true);
                    boolean z6 = a.b.get();
                    if (compareAndSet3 && z6) {
                        ConcurrentHashMap.KeySetView<Object, Boolean> keySetView4 = jt50.a;
                        jt50.c(ForegroundEvent.CLIP_PLAYER_FULLSCREEN);
                    } else if (compareAndSet3) {
                        ConcurrentHashMap.KeySetView<Object, Boolean> keySetView5 = jt50.a;
                        jt50.c(ForegroundEvent.CLIP_PLAYER_FULLSCREEN);
                        jt50.c(ForegroundEvent.CLIP_PLAYER_ANY);
                    }
                } else if (z) {
                    boolean compareAndSet4 = a.b.compareAndSet(false, true);
                    boolean z7 = a.a.get();
                    if (compareAndSet4 && !z7) {
                        ConcurrentHashMap.KeySetView<Object, Boolean> keySetView6 = jt50.a;
                        jt50.c(ForegroundEvent.CLIP_PLAYER_ANY);
                    }
                }
            }
            jmeVar.b = z;
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
        public final void w(BaseVideoPlayer baseVideoPlayer) {
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
        public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
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
}
