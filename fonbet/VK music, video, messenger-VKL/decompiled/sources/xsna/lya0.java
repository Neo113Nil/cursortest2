package xsna;

import android.os.SystemClock;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.session.playback.PlaybackException;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import java.lang.Thread;
import java.nio.ByteBuffer;
import xsna.qpa0;
import xsna.qva0;

/* compiled from: PlaybackSession.kt */
/* loaded from: classes3.dex */
public final class lya0 implements tsi0 {
    public final csp a;
    public Timeline b;
    public final nfq c;
    public final xsw d;
    public final xu10 e;
    public final a f;
    public final ju4 g;
    public volatile mwa0 h;
    public volatile g330 i;
    public volatile boolean j;
    public final aza0 k;

    /* compiled from: PlaybackSession.kt */
    public final class a implements qva0 {
        public a() {
        }

        @Override // xsna.qva0
        public final qva0.a a(long j) {
            lya0 lya0Var = lya0.this;
            aza0 aza0Var = lya0Var.k;
            if (aza0Var != null) {
                aza0Var.l = null;
                aza0Var.m = Long.valueOf(SystemClock.elapsedRealtime());
            }
            mwa0 mwa0Var = lya0Var.h;
            qva0.a a = mwa0Var != null ? mwa0Var.a(j) : null;
            aza0 aza0Var2 = lya0Var.k;
            if (aza0Var2 != null) {
                aza0Var2.l = Long.valueOf(aza0.h(aza0Var2.m));
                aza0Var2.m = null;
            }
            return a;
        }

        @Override // xsna.qva0
        public final void b(long j) {
            mwa0 mwa0Var = lya0.this.h;
            if (mwa0Var != null) {
                mwa0Var.b(j);
            }
        }

        @Override // xsna.qva0
        public final int c() {
            mwa0 mwa0Var = lya0.this.h;
            if (mwa0Var != null) {
                return mwa0Var.o;
            }
            return 0;
        }

        @Override // xsna.qva0
        public final int d() {
            mwa0 mwa0Var = lya0.this.h;
            if (mwa0Var != null) {
                return mwa0Var.p;
            }
            return 0;
        }

        @Override // xsna.qva0
        public final ByteBuffer e(int i, int i2) {
            lya0 lya0Var = lya0.this;
            aza0 aza0Var = lya0Var.k;
            if (aza0Var != null) {
                aza0Var.n = null;
                aza0Var.o = Long.valueOf(SystemClock.elapsedRealtime());
            }
            mwa0 mwa0Var = lya0Var.h;
            ByteBuffer e = mwa0Var != null ? mwa0Var.e(i, i2) : null;
            aza0 aza0Var2 = lya0Var.k;
            if (aza0Var2 != null) {
                if (aza0Var2.b == null) {
                    aza0Var2.b = Long.valueOf(SystemClock.elapsedRealtime() - aza0Var2.a);
                }
                aza0Var2.n = Long.valueOf(aza0.h(aza0Var2.o));
                aza0Var2.o = null;
            }
            return e;
        }

        public final void f(Timeline timeline) {
            lya0 lya0Var = lya0.this;
            l0h0 l0h0Var = new l0h0(lya0Var.a, lya0Var.g, false);
            lya0 lya0Var2 = lya0.this;
            mwa0 mwa0Var = new mwa0(lya0Var2.a, timeline, l0h0Var, lya0Var2.c, lya0Var2.g, lya0Var2.k, lya0Var2.e, lya0Var2.d);
            mwa0Var.init();
            lya0Var2.h = mwa0Var;
        }

        @Override // xsna.qva0
        public final long getDurationUs() {
            mwa0 mwa0Var = lya0.this.h;
            if (mwa0Var != null) {
                return mwa0Var.n;
            }
            return 0L;
        }

        @Override // xsna.qva0
        public final int getHeight() {
            mwa0 mwa0Var = lya0.this.h;
            if (mwa0Var != null) {
                return mwa0Var.getHeight();
            }
            return 0;
        }

        @Override // xsna.qva0
        public final int getWidth() {
            mwa0 mwa0Var = lya0.this.h;
            if (mwa0Var != null) {
                return mwa0Var.getWidth();
            }
            return 0;
        }

        @Override // xsna.qva0
        public final boolean init() {
            final lya0 lya0Var = lya0.this;
            try {
                mwa0 mwa0Var = lya0Var.h;
                if (mwa0Var == null) {
                    Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: xsna.kya0
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        public final void uncaughtException(Thread thread, Throwable th) {
                            PlaybackException playbackException = new PlaybackException("PlaybackSession " + thread, th);
                            lya0 lya0Var2 = lya0.this;
                            xu10 xu10Var = lya0Var2.e;
                            if (xu10Var != null) {
                                xu10Var.a(new awa0(playbackException));
                            }
                            f100 f100Var = lya0Var2.a.d;
                            if (f100Var != null) {
                                f100Var.a("PlaybackSession", playbackException);
                            }
                        }
                    });
                    f(lya0Var.b);
                    return true;
                }
                g330 g330Var = lya0Var.i;
                if (g330Var == null) {
                    return true;
                }
                try {
                    f100 f100Var = lya0Var.a.d;
                    if (f100Var != null) {
                        f100Var.i("PlaybackSession", "start update model for diff: " + g330Var);
                    }
                    mwa0Var.i(g330Var);
                    f100 f100Var2 = lya0Var.a.d;
                    if (f100Var2 != null) {
                        f100Var2.i("PlaybackSession", "model updated");
                    }
                    lya0Var.i = null;
                    return true;
                } finally {
                }
            } catch (Throwable th) {
                xu10 xu10Var = lya0Var.e;
                if (xu10Var != null) {
                    xu10Var.a(new awa0(th));
                }
                f100 f100Var3 = lya0Var.a.d;
                if (f100Var3 == null) {
                    return false;
                }
                f100Var3.a("PlaybackSession", th);
                return false;
            }
        }

        @Override // xsna.qva0
        public final void release() {
            aza0 aza0Var;
            if (lya0.this.j) {
                mwa0 mwa0Var = lya0.this.h;
                if (mwa0Var != null) {
                    mwa0Var.release();
                }
                try {
                    lya0 lya0Var = lya0.this;
                    if (lya0Var.e == null || (aza0Var = lya0Var.k) == null) {
                        return;
                    }
                    mya0 g = aza0Var.g();
                    lya0.this.e.d(g);
                    f100 f100Var = lya0.this.a.d;
                    if (f100Var != null) {
                        f100Var.i("PlaybackSession", "Release playback session. Stat: " + g);
                    }
                } catch (Throwable th) {
                    xu10 xu10Var = lya0.this.e;
                    if (xu10Var != null) {
                        xu10Var.a(new awa0(th));
                    }
                }
            }
        }

        @Override // xsna.qva0
        public final qva0.a v(int i) {
            lya0 lya0Var = lya0.this;
            aza0 aza0Var = lya0Var.k;
            if (aza0Var != null) {
                aza0Var.l = null;
                aza0Var.m = Long.valueOf(SystemClock.elapsedRealtime());
            }
            mwa0 mwa0Var = lya0Var.h;
            qva0.a v = mwa0Var != null ? mwa0Var.v(i) : null;
            aza0 aza0Var2 = lya0Var.k;
            if (aza0Var2 != null) {
                aza0Var2.l = Long.valueOf(aza0.h(aza0Var2.m));
                aza0Var2.m = null;
            }
            return v;
        }
    }

    public lya0(csp cspVar, Timeline timeline, nfq nfqVar, xsw xswVar, xu10 xu10Var) {
        this.a = cspVar;
        this.b = timeline;
        this.c = nfqVar;
        this.d = xswVar;
        this.e = xu10Var;
        new qpa0.d(true);
        this.g = new ju4();
        this.k = xu10Var == null ? null : new aza0();
        f100 f100Var = cspVar.d;
        if (f100Var != null) {
            f100Var.i("PlaybackSession", "create PlaybackSession with timeline: " + this.b);
        }
        this.f = new a();
    }

    @Override // xsna.tsi0
    public final zu10 a(Throwable th) {
        return ((ErrorStatBuilder) this.g.b).b(th);
    }
}
