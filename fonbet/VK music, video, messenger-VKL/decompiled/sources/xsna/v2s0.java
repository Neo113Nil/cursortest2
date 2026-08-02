package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.vk.log.L;
import com.vk.media.ok.encoder.VideoAudioEncoderException;
import com.vk.media.recorder.h;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.util.Consumer;
import ru.ok.gl.util.GlThread;
import ru.ok.gl.util.ScaledTime;
import xsna.gzf;
import xsna.mo9;
import xsna.mu4;
import xsna.szf;

/* compiled from: VideoAudioEncoder.java */
/* loaded from: classes3.dex */
public final class v2s0 {
    public static final /* synthetic */ int H = 0;
    public b A;
    public a B;
    public HandlerThread C;
    public Surface D;
    public MediaCodec E;
    public g F;
    public volatile f G;

    @NonNull
    public final String a = X3.j.d + Integer.toHexString(hashCode()) + ']';

    @NonNull
    public final c020 b;

    @NonNull
    public final vhf0 c;
    public final ScaledTime d;
    public final ScaledTime e;
    public final ScaledTime f;
    public final ScaledTime g;
    public final ExecutorService h;
    public final Object i;
    public final Object j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicReference<File> n;
    public final AtomicReference<Throwable> o;
    public final h.a p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final AtomicReference<ej50> t;
    public final File u;
    public gb4 v;
    public boolean w;
    public volatile boolean x;
    public volatile ExtraAudioSupplier y;
    public gzf z;

    /* compiled from: VideoAudioEncoder.java */
    public final class a {
        public final olb0 a = new olb0(TimeUnit.MICROSECONDS, 0, 0);

        public a() {
        }
    }

    /* compiled from: VideoAudioEncoder.java */
    public class b implements Consumer<szf.b> {
        public final olb0 a = new olb0(TimeUnit.MICROSECONDS, 0, 0);
        public long b;
        public final int c;
        public final int d;
        public final float e;
        public final int f;
        public final mu4 g;
        public mu4.a h;
        public long i;

        /* compiled from: VideoAudioEncoder.java */
        public class a {
            public final /* synthetic */ v2s0 a;
            public final /* synthetic */ g b;

            public a(v2s0 v2s0Var, g gVar) {
                this.a = v2s0Var;
                this.b = gVar;
            }

            public final boolean a() {
                if (v2s0.this.m.get()) {
                    g gVar = this.b;
                    if (gVar != null && (!gVar.f.k.get() || gVar.a.d <= 0)) {
                        try {
                            gVar.c.await(gVar.b * 3, TimeUnit.NANOSECONDS);
                        } catch (InterruptedException e) {
                            L.j(e, "waiting first video frame was interrupted");
                            Thread.currentThread().interrupt();
                        } catch (Exception e2) {
                            L.j(e2, "failed to await first video frame");
                        }
                        if (!gVar.f.k.get() || gVar.a.d <= 0) {
                        }
                    }
                    return true;
                }
                return false;
            }
        }

        public b(gb4 gb4Var, g gVar, MediaFormat mediaFormat) {
            int integer = mediaFormat.getInteger("channel-count");
            this.c = integer;
            this.d = mediaFormat.getInteger("sample-rate");
            this.e = (TimeUnit.SECONDS.toMicros(1L) * 1.0f) / ((integer * 2) * r1);
            this.f = integer * 2048;
            this.g = new mu4(mediaFormat, gb4Var, new a(v2s0.this, gVar), v2s0.this.r, v2s0.this.a);
        }

        @Override // ru.ok.gl.util.Consumer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void accept(szf.b bVar) {
            if (!d(bVar) && e(bVar)) {
                MediaCodec.BufferInfo bufferInfo = bVar.a;
                bufferInfo.presentationTimeUs = c(bufferInfo.size);
                byte[] bArr = this.h.b;
                if (v2s0.this.x) {
                    Arrays.fill(bArr, (byte) 0);
                }
                mu4.a aVar = this.h;
                byte[] bArr2 = aVar.b;
                int i = aVar.c;
                Boolean bool = Boolean.TRUE;
                ExtraAudioSupplier extraAudioSupplier = v2s0.this.y;
                if (extraAudioSupplier != null) {
                    extraAudioSupplier.getRawData(bArr2, i, this.c, bool, v2s0.this.x);
                }
                byte[] bArr3 = this.h.b;
                ByteBuffer byteBuffer = bVar.c;
                MediaCodec.BufferInfo bufferInfo2 = bVar.a;
                byteBuffer.put(bArr3, 0, bufferInfo2.size);
                this.a.c(bufferInfo2.presentationTimeUs);
            }
            mu4.a aVar2 = this.h;
            if (aVar2 != null) {
                this.g.h.recycle(aVar2);
                this.h = null;
            }
        }

        public final long c(int i) {
            long j = this.i;
            if (j != 0) {
                this.i = ((long) (i * this.e)) + j;
                return j;
            }
            g gVar = v2s0.this.F;
            this.i = gVar != null ? gVar.a.a() : TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
            ExtraAudioSupplier extraAudioSupplier = v2s0.this.y;
            if (extraAudioSupplier != null) {
                extraAudioSupplier.tie();
            }
            return this.i - ((long) (i * this.e));
        }

        public boolean d(szf.b bVar) {
            if (v2s0.this.k.get() || !this.g.g.isEmpty()) {
                return false;
            }
            if (this.a.d > 0) {
                long j = this.i;
                MediaCodec.BufferInfo bufferInfo = bVar.a;
                bufferInfo.size = 0;
                bufferInfo.offset = 0;
                bufferInfo.presentationTimeUs = j;
                bufferInfo.flags = 4;
            }
            ExtraAudioSupplier extraAudioSupplier = v2s0.this.y;
            if (extraAudioSupplier != null) {
                extraAudioSupplier.untie();
            }
            bVar.b.g = false;
            return true;
        }

        public final boolean e(szf.b bVar) {
            mu4.a aVar;
            mu4 mu4Var = this.g;
            mu4Var.getClass();
            try {
                aVar = mu4Var.g.poll(100L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                mu4Var.interrupt();
                aVar = null;
            }
            this.h = aVar;
            if (aVar == null) {
                return false;
            }
            if (this.i == 0) {
                g gVar = v2s0.this.F;
                this.i = gVar != null ? gVar.a.a() : aVar.a;
                ExtraAudioSupplier extraAudioSupplier = v2s0.this.y;
                if (extraAudioSupplier != null) {
                    extraAudioSupplier.syncAms();
                    extraAudioSupplier.tie();
                }
            }
            bVar.a.size = this.h.c;
            return true;
        }

        public void f() {
            long currentTimeMillis = System.currentTimeMillis();
            mu4 mu4Var = this.g;
            mu4Var.f.set(true);
            if (mu4Var.isAlive()) {
                mu4Var.interrupt();
            }
            this.b = System.currentTimeMillis() - currentTimeMillis;
        }
    }

    /* compiled from: VideoAudioEncoder.java */
    public final class c extends b {
        public final st4 k;

        public c(gb4 gb4Var, g gVar, MediaFormat mediaFormat) {
            super(gb4Var, gVar, mediaFormat);
            vhf0 vhf0Var = v2s0.this.c;
            this.k = new st4(vhf0Var.c, vhf0Var.a.e, this.d, this.c, this.f);
        }

        @Override // xsna.v2s0.b, ru.ok.gl.util.Consumer
        /* renamed from: b */
        public final void accept(szf.b bVar) {
            if (!d(bVar) && !g(bVar) && e(bVar)) {
                byte[] bArr = this.h.b;
                if (v2s0.this.x) {
                    Arrays.fill(bArr, (byte) 0);
                }
                mu4.a aVar = this.h;
                byte[] bArr2 = aVar.b;
                int i = aVar.c;
                Boolean bool = Boolean.FALSE;
                ExtraAudioSupplier extraAudioSupplier = v2s0.this.y;
                if (extraAudioSupplier != null) {
                    extraAudioSupplier.getRawData(bArr2, i, this.c, bool, v2s0.this.x);
                }
                this.k.c(bVar.a.size, this.h.b);
                g(bVar);
            }
            mu4.a aVar2 = this.h;
            if (aVar2 != null) {
                this.g.h.recycle(aVar2);
                this.h = null;
            }
        }

        @Override // xsna.v2s0.b
        public final boolean d(szf.b bVar) {
            if (!v2s0.this.k.get()) {
                st4 st4Var = this.k;
                if (!st4Var.e) {
                    androidx.media3.common.audio.e eVar = st4Var.b;
                    if (eVar != null) {
                        eVar.queueEndOfStream();
                    }
                    st4Var.e = true;
                }
                if (g(bVar)) {
                    return true;
                }
            }
            return super.d(bVar);
        }

        @Override // xsna.v2s0.b
        public final void f() {
            long currentTimeMillis = System.currentTimeMillis();
            this.k.getClass();
            super.f();
            this.b = System.currentTimeMillis() - currentTimeMillis;
        }

        public final boolean g(szf.b bVar) {
            MediaCodec.BufferInfo bufferInfo = bVar.a;
            st4 st4Var = this.k;
            int b = st4Var.b();
            bufferInfo.size = b;
            if (b <= 0) {
                return false;
            }
            bufferInfo.presentationTimeUs = c(b);
            byte[] bArr = st4Var.a;
            int i = bufferInfo.size;
            ExtraAudioSupplier extraAudioSupplier = v2s0.this.y;
            if (extraAudioSupplier != null) {
                extraAudioSupplier.getRawData(bArr, i, this.c, null, v2s0.this.x);
            }
            byte[] bArr2 = st4Var.a;
            ByteBuffer byteBuffer = bVar.c;
            MediaCodec.BufferInfo bufferInfo2 = bVar.a;
            byteBuffer.put(bArr2, 0, bufferInfo2.size);
            this.a.c(bufferInfo2.presentationTimeUs);
            return true;
        }
    }

    /* compiled from: VideoAudioEncoder.java */
    @GlThread
    public interface d {
        @NonNull
        nv70 a(int i, int i2);

        void b();
    }

    /* compiled from: VideoAudioEncoder.java */
    public static final class e implements ThreadFactory {
        public static final AtomicInteger d = new AtomicInteger(1);
        public final AtomicInteger b = new AtomicInteger(1);
        public final String c = "vae-pool-" + d.getAndIncrement() + "-thread-";

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.c + this.b.getAndIncrement());
        }
    }

    /* compiled from: VideoAudioEncoder.java */
    public class g {
        public final olb0 a;
        public final long b;
        public final CountDownLatch c;
        public final long d;
        public Bundle e;
        public final /* synthetic */ v2s0 f;

        public g(v2s0 v2s0Var, MediaFormat mediaFormat) {
            vhf0 vhf0Var = v2s0Var.c;
            this.f = v2s0Var;
            this.a = new olb0(TimeUnit.NANOSECONDS, 0, 0);
            this.c = new CountDownLatch(1);
            if (mediaFormat.containsKey("frame-rate")) {
                this.b = TimeUnit.SECONDS.toNanos(1L) / mediaFormat.getInteger("frame-rate");
            } else {
                this.b = (long) (TimeUnit.SECONDS.toNanos(1L) / vhf0Var.b.a);
            }
            long j = vhf0Var.b.e;
            this.d = j;
            Bundle bundle = j > 0 ? new Bundle() : null;
            this.e = bundle;
            if (bundle != null) {
                bundle.putInt("request-sync", 0);
                this.e.putInt("video-bitrate", (int) (vhf0Var.b.b * 2.0d));
            }
        }

        public final void a(map mapVar, long j) {
            int i;
            olb0 olb0Var = this.a;
            if (j >= 0 && olb0Var.c(j) == 1) {
                this.c.countDown();
            }
            v2s0 v2s0Var = this.f;
            vhf0 vhf0Var = v2s0Var.c;
            if (this.e != null) {
                float millis = olb0Var.a.toMillis(olb0Var.b() - olb0Var.b[0]);
                float f = this.d;
                if (millis < f) {
                    v2s0Var.E.setParameters(this.e);
                } else {
                    gzf.c cVar = vhf0Var.b;
                    double millis2 = olb0Var.a.toMillis(olb0Var.b() - r2[0]) - f;
                    int i2 = vhf0Var.b.b;
                    if (millis2 > 1500.0d) {
                        i = i2;
                    } else {
                        i = (int) ((((1500.0d - millis2) / 1500.0d) * ((int) (1.0d * r2))) + i2);
                    }
                    this.e.remove("request-sync");
                    this.e.putInt("video-bitrate", i);
                    v2s0Var.E.setParameters(this.e);
                    if (i == i2) {
                        this.e = null;
                    }
                }
            }
            mapVar.b();
        }

        public final void b(map mapVar, long j, boolean z) {
            if (z && this.a.c(j) == 1) {
                this.c.countDown();
            }
            mapVar.d(j);
        }

        public void c(d dVar, map mapVar) {
            long nanoTime = System.nanoTime();
            boolean z = this.a.d == 0;
            a(mapVar, z ? nanoTime : -1L);
            dVar.b();
            b(mapVar, nanoTime, !z);
        }
    }

    /* compiled from: VideoAudioEncoder.java */
    public final class h extends g {
        public long g;
        public long h;

        public h(MediaFormat mediaFormat) {
            super(v2s0.this, mediaFormat);
        }

        @Override // xsna.v2s0.g
        public final void c(d dVar, map mapVar) {
            fap fapVar = mapVar.a;
            long nanoTime = System.nanoTime();
            if (this.g == 0) {
                this.g = nanoTime;
                this.h = nanoTime;
                a(mapVar, nanoTime);
                dVar.b();
                mapVar.d(nanoTime);
                return;
            }
            long j = this.h;
            float f = v2s0.this.c.c;
            long j2 = ((long) ((nanoTime - r5) / f)) + j;
            long j3 = j2 - j;
            long j4 = this.b;
            if (j3 < j4) {
                return;
            }
            if (f > 1.0f) {
                a(mapVar, -1L);
                dVar.b();
                b(mapVar, j2, true);
            } else {
                int i = mapVar.c;
                if (i < 0) {
                    int[] iArr = new int[1];
                    EGL14.eglQuerySurface(fapVar.b, mapVar.b, 12375, iArr, 0);
                    i = iArr[0];
                }
                int i2 = mapVar.d;
                if (i2 < 0) {
                    int[] iArr2 = new int[1];
                    EGL14.eglQuerySurface(fapVar.b, mapVar.b, 12374, iArr2, 0);
                    i2 = iArr2[0];
                }
                nv70 a = dVar.a(i, i2);
                ((FrameBuffer) a.c).bind();
                dVar.b();
                ((FrameBuffer) a.c).unbind();
                a(mapVar, -1L);
                long j5 = this.h + j4;
                for (long j6 = 0; j5 < j2 && j6 < 2; j6++) {
                    a.c();
                    b(mapVar, j5, true);
                    j5 += j4;
                }
                a.c();
                b(mapVar, j2, true);
            }
            this.g = nanoTime;
            this.h = j2;
        }
    }

    public v2s0(@NonNull w2s0 w2s0Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.d = new ScaledTime(2000L, timeUnit);
        TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
        this.e = new ScaledTime(10L, timeUnit2);
        this.f = new ScaledTime(1000L, timeUnit2);
        this.g = new ScaledTime(100L, timeUnit);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new e());
        this.h = newSingleThreadExecutor;
        this.i = new Object();
        this.j = new Object();
        this.k = new AtomicBoolean(true);
        this.l = new AtomicBoolean();
        this.m = new AtomicBoolean();
        AtomicReference<File> atomicReference = new AtomicReference<>();
        this.n = atomicReference;
        this.o = new AtomicReference<>();
        this.t = new AtomicReference<>();
        h.a aVar = w2s0Var.a;
        this.p = aVar;
        atomicReference.set(null);
        this.u = w2s0Var.b;
        this.c = w2s0Var.c;
        gb4 gb4Var = w2s0Var.d;
        this.v = gb4Var;
        this.w = gb4Var == null;
        this.y = w2s0Var.e;
        this.x = w2s0Var.f;
        this.q = true;
        this.r = w2s0Var.g;
        this.s = w2s0Var.h;
        this.b = new c020();
        aVar.b.set(this);
        newSingleThreadExecutor.execute(new u12(this, 14));
    }

    public final ej50 a(File file, boolean z) {
        try {
            gzf.c cVar = this.c.b;
            return new ej50(file, true, true, new q9f0(this, 4));
        } catch (Exception e2) {
            c(new VideoAudioEncoderException("failed to create muxer", e2), z);
            return null;
        }
    }

    public final void b() {
        AtomicBoolean atomicBoolean = this.m;
        if (atomicBoolean.get()) {
            return;
        }
        AtomicBoolean atomicBoolean2 = this.k;
        if (atomicBoolean2.get()) {
            AtomicReference<ej50> atomicReference = this.t;
            if (atomicReference.get() == null) {
                atomicReference.set(a(this.n.get(), true));
            }
            if (atomicReference.get() != null && atomicBoolean2.get()) {
                atomicBoolean.set(true);
                this.p.getClass();
                gzf gzfVar = this.z;
                if (gzfVar != null) {
                    szf.a aVar = new szf.a(gzfVar);
                    aVar.e = this.e;
                    a aVar2 = this.B;
                    Objects.requireNonNull(aVar2);
                    aVar.d = new t2s0(aVar2);
                    a aVar3 = this.B;
                    Objects.requireNonNull(aVar3);
                    aVar.c = new u2s0(aVar3);
                    b bVar = this.A;
                    aVar.b = bVar;
                    if (bVar != null) {
                        try {
                            if (aVar.d != null) {
                                new szf(aVar).run();
                                return;
                            }
                        } catch (Exception e2) {
                            c(new VideoAudioEncoderException("failed to process audio", e2), true);
                            return;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        }
    }

    public final void c(VideoAudioEncoderException videoAudioEncoderException, boolean z) {
        AtomicReference<Throwable> atomicReference;
        L.i(videoAudioEncoderException);
        com.vk.metrics.eventtracking.b.a.a(videoAudioEncoderException);
        if (z) {
            do {
                atomicReference = this.o;
                if (atomicReference.compareAndSet(null, videoAudioEncoderException)) {
                    h.a aVar = this.p;
                    if (!aVar.a.get()) {
                        aVar.e.obtainMessage(5).sendToTarget();
                    }
                    aVar.c.countDown();
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }

    public final void d(MediaCodec mediaCodec, ScaledTime scaledTime) {
        HandlerThread handlerThread = this.C;
        if (handlerThread != null && handlerThread.isAlive()) {
            handlerThread.quit();
            handlerThread.interrupt();
            if (scaledTime != null) {
                try {
                    handlerThread.join(scaledTime.toMillis());
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.C = null;
        gzf.c(mediaCodec);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        g gVar;
        gb4 gb4Var;
        MediaMuxer mediaMuxer;
        MediaCodec mediaCodec;
        synchronized (this.j) {
            gVar = this.F;
            this.F = null;
        }
        if (this.E != null) {
            System.currentTimeMillis();
            if (gVar.a.d > 0 && this.G.g > 0 && (mediaCodec = this.E) != null) {
                try {
                    mediaCodec.signalEndOfInputStream();
                    f fVar = this.G;
                    ScaledTime scaledTime = this.d;
                    CountDownLatch countDownLatch = fVar.b;
                    try {
                        countDownLatch.await(scaledTime.value, scaledTime.scale);
                    } catch (Exception e2) {
                        L.j(e2, "failed to await video eos");
                        countDownLatch.countDown();
                    }
                } catch (Exception e3) {
                    L.j(e3, "failed to send eos");
                }
            }
            System.currentTimeMillis();
        }
        if (this.t.get() != null) {
            ej50 ej50Var = this.t.get();
            File file = this.n.get();
            synchronized (ej50Var.d) {
                mediaMuxer = ej50Var.h;
                ej50Var.h = null;
            }
            if (mediaMuxer != null) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    if (ej50Var.i) {
                        try {
                            mediaMuxer.stop();
                        } catch (Exception e4) {
                            e = e4;
                            L.j(e, "failed to stop muxer");
                        }
                    }
                    e = null;
                    try {
                        mediaMuxer.release();
                    } catch (Exception unused) {
                    }
                    if (e != null || file == null) {
                        ej50Var.b(ej50Var.a);
                    } else if (!ej50Var.a.equals(file) && !ej50Var.e(ej50Var.a, file)) {
                        ej50Var.b(ej50Var.a);
                        e = new IOException("failed to move file");
                    }
                    long j = this.t.get().b;
                    if (e != null) {
                        c(new VideoAudioEncoderException("failed to release muxer", e), true);
                    }
                } finally {
                    ej50Var.b = System.currentTimeMillis() - currentTimeMillis;
                }
            }
            e = null;
            long j2 = this.t.get().b;
            if (e != null) {
            }
        }
        h.a aVar = this.p;
        if (!aVar.a.get()) {
            aVar.e.obtainMessage(4).sendToTarget();
        }
        aVar.c.countDown();
        gzf gzfVar = this.z;
        if (gzfVar != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            gzf.c(gzfVar.a);
            gzfVar.d = System.currentTimeMillis() - currentTimeMillis2;
            long j3 = this.z.d;
            this.z = null;
        }
        b bVar = this.A;
        if (bVar != null) {
            bVar.f();
            long j4 = this.A.b;
        }
        if (this.E != null) {
            System.currentTimeMillis();
            d(this.E, null);
            System.currentTimeMillis();
        }
        Surface surface = this.D;
        if (surface != null) {
            surface.release();
            this.D = null;
        }
        synchronized (this.j) {
            gb4Var = this.v;
            this.v = null;
        }
        if (!this.w || gb4Var == null) {
            return;
        }
        gb4Var.a();
    }

    public final boolean f(@Nullable gb4 gb4Var) {
        if (gb4Var == null) {
            return false;
        }
        synchronized (this.j) {
            try {
                if (gb4Var != this.v) {
                    return false;
                }
                this.w = true;
                return true;
            } finally {
            }
        }
    }

    public final void finalize() throws Throwable {
        AtomicBoolean atomicBoolean = this.k;
        boolean z = atomicBoolean.get();
        ExecutorService executorService = this.h;
        if (z || !executorService.isShutdown()) {
            c(new VideoAudioEncoderException("release() was not called!"), false);
            atomicBoolean.set(false);
            executorService.shutdown();
            try {
                e();
            } catch (Exception unused) {
            }
        }
        super.finalize();
    }

    /* compiled from: VideoAudioEncoder.java */
    public final class f extends MediaCodec.Callback {
        public final olb0 a = new olb0(TimeUnit.MICROSECONDS, 0, 0);
        public final CountDownLatch b = new CountDownLatch(1);
        public long c;
        public long d;
        public long e;
        public volatile nhf0 f;
        public int g;
        public MediaFormat h;
        public boolean i;

        public f() {
        }

        public final void a(VideoAudioEncoderException videoAudioEncoderException) {
            this.b.countDown();
            v2s0.this.c(videoAudioEncoderException, true);
        }

        public final boolean b() {
            ej50 ej50Var;
            v2s0 v2s0Var = v2s0.this;
            if (!this.i) {
                if (this.h == null || !v2s0Var.m.get() || (ej50Var = v2s0Var.t.get()) == null) {
                    return false;
                }
                if (ej50Var.f(this.h)) {
                    this.i = true;
                    if (v2s0Var.l.compareAndSet(false, true)) {
                        h.a aVar = v2s0Var.p;
                        if (!aVar.a.get()) {
                            com.vk.media.recorder.h.this.q = true;
                            aVar.e.obtainMessage(1).sendToTarget();
                            return true;
                        }
                    }
                } else if (!ej50Var.d()) {
                    return false;
                }
            }
            return true;
        }

        public final void c(MediaCodec mediaCodec, int i) {
            try {
                mediaCodec.releaseOutputBuffer(i, false);
            } catch (Exception unused) {
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(@NonNull MediaCodec mediaCodec, @NonNull MediaCodec.CodecException codecException) {
            if (codecException.isTransient()) {
                return;
            }
            a(new VideoAudioEncoderException("video encoder failed", codecException));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(@NonNull MediaCodec mediaCodec, int i, @NonNull MediaCodec.BufferInfo bufferInfo) {
            boolean g;
            if ((bufferInfo.flags & 1) != 0 && this.f == null) {
                this.f = new nhf0();
                this.e = bufferInfo.presentationTimeUs;
                this.d = TimeUnit.NANOSECONDS.toMicros(System.nanoTime()) - this.e;
                h.a aVar = v2s0.this.p;
                if (!aVar.a.get()) {
                    mo9.b bVar = com.vk.media.recorder.h.this.j;
                    if (bVar != null) {
                        bVar.c();
                    }
                    aVar.e.obtainMessage(2).sendToTarget();
                }
            }
            if (this.c == 0 && this.f != null) {
                WeakReference<vky> weakReference = this.f.a;
                vky vkyVar = weakReference == null ? null : weakReference.get();
                long c = vkyVar != null ? vkyVar.c() : 0L;
                if (c > 0) {
                    this.c = ((TimeUnit.NANOSECONDS.toMicros(System.nanoTime()) - this.e) + this.d) - TimeUnit.MILLISECONDS.toMicros(c);
                    this.f.b = this.c;
                }
            }
            if ((bufferInfo.flags & 2) != 0) {
                c(mediaCodec, i);
                return;
            }
            if (bufferInfo.size <= 0) {
                c(mediaCodec, i);
                if ((bufferInfo.flags & 4) != 0) {
                    this.b.countDown();
                    return;
                }
                return;
            }
            try {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                if (outputBuffer == null) {
                    throw new NullPointerException();
                }
                if (!b()) {
                    c(mediaCodec, i);
                    a(new VideoAudioEncoderException("failed to handle output video format"));
                    return;
                }
                ej50 ej50Var = v2s0.this.t.get();
                if (ej50Var == null) {
                    c(mediaCodec, i);
                    a(new VideoAudioEncoderException("has no muxer to write video frame"));
                    return;
                }
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                outputBuffer.position(bufferInfo.offset);
                this.g++;
                synchronized (ej50Var.d) {
                    try {
                        if (ej50Var.h == null) {
                            g = false;
                        } else {
                            g = ej50Var.g(true, outputBuffer, bufferInfo);
                            if (g) {
                                ej50Var.c(bufferInfo);
                            }
                        }
                    } finally {
                    }
                }
                c(mediaCodec, i);
                if (g) {
                    this.a.c(bufferInfo.presentationTimeUs);
                } else {
                    if (ej50Var.d()) {
                        return;
                    }
                    a(new VideoAudioEncoderException("failed to write video frame to muxer"));
                }
            } catch (MediaCodec.CodecException e) {
                c(mediaCodec, i);
                if (e.isTransient()) {
                    return;
                }
                a(new VideoAudioEncoderException("video encoder output buffer unavailable", e));
            } catch (IllegalStateException unused) {
                c(mediaCodec, i);
            } catch (NullPointerException unused2) {
                c(mediaCodec, i);
            } catch (Exception e2) {
                c(mediaCodec, i);
                a(new VideoAudioEncoderException("failed to get video encoder output buffer", e2));
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(@NonNull MediaCodec mediaCodec, @NonNull MediaFormat mediaFormat) {
            if (mediaFormat.equals(this.h)) {
                return;
            }
            this.h = mediaFormat;
            b();
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(@NonNull MediaCodec mediaCodec, int i) {
        }
    }
}
