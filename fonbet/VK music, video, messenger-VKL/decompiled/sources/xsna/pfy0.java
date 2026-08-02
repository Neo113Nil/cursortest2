package xsna;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.ironsource.adapters.fyber.FyberConstants;
import com.unity3d.services.UnityAdsConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import xsna.loy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class pfy0 implements loy0, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, TextureView.SurfaceTextureListener, MediaPlayer.OnInfoListener {
    public final saz0 b;
    public final a c;
    public final saz0 d;
    public final a2z0 e;
    public final MediaPlayer f;
    public loy0.a g;
    public Surface h;
    public int i;
    public float j;
    public int k;
    public long l;
    public dvy0 m;
    public Uri n;
    public final AudioManager o;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements Runnable {
        public pfy0 b;
        public loy0.a c;
        public int d;
        public float e;

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b == null) {
                return;
            }
            float position = r0.getPosition() / 1000.0f;
            float duration = this.b.getDuration();
            if (this.e == position) {
                this.d++;
            } else {
                loy0.a aVar = this.c;
                if (aVar != null) {
                    aVar.a(position, duration);
                }
                this.e = position;
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
        }
    }

    public pfy0(Context context) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        a aVar = new a();
        a2z0 a2z0Var = new a2z0();
        this.b = saz0.b(200);
        this.d = saz0.b(30);
        this.i = 0;
        this.j = 1.0f;
        this.l = 0L;
        this.f = mediaPlayer;
        this.c = aVar;
        this.e = a2z0Var;
        aVar.b = this;
        a2z0Var.b = this;
        this.o = (AudioManager) context.getSystemService("audio");
    }

    public static pfy0 a(Context context) {
        return new pfy0(context);
    }

    @Override // xsna.loy0
    public final void A(dvy0 dvy0Var) {
        i();
        if (dvy0Var == null) {
            this.m = null;
            b(null);
            return;
        }
        this.m = dvy0Var;
        TextureView textureView = dvy0Var.getTextureView();
        textureView.getSurfaceTextureListener();
        textureView.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        b(surfaceTexture != null ? new Surface(surfaceTexture) : null);
    }

    @Override // xsna.loy0
    public final void B(Context context, Uri uri) {
        gu8.c(null, "DefaultVideoPlayer: Play video in Android MediaPlayer - " + uri);
        int i = this.i;
        if (i == 2 && uri == this.n) {
            resume();
            return;
        }
        this.n = uri;
        MediaPlayer mediaPlayer = this.f;
        if (i != 0) {
            try {
                mediaPlayer.reset();
            } catch (Throwable unused) {
                gu8.c(null, "DefaultVideoPlayer: Media player's reset method called in wrong state");
            }
            this.i = 0;
        }
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnInfoListener(this);
        try {
            mediaPlayer.setDataSource(context, uri);
            loy0.a aVar = this.g;
            if (aVar != null) {
                aVar.g();
            }
            try {
                mediaPlayer.prepareAsync();
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("DefaultVideoPlayer: Media player's prepare async method called in wrong state, "), th);
            }
            this.b.c(this.c);
            this.d.c(this.e);
        } catch (Throwable th2) {
            if (this.g != null) {
                this.g.a(m5k.b(th2, new StringBuilder("DefaultVideoPlayer data source error: ")));
            }
            eb3.a(null, new StringBuilder("DefaultVideoPlayer: Unable to parse video source, "), th2);
            this.i = 5;
            th2.printStackTrace();
        }
    }

    @Override // xsna.loy0
    public final boolean b() {
        return this.i == 2;
    }

    @Override // xsna.loy0
    public final boolean c() {
        return this.j == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.loy0
    public final void d() {
        setVolume(1.0f);
    }

    @Override // xsna.loy0
    public final void destroy() {
        this.g = null;
        this.i = 5;
        this.b.h(this.c);
        saz0 saz0Var = this.d;
        a2z0 a2z0Var = this.e;
        saz0Var.h(a2z0Var);
        a2z0Var.b();
        i();
        boolean j = j();
        MediaPlayer mediaPlayer = this.f;
        if (j) {
            try {
                mediaPlayer.stop();
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("DefaultVideoPlayer: Media player's stop method called in wrong state, "), th);
            }
        }
        try {
            mediaPlayer.release();
        } catch (Throwable th2) {
            eb3.a(null, new StringBuilder("DefaultVideoPlayer: Media player's release method called in wrong state, "), th2);
        }
        this.m = null;
    }

    @Override // xsna.loy0
    public final void e() {
        setVolume(0.2f);
    }

    @Override // xsna.loy0
    public final void f() {
        setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.loy0
    public final boolean g() {
        int i = this.i;
        return i >= 1 && i < 3;
    }

    @Override // xsna.loy0
    public final float getDuration() {
        if (!j()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        try {
            return this.f.getDuration() / 1000.0f;
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("DefaultVideoPlayer: Media player's get duration method called in wrong state, "), th);
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // xsna.loy0
    public final long getPosition() {
        if (j() && this.i != 3) {
            try {
                return this.f.getCurrentPosition();
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("DefaultVideoPlayer: media player's get current position method called in wrong state, "), th);
            }
        }
        return 0L;
    }

    @Override // xsna.loy0
    public final Uri getUri() {
        return this.n;
    }

    @Override // xsna.loy0
    public final float getVolume() {
        int streamMaxVolume = this.o.getStreamMaxVolume(3);
        return new BigDecimal(Double.toString((r0.getStreamVolume(3) / streamMaxVolume) * this.j)).setScale(2, RoundingMode.HALF_UP).floatValue();
    }

    @Override // xsna.loy0
    public final void h() {
        try {
            this.f.start();
            this.i = 1;
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("DefaultVideoPlayer: Media player's start method called in wrong state, "), th);
        }
        seekTo(0L);
    }

    public final void i() {
        dvy0 dvy0Var = this.m;
        TextureView textureView = dvy0Var != null ? dvy0Var.getTextureView() : null;
        if (textureView == null || textureView.getSurfaceTextureListener() != this) {
            return;
        }
        textureView.setSurfaceTextureListener(null);
    }

    @Override // xsna.loy0
    public final boolean isPlaying() {
        return this.i == 1;
    }

    public final boolean j() {
        int i = this.i;
        return i >= 1 && i <= 4;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        loy0.a aVar;
        float duration = getDuration();
        this.i = 4;
        if (duration > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (aVar = this.g) != null) {
            aVar.a(duration, duration);
        }
        loy0.a aVar2 = this.g;
        if (aVar2 != null) {
            aVar2.c();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.b.h(this.c);
        this.d.c(this.e);
        i();
        b(null);
        String c = fw3.c(i == 100 ? "Server died" : FyberConstants.Logs.UNKNOWN_ERROR, " (reason: ", i2 == -1004 ? "IO error" : i2 == -1007 ? "Malformed error" : i2 == -1010 ? "Unsupported error" : i2 == -110 ? "Timed out error" : i2 == Integer.MIN_VALUE ? "Low-level system error" : DeviceInfo.STR_TYPE_UNKNOWN, ")");
        wga0.b("DefaultVideoPlayer: Video error - ", c, null);
        loy0.a aVar = this.g;
        if (aVar != null) {
            aVar.a(c);
        }
        if (this.i > 0) {
            try {
                this.f.reset();
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("DefaultVideoPlayer: Media player's reset method called in wrong state, "), th);
            }
        }
        this.i = 0;
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        loy0.a aVar = this.g;
        if (aVar == null) {
            return true;
        }
        aVar.k();
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            float f = this.j;
            mediaPlayer.setVolume(f, f);
            this.i = 1;
            mediaPlayer.start();
            long j = this.l;
            if (j > 0) {
                seekTo(j);
            }
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("DefaultVideoPlayer: Media player's start method called in wrong state, "), th);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        b(new Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b(null);
        return true;
    }

    @Override // xsna.loy0
    public final void pause() {
        MediaPlayer mediaPlayer = this.f;
        if (this.i == 1) {
            this.b.h(this.c);
            this.d.h(this.e);
            try {
                this.k = mediaPlayer.getCurrentPosition();
                mediaPlayer.pause();
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("DefaultVideoPlayer: Media player's pause or get current position method called in wrong state, "), th);
            }
            this.i = 2;
            loy0.a aVar = this.g;
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    @Override // xsna.loy0
    public final void resume() {
        MediaPlayer mediaPlayer = this.f;
        if (this.i == 2) {
            this.b.c(this.c);
            this.d.c(this.e);
            try {
                mediaPlayer.start();
            } catch (Throwable unused) {
                gu8.c(null, "DefaultVideoPlayer: Media player's start method called in wrong state");
            }
            int i = this.k;
            if (i > 0) {
                try {
                    mediaPlayer.seekTo(i);
                } catch (Throwable unused2) {
                    gu8.c(null, "DefaultVideoPlayer: Media player's seek to method called in wrong state");
                }
                this.k = 0;
            }
            this.i = 1;
            loy0.a aVar = this.g;
            if (aVar != null) {
                aVar.h();
            }
        }
    }

    @Override // xsna.loy0
    public final void seekTo(long j) {
        this.l = j;
        if (j()) {
            try {
                this.f.seekTo((int) j);
                this.l = 0L;
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("DefaultVideoPlayer: media player's seek to method called in wrong state, "), th);
            }
        }
    }

    @Override // xsna.loy0
    public final void setVolume(float f) {
        this.j = f;
        if (j()) {
            try {
                this.f.setVolume(f, f);
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("DefaultVideoPlayer: Media player's set volume method called in wrong state, "), th);
            }
        }
        loy0.a aVar = this.g;
        if (aVar != null) {
            aVar.a(f);
        }
    }

    @Override // xsna.loy0
    public final void stop() {
        this.b.h(this.c);
        this.d.h(this.e);
        try {
            this.f.stop();
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("DefaultVideoPlayer: Media player's stop method called in wrong state, "), th);
        }
        loy0.a aVar = this.g;
        if (aVar != null) {
            aVar.p();
        }
        this.i = 3;
    }

    @Override // xsna.loy0
    public final void x(loy0.a aVar) {
        this.g = aVar;
        this.c.c = aVar;
        this.e.c = aVar;
    }

    @Override // xsna.loy0
    public final void a() {
        if (this.j == 1.0f) {
            setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            setVolume(1.0f);
        }
    }

    public final void b(Surface surface) {
        try {
            this.f.setSurface(surface);
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("DefaultVideoPlayer: Media player's set surface method called in wrong state, "), th);
        }
        Surface surface2 = this.h;
        if (surface2 != null && surface2 != surface) {
            surface2.release();
        }
        this.h = surface;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
