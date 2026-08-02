package xsna;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.ironsource.C4498pe;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.session.transform.task.transcode.producer.framerate.FrameRateController;
import com.vk.media.pipeline.transcoder.DecodedSampleStatus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.dkt0;
import xsna.dt5;
import xsna.oap;
import xsna.oms0;
import xsna.qva0;
import xsna.w7l;

/* compiled from: VideoPlaybackTrackHandler.kt */
/* loaded from: classes3.dex */
public final class w3t0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public tht0 D;
    public long E;
    public final /* synthetic */ w7l a;
    public final csp b;
    public final int c;
    public final gz8 d;
    public final q1s0 e;
    public final String f;
    public int g;
    public final f100 h;
    public final f2d0 i;
    public final x3i0 j;
    public qva0.a k;
    public oms0 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public long r;
    public double s;
    public long t;
    public long u;
    public FrameRateController v;
    public final HandlerThread w;
    public final b x;
    public final e7s0 y;
    public Integer z;

    /* compiled from: VideoPlaybackTrackHandler.kt */
    public final class b extends ir6 {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(csp cspVar, lzf lzfVar, gz8 gz8Var) {
            super(cspVar, lzfVar, r3, r4, gz8Var, null, r7, r8, false, true, r15 != null ? r15.c : null, null, C4498pe.e);
            Looper myLooper = Looper.myLooper();
            Looper looper = w3t0.this.w.getLooper();
            int i = w3t0.this.c;
            a aVar = w3t0.this.new a(gz8Var);
            q1s0 q1s0Var = w3t0.this.e;
        }

        @Override // xsna.ir6, xsna.llt0
        public final void a() {
            w3t0 w3t0Var = w3t0.this;
            f100 f100Var = w3t0Var.h;
            if (f100Var != null) {
                f100Var.i(w3t0Var.f, "onTimelineEndReached");
            }
            w3t0Var.B = true;
        }

        @Override // xsna.llt0
        public final void b() {
            f2d0 f2d0Var;
            e(true);
            w3t0 w3t0Var = w3t0.this;
            f100 f100Var = w3t0Var.h;
            if (f100Var != null) {
                f100Var.i(w3t0Var.f, "onTimelineFragmentDetached");
            }
            w3t0Var.r = Long.MIN_VALUE;
            w3t0Var.q = 0L;
            w3t0Var.D = null;
            if (w3t0Var.m || (f2d0Var = w3t0Var.i) == null) {
                return;
            }
            f2d0Var.a();
        }

        @Override // xsna.ir6, xsna.llt0
        public final void c(c7s0 c7s0Var, VideoItem videoItem, tht0 tht0Var, int i) {
            w3t0 w3t0Var = w3t0.this;
            f100 f100Var = w3t0Var.h;
            w3t0Var.s = videoItem.z();
            Integer e = tht0Var.e();
            w3t0Var.z = e;
            int min = Math.min((int) ((e != null ? e.intValue() : 30) * w3t0Var.s), 60);
            f2d0 f2d0Var = w3t0Var.i;
            if (f2d0Var != null) {
                f2d0Var.e = min;
                dt5.b bVar = f2d0Var.c;
                bVar.getClass();
                bVar.f = SystemClock.elapsedRealtime();
            }
            if (f100Var != null) {
                String str = w3t0Var.f;
                StringBuilder b = ji.b(i, "onTimelineFragmentAttached. fragment=[", "|global frame=(");
                b.append(c7s0Var.getLayout().c);
                b.append("mcs - ");
                b.append(c7s0Var.getLayout().d);
                b.append("mcs)|local frame=(");
                b.append(c7s0Var.getLayout().b.O0());
                b.append("mcs - ");
                b.append(c7s0Var.getLayout().b.W0());
                b.append("mcs)|");
                b.append(tht0Var.getWidth());
                b.append('x');
                b.append(tht0Var.getHeight());
                b.append('|');
                b.append(tht0Var.e());
                b.append("fps|speed=");
                f100Var.i(str, ojp0.a(b, w3t0Var.s, ']'));
            }
            super.c(c7s0Var, videoItem, tht0Var, i);
            w3t0Var.D = tht0Var;
            w3t0Var.t = Math.max(videoItem.O0(), 0L);
            w3t0Var.u = videoItem.W0();
            Integer e2 = tht0Var.e();
            w3t0Var.v = (e2 == null || ((double) e2.intValue()) * w3t0Var.s <= 60.0d) ? null : new FrameRateController((int) (e2.intValue() * w3t0Var.s), 60, f100Var);
        }
    }

    public w3t0(csp cspVar, List list, ncl nclVar, int i, gz8 gz8Var, q1s0 q1s0Var) {
        f100 f100Var = cspVar.d;
        this.a = new w7l(gz8Var, f100Var);
        this.b = cspVar;
        this.c = i;
        this.d = gz8Var;
        this.e = q1s0Var;
        this.f = "VideoPlaybackTrackHandler";
        this.h = f100Var;
        this.i = q1s0Var != null ? q1s0Var.b : null;
        this.j = q1s0Var != null ? q1s0Var.a : null;
        this.l = new oms0.b(-1L);
        this.r = Long.MIN_VALUE;
        this.s = 1.0d;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.w = h5s.a("video-playback-decoder-surface-handler-thread");
        b bVar = new b(cspVar, nclVar, gz8Var);
        this.x = bVar;
        this.y = new e7s0(cspVar, list, bVar);
    }

    public final void a() {
        Pair pair;
        dkt0.a aVar;
        klt0 klt0Var;
        this.y.a().c = false;
        x3i0 x3i0Var = this.j;
        if (x3i0Var != null) {
            x3i0Var.f = true;
            x3i0Var.g = 0;
        }
        oms0 oms0Var = this.l;
        oms0.b bVar = oms0Var instanceof oms0.b ? (oms0.b) oms0Var : null;
        if (bVar == null) {
            throw new IllegalArgumentException(("Seek for frame request by frame number is prohibited: " + bVar).toString());
        }
        this.m = true;
        this.n = true;
        this.B = false;
        f100 f100Var = this.b.d;
        if (f100Var != null) {
            f100Var.i(this.f, efz.b(bVar.b, "mcs", new StringBuilder("actual seeking to: ")));
        }
        e7s0 e7s0Var = this.y;
        long j = bVar.b;
        dkt0 a2 = e7s0Var.a();
        Iterator it = j5g.H0(a2.d, a2.e).iterator();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                pair = new Pair(Long.valueOf(j2), Integer.valueOf(a2.e));
                break;
            }
            int i2 = i + 1;
            long d = ((c7s0) it.next()).getLayout().d() + j2;
            if (j <= d) {
                pair = new Pair(Long.valueOf(j2), Integer.valueOf(i));
                break;
            } else {
                i = i2;
                j2 = d;
            }
        }
        long longValue = ((Number) pair.d()).longValue();
        int intValue = ((Number) pair.g()).intValue();
        dkt0.a aVar2 = a2.f;
        if (aVar2 != null) {
            a2.a.d(aVar2.b);
            c7s0 c7s0Var = a2.d.get(intValue);
            aVar = new dkt0.a(intValue, c7s0Var);
            a2.f = aVar;
            a2.a.e(c7s0Var, aVar.d, aVar.e, intValue);
        } else {
            c7s0 c7s0Var2 = a2.d.get(intValue);
            aVar = new dkt0.a(intValue, c7s0Var2);
            a2.f = aVar;
            a2.a.e(c7s0Var2, aVar.d, aVar.e, intValue);
        }
        aVar.e.seekTo((long) ((aVar.d.z() * (j - longValue)) + r7.O0()));
        e7s0Var.c = longValue;
        tht0 tht0Var = this.D;
        if (tht0Var != null && (klt0Var = this.x.l.f) != null) {
            klt0Var.b.c(tht0Var);
        }
        this.q = bVar.b - this.y.c;
        this.k = null;
        this.m = false;
        this.C = false;
        f2d0 f2d0Var = this.i;
        if (f2d0Var != null) {
            f2d0Var.d = new dt5.b();
            f2d0Var.c = new dt5.b();
            f2d0Var.b = new dt5.b();
        }
    }

    public final long b() {
        return TimeUnit.SECONDS.toMicros(1L) / (this.z != null ? r2.intValue() : 30);
    }

    public final DecodedSampleStatus c(MediaCodec.BufferInfo bufferInfo) {
        FrameRateController frameRateController = this.v;
        FrameRateController.a a2 = frameRateController != null ? frameRateController.a() : null;
        if (a2 != null && a2.a == FrameRateController.ResultType.SKIP) {
            return DecodedSampleStatus.SKIP;
        }
        long j = this.y.c + ((long) ((bufferInfo.presentationTimeUs - this.r) / this.s)) + this.q;
        qva0.a aVar = this.k;
        this.k = new qva0.a(j, (aVar != null ? aVar.b : 0) + 1);
        bufferInfo.presentationTimeUs = j;
        return DecodedSampleStatus.RENDER;
    }

    public final void d() {
        if (!this.p || this.A) {
            return;
        }
        this.l = new oms0.b(this.y.c + ((long) ((this.E - this.t) / this.s)));
    }

    public final void e() {
        String str = this.f;
        f100 f100Var = this.h;
        if (f100Var != null) {
            f100Var.i(str, "release video track handler");
        }
        ir6 ir6Var = this.y.b;
        try {
            ir6Var.e(false);
            ir6Var.l.e();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Throwable th) {
            f100 f100Var2 = ir6Var.a.d;
            if (f100Var2 != null) {
                f100Var2.e("DefaultVideoTrackDecoderHelper", "Failed to release BaseVideoTrackDecoderHelper: " + th);
            }
        }
        if (!this.w.quit() && f100Var != null) {
            f100Var.c(str, new IllegalStateException("Failed to quit video decoder thread"));
        }
        this.d.i();
        f2d0 f2d0Var = this.i;
        if (f2d0Var != null) {
            f2d0Var.a();
        }
    }

    public final qva0.a f() {
        w7l.a aVar;
        w7l w7lVar = this.a;
        w7l.a aVar2 = w7lVar.c;
        if (aVar2 instanceof w7l.a.b) {
            return null;
        }
        if (aVar2 instanceof w7l.a.C3915a) {
            w7l.a.C3915a c3915a = (w7l.a.C3915a) aVar2;
            int i = c3915a.b;
            if (i < 2) {
                aVar = new w7l.a.C3915a(c3915a.a, i + 1);
            } else {
                aVar = w7l.a.b.a;
            }
            w7lVar.c = aVar;
            return null;
        }
        if (!(aVar2 instanceof w7l.a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        w7l.a.c cVar = (w7l.a.c) aVar2;
        int i2 = cVar.b;
        if (i2 >= 2) {
            w7lVar.c = w7l.a.b.a;
            return null;
        }
        w7lVar.c = new w7l.a.c(cVar.a, i2 + 1);
        return w7lVar.a(i2);
    }

    public final qva0.a g(long j) {
        w7l w7lVar = this.a;
        w7l.a aVar = w7lVar.c;
        if (aVar instanceof w7l.a.b) {
            w7lVar.b(j);
            return null;
        }
        if (aVar instanceof w7l.a.C3915a) {
            w7l.a.C3915a c3915a = (w7l.a.C3915a) aVar;
            if (c3915a.b == 2) {
                long j2 = c3915a.a;
                if (j2 == j) {
                    w7lVar.c = new w7l.a.c(j2, 1);
                    return w7lVar.a(0);
                }
            }
            w7lVar.b(j);
            return null;
        }
        if (!(aVar instanceof w7l.a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        w7l.a.c cVar = (w7l.a.c) aVar;
        boolean z = cVar.b % 2 == 0;
        long j3 = cVar.a;
        if (j3 == j && z) {
            w7lVar.c = new w7l.a.c(j3, 1);
            return w7lVar.a(0);
        }
        w7lVar.b(j);
        return null;
    }

    /* compiled from: VideoPlaybackTrackHandler.kt */
    public final class a extends xmt0 {
        public a(gz8 gz8Var) {
            super(gz8Var, new n9m0(w3t0.this, 16));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
        @Override // xsna.r6t0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final x7l e(MediaCodec.BufferInfo bufferInfo) {
            long j;
            DecodedSampleStatus c;
            DecodedSampleStatus decodedSampleStatus;
            x7l x7lVar;
            oap<Long, Integer> oapVar;
            Boolean valueOf;
            w3t0 w3t0Var = w3t0.this;
            if (w3t0Var.m) {
                return new x7l(DecodedSampleStatus.SKIP, null);
            }
            long j2 = bufferInfo.presentationTimeUs;
            int i = bufferInfo.flags;
            if ((i & 4) != 0) {
                w3t0Var.d();
                c = DecodedSampleStatus.END_OF_STREAM;
            } else {
                if ((i & 2) == 0) {
                    j = j2;
                    if ((w3t0Var.b() / 2) + j2 < (w3t0Var.q * w3t0Var.s) + w3t0Var.t) {
                        c = DecodedSampleStatus.SKIP;
                    } else {
                        long j3 = w3t0Var.u;
                        long j4 = bufferInfo.presentationTimeUs;
                        if (j3 < j4) {
                            w3t0Var.d();
                            c = DecodedSampleStatus.END_OF_MEDIA;
                        } else if (bufferInfo.size <= 0) {
                            c = DecodedSampleStatus.SKIP;
                        } else if (w3t0Var.r == Long.MIN_VALUE) {
                            w3t0Var.r = j4;
                            c = w3t0Var.c(bufferInfo);
                        } else {
                            c = w3t0Var.c(bufferInfo);
                        }
                    }
                    qva0.a aVar = w3t0Var.k;
                    decodedSampleStatus = DecodedSampleStatus.RENDER;
                    boolean z = false;
                    if (c == decodedSampleStatus && aVar != null) {
                        oapVar = w3t0Var.l.a;
                        if (!(oapVar instanceof oap.b)) {
                            valueOf = Boolean.valueOf(((Integer) ((oap.b) oapVar).a).intValue() <= aVar.b);
                        } else {
                            if (!(oapVar instanceof oap.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            valueOf = Boolean.valueOf(((Long) ((oap.a) oapVar).a).longValue() < (w3t0Var.b() / ((long) 2)) + aVar.a);
                        }
                        if (valueOf.booleanValue()) {
                            z = true;
                        }
                    }
                    w3t0Var.A = z;
                    if (c == decodedSampleStatus) {
                        x7lVar = new x7l(c, null);
                    } else if (z) {
                        w3t0Var.d.q = Long.valueOf(aVar.a);
                        x7lVar = new x7l(DecodedSampleStatus.CONSUMED, null);
                    } else {
                        x7lVar = new x7l(DecodedSampleStatus.SKIP, null);
                    }
                    w3t0Var.E = j;
                    return x7lVar;
                }
                c = DecodedSampleStatus.SKIP;
            }
            j = j2;
            qva0.a aVar2 = w3t0Var.k;
            decodedSampleStatus = DecodedSampleStatus.RENDER;
            boolean z2 = false;
            if (c == decodedSampleStatus) {
                oapVar = w3t0Var.l.a;
                if (!(oapVar instanceof oap.b)) {
                }
                if (valueOf.booleanValue()) {
                }
            }
            w3t0Var.A = z2;
            if (c == decodedSampleStatus) {
            }
            w3t0Var.E = j;
            return x7lVar;
        }

        @Override // xsna.r6t0
        public final void a(MediaCodec.BufferInfo bufferInfo) {
        }
    }
}
