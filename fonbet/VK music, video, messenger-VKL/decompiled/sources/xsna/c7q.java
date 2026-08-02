package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import com.ironsource.X3;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import one.video.statistics2.FirstSendEventManager;
import xsna.jza0;

/* compiled from: ExoStatisticsListener.kt */
/* loaded from: classes3.dex */
public final class c7q {
    public androidx.media3.exoplayer.c a;
    public g4b0 b;
    public g4b0 c;
    public boolean e;
    public long d = -1;
    public final FirstSendEventManager f = new FirstSendEventManager();
    public final AtomicLong g = new AtomicLong(0);
    public final a h = new a();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final d j = new d();
    public final b k = new b();
    public final c l = new c();

    /* compiled from: ExoStatisticsListener.kt */
    public final class a extends l7q {
        public a() {
        }
    }

    /* compiled from: ExoStatisticsListener.kt */
    public static final class b implements jza0.b {
        public b() {
        }

        @Override // xsna.jza0.b
        public final void D(int i, jza0.c cVar, jza0.c cVar2) {
            c7q c7qVar = c7q.this;
            a aVar = c7qVar.h;
            aVar.q0();
            c7qVar.b();
            long j = cVar2.f;
            tds0 tds0Var = aVar.b;
            tds0Var.a = j;
            tds0Var.b = j;
            c7qVar.b();
            if (i == 1) {
                g4b0 g4b0Var = c7qVar.b;
                if (g4b0Var != null) {
                    wi80.b("seek", g4b0Var, "unknown", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)));
                }
                c7q.a(c7qVar);
                c7qVar.e = false;
            }
            if (cVar.b != cVar2.b) {
                if (i == 1 || i == 0) {
                    g4b0 g4b0Var2 = c7qVar.c;
                    if (g4b0Var2 == null) {
                        g4b0 g4b0Var3 = c7qVar.b;
                        g4b0Var2 = g4b0Var3 != null ? g4b0Var3.a() : null;
                    }
                    if (g4b0Var2 != null) {
                        c7qVar.c = g4b0Var2;
                    }
                    c7qVar.e(c7qVar.a);
                }
            }
        }

        @Override // xsna.jza0.b
        public final void onIsPlayingChanged(boolean z) {
            c7q c7qVar = c7q.this;
            a aVar = c7qVar.h;
            g4b0 g4b0Var = c7qVar.b;
            if (g4b0Var != null) {
                if (!z) {
                    aVar.q0();
                    c7qVar.b();
                    return;
                }
                if (c7qVar.f.a.add(FirstSendEventManager.Event.PLAYING)) {
                    wi80.b(X3.i.f0, g4b0Var, Long.valueOf(SystemClock.elapsedRealtime() - g4b0Var.k), null);
                }
                androidx.media3.exoplayer.c cVar = c7qVar.a;
                long currentPosition = cVar != null ? cVar.getCurrentPosition() : 0L;
                tds0 tds0Var = aVar.b;
                tds0Var.a = currentPosition;
                tds0Var.b = currentPosition;
            }
        }

        @Override // xsna.jza0.b
        public final void onPlayWhenReadyChanged(boolean z, int i) {
            c7q c7qVar = c7q.this;
            androidx.media3.exoplayer.c cVar = c7qVar.a;
            if (cVar == null || cVar.getPlaybackState() != 3 || z) {
                return;
            }
            androidx.media3.exoplayer.c cVar2 = c7qVar.a;
            g4b0 g4b0Var = c7qVar.b;
            if (cVar2 == null || g4b0Var == null) {
                return;
            }
            wi80.b("pause", g4b0Var, Long.valueOf(cVar2.getCurrentPosition() / 1000), null);
        }

        @Override // xsna.jza0.b
        public final void onPlaybackStateChanged(int i) {
            androidx.media3.exoplayer.c cVar;
            c7q c7qVar = c7q.this;
            d dVar = c7qVar.j;
            Handler handler = c7qVar.i;
            if (i == 1) {
                c7qVar.c();
                g4b0 g4b0Var = c7qVar.b;
                if (g4b0Var != null) {
                    wi80.b("stop", g4b0Var, null, null);
                }
            } else if (i != 2) {
                if (i == 3) {
                    c7q.a(c7qVar);
                    g4b0 g4b0Var2 = c7qVar.b;
                    if (g4b0Var2 != null) {
                        if (c7qVar.f.a.add(FirstSendEventManager.Event.READY)) {
                            wi80.b("player_ready", g4b0Var2, Long.valueOf(SystemClock.elapsedRealtime() - g4b0Var2.k), null);
                        }
                    }
                }
            } else if (c7qVar.b != null) {
                if (c7qVar.e) {
                    c7qVar.d = SystemClock.elapsedRealtime();
                } else {
                    c7qVar.d = -1L;
                    c7qVar.e = true;
                }
            }
            if (i == 3 && (cVar = c7qVar.a) != null && cVar.getPlayWhenReady()) {
                handler.post(dVar);
            } else {
                handler.removeCallbacks(dVar);
            }
        }

        @Override // xsna.jza0.b
        public final void onPlayerError(PlaybackException playbackException) {
            g4b0 g4b0Var = c7q.this.b;
            if (g4b0Var != null) {
                wi80.b("content_error", g4b0Var, playbackException, null);
            }
        }
    }

    /* compiled from: ExoStatisticsListener.kt */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c7q c7qVar = c7q.this;
            androidx.media3.exoplayer.c cVar = c7qVar.a;
            if (cVar != null) {
                long currentPosition = cVar.getCurrentPosition();
                if (c7qVar.b != null) {
                    a aVar = c7qVar.h;
                    tds0 tds0Var = aVar.b;
                    long j = tds0Var.a;
                    if (j >= 0 && currentPosition > tds0Var.b) {
                        tds0Var.b = currentPosition;
                    }
                    if (currentPosition - j > 15000) {
                        aVar.q0();
                        tds0 tds0Var2 = aVar.b;
                        tds0Var2.a = currentPosition;
                        tds0Var2.b = currentPosition;
                    }
                }
                c7qVar.i.postDelayed(this, 1000L);
            }
        }
    }

    public static final void a(c7q c7qVar) {
        g4b0 g4b0Var = c7qVar.b;
        if (g4b0Var == null || c7qVar.d <= 0) {
            return;
        }
        wi80.b("empty_buffer", g4b0Var, Long.valueOf(SystemClock.elapsedRealtime() - c7qVar.d), null);
        c7qVar.d = -1L;
    }

    public final void b() {
        g4b0 g4b0Var = this.b;
        if (g4b0Var != null) {
            long andSet = this.g.getAndSet(0L);
            if (andSet > 0) {
                wi80.b("download_bytes", g4b0Var, Long.valueOf(andSet), null);
            }
        }
    }

    public final void c() {
        g4b0 g4b0Var = this.b;
        if (g4b0Var == null || this.d <= 0) {
            return;
        }
        wi80.b("close_at_empty_buffer", g4b0Var, Long.valueOf(SystemClock.elapsedRealtime() - this.d), null);
        this.d = -1L;
    }

    public final void d(ExoPlayer exoPlayer) {
        a aVar = this.h;
        if (exoPlayer != null) {
            long q0 = aVar.q0();
            if (q0 >= 0) {
                tds0 tds0Var = aVar.b;
                tds0Var.a = q0;
                tds0Var.b = q0;
            }
            b();
            c();
        }
        this.e = false;
        this.d = -1L;
        this.f.a.clear();
        this.g.set(0L);
        aVar.b.a();
        this.i.removeCallbacks(this.j);
    }

    public final void e(ExoPlayer exoPlayer) {
        d(exoPlayer);
        b();
        c();
        this.e = false;
        g4b0 g4b0Var = this.c;
        if (g4b0Var != null) {
            this.b = g4b0Var;
            this.c = null;
        }
        FirstSendEventManager firstSendEventManager = this.f;
        firstSendEventManager.a.clear();
        this.d = -1L;
        g4b0 g4b0Var2 = this.b;
        if (g4b0Var2 != null) {
            this.h.b.a();
            g4b0Var2.k = SystemClock.elapsedRealtime();
        }
        g4b0 g4b0Var3 = this.b;
        if (g4b0Var3 != null) {
            if (firstSendEventManager.a.add(FirstSendEventManager.Event.PLAY)) {
                wi80.c(g4b0Var3);
            }
        }
    }

    /* compiled from: ExoStatisticsListener.kt */
    public static final class c implements mjp0 {
        public c() {
        }

        @Override // xsna.mjp0
        public final void f(androidx.media3.datasource.a aVar, evk evkVar, boolean z, int i) {
            c7q.this.g.addAndGet(i);
        }

        @Override // xsna.mjp0
        public final void e(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        }

        @Override // xsna.mjp0
        public final void g(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        }

        @Override // xsna.mjp0
        public final void h(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        }
    }
}
