package xsna;

import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audiomsg.player.SpeakerType;
import com.vk.audiomsg.player.Speed;
import com.vk.audiomsg.player.trackplayer.oggtrackplayer.PlayState;
import com.vk.medianative.AudioNative;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.cw70;
import xsna.hil;
import xsna.i4b0;

/* compiled from: OggTrackPlayer.kt */
/* loaded from: classes.dex */
public final class kw70 implements sgp0 {
    public final wel a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ThreadPoolExecutor c;
    public int d;
    public volatile int e;
    public int f;
    public int g;
    public final cw70 h;
    public cw70.a i;
    public final CountDownLatch j;
    public final Object k;
    public final CopyOnWriteArrayList<tgp0> l;
    public final i4b0 m;
    public boolean n;
    public Future<?> o;
    public long p;

    /* compiled from: OggTrackPlayer.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public final Uri a;
        public final File b;

        public a(Uri uri, File file) {
            this.a = uri;
            this.b = file;
        }

        public final File a() {
            return this.b;
        }
    }

    /* compiled from: OggTrackPlayer.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayState.values().length];
            try {
                iArr[PlayState.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayState.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kw70(wel welVar) {
        this.a = welVar;
        final String simpleName = kw70.class.getSimpleName();
        this.c = new ThreadPoolExecutor(1, 1, TimeUnit.SECONDS.toMillis(10L), TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: xsna.iw70
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, simpleName);
                thread.setPriority(10);
                return thread;
            }
        });
        this.d = -2;
        this.e = 1;
        this.h = new cw70();
        this.j = new CountDownLatch(1);
        this.k = new Object();
        this.l = new CopyOnWriteArrayList<>();
        this.m = new i4b0();
    }

    public static final void l(kw70 kw70Var) {
        synchronized (kw70Var.k) {
            try {
                if (!kw70Var.n) {
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                kw70Var.n = false;
                Future<?> future = kw70Var.o;
                if (future != null) {
                    future.cancel(true);
                }
                kw70Var.o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.sgp0
    public final void a(lza0 lza0Var, float f) {
        kw70 kw70Var;
        synchronized (this.k) {
            try {
                n();
                i4b0 i4b0Var = this.m;
                ur4 ur4Var = i4b0Var.a.a;
                float f2 = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                if (ur4Var != null) {
                    i4b0.a aVar = i4b0Var.a;
                    if (aVar.d != f2) {
                        aVar.d = f2;
                        i4b0Var.b.b = Float.valueOf(f2);
                        kw70Var = this;
                        try {
                            u(new jw70(kw70Var, lza0Var, ur4Var, f, true));
                            kw70Var.k.notifyAll();
                            s3q0 s3q0Var = s3q0.a;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
                kw70Var = this;
                kw70Var.k.notifyAll();
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // xsna.sgp0
    public final ur4 b() {
        ur4 ur4Var;
        synchronized (this.k) {
            n();
            ur4Var = this.m.a.a;
        }
        return ur4Var;
    }

    @Override // xsna.sgp0
    public final void c(bgk0 bgk0Var, Speed speed) {
        synchronized (this.k) {
            try {
                n();
                i4b0 i4b0Var = this.m;
                i4b0.a aVar = i4b0Var.a;
                if (aVar.f != speed) {
                    aVar.f = speed;
                    i4b0Var.b.d = speed;
                    u(new m9(this, bgk0Var, speed));
                }
                this.k.notifyAll();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.sgp0
    public final void d(bgk0 bgk0Var, SpeakerType speakerType) {
        synchronized (this.k) {
            try {
                n();
                i4b0 i4b0Var = this.m;
                i4b0.a aVar = i4b0Var.a;
                if (aVar.g != speakerType) {
                    aVar.g = speakerType;
                    i4b0Var.b.e = speakerType;
                    u(new nk0(this, bgk0Var, speakerType));
                }
                this.k.notifyAll();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.sgp0
    public final void e(lza0 lza0Var) {
        j(lza0Var);
        this.j.await();
    }

    @Override // xsna.sgp0
    public final SpeakerType f() {
        SpeakerType speakerType;
        synchronized (this.k) {
            n();
            speakerType = this.m.a.g;
        }
        return speakerType;
    }

    @Override // xsna.sgp0
    public final void g(hil.b bVar) {
        this.l.add(bVar);
    }

    @Override // xsna.sgp0
    public final float getVolume() {
        float f;
        synchronized (this.k) {
            n();
            f = this.m.a.e;
        }
        return f;
    }

    @Override // xsna.sgp0
    public final void h(bgk0 bgk0Var, ur4 ur4Var) {
        synchronized (this.k) {
            try {
                n();
                i4b0 i4b0Var = this.m;
                if (!epx.f(i4b0Var.a.a, ur4Var)) {
                    if (i4b0Var.a.a != null) {
                        k(sgk0.a);
                    }
                    i4b0Var.a.a = ur4Var;
                    u(new yu1(this, bgk0Var, ur4Var));
                }
                this.k.notifyAll();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.sgp0
    public final void i(final bgk0 bgk0Var, float f) {
        synchronized (this.k) {
            n();
            i4b0 i4b0Var = this.m;
            final float f2 = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            i4b0.a aVar = i4b0Var.a;
            if (aVar.e != f2) {
                aVar.e = f2;
                i4b0Var.b.c = Float.valueOf(f2);
                u(new izs(this) { // from class: xsna.hw70
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        ((tgp0) obj).a(bgk0Var, f2);
                        return s3q0.a;
                    }
                });
            }
            this.k.notifyAll();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.sgp0
    public final boolean isLoading() {
        boolean z;
        synchronized (this.k) {
            n();
            z = this.m.a.b;
        }
        return z;
    }

    @Override // xsna.sgp0
    public final boolean isPaused() {
        boolean z;
        synchronized (this.k) {
            n();
            z = this.m.a.c == PlayState.PAUSE;
        }
        return z;
    }

    @Override // xsna.sgp0
    public final boolean isPlaying() {
        boolean z;
        synchronized (this.k) {
            n();
            z = this.m.a.c == PlayState.PLAY;
        }
        return z;
    }

    @Override // xsna.sgp0
    public final void j(lza0 lza0Var) {
        synchronized (this.k) {
            try {
                if (!this.m.a.h) {
                    h(lza0Var, null);
                    this.m.a.h = true;
                    this.c.submit(new sm9(this, 11));
                    this.c.shutdown();
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0016, code lost:
    
        if (r0 == com.vk.audiomsg.player.trackplayer.oggtrackplayer.PlayState.PAUSE) goto L14;
     */
    @Override // xsna.sgp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(bgk0 bgk0Var) {
        Throwable th;
        kw70 kw70Var;
        synchronized (this.k) {
            try {
                n();
                i4b0.a aVar = this.m.a;
                ur4 ur4Var = aVar.a;
                if (ur4Var != null) {
                    PlayState playState = aVar.c;
                    if (playState != PlayState.PLAY) {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    l(this);
                    i4b0.a aVar2 = this.m.a;
                    aVar2.b = false;
                    aVar2.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    aVar2.c = PlayState.STOP;
                    kw70Var = this;
                    try {
                        u(new jw70(kw70Var, bgk0Var, ur4Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true));
                        u(new defpackage.y(this, bgk0Var, ur4Var));
                        kw70Var.k.notifyAll();
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                kw70Var = this;
                kw70Var.k.notifyAll();
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // xsna.sgp0
    public final boolean m() {
        boolean z;
        synchronized (this.k) {
            n();
            z = this.m.a.c == PlayState.COMPLETE;
        }
        return z;
    }

    public final void n() {
        synchronized (this.k) {
            if (this.m.a.h) {
                throw new IllegalStateException("Player is released");
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.sgp0
    public final float o() {
        float f;
        synchronized (this.k) {
            n();
            f = this.m.a.d;
        }
        return f;
    }

    @Override // xsna.sgp0
    public final void p(bgk0 bgk0Var) {
        synchronized (this.k) {
            try {
                n();
                i4b0 i4b0Var = this.m;
                i4b0.a aVar = i4b0Var.a;
                ur4 ur4Var = aVar.a;
                PlayState playState = aVar.c;
                PlayState playState2 = PlayState.PLAY;
                if (playState != playState2 && ur4Var != null) {
                    aVar.c = playState2;
                    i4b0Var.b.a = playState2;
                    synchronized (this.k) {
                        if (this.n) {
                            s3q0 s3q0Var = s3q0.a;
                        } else {
                            this.n = true;
                            this.o = this.c.submit(new f2l(3, this, ur4Var));
                        }
                    }
                    u(new h1(this, bgk0Var, ur4Var));
                }
                this.k.notifyAll();
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.sgp0
    public final void q(bgk0 bgk0Var) {
        synchronized (this.k) {
            try {
                n();
                i4b0 i4b0Var = this.m;
                i4b0.a aVar = i4b0Var.a;
                ur4 ur4Var = aVar.a;
                if (ur4Var != null && aVar.c == PlayState.PLAY) {
                    PlayState playState = PlayState.PAUSE;
                    aVar.c = playState;
                    i4b0Var.b.a = playState;
                    u(new n9(this, bgk0Var, ur4Var));
                }
                this.k.notifyAll();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(ur4 ur4Var, boolean z) {
        synchronized (this.k) {
            try {
                n();
                if (epx.f(this.m.a.a, ur4Var)) {
                    this.m.a.b = z;
                }
                this.k.notifyAll();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(ur4 ur4Var, Throwable th) {
        synchronized (this.k) {
            try {
                n();
                i4b0 i4b0Var = this.m;
                if (epx.f(i4b0Var.a.a, ur4Var)) {
                    PlayState playState = i4b0Var.a.c;
                    if (playState != PlayState.PLAY) {
                        if (playState == PlayState.PAUSE) {
                        }
                    }
                    l(this);
                    i4b0.a aVar = this.m.a;
                    aVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    aVar.c = PlayState.STOP;
                    u(new tn0(this, ur4Var, th));
                }
                this.k.notifyAll();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a t(ur4 ur4Var) {
        Object obj;
        Object obj2;
        Collection<Uri> b2 = ur4Var.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : b2) {
            if (epx.f(((Uri) obj3).getScheme(), X3.i.b)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            arrayList2.add(new a(uri, new File(uri.getPath())));
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            a aVar = (a) obj;
            if (aVar.a().isFile() && aVar.a().canRead()) {
                break;
            }
        }
        a aVar2 = (a) obj;
        if (aVar2 != null) {
            return aVar2;
        }
        Iterator<T> it3 = ur4Var.b().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            if (!epx.f(((Uri) obj2).getScheme(), X3.i.b)) {
                break;
            }
        }
        Uri uri2 = (Uri) obj2;
        if (uri2 == null) {
            return null;
        }
        try {
            r(ur4Var, true);
            u(new il7(this, ur4Var, uri2));
            File a2 = this.a.a(uri2, uri2.toString());
            u(new mm1(this, ur4Var, uri2));
            r(ur4Var, false);
            return new a(uri2, a2);
        } catch (Throwable th) {
            u(new zu1(this, ur4Var, uri2, th));
            r(ur4Var, false);
            throw th;
        }
    }

    public final void u(izs<? super tgp0, s3q0> izsVar) {
        Iterator<tgp0> it = this.l.iterator();
        while (it.hasNext()) {
            tgp0 next = it.next();
            this.b.postAtTime(new n93(new ig1(22, izsVar, next), 6), next, SystemClock.uptimeMillis());
        }
    }

    public final AudioTrack v(i4b0.a aVar, long j) {
        int i;
        AudioTrack a2;
        do {
            SpeakerType speakerType = aVar.g;
            int minBufferSize = AudioTrack.getMinBufferSize(48000, 4, 2);
            if (minBufferSize == -2) {
                i = 0;
            } else {
                this.f = 2;
                int i2 = minBufferSize * 4 * this.e;
                long j2 = 48000;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long b2 = an10.b(swe0.g(i2, ((int) ((250000 * j2) / timeUnit.toMicros(1L))) * 2, Math.max(minBufferSize, ((int) ((1000000 * j2) / timeUnit.toMicros(1L))) * 2)) * 2.0f);
                long j3 = 2;
                long j4 = b2 / j3;
                if (j4 > j) {
                    j4 = j;
                }
                i = (int) (j4 * j3);
            }
            this.d = i;
            this.i = new cw70.a(new byte[i]);
            a2 = qz4.a(speakerType, i);
            int i3 = b.$EnumSwitchMapping$0[aVar.c.ordinal()];
            if (i3 == 1) {
                a2.play();
            } else if (i3 == 2) {
                a2.pause();
            }
            cw70 cw70Var = this.h;
            float f = aVar.d;
            synchronized (cw70Var) {
                AudioNative.audioSeekOpusFile(f);
            }
            a2.setVolume(aVar.e);
            this.g = 0;
            if (!x(a2, aVar.f)) {
                a2 = null;
            }
        } while (a2 == null);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w(AudioTrack audioTrack, ur4 ur4Var) {
        boolean z;
        boolean z2;
        audioTrack.play();
        cw70 cw70Var = this.h;
        int i = this.d;
        cw70.a aVar = this.i;
        if (aVar == null) {
            aVar = null;
        }
        synchronized (cw70Var) {
            if (aVar.a().length < i) {
                throw new IllegalArgumentException("Expect buffer capacity >= bytes to read. Buffer capacity: " + aVar.a().length + ". Bytes to read: " + i);
            }
            ByteBuffer byteBuffer = cw70Var.a;
            if (byteBuffer == null || byteBuffer.capacity() < i) {
                byteBuffer = ByteBuffer.allocateDirect(i);
                cw70Var.a = byteBuffer;
            }
            byteBuffer.rewind();
            AudioNative.audioReadOpusFile(byteBuffer, i, cw70Var.b);
            z = 0;
            z2 = false;
            z2 = false;
            z2 = false;
            z2 = false;
            aVar.e(cw70Var.b[0]);
            aVar.g(cw70Var.b[1] / AudioNative.audioGetTotalPcmDuration());
            aVar.f(cw70Var.b[2] == 1);
            if (aVar.b() > 0) {
                byteBuffer.rewind();
                byteBuffer.get(aVar.a());
            }
        }
        cw70.a aVar2 = this.i;
        if (aVar2 == null) {
            aVar2 = null;
        }
        if (aVar2.b() > 0) {
            cw70.a aVar3 = this.i;
            if (aVar3 == null) {
                aVar3 = null;
            }
            byte[] a2 = aVar3.a();
            cw70.a aVar4 = this.i;
            if (aVar4 == null) {
                aVar4 = null;
            }
            int write = audioTrack.write(a2, 0, aVar4.b());
            if (write < 0) {
                throw new IOException(lhg.a(write, "Unexpected error during pcm writing to AudioTrack: "));
            }
            this.g += write;
            cw70.a aVar5 = this.i;
            if (aVar5 == null) {
                aVar5 = null;
            }
            float d = aVar5.d();
            synchronized (this.k) {
                try {
                    n();
                    i4b0 i4b0Var = this.m;
                    if (epx.f(i4b0Var.a.a, ur4Var) && i4b0Var.b.b == null) {
                        i4b0.a aVar6 = i4b0Var.a;
                        if (aVar6.d != d) {
                            PlayState playState = aVar6.c;
                            if (playState != PlayState.PLAY) {
                                if (playState == PlayState.PAUSE) {
                                }
                            }
                            this.m.a.d = d;
                            z2 = false;
                            u(new jw70(this, sgk0.a, ur4Var, d, false));
                        }
                    }
                    this.k.notifyAll();
                    s3q0 s3q0Var = s3q0.a;
                    z = z2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        cw70.a aVar7 = this.i;
        if (!(aVar7 != null ? aVar7 : null).c()) {
            return true;
        }
        while (true) {
            int playbackHeadPosition = audioTrack.getPlaybackHeadPosition();
            int i2 = this.f;
            if (playbackHeadPosition >= (i2 > 0 ? this.g / i2 : z)) {
                break;
            }
            Thread.sleep(8L);
        }
        synchronized (this.k) {
            try {
                n();
                i4b0 i4b0Var2 = this.m;
                if (epx.f(i4b0Var2.a.a, ur4Var)) {
                    PlayState playState2 = i4b0Var2.a.c;
                    if (playState2 != PlayState.PLAY) {
                        if (playState2 == PlayState.PAUSE) {
                        }
                    }
                    l(this);
                    i4b0.a aVar8 = this.m.a;
                    aVar8.d = 1.0f;
                    aVar8.c = PlayState.STOP;
                    u(new jw70(this, sgk0.a, ur4Var, 1.0f, true));
                    u(new o440(this, ur4Var));
                }
                this.k.notifyAll();
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z;
    }

    public final boolean x(AudioTrack audioTrack, Speed speed) {
        try {
            float f = swe0.f(speed.i(), 1.0f, 2.0f);
            PlaybackParams playbackParams = new PlaybackParams();
            playbackParams.setSpeed(f);
            audioTrack.setPlaybackParams(playbackParams);
            return true;
        } catch (IllegalArgumentException e) {
            if (this.e == 8) {
                throw e;
            }
            this.e *= 2;
            return false;
        }
    }

    @Override // xsna.sgp0
    public final Speed z() {
        Speed speed;
        synchronized (this.k) {
            n();
            speed = this.m.a.f;
        }
        return speed;
    }
}
