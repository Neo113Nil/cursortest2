package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.music.player.playback.PlayableType;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cz40;
import xsna.fx40;
import xsna.hr90;
import xsna.kw40;
import xsna.ry40;

/* compiled from: MusicPlayerStateControllerImpl.kt */
/* loaded from: classes3.dex */
public final class ty40 {
    public final cz40 a;
    public final Context b;
    public final fx40.a c;
    public final ct4 d;
    public ry40 e = ry40.c.d;
    public boolean f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final y6x0 l;
    public nw40 m;
    public uy40 n;
    public kx40 o;
    public px40 p;
    public qxo0 q;
    public Boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public ky40 v;
    public long w;
    public boolean x;
    public long y;

    /* compiled from: MusicPlayerStateControllerImpl.kt */
    public final class a implements Runnable {
        public final AudioPlayer b;
        public final long c;
        public boolean d = true;
        public int e;

        public a(AudioPlayer audioPlayer, long j) {
            this.b = audioPlayer;
            this.c = j;
        }

        public final void a(boolean z) {
            AudioPlayer audioPlayer = this.b;
            int bufferedPercentage = audioPlayer.getBufferedPercentage();
            int i = this.e;
            ty40 ty40Var = ty40.this;
            if (i == bufferedPercentage && epx.f(ty40Var.r, Boolean.valueOf(z))) {
                return;
            }
            this.e = bufferedPercentage;
            ty40Var.g(z);
            ty40Var.j(new ry40.a.b(ty40Var.b(), bufferedPercentage, z));
            ty40Var.r = Boolean.valueOf(z);
            if (bufferedPercentage == 100) {
                ty40Var.j(new ry40.a.C3641a(ty40Var.b(), z));
                ty40Var.s = true;
            }
            px40 px40Var = ty40Var.p;
            if (px40Var != null) {
                px40Var.n(ty40Var.a, bufferedPercentage, audioPlayer.a());
            }
        }

        /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // java.lang.Runnable
        public final void run() {
            long currentPosition;
            kw40 g;
            ty40 ty40Var = ty40.this;
            cz40 cz40Var = ty40Var.a;
            AudioPlayer audioPlayer = this.b;
            boolean playWhenReady = audioPlayer.getPlayWhenReady();
            boolean isReady = audioPlayer.isReady();
            if (!isReady) {
                this.d = true;
            }
            if (!isReady || !playWhenReady) {
                if (audioPlayer.d()) {
                    boolean z = !playWhenReady;
                    ty40Var.g(z);
                    a(z);
                    return;
                }
                return;
            }
            if (audioPlayer.e()) {
                currentPosition = ty40Var.y + this.c;
                ty40Var.y = currentPosition;
            } else {
                currentPosition = audioPlayer.getCurrentPosition();
            }
            long j = ty40Var.o.c.b;
            if (j == -1 || j <= 0 || currentPosition <= j) {
                p4b0 b = ty40Var.b();
                ky40 c = ty40Var.c(audioPlayer);
                boolean a = ty40Var.c.e.a();
                long j2 = a ? currentPosition - c.c : currentPosition;
                long j3 = a ? c.e : c.b;
                if (this.d) {
                    lw40 lw40Var = (lw40) ty40Var.h.getValue();
                    nw40 nw40Var = ty40Var.m;
                    rfc a2 = fpf0.a(kw40.b.class);
                    if (a2.equals(fpf0.a(kw40.b.class))) {
                        g = ((hy40) lw40Var.a.getValue()).g(nw40Var);
                    } else if (a2.equals(fpf0.a(kw40.a.class))) {
                        g = ((cy40) lw40Var.b.getValue()).g(nw40Var);
                    } else {
                        if (!a2.equals(fpf0.a(kw40.c.class))) {
                            throw new IllegalStateException(("Unknown music player event " + fpf0.a(kw40.b.class)).toString());
                        }
                        g = ((zy40) lw40Var.c.getValue()).g(nw40Var);
                    }
                    ty40Var.j(new ry40.e.b((kw40.b) g, b, j3));
                    ty40Var.x = false;
                    this.d = false;
                }
                ty40Var.j(new ry40.e.a(b, j3, j2));
                px40 px40Var = ty40Var.p;
                if (px40Var != null) {
                    px40Var.i(new ly40(cz40Var, j2, ((n1v) ty40Var.i.getValue()).b(currentPosition, b, ty40Var.m)));
                }
            } else {
                boolean playWhenReady2 = audioPlayer.getPlayWhenReady();
                ty40Var.e(26);
                if (playWhenReady2) {
                    ty40Var.j(new ry40.b(ty40Var.b()));
                }
                px40 px40Var2 = ty40Var.p;
                if (px40Var2 != null) {
                    px40Var2.l(cz40Var);
                }
            }
            a(false);
        }
    }

    /* compiled from: MusicPlayerStateControllerImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioPlayer.State.values().length];
            try {
                iArr[AudioPlayer.State.ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioPlayer.State.BUFFERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioPlayer.State.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioPlayer.State.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioPlayer.State.IDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ty40(cz40 cz40Var, Context context, fx40.a aVar, ct4 ct4Var) {
        this.a = cz40Var;
        this.b = context;
        this.c = aVar;
        this.d = ct4Var;
        k7y k7yVar = new k7y(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, k7yVar);
        this.h = msy.a(lazyThreadSafetyMode, new x5(28));
        int i = 26;
        this.i = msy.a(lazyThreadSafetyMode, new re0(i));
        this.j = msy.a(lazyThreadSafetyMode, new t2l(this, i));
        this.k = msy.a(lazyThreadSafetyMode, new te0(27));
        this.l = new y6x0();
        this.m = new nw40(0);
        this.n = new uy40(0);
        this.o = new kx40(null, null, null, null, null, false, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        this.s = true;
        this.v = ky40.f;
        this.x = true;
    }

    public final long a() {
        boolean z = this.f;
        ct4 ct4Var = this.d;
        if (z && ct4Var.a().e()) {
            return this.y;
        }
        if (this.f) {
            return ct4Var.a().getCurrentPosition();
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final p4b0 b() {
        boolean z = this.a instanceof cz40.a;
        n4b0 n4b0Var = z ? new n4b0(this.n.b) : (n4b0) n4b0.b.getValue();
        uy40 uy40Var = this.n;
        MusicTrack musicTrack = uy40Var.a;
        PlayableType playableType = uy40Var.c.d;
        boolean z2 = uy40Var.d;
        long duration = this.f ? this.d.a().getDuration() : 0L;
        PlaybackLaunchMeta playbackLaunchMeta = this.n.c;
        return new p4b0(z, new q4b0(musicTrack, playableType, z2, duration, new r4b0(playbackLaunchMeta.b, playbackLaunchMeta.c, playbackLaunchMeta.f, playbackLaunchMeta.e)), n4b0Var, this.x ? this.w : 0L);
    }

    public final ky40 c(AudioPlayer audioPlayer) {
        if (!epx.f(this.v, ky40.f)) {
            return this.v;
        }
        wva0 wva0Var = this.o.c;
        long j = wva0Var.b;
        if (j == -1 || j <= 0) {
            j = audioPlayer.getDuration();
        }
        long j2 = j;
        ky40 ky40Var = new ky40(this.a, audioPlayer.getDuration(), wva0Var.c, j2);
        this.v = ky40Var;
        return ky40Var;
    }

    public final boolean d() {
        kw40.a aVar;
        ry40 ry40Var = this.e;
        ry40.c cVar = ry40.c.d;
        int i = ry40Var.b;
        if (i - cVar.b <= 0 || epx.g(i, 70) >= 0) {
            return false;
        }
        ry40 ry40Var2 = this.e;
        hr90 hr90Var = null;
        ry40.d dVar = ry40Var2 instanceof ry40.d ? (ry40.d) ry40Var2 : null;
        if (dVar != null && (aVar = dVar.d) != null) {
            hr90Var = aVar.b;
        }
        return !epx.f(hr90Var, hr90.a.a);
    }

    public final void e(int i) {
        l(i, SystemClock.elapsedRealtime(), a(), this.m.a);
        if (this.f) {
            this.d.a().setPlayWhenReady(false);
        } else {
            this.u = true;
        }
        qxo0 qxo0Var = this.q;
        if (qxo0Var != null) {
            ju4 ju4Var = qxo0Var.c;
            ((Handler) ju4Var.a).removeCallbacks((Runnable) ju4Var.b);
        }
        this.q = null;
        y6x0 y6x0Var = this.l;
        yok0 yok0Var = y6x0Var.e;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        y6x0Var.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i) {
        boolean z;
        kw40.a aVar;
        rfc a2;
        kw40 g;
        yok0 yok0Var;
        qxo0 qxo0Var;
        boolean d = d();
        boolean z2 = i == 30 || i == 28;
        if (i == 32 || i == 34 || i == 12 || i == 36) {
            ry40 ry40Var = this.e;
            ry40.d dVar = ry40Var instanceof ry40.d ? (ry40.d) ry40Var : null;
            if (epx.f((dVar == null || (aVar = dVar.d) == null) ? null : aVar.b, hr90.a.a) || this.e.h()) {
                z = true;
                if (!d && i != -99 && (i < 0 || i == 9)) {
                    i = 33;
                } else if (!d && !z && !z2) {
                    i = 26;
                }
                l(i, SystemClock.elapsedRealtime(), a(), this.m.a);
                lw40 lw40Var = (lw40) this.h.getValue();
                nw40 nw40Var = this.m;
                a2 = fpf0.a(kw40.c.class);
                if (!a2.equals(fpf0.a(kw40.b.class))) {
                    g = ((hy40) lw40Var.a.getValue()).g(nw40Var);
                } else if (a2.equals(fpf0.a(kw40.a.class))) {
                    g = ((cy40) lw40Var.b.getValue()).g(nw40Var);
                } else {
                    if (!a2.equals(fpf0.a(kw40.c.class))) {
                        throw new IllegalStateException(("Unknown music player event " + fpf0.a(kw40.c.class)).toString());
                    }
                    g = ((zy40) lw40Var.c.getValue()).g(nw40Var);
                }
                j(new ry40.f((kw40.c) g, b()));
                this.f = false;
                this.r = null;
                this.s = true;
                ((m8x0) this.g.getValue()).a(10000L);
                y6x0 y6x0Var = this.l;
                yok0Var = y6x0Var.e;
                if (yok0Var != null) {
                    yok0Var.b(null);
                }
                y6x0Var.e = null;
                qxo0Var = this.q;
                if (qxo0Var != null) {
                    ju4 ju4Var = qxo0Var.c;
                    ((Handler) ju4Var.a).removeCallbacks((Runnable) ju4Var.b);
                }
                this.q = null;
                this.y = 0L;
            }
        }
        z = false;
        if (!d) {
        }
        if (!d) {
            i = 26;
        }
        l(i, SystemClock.elapsedRealtime(), a(), this.m.a);
        lw40 lw40Var2 = (lw40) this.h.getValue();
        nw40 nw40Var2 = this.m;
        a2 = fpf0.a(kw40.c.class);
        if (!a2.equals(fpf0.a(kw40.b.class))) {
        }
        j(new ry40.f((kw40.c) g, b()));
        this.f = false;
        this.r = null;
        this.s = true;
        ((m8x0) this.g.getValue()).a(10000L);
        y6x0 y6x0Var2 = this.l;
        yok0Var = y6x0Var2.e;
        if (yok0Var != null) {
        }
        y6x0Var2.e = null;
        qxo0Var = this.q;
        if (qxo0Var != null) {
        }
        this.q = null;
        this.y = 0L;
    }

    public final void g(boolean z) {
        if (this.s) {
            j(new ry40.a.c(10, b(), 0, z));
            this.s = false;
            this.r = Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void h() {
        kw40 g;
        this.r = Boolean.TRUE;
        if (this.e instanceof ry40.a.c) {
            j(new ry40.a.C3641a(b(), true));
            this.s = true;
        }
        lw40 lw40Var = (lw40) this.h.getValue();
        nw40 nw40Var = this.m;
        rfc a2 = fpf0.a(kw40.a.class);
        if (a2.equals(fpf0.a(kw40.b.class))) {
            g = ((hy40) lw40Var.a.getValue()).g(nw40Var);
        } else if (a2.equals(fpf0.a(kw40.a.class))) {
            g = ((cy40) lw40Var.b.getValue()).g(nw40Var);
        } else {
            if (!a2.equals(fpf0.a(kw40.c.class))) {
                throw new IllegalStateException(("Unknown music player event " + fpf0.a(kw40.a.class)).toString());
            }
            g = ((zy40) lw40Var.c.getValue()).g(nw40Var);
        }
        j(new ry40.d((kw40.a) g, b()));
    }

    public final void i(boolean z) {
        ct4 ct4Var = this.d;
        AudioPlayer a2 = ct4Var.c() ? ct4Var.a() : null;
        if (a2 == null) {
            return;
        }
        a2.setPlayWhenReady(z);
        y6x0 y6x0Var = this.l;
        if (z) {
            k();
            y6x0Var.b();
            return;
        }
        qxo0 qxo0Var = this.q;
        if (qxo0Var != null) {
            ju4 ju4Var = qxo0Var.c;
            ((Handler) ju4Var.a).removeCallbacks((Runnable) ju4Var.b);
        }
        this.q = null;
        yok0 yok0Var = y6x0Var.e;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        y6x0Var.e = null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void j(ry40 ry40Var) {
        bn40 bn40Var = bn40.a;
        boolean c = ry40Var.c();
        tzv tzvVar = new tzv(ry40Var, 14);
        bn40Var.getClass();
        if (c) {
            bn40.c.invoke("MusicPlayerStateController", tzvVar);
        } else {
            L.n("MusicPlayerStateController", tzvVar);
        }
        this.e = ry40Var;
        boolean j = ry40Var.j();
        ?? r1 = this.g;
        if (j) {
            m8x0 m8x0Var = (m8x0) r1.getValue();
            PowerManager.WakeLock wakeLock = m8x0Var.a;
            if (!wakeLock.isHeld()) {
                L.l(new String[0]);
                wakeLock.acquire();
            }
            ju4 ju4Var = m8x0Var.b;
            if (ju4Var != null) {
                ((Handler) ju4Var.a).removeCallbacks((Runnable) ju4Var.b);
                m8x0Var.b = null;
            }
        } else {
            ((m8x0) r1.getValue()).a(10000L);
        }
        px40 px40Var = this.p;
        if (px40Var != null) {
            px40Var.a(ry40Var);
        }
        ((w0q) this.j.getValue()).a(ry40Var);
    }

    public final void k() {
        if (this.q == null) {
            long j = this.c.a;
            qxo0 qxo0Var = new qxo0(j, new a(this.d.a(), j));
            qxo0Var.c.b(0L);
            this.q = qxo0Var;
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void l(int i, long j, long j2, long j3) {
        this.m.getClass();
        this.m = new nw40(i, j2, j3, j);
        ((n1v) this.i.getValue()).a(j2);
    }
}
