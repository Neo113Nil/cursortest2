package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import com.unity3d.services.UnityAdsConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import xsna.jza0;
import xsna.loy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class qfy0 implements jza0.b, loy0 {
    public final androidx.media3.exoplayer.c c;
    public final a d;
    public final AudioManager e;
    public final a2z0 g;
    public loy0.a h;
    public androidx.media3.exoplayer.source.a i;
    public Uri j;
    public boolean k;
    public boolean l;
    public final saz0 b = saz0.b(200);
    public final saz0 f = saz0.b(30);

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static final class a implements Runnable {
        public final androidx.media3.exoplayer.c b;
        public loy0.a c;
        public int d;
        public float e;

        public a(androidx.media3.exoplayer.c cVar) {
            this.b = cVar;
        }

        public final void a(loy0.a aVar) {
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.media3.exoplayer.c cVar = this.b;
            try {
                float currentPosition = cVar.getCurrentPosition() / 1000.0f;
                float duration = cVar.getDuration() / 1000.0f;
                if (this.e == currentPosition) {
                    this.d++;
                } else {
                    loy0.a aVar = this.c;
                    if (aVar != null) {
                        aVar.a(currentPosition, duration);
                    }
                    this.e = currentPosition;
                    if (this.d > 0) {
                        this.d = 0;
                    }
                }
                if (this.d > 50) {
                    loy0.a aVar2 = this.c;
                    if (aVar2 != null) {
                        aVar2.j();
                    }
                    this.d = 0;
                }
            } catch (Throwable th) {
                String str = "ExoVideoPlayer: Error - " + th.getMessage();
                gu8.c(null, str);
                loy0.a aVar3 = this.c;
                if (aVar3 != null) {
                    aVar3.a(str);
                }
            }
        }
    }

    public qfy0(Context context) {
        androidx.media3.exoplayer.c a2 = new ExoPlayer.b(context).a();
        this.c = a2;
        a2.c(this);
        this.e = (AudioManager) context.getSystemService("audio");
        this.d = new a(a2);
        this.g = new a2z0(this);
    }

    @Override // xsna.loy0
    public final void A(dvy0 dvy0Var) {
        androidx.media3.exoplayer.c cVar = this.c;
        try {
            if (dvy0Var != null) {
                dvy0Var.setExoPlayer(cVar);
            } else {
                cVar.setVideoTextureView(null);
            }
        } catch (Throwable th) {
            F(th);
        }
    }

    @Override // xsna.loy0
    public final void B(Context context, Uri uri) {
        androidx.media3.exoplayer.c cVar = this.c;
        gu8.c(null, "ExoVideoPlayer: prepare to play video in ExoPlayer");
        this.j = uri;
        this.l = false;
        loy0.a aVar = this.h;
        if (aVar != null) {
            aVar.g();
        }
        try {
            this.b.c(this.d);
            this.f.c(this.g);
            cVar.setPlayWhenReady(true);
            if (this.k) {
                gu8.e(null, "ExoVideoPlayer: New source url not set! Will play previous video! started = true");
                return;
            }
            androidx.media3.exoplayer.source.a a2 = ewy0.a(context, uri);
            this.i = a2;
            cVar.r(a2);
            cVar.prepare();
            gu8.c(null, "ExoVideoPlayer: Play new video in ExoPlayer");
        } catch (Throwable th) {
            String str = "ExoVideoPlayer: Error - " + th.getMessage();
            gu8.c(null, str);
            loy0.a aVar2 = this.h;
            if (aVar2 != null) {
                aVar2.a(str);
            }
        }
    }

    public final void F(Throwable th) {
        String str = "ExoVideoPlayer: Error - " + th.getMessage();
        gu8.c(null, str);
        loy0.a aVar = this.h;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // xsna.loy0
    public final void a() {
        try {
            setVolume(((double) this.c.getVolume()) == 1.0d ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("ExoVideoPlayer: error - "), th);
        }
    }

    @Override // xsna.loy0
    public final boolean b() {
        return this.k && this.l;
    }

    @Override // xsna.loy0
    public final boolean c() {
        try {
            return this.c.getVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("ExoVideoPlayer: Error - "), th);
            return false;
        }
    }

    @Override // xsna.loy0
    public final void d() {
        try {
            this.c.setVolume(1.0f);
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("ExoVideoPlayer: Error - "), th);
        }
        loy0.a aVar = this.h;
        if (aVar != null) {
            aVar.a(1.0f);
        }
    }

    @Override // xsna.loy0
    public final void destroy() {
        androidx.media3.exoplayer.c cVar = this.c;
        this.j = null;
        this.k = false;
        this.l = false;
        this.h = null;
        this.b.h(this.d);
        saz0 saz0Var = this.f;
        a2z0 a2z0Var = this.g;
        saz0Var.h(a2z0Var);
        a2z0Var.b();
        try {
            cVar.setVideoTextureView(null);
            cVar.stop();
            cVar.release();
            cVar.l(this);
        } catch (Throwable unused) {
        }
    }

    @Override // xsna.loy0
    public final void e() {
        try {
            this.c.setVolume(0.2f);
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("ExoVideoPlayer: Error - "), th);
        }
    }

    @Override // xsna.loy0
    public final void f() {
        try {
            this.c.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("ExoVideoPlayer: Error - "), th);
        }
        loy0.a aVar = this.h;
        if (aVar != null) {
            aVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // xsna.loy0
    public final boolean g() {
        return this.k;
    }

    @Override // xsna.loy0
    public final float getDuration() {
        try {
            return this.c.getDuration() / 1000.0f;
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("ExoVideoPlayer: Error - "), th);
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // xsna.loy0
    public final long getPosition() {
        try {
            return this.c.getCurrentPosition();
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("ExoVideoPlayer: Error - "), th);
            return 0L;
        }
    }

    @Override // xsna.loy0
    public final Uri getUri() {
        return this.j;
    }

    @Override // xsna.loy0
    public final float getVolume() {
        int streamMaxVolume = this.e.getStreamMaxVolume(3);
        return new BigDecimal(Double.toString((r0.getStreamVolume(3) / streamMaxVolume) * this.c.getVolume())).setScale(2, RoundingMode.HALF_UP).floatValue();
    }

    @Override // xsna.loy0
    public final void h() {
        androidx.media3.exoplayer.c cVar = this.c;
        try {
            cVar.x(0L);
            cVar.setPlayWhenReady(true);
        } catch (Throwable th) {
            F(th);
        }
    }

    @Override // xsna.loy0
    public final boolean isPlaying() {
        return this.k && !this.l;
    }

    @Override // xsna.jza0.b
    public final void onPlayerError(PlaybackException playbackException) {
        this.l = false;
        this.k = false;
        if (this.h != null) {
            StringBuilder sb = new StringBuilder("ExoVideoPlayer: Error - ");
            sb.append(playbackException != null ? playbackException.getMessage() : "unknown video error");
            this.h.a(sb.toString());
        }
    }

    @Override // xsna.jza0.b
    public final void onPlayerStateChanged(boolean z, int i) {
        a2z0 a2z0Var = this.g;
        saz0 saz0Var = this.f;
        a aVar = this.d;
        saz0 saz0Var2 = this.b;
        if (i == 1) {
            gu8.c(null, "ExoVideoPlayer: Player state is changed to IDLE");
            if (this.k) {
                this.k = false;
                loy0.a aVar2 = this.h;
                if (aVar2 != null) {
                    aVar2.p();
                }
            }
            saz0Var2.h(aVar);
            saz0Var.h(a2z0Var);
            return;
        }
        if (i == 2) {
            gu8.c(null, "ExoVideoPlayer: Player state is changed to BUFFERING");
            if (!z || this.k) {
                return;
            }
            saz0Var2.c(aVar);
            saz0Var.c(a2z0Var);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            gu8.c(null, "ExoVideoPlayer: Player state is changed to ENDED");
            this.l = false;
            this.k = false;
            float duration = getDuration();
            loy0.a aVar3 = this.h;
            if (aVar3 != null) {
                aVar3.a(duration, duration);
            }
            loy0.a aVar4 = this.h;
            if (aVar4 != null) {
                aVar4.c();
            }
            saz0Var2.h(aVar);
            saz0Var.h(a2z0Var);
            return;
        }
        gu8.c(null, "ExoVideoPlayer: Player state is changed to READY");
        if (!z) {
            if (!this.l) {
                this.l = true;
                loy0.a aVar5 = this.h;
                if (aVar5 != null) {
                    aVar5.f();
                }
            }
            saz0Var2.h(aVar);
            saz0Var.h(a2z0Var);
            return;
        }
        loy0.a aVar6 = this.h;
        if (aVar6 != null) {
            aVar6.k();
        }
        if (!this.k) {
            this.k = true;
        } else if (this.l) {
            this.l = false;
            loy0.a aVar7 = this.h;
            if (aVar7 != null) {
                aVar7.h();
            }
        }
        saz0Var2.c(aVar);
        saz0Var.c(a2z0Var);
    }

    @Override // xsna.loy0
    public final void pause() {
        if (!this.k || this.l) {
            return;
        }
        try {
            this.c.setPlayWhenReady(false);
        } catch (Throwable th) {
            F(th);
        }
    }

    @Override // xsna.loy0
    public final void resume() {
        try {
            boolean z = this.k;
            androidx.media3.exoplayer.c cVar = this.c;
            if (z) {
                cVar.setPlayWhenReady(true);
                return;
            }
            androidx.media3.exoplayer.source.a aVar = this.i;
            if (aVar != null) {
                cVar.M(aVar);
                cVar.prepare();
            }
        } catch (Throwable th) {
            F(th);
        }
    }

    @Override // xsna.loy0
    public final void seekTo(long j) {
        try {
            this.c.x(j);
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("ExoVideoPlayer: Error - "), th);
        }
    }

    @Override // xsna.loy0
    public final void setVolume(float f) {
        try {
            this.c.setVolume(f);
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("ExoVideoPlayer: Error - "), th);
        }
        loy0.a aVar = this.h;
        if (aVar != null) {
            aVar.a(f);
        }
    }

    @Override // xsna.loy0
    public final void stop() {
        androidx.media3.exoplayer.c cVar = this.c;
        try {
            cVar.stop();
            cVar.n();
        } catch (Throwable th) {
            F(th);
        }
    }

    @Override // xsna.loy0
    public final void x(loy0.a aVar) {
        this.h = aVar;
        this.d.a(aVar);
        this.g.a(aVar);
    }
}
