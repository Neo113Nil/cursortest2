package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import defpackage.bzn;
import defpackage.cac;
import defpackage.czn;
import defpackage.d94;
import defpackage.euy;
import defpackage.fzn;
import defpackage.geb1;
import defpackage.gl7;
import defpackage.hiv;
import defpackage.hsj0;
import defpackage.hzn;
import defpackage.j34;
import defpackage.mbb;
import defpackage.mf3;
import defpackage.ni91;
import defpackage.pyn;
import defpackage.sgb1;
import defpackage.syn;
import defpackage.tl31;
import defpackage.u1n;
import defpackage.vbj;
import defpackage.w3x0;
import defpackage.wqj;
import defpackage.x3;
import defpackage.x4e;
import defpackage.xen;
import defpackage.xyn;
import defpackage.yci0;
import defpackage.zyn;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class j {
    public static final Range H;
    public ScheduledFuture G;
    public final String a;
    public final boolean c;
    public final zyn d;
    public final MediaFormat e;
    public final MediaCodec f;
    public final syn g;
    public final x3 h;
    public final androidx.camera.core.impl.utils.executor.b i;
    public final euy j;
    public final androidx.concurrent.futures.b k;
    public final Timebase q;
    public final u1n r;
    public final Rational s;
    public final boolean t;
    public EncoderImpl$InternalState w;
    public final Object b = new Object();
    public final ArrayDeque l = new ArrayDeque();
    public final ArrayDeque m = new ArrayDeque();
    public final HashSet n = new HashSet();
    public final HashSet o = new HashSet();
    public final ArrayDeque p = new ArrayDeque();
    public xyn u = xyn.a2;
    public Executor v = geb1.b();
    public Range x = H;
    public long y = 0;
    public boolean z = false;
    public Long A = null;
    public ScheduledFuture B = null;
    public EncoderImpl$MediaCodecCallback C = null;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;

    static {
        Long valueOf = Long.valueOf(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        H = Range.create(valueOf, valueOf);
    }

    public j(Executor executor, zyn zynVar, int i) {
        boolean z = false;
        executor.getClass();
        zynVar.getClass();
        this.d = zynVar;
        LruCache lruCache = cac.a;
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(zynVar.a());
            this.f = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            this.i = new androidx.camera.core.impl.utils.executor.b(executor);
            MediaFormat c = zynVar.c();
            this.e = c;
            Timebase b = zynVar.b();
            this.q = b;
            this.r = new u1n(7, new xen(2, this), new w3x0());
            if (zynVar instanceof j34) {
                j34 j34Var = (j34) zynVar;
                this.a = "AudioEncoder";
                this.c = false;
                this.g = new fzn(this);
                mf3 mf3Var = new mf3(codecInfo, j34Var.a);
                Objects.requireNonNull(((MediaCodecInfo.CodecCapabilities) mf3Var.b).getAudioCapabilities());
                this.h = mf3Var;
                this.s = new Rational(j34Var.e, j34Var.f);
            } else {
                if (!(zynVar instanceof d94)) {
                    throw new InvalidConfigException("Unknown encoder config type");
                }
                d94 d94Var = (d94) zynVar;
                this.a = "VideoEncoder";
                this.c = true;
                this.g = new hzn(this);
                tl31 tl31Var = new tl31(codecInfo, d94Var.a);
                if (c.containsKey("bitrate")) {
                    int integer = c.getInteger("bitrate");
                    int intValue = tl31Var.c.getBitrateRange().clamp(Integer.valueOf(integer)).intValue();
                    if (integer != intValue) {
                        c.setInteger("bitrate", intValue);
                        sgb1.g(3, "VideoEncoder");
                    }
                }
                this.h = tl31Var;
                this.s = new Rational(d94Var.g, d94Var.h);
            }
            String str = this.a;
            Objects.toString(b);
            sgb1.g(3, str);
            String str2 = this.a;
            Objects.toString(c);
            sgb1.g(3, str2);
            String str3 = this.a;
            Objects.toString(this.s);
            sgb1.g(3, str3);
            try {
                i();
                AtomicReference atomicReference = new AtomicReference();
                androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
                bVar.c = new hsj0();
                gl7 gl7Var = new gl7(bVar);
                bVar.b = gl7Var;
                bVar.a = x4e.class;
                try {
                    atomicReference.set(bVar);
                    bVar.a = "mReleasedFuture";
                } catch (Exception e) {
                    gl7Var.a(e);
                }
                this.j = ni91.g(gl7Var);
                androidx.concurrent.futures.b bVar2 = (androidx.concurrent.futures.b) atomicReference.get();
                bVar2.getClass();
                this.k = bVar2;
                if (this.c && i == 1 && vbj.a.b(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) {
                    z = true;
                }
                this.t = z;
                j(EncoderImpl$InternalState.CONFIGURED);
            } catch (MediaCodec.CodecException e2) {
                throw new InvalidConfigException(e2);
            }
        } catch (IOException | IllegalArgumentException e3) {
            throw new InvalidConfigException(e3);
        }
    }

    public final euy a() {
        switch (this.w.ordinal()) {
            case 0:
                return new hiv(1, new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
                bVar.c = new hsj0();
                gl7 gl7Var = new gl7(bVar);
                bVar.b = gl7Var;
                bVar.a = x4e.class;
                try {
                    atomicReference.set(bVar);
                    bVar.a = "acquireInputBuffer";
                } catch (Exception e) {
                    gl7Var.a(e);
                }
                androidx.concurrent.futures.b bVar2 = (androidx.concurrent.futures.b) atomicReference.get();
                bVar2.getClass();
                this.m.offer(bVar2);
                bVar2.a(new wqj(22, this, bVar2), this.i);
                d();
                return gl7Var;
            case 7:
                return new hiv(1, new IllegalStateException("Encoder is in error state."));
            case 8:
                return new hiv(1, new IllegalStateException("Encoder is released."));
            default:
                yci0.t(this.w, "Unknown state: ");
                return null;
        }
    }

    public final void b(int i, String str, Throwable th) {
        switch (this.w.ordinal()) {
            case 0:
                e(i, str, th);
                i();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                j(EncoderImpl$InternalState.ERROR);
                m(new mbb(this, i, str, th, 2));
                break;
            case 7:
                sgb1.g(5, this.a);
                break;
        }
    }

    public final boolean c() {
        Rational rational = this.s;
        return !(rational != null && rational.getDenominator() == rational.getNumerator());
    }

    public final void d() {
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.l;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            androidx.concurrent.futures.b bVar = (androidx.concurrent.futures.b) arrayDeque.poll();
            Objects.requireNonNull(bVar);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                czn cznVar = new czn(this, this.f, num.intValue());
                if (bVar.b(cznVar)) {
                    this.n.add(cznVar);
                    ni91.g(cznVar.d).c(new wqj(23, this, cznVar), this.i);
                } else {
                    cznVar.a();
                }
            } catch (MediaCodec.CodecException e) {
                b(1, e.getMessage(), e);
                return;
            }
        }
    }

    public final void e(int i, String str, Throwable th) {
        xyn xynVar;
        Executor executor;
        synchronized (this.b) {
            xynVar = this.u;
            executor = this.v;
        }
        try {
            executor.execute(new mbb(xynVar, i, str, th, 3));
        } catch (RejectedExecutionException e) {
            sgb1.e(this.a, "Unable to post to the supplied executor.", e);
        }
    }

    public final void f() {
        this.i.execute(new d(this, this.r.d(), 0));
    }

    public final void g() {
        Surface surface;
        HashSet hashSet;
        sgb1.g(3, this.a);
        if (this.D) {
            if (!this.t) {
                sgb1.g(3, this.a);
                this.f.stop();
            }
            this.D = false;
        }
        sgb1.g(3, this.a);
        this.f.release();
        syn synVar = this.g;
        if (synVar instanceof hzn) {
            hzn hznVar = (hzn) synVar;
            synchronized (hznVar.a) {
                surface = hznVar.b;
                hznVar.b = null;
                hashSet = new HashSet(hznVar.c);
                hznVar.c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        j(EncoderImpl$InternalState.RELEASED);
        this.k.b(null);
    }

    public final void h() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        sgb1.g(3, this.a);
        this.f.setParameters(bundle);
    }

    public final void i() {
        androidx.camera.video.j jVar;
        Executor executor;
        this.x = H;
        this.y = 0L;
        this.p.clear();
        this.l.clear();
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((androidx.concurrent.futures.b) it.next()).c();
        }
        this.m.clear();
        sgb1.g(3, this.a);
        this.f.reset();
        this.D = false;
        this.E = false;
        this.F = false;
        this.z = false;
        ScheduledFuture scheduledFuture = this.B;
        Surface surface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.B = null;
        }
        ScheduledFuture scheduledFuture2 = this.G;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.G = null;
        }
        EncoderImpl$MediaCodecCallback encoderImpl$MediaCodecCallback = this.C;
        if (encoderImpl$MediaCodecCallback != null) {
            encoderImpl$MediaCodecCallback.stop();
        }
        this.C = new EncoderImpl$MediaCodecCallback(this);
        sgb1.g(3, this.a);
        this.f.setCallback(this.C);
        sgb1.g(3, this.a);
        this.f.configure(this.e, (Surface) null, (MediaCrypto) null, 1);
        syn synVar = this.g;
        if (synVar instanceof hzn) {
            hzn hznVar = (hzn) synVar;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) vbj.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (hznVar.a) {
                Surface surface2 = hznVar.b;
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (surface2 == null) {
                            surface = MediaCodec.createPersistentInputSurface();
                            hznVar.b = surface;
                        }
                        hznVar.f.f.setInputSurface(hznVar.b);
                    } else {
                        if (surface2 != null) {
                            hznVar.c.add(surface2);
                        }
                        surface = hznVar.f.f.createInputSurface();
                        hznVar.b = surface;
                    }
                    jVar = hznVar.d;
                    executor = hznVar.e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surface == null || jVar == null || executor == null) {
                return;
            }
            try {
                executor.execute(new wqj(27, jVar, surface));
            } catch (RejectedExecutionException e) {
                sgb1.e(hznVar.f.a, "Unable to post to the supplied executor.", e);
            }
        }
    }

    public final void j(EncoderImpl$InternalState encoderImpl$InternalState) {
        EncoderImpl$InternalState encoderImpl$InternalState2 = this.w;
        if (encoderImpl$InternalState2 == encoderImpl$InternalState) {
            return;
        }
        Objects.toString(encoderImpl$InternalState2);
        Objects.toString(encoderImpl$InternalState);
        sgb1.g(3, this.a);
        this.w = encoderImpl$InternalState;
    }

    public final void k() {
        int i = 3;
        sgb1.g(3, this.a);
        syn synVar = this.g;
        int i2 = 0;
        if (synVar instanceof fzn) {
            ((fzn) synVar).d(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                arrayList.add(ni91.g(((czn) it.next()).d));
            }
            ni91.k(arrayList).c(new bzn(this, i), this.i);
            return;
        }
        if (synVar instanceof hzn) {
            try {
                if (vbj.a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    EncoderImpl$MediaCodecCallback encoderImpl$MediaCodecCallback = this.C;
                    androidx.camera.core.impl.utils.executor.b bVar = this.i;
                    ScheduledFuture scheduledFuture = this.G;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.G = geb1.f().schedule(new a(i2, bVar, encoderImpl$MediaCodecCallback), 1000L, TimeUnit.MILLISECONDS);
                }
                sgb1.g(3, this.a);
                this.f.signalEndOfInputStream();
                this.F = true;
            } catch (MediaCodec.CodecException e) {
                b(1, e.getMessage(), e);
            }
        }
    }

    public final void l() {
        this.i.execute(new d(this, this.r.d(), 1));
    }

    public final void m(Runnable runnable) {
        String str = this.a;
        sgb1.g(3, str);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.o;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(ni91.g(((pyn) it.next()).x));
        }
        HashSet hashSet2 = this.n;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(ni91.g(((czn) it2.next()).d));
        }
        if (!arrayList.isEmpty()) {
            hashSet.size();
            hashSet2.size();
            sgb1.g(3, str);
        }
        ni91.k(arrayList).c(new e(0, this, arrayList, runnable), this.i);
    }

    public final long n(long j) {
        if (!c()) {
            return j;
        }
        return Math.round(this.s.doubleValue() * j);
    }
}
