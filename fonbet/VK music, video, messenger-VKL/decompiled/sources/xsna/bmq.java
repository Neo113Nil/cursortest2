package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.toggle.features.VideoFeatures;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import xsna.acx;

/* compiled from: FastSpeedController.kt */
/* loaded from: classes3.dex */
public final class bmq {
    public final evs a;
    public final View b;
    public final boolean c;
    public a d;
    public lcx e;
    public final b f;
    public boolean g;

    /* compiled from: FastSpeedController.kt */
    public static final class a {
        public final boolean a;
        public final float b;
        public final boolean c;

        public a() {
            this(0);
        }

        public static a a(a aVar, boolean z, float f, boolean z2, int i) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            if ((i & 2) != 0) {
                f = aVar.b;
            }
            if ((i & 4) != 0) {
                z2 = aVar.c;
            }
            aVar.getClass();
            return new a(f, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FastSpeedState(isActive=");
            sb.append(this.a);
            sb.append(", playbackSpeedBeforeFastSpeed=");
            sb.append(this.b);
            sb.append(", wasControlsVisibleBeforeFastSpeed=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        public a(float f, boolean z, boolean z2) {
            this.a = z;
            this.b = f;
            this.c = z2;
        }

        public /* synthetic */ a(int i) {
            this(1.0f, false, false);
        }
    }

    public bmq(evs evsVar, View view) {
        this.a = evsVar;
        this.b = view;
        VideoFeatures videoFeatures = VideoFeatures.FAST_SPEED;
        videoFeatures.getClass();
        this.c = com.vk.toggle.b.A.a(videoFeatures);
        this.d = new a(0);
        this.f = new b();
        this.g = true;
    }

    public final void a(boolean z) {
        this.g = z;
        if (!this.d.a || z) {
            return;
        }
        b(false, false);
    }

    public final void b(boolean z, boolean z2) {
        ocx currentState;
        if (this.c) {
            evs evsVar = this.a;
            if (z) {
                a aVar = this.d;
                boolean z3 = evsVar.B;
                lcx lcxVar = this.e;
                this.d = a.a(aVar, false, (lcxVar == null || (currentState = lcxVar.getCurrentState()) == null) ? 1.0f : currentState.q, z3, 1);
                d3m.c(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                evsVar.a(new acx.l(2.0f));
                if (z2) {
                    evsVar.Q(true);
                }
            } else {
                d3m.e(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                evsVar.a(new acx.l(this.d.b));
                if (z2) {
                    evsVar.j2(this.d.c, true);
                }
            }
            this.d = a.a(this.d, z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, 6);
        }
    }

    /* compiled from: FastSpeedController.kt */
    public static final class b implements one.video.player.f {
        public b() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void h(OneVideoPlayer oneVideoPlayer) {
            bmq.this.a(false);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void j(OneVideoPlayer oneVideoPlayer) {
            bmq.this.a(true);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void r(OneVideoPlayer oneVideoPlayer) {
            bmq.this.a(false);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void s(OneVideoPlayer oneVideoPlayer) {
            bmq.this.a(oneVideoPlayer.getState() == OneVideoPlayer.State.PLAYING);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void d(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void f(OneVideoPlayer oneVideoPlayer) {
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
        @ozl
        public final void y(OneVideoPlayer oneVideoPlayer, boolean z) {
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
