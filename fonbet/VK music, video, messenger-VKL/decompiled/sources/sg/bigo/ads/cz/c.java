package sg.bigo.ads.cz;

import android.media.MediaPlayer;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class c implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    static final AtomicBoolean h = new AtomicBoolean(false);

    @NonNull
    MediaPlayer a;
    String b;

    @Nullable
    a c;
    boolean e;
    boolean f;
    private Surface j;
    private long k;
    private boolean n;
    int d = 0;
    final Runnable g = new Runnable() { // from class: sg.bigo.ads.cz.c.1
        @Override // java.lang.Runnable
        public final void run() {
            if (c.this.c != null) {
                c.this.c.h();
            }
            if (c.this.d == 3 || c.this.d == 4 || c.this.d == 5) {
                return;
            }
            sg.bigo.ads.bh.d.a(2, c.this.g, 500L);
        }
    };
    private boolean l = false;
    private final AtomicBoolean m = new AtomicBoolean(false);
    int i = 0;

    public interface a {
        void a(int i, String str, int i2);

        void a(MediaPlayer mediaPlayer, int i);

        boolean a(int i);

        boolean a(int i, int i2);

        void f();

        void g();

        void h();

        void i();

        void j();

        void k_();
    }

    public c() {
        this.n = false;
        this.n = k.a.n().a(3);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.a = new MediaPlayer();
        h.set(false);
        this.a.setOnCompletionListener(this);
        this.a.setOnErrorListener(this);
        this.a.setOnInfoListener(this);
        this.a.setOnPreparedListener(this);
        this.a.setOnVideoSizeChangedListener(this);
        this.a.setOnBufferingUpdateListener(this);
    }

    private boolean i() {
        return !this.n || this.i >= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        try {
            this.k = SystemClock.elapsedRealtime();
            this.a.prepareAsync();
            return true;
        } catch (Exception e) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(10, Log.getStackTraceString(e), this.i);
            }
            b(10);
            sg.bigo.ads.bn.a.a(0, "MediaPlayerWrapper", "Player prepareAsync failed");
            return false;
        }
    }

    public final int c() {
        try {
            if (this.e) {
                return this.a.getCurrentPosition();
            }
            sg.bigo.ads.bn.a.a(0, "MediaPlayerWrapper", "getCurrentPosition failed，not initialize or release already");
            return 0;
        } catch (IllegalStateException e) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(5, Log.getStackTraceString(e), this.i);
            }
            sg.bigo.ads.bn.a.a(0, "MediaPlayerWrapper", "getCurrentPosition IllegalStateException");
            return 0;
        }
    }

    public final boolean d() {
        try {
            this.a.stop();
            sg.bigo.ads.bh.d.a(this.g);
            this.d = 4;
            return true;
        } catch (IllegalStateException e) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(6, Log.getStackTraceString(e), this.i);
            }
            sg.bigo.ads.bn.a.a(1, "MediaPlayerWrapper", "Failed to stop video: " + e.getMessage());
            return false;
        }
    }

    public final void e() {
        try {
            this.a.release();
            h.set(true);
            sg.bigo.ads.bh.d.a(this.g);
        } catch (IllegalStateException e) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(7, Log.getStackTraceString(e), this.i);
            }
            sg.bigo.ads.bn.a.a(0, "MediaPlayerWrapper", "player release IllegalStateException");
        }
        this.d = 0;
        this.e = false;
    }

    public final int f() {
        try {
            if (this.e) {
                return this.a.getDuration();
            }
            sg.bigo.ads.bn.a.a(0, "MediaPlayerWrapper", "getDuration failed，not initialize or release already");
            return 0;
        } catch (IllegalStateException e) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(8, Log.getStackTraceString(e), this.i);
            }
            sg.bigo.ads.bn.a.a(0, "MediaPlayerWrapper", "getDuration IllegalStateException");
            return 0;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        sg.bigo.ads.bh.d.a(this.g);
        a aVar = this.c;
        if (aVar != null) {
            this.d = 5;
            aVar.i();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        a aVar;
        if (i() && (aVar = this.c) != null) {
            return aVar.a(i, i2);
        }
        sg.bigo.ads.bh.d.a(this.g);
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        a aVar = this.c;
        if (aVar != null) {
            return aVar.a(i);
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (!this.f) {
            sg.bigo.ads.bn.a.a("MediaPlayerWrapper", "Surface is not available, do prepare cancel");
            return;
        }
        if (this.m.get()) {
            sg.bigo.ads.bn.a.a("MediaPlayerWrapper", "Destroy Has Called");
            return;
        }
        this.d = 1;
        this.e = true;
        SystemClock.elapsedRealtime();
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(mediaPlayer, this.i);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.j();
        }
    }

    public final void a(Surface surface) {
        try {
            this.j = surface;
            this.a.setSurface(surface);
            this.f = true;
        } catch (Exception e) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(12, Log.getStackTraceString(e), this.i);
            }
            b(12);
            sg.bigo.ads.bn.a.a(0, "MediaPlayerWrapper", "setSurface IllegalStateException");
        }
    }

    public final void b(final int i) {
        if (this.n) {
            int i2 = this.i;
            if (i2 < 3) {
                this.i = i2 + 1;
                e();
                sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.cz.c.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.h();
                        int i3 = i;
                        if (i3 != 9 && i3 != 10) {
                            if (i3 == 12) {
                                c cVar = c.this;
                                cVar.a(cVar.j);
                                return;
                            } else if (i3 != 15) {
                                return;
                            }
                        }
                        c cVar2 = c.this;
                        cVar2.a(cVar2.j);
                        c cVar3 = c.this;
                        cVar3.a(cVar3.b);
                    }
                });
            } else {
                a aVar = this.c;
                if (aVar != null) {
                    aVar.a(i, "retry times has reached limit", i2);
                }
            }
        }
    }

    public final void g() {
        this.m.set(true);
    }

    public final void a(final String str) {
        if (r.a((CharSequence) str)) {
            sg.bigo.ads.bn.a.a(0, "MediaPlayerWrapper", "invalidate file path, set data source failed");
        } else {
            this.b = str;
            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.cz.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.b(str)) {
                        c.this.j();
                    }
                }
            });
        }
    }

    public final boolean b() {
        try {
            this.a.pause();
            sg.bigo.ads.bh.d.a(this.g);
            this.d = 3;
            a aVar = this.c;
            if (aVar != null) {
                aVar.g();
            }
            return true;
        } catch (IllegalStateException e) {
            a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.a(4, Log.getStackTraceString(e), this.i);
            }
            sg.bigo.ads.bn.a.a(1, "MediaPlayerWrapper", "Failed to pause video: " + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(@NonNull String str) {
        try {
            if (!this.f) {
                sg.bigo.ads.bn.a.a("MediaPlayerWrapper", "Surface is not available, setDataSource cancel");
                return false;
            }
            this.a.reset();
            this.a.setDataSource(str);
            return true;
        } catch (Exception e) {
            sg.bigo.ads.bn.a.a(0, "MediaPlayerWrapper", "Player setDataSource failed");
            if (this.c != null) {
                if (i()) {
                    sg.bigo.ads.bn.a.a("MediaPlayerWrapper", "setDataSource called onError");
                    this.c.a(1, -1004);
                }
                this.c.a(9, Log.getStackTraceString(e), this.i);
            }
            b(9);
            return false;
        }
    }

    public final boolean a() {
        try {
            if (this.e && this.f) {
                if (this.a.isPlaying()) {
                    return true;
                }
                this.a.start();
                if (!this.l) {
                    this.l = true;
                    a aVar = this.c;
                    if (aVar != null) {
                        aVar.k_();
                    }
                }
                this.d = 2;
                sg.bigo.ads.bh.d.a(this.g);
                sg.bigo.ads.bh.d.a(2, this.g);
                a aVar2 = this.c;
                if (aVar2 != null) {
                    aVar2.f();
                }
                return true;
            }
            sg.bigo.ads.bn.a.a("MediaPlayerWrapper", "Surface is not available or player unprepared, do start play cancel");
            return false;
        } catch (IllegalStateException e) {
            a aVar3 = this.c;
            if (aVar3 != null) {
                aVar3.a(3, Log.getStackTraceString(e), this.i);
            }
            sg.bigo.ads.bn.a.a(1, "MediaPlayerWrapper", "Failed to play video: " + e.getMessage());
            return false;
        }
    }

    public final boolean a(int i) {
        try {
            this.a.seekTo(i);
            return true;
        } catch (IllegalStateException e) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(1, Log.getStackTraceString(e), this.i);
            }
            sg.bigo.ads.bn.a.a(1, "MediaPlayerWrapper", "The video failed to seek:" + e.getMessage());
            return false;
        }
    }

    public final boolean a(boolean z) {
        try {
            if (z) {
                this.a.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return z;
            }
            this.a.setVolume(1.0f, 1.0f);
            return z;
        } catch (IllegalStateException e) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(14, Log.getStackTraceString(e), this.i);
            }
            sg.bigo.ads.bn.a.a(1, "MediaPlayerWrapper", "The video failed to set volume: " + e.getMessage());
            return z;
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }
}
