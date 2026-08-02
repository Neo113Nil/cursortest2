package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyThreadSafetyMode;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import xsna.hpa0;

/* compiled from: MediaPlaybackControllerImpl.kt */
/* loaded from: classes3.dex */
public final class ev10 implements cv10 {
    public final Context a;
    public final String b;
    public final MediaPipelineComponent c;
    public final qfs d;
    public apk e;
    public d80 f;
    public gpa0 g;
    public fgs h;
    public final ReentrantLock i;
    public volatile dv10 j;
    public volatile boolean k;
    public volatile Size l;
    public final a m;
    public final Object n;

    public ev10(Context context, String str, MediaPipelineComponent mediaPipelineComponent) {
        this.a = context;
        this.b = str;
        this.c = mediaPipelineComponent;
        qfs qfsVar = new qfs();
        this.d = qfsVar;
        this.i = new ReentrantLock();
        this.l = new Size(0, 0);
        a aVar = new a();
        this.m = aVar;
        this.n = msy.a(LazyThreadSafetyMode.NONE, new cty(this, 8));
        qfsVar.d0(aVar);
    }

    @Override // xsna.cv10
    public final OneVideoPlayer a() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.cv10
    public final void b(g0b0 g0b0Var, long j, gzs<Boolean> gzsVar) {
        gpa0 gpa0Var = this.g;
        if (gpa0Var == null) {
            try {
                h(g0b0Var);
            } catch (Throwable th) {
                ((f100) this.n.getValue()).a("MediaPlaybackControllerImpl", th);
                return;
            }
        } else {
            gpa0Var.b(g0b0Var.a);
        }
        int i = g0b0Var.b;
        int i2 = g0b0Var.c;
        ReentrantLock reentrantLock = this.i;
        reentrantLock.lock();
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            dv10 dv10Var = new dv10(this, i, i2, gzsVar, j);
            if (this.k) {
                this.j = dv10Var;
            } else {
                dv10Var.run();
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            reentrantLock.unlock();
            throw th4;
        }
    }

    @Override // xsna.fyi
    public final Object d(d80 d80Var) {
        this.f = d80Var;
        return s3q0.a;
    }

    @Override // xsna.cv10
    public final void e(g0b0 g0b0Var, long j) {
        b(g0b0Var, j, new c6(16));
    }

    @Override // xsna.fyi
    public final Object g(apk apkVar) {
        this.e = apkVar;
        return s3q0.a;
    }

    public final void h(g0b0 g0b0Var) {
        hpa0 a2 = hpa0.a.a(this.c.p6(this.a).c(g0b0Var.a), this.b);
        apk apkVar = this.e;
        if (apkVar != null) {
        }
        d80 d80Var = this.f;
        if (d80Var != null) {
        }
        this.g = a2.build();
        int i = g0b0Var.b;
        int i2 = g0b0Var.c;
        if (this.l.getWidth() != i || this.l.getHeight() != i2) {
            this.l = new Size(i, i2);
        }
        gpa0 gpa0Var = this.g;
        if (gpa0Var == null) {
            gpa0Var = null;
        }
        qva0 a3 = gpa0Var.a(new xsw(this, 6));
        if (a3 == null) {
            throw new IllegalStateException("Failed to create Playback session");
        }
        this.h = new fgs(new rva0(a3));
    }

    @Override // xsna.cv10
    public final void release() {
        this.d.c0(this.m);
        gpa0 gpa0Var = this.g;
        if (gpa0Var != null) {
            gpa0Var.release();
        }
    }

    /* compiled from: MediaPlaybackControllerImpl.kt */
    public static final class a implements one.video.player.f {
        public a() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void x(OneVideoPlayer oneVideoPlayer) {
            ev10.this.k = false;
            ev10 ev10Var = ev10.this;
            ReentrantLock reentrantLock = ev10Var.i;
            reentrantLock.lock();
            try {
                dv10 dv10Var = ev10Var.j;
                if (dv10Var != null) {
                    dv10Var.run();
                }
                ev10Var.j = null;
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
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
