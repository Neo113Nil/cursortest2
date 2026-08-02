package xsna;

import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import com.vk.media.pipeline.utils.concurrent.ThreadStuckAnalyzer;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import xsna.dkt0;
import xsna.dt5;
import xsna.g330;
import xsna.gz8;
import xsna.nkp0;
import xsna.oap;
import xsna.oms0;
import xsna.qva0;
import xsna.w3t0;
import xsna.w7l;

/* compiled from: PlaybackProcessor.kt */
/* loaded from: classes3.dex */
public final class mwa0 implements qva0 {
    public final csp a;
    public final nfq b;
    public final gwa0 c;
    public final xu10 d;
    public final xsw e;
    public final q1s0 f;
    public ThreadStuckAnalyzer i;
    public w3t0 j;
    public dn8 k;
    public final u98 l;
    public s98 m;
    public long n;
    public final int o;
    public final int p;
    public final ncl s;
    public final HashSet<String> g = new HashSet<>();
    public volatile chd0 h = new chd0(0);
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(false);

    public mwa0(csp cspVar, Timeline timeline, l0h0 l0h0Var, nfq nfqVar, ju4 ju4Var, gwa0 gwa0Var, xu10 xu10Var, xsw xswVar) {
        this.a = cspVar;
        this.b = nfqVar;
        this.c = gwa0Var;
        this.d = xu10Var;
        this.e = xswVar;
        this.l = new u98(cspVar, l0h0Var);
        this.s = new ncl(cspVar.d, ju4Var, cspVar.b, false);
        f100 f100Var = cspVar.d;
        if (f100Var != null) {
            f100Var.i("PlaybackProcessor", "create playback processor");
        }
        this.m = new t98(cspVar).d(timeline, l0h0Var);
        this.n = TimeUnit.MICROSECONDS.toMillis(timeline.d);
        s98 s98Var = this.m;
        e43.l("video/avc", "video/hevc");
        q1s0 q1s0Var = null;
        MediaFormat b = nkp0.a.b(null, s98Var.b.a, new nkp0.b(0), null);
        this.o = b != null ? b.getInteger("sample-rate") : 44100;
        this.p = 2;
        if (gwa0Var != null) {
            int i = 0;
            int i2 = 9;
            int i3 = 1;
            q1s0Var = new q1s0(new x3i0(new j37(i3, gwa0Var, gwa0.class, "onSeekTimeMeasured", "onSeekTimeMeasured(J)V", i, i2)), new f2d0(new m8(i3, gwa0Var, gwa0.class, "onFrameProcessingInfo", "onFrameProcessingInfo(Lcom/vk/media/pipeline/model/stat/playback/FrameProcessingTimeInfo;)V", i, i2)), new kwa0(this, 0), new lwa0(2, gwa0Var, gwa0.class, "onDecoderFormatInfo", "onDecoderFormatInfo(Lcom/vk/media/pipeline/session/transform/task/transcode/producer/DecoderOutputFormat;I)V", 0));
        }
        this.f = q1s0Var;
    }

    @Override // xsna.qva0
    public final qva0.a a(long j) {
        xu10 xu10Var;
        try {
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Throwable th) {
            if (this.g.add(th.toString()) && (xu10Var = this.d) != null) {
                xu10Var.a(new awa0(th));
            }
            f100 f100Var = this.a.d;
            if (f100Var != null) {
                f100Var.a("PlaybackProcessor", th);
            }
        }
        if (this.q.get()) {
            return null;
        }
        long i = swe0.i(j, 0L, this.n);
        w3t0 w3t0Var = this.j;
        if (w3t0Var == null) {
            w3t0Var = null;
        }
        qva0.a g = w3t0Var.g(i);
        return g == null ? g(new oms0.b(i * 1000)) : g;
    }

    @Override // xsna.qva0
    public final void b(long j) {
        f2d0 f2d0Var;
        dt5.a aVar;
        q1s0 q1s0Var = this.f;
        if (q1s0Var == null || (f2d0Var = q1s0Var.b) == null || (aVar = f2d0Var.b) == null) {
            return;
        }
        aVar.c(j);
    }

    @Override // xsna.qva0
    public final int c() {
        return this.o;
    }

    @Override // xsna.qva0
    public final int d() {
        return this.p;
    }

    @Override // xsna.qva0
    public final ByteBuffer e(int i, int i2) {
        xu10 xu10Var;
        dn8 dn8Var;
        try {
            if (this.q.get() || (dn8Var = this.k) == null) {
                return null;
            }
            return dn8Var.c(i, i2);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        } catch (Throwable th) {
            if (this.g.add(th.toString()) && (xu10Var = this.d) != null) {
                xu10Var.a(new awa0(th));
            }
            f100 f100Var = this.a.d;
            if (f100Var == null) {
                return null;
            }
            f100Var.a("PlaybackProcessor", th);
            return null;
        }
    }

    public final void f(el4 el4Var) {
        if (this.k != null || el4Var.a.isEmpty()) {
            return;
        }
        j630 j630Var = this.c == null ? null : new j630(this, 11);
        m130 m130Var = new m130(this, 18);
        q1s0 q1s0Var = this.f;
        this.k = new dn8(this.a, this.s, el4Var, this.b.a, this.o, this.p, new by4(m130Var, q1s0Var != null ? q1s0Var.a : null, new bx80(this, 3), j630Var));
        f100 f100Var = this.a.d;
        if (f100Var != null) {
            f100Var.i("PlaybackProcessor", "AudioTrackHandler created");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0135, code lost:
    
        if (((java.lang.Number) ((xsna.oap.b) r1).a).intValue() == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0137, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0139, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014b, code lost:
    
        if (((java.lang.Number) ((xsna.oap.a) r1).a).longValue() == 0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qva0.a g(oms0 oms0Var) {
        boolean z;
        dkt0.a aVar;
        boolean z2;
        boolean z3;
        x3i0 x3i0Var;
        dt5.b bVar;
        dkt0.a aVar2;
        klt0 klt0Var;
        klt0 klt0Var2;
        Boolean valueOf;
        dt5.b bVar2;
        boolean z4;
        this.h = new chd0(0);
        w3t0 w3t0Var = this.j;
        if (w3t0Var == null) {
            w3t0Var = null;
        }
        x3i0 x3i0Var2 = w3t0Var.j;
        if (x3i0Var2 != null) {
            x3i0Var2.c = SystemClock.elapsedRealtime();
        }
        qva0.a aVar3 = w3t0Var.k;
        w3t0Var.l = oms0Var;
        w3t0Var.A = false;
        oms0.b bVar3 = oms0Var instanceof oms0.b ? (oms0.b) oms0Var : null;
        if (bVar3 == null) {
            w3t0Var.p = false;
            if (w3t0Var.B) {
                w3t0Var.d.k();
            }
        } else {
            boolean z5 = w3t0Var.B && aVar3 != null && bVar3.b >= aVar3.a;
            w3t0Var.B = z5;
            if (!z5 || w3t0Var.C) {
                String str = w3t0Var.f;
                f100 f100Var = w3t0Var.h;
                if (aVar3 != null && !z5) {
                    long j = bVar3.b;
                    long j2 = aVar3.a;
                    if (j < j2) {
                        if (f100Var != null) {
                            f100Var.i(str, "requested past frame, seeking backwards. frameRequest=" + bVar3 + ", lastProcessed=" + aVar3);
                        }
                    } else if (j <= j2 + 500000) {
                        z = w3t0Var.C;
                        if (z) {
                            w3t0Var.a();
                        }
                        e7s0 e7s0Var = w3t0Var.y;
                        long j3 = ((oms0.b) oms0Var).b;
                        dkt0 a = e7s0Var.a();
                        aVar = a.f;
                        if (aVar != null) {
                            VideoFragment layout = aVar.b.getLayout();
                            long j4 = layout.c;
                            if ((j4 <= j3 && j3 < layout.d) || (j4 <= j3 && aVar.a == a.e)) {
                                z2 = true;
                                w3t0Var.p = z2;
                            }
                        }
                        z2 = false;
                        w3t0Var.p = z2;
                    } else if (f100Var != null) {
                        f100Var.i(str, "requested future frame, seeking forward. frameRequest=" + bVar3 + ", lastProcessed=" + aVar3);
                    }
                } else if (f100Var != null) {
                    f100Var.i(str, "requested frame after update model, seeking. frameRequest=" + bVar3);
                }
                z = true;
                if (z) {
                }
                e7s0 e7s0Var2 = w3t0Var.y;
                long j32 = ((oms0.b) oms0Var).b;
                dkt0 a2 = e7s0Var2.a();
                aVar = a2.f;
                if (aVar != null) {
                }
                z2 = false;
                w3t0Var.p = z2;
            } else {
                w3t0Var.d.k();
                qva0.a aVar4 = w3t0Var.k;
                w3t0Var.k = aVar4 != null ? new qva0.a(bVar3.b, aVar4.b) : null;
            }
        }
        this.h = chd0.a(this.h, Long.valueOf(System.currentTimeMillis()), null, null, 13);
        if (w3t0Var.B && (oms0Var instanceof oms0.a)) {
            oap<Long, Integer> oapVar = oms0Var.a;
            if (!(oapVar instanceof oap.b)) {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (!z4) {
                this.h = chd0.a(this.h, null, Long.valueOf(System.currentTimeMillis()), 0, 3);
                f100 f100Var2 = this.a.d;
                if (f100Var2 != null) {
                    f100Var2.i("PlaybackProcessor", "ENTIRE TIMELINE PLAYED");
                }
                return null;
            }
        }
        gz8 gz8Var = w3t0Var.d;
        f2d0 f2d0Var = w3t0Var.i;
        w3t0.b bVar4 = w3t0Var.x;
        if (!w3t0Var.n && f2d0Var != null && (bVar2 = f2d0Var.c) != null) {
            bVar2.f = SystemClock.elapsedRealtime();
        }
        w3t0Var.g = 0;
        if (w3t0Var.p) {
            klt0 klt0Var3 = bVar4.l.f;
            if ((klt0Var3 != null && klt0Var3.b.e()) && bVar4.d()) {
                z3 = true;
                if (!w3t0Var.o || z3) {
                    gz8Var.k();
                    qva0.a aVar5 = w3t0Var.k;
                    w3t0Var.k = aVar5 == null ? new qva0.a(aVar5.a, aVar5.b + 1) : null;
                } else {
                    while (!w3t0Var.A && !w3t0Var.B && !((Boolean) w3t0Var.b.c.get()).booleanValue() && !Thread.currentThread().isInterrupted()) {
                        e7s0 e7s0Var3 = w3t0Var.y;
                        qva0.a aVar6 = w3t0Var.k;
                        if (aVar6 != null) {
                            oap<Long, Integer> oapVar2 = w3t0Var.l.a;
                            if (oapVar2 instanceof oap.b) {
                                valueOf = Boolean.valueOf(((Integer) ((oap.b) oapVar2).a).intValue() == aVar6.b);
                            } else {
                                if (!(oapVar2 instanceof oap.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                valueOf = Boolean.valueOf(((Long) ((oap.a) oapVar2).a).longValue() - aVar6.a < w3t0Var.b());
                            }
                            if (valueOf.booleanValue() && w3t0Var.p) {
                                f100 f100Var3 = w3t0Var.h;
                                if (f100Var3 != null) {
                                    f100Var3.i(w3t0Var.f, "requested current frame: " + w3t0Var.l + ", render it");
                                }
                                gz8Var.k();
                                w3t0Var.A = true;
                                w3t0Var.g++;
                            }
                        }
                        w3t0Var.A = false;
                        dkt0.a aVar7 = e7s0Var3.a().f;
                        if (aVar7 != null ? aVar7.c : true) {
                            klt0 klt0Var4 = bVar4.l.f;
                            if (!(klt0Var4 != null && klt0Var4.b.e()) && (klt0Var2 = bVar4.l.f) != null) {
                                klt0Var2.b.g(false);
                            }
                        }
                        dkt0.a aVar8 = e7s0Var3.a().f;
                        if (!(aVar8 != null ? aVar8.c : true) || bVar4.d()) {
                            if (e7s0Var3.b.d() && (aVar2 = e7s0Var3.a().f) != null) {
                                aVar2.c = true;
                            }
                            e7s0Var3.a().a();
                        } else {
                            tht0 tht0Var = w3t0Var.D;
                            if (tht0Var != null && (klt0Var = e7s0Var3.b.l.f) != null) {
                                klt0Var.b.a(tht0Var);
                            }
                        }
                        if (w3t0Var.p && !w3t0Var.A && bVar4.d()) {
                            w3t0Var.a();
                        }
                        w3t0Var.g++;
                    }
                }
                if (!w3t0Var.n && f2d0Var != null && (bVar = f2d0Var.c) != null) {
                    bVar.a();
                }
                x3i0Var = w3t0Var.j;
                if (x3i0Var != null) {
                    x3i0Var.g++;
                    long elapsedRealtime = x3i0Var.e + (SystemClock.elapsedRealtime() - x3i0Var.c);
                    x3i0Var.e = elapsedRealtime;
                    if (x3i0Var.f && x3i0Var.g == 2) {
                        x3i0Var.a.invoke(Long.valueOf(elapsedRealtime + x3i0Var.d));
                        x3i0Var.f = false;
                    }
                    if (!x3i0Var.f) {
                        x3i0Var.e = 0L;
                    }
                }
                w3t0Var.n = false;
                w3t0Var.o = w3t0Var.l instanceof oms0.b;
                this.h = chd0.a(this.h, null, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(w3t0Var.g), 3);
                return w3t0Var.k;
            }
        }
        z3 = false;
        if (w3t0Var.o) {
        }
        gz8Var.k();
        qva0.a aVar52 = w3t0Var.k;
        w3t0Var.k = aVar52 == null ? new qva0.a(aVar52.a, aVar52.b + 1) : null;
        if (!w3t0Var.n) {
            bVar.a();
        }
        x3i0Var = w3t0Var.j;
        if (x3i0Var != null) {
        }
        w3t0Var.n = false;
        w3t0Var.o = w3t0Var.l instanceof oms0.b;
        this.h = chd0.a(this.h, null, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(w3t0Var.g), 3);
        return w3t0Var.k;
    }

    @Override // xsna.qva0
    public final long getDurationUs() {
        return this.n;
    }

    @Override // xsna.qva0
    public final int getHeight() {
        return ((ev10) this.e.c).l.getHeight();
    }

    @Override // xsna.qva0
    public final int getWidth() {
        return ((ev10) this.e.c).l.getWidth();
    }

    public final void h(el4 el4Var) {
        f100 f100Var = this.a.d;
        if (f100Var != null) {
            f100Var.i("PlaybackProcessor", "Update audio model for BufferingAudioPlaybackTrackHandler");
        }
        f(el4Var);
        dn8 dn8Var = this.k;
        if (dn8Var == null || dn8Var.g) {
            return;
        }
        ml4 ml4Var = dn8Var.f;
        ml4Var.e(ml4Var.i, new d7(el4Var, 5), new jl4(0, ml4Var, el4Var));
        dn8Var.h = null;
        dn8Var.i = null;
    }

    public final void i(g330 g330Var) {
        xu10 xu10Var;
        s98 s98Var;
        try {
            if (!this.q.get() && this.r.get()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = g330Var instanceof g330.c;
                u98 u98Var = this.l;
                if (z) {
                    s98Var = u98Var.c(this.m, ((g330.c) g330Var).a);
                    j(s98Var.a);
                    h(s98Var.b);
                } else if (g330Var instanceof g330.e) {
                    s98Var = u98Var.b(this.m, ((g330.e) g330Var).a);
                    j(s98Var.a);
                } else if (g330Var instanceof g330.a) {
                    s98Var = u98Var.a(this.m, ((g330.a) g330Var).a);
                    h(s98Var.b);
                } else {
                    s98Var = this.m;
                }
                this.m = s98Var;
                gwa0 gwa0Var = this.c;
                if (gwa0Var != null) {
                    gwa0Var.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Throwable th) {
            if (this.g.add(th.toString()) && (xu10Var = this.d) != null) {
                xu10Var.a(new awa0(th));
            }
            f100 f100Var = this.a.d;
            if (f100Var != null) {
                f100Var.a("PlaybackProcessor", th);
            }
        }
    }

    @Override // xsna.qva0
    public final boolean init() {
        xu10 xu10Var;
        xsw xswVar = this.e;
        csp cspVar = this.a;
        Boolean bool = null;
        try {
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Throwable th) {
            if (this.g.add(th.toString()) && (xu10Var = this.d) != null) {
                xu10Var.a(new awa0(th));
            }
            f100 f100Var = cspVar.d;
            if (f100Var != null) {
                f100Var.a("PlaybackProcessor", th);
            }
        }
        if (!this.r.compareAndSet(false, true)) {
            return true;
        }
        ThreadStuckAnalyzer threadStuckAnalyzer = new ThreadStuckAnalyzer(Looper.myLooper(), cspVar.d, 5000L);
        threadStuckAnalyzer.d = new cfz(this, 10);
        threadStuckAnalyzer.g.add("AudioBufferingHandlerThread");
        Iterator it = rli0.y(dli0.e(0, new u620(11)), 3).iterator();
        while (it.hasNext()) {
            threadStuckAnalyzer.g.add("decoder-preparing-thread-" + ((Number) it.next()).intValue());
        }
        threadStuckAnalyzer.start();
        this.i = threadStuckAnalyzer;
        csp cspVar2 = this.a;
        List<c7s0> list = this.m.a;
        ncl nclVar = this.s;
        Size size = ((ev10) xswVar.c).l;
        this.j = new w3t0(cspVar2, list, nclVar, Math.max(size.getWidth(), size.getHeight()), new gz8(cspVar, xswVar, this.b.b), this.f);
        f(this.m.b);
        bool = Boolean.TRUE;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void j(List<? extends c7s0> list) {
        f100 f100Var = this.a.d;
        if (f100Var != null) {
            f100Var.i("PlaybackProcessor", "Update video model for VideoPlaybackTrackHandler ");
        }
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        Iterator<T> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((c7s0) it.next()).getLayout().d();
        }
        this.n = timeUnit.toMillis(j);
        w3t0 w3t0Var = this.j;
        if (w3t0Var == null) {
            w3t0Var = null;
        }
        w3t0Var.y.a().b(list);
        w3t0Var.C = true;
        w7l w7lVar = w3t0Var.a;
        w7lVar.getClass();
        w7lVar.c = w7l.a.b.a;
        gz8 gz8Var = w7lVar.a;
        gz8Var.r = 0;
        sk3<gz8.a> sk3Var = gz8Var.s;
        Iterator<gz8.a> it2 = sk3Var.iterator();
        while (it2.hasNext()) {
            it2.next().b.a();
        }
        sk3Var.clear();
    }

    @Override // xsna.qva0
    public final void release() {
        xu10 xu10Var;
        csp cspVar = this.a;
        try {
            if (this.q.compareAndSet(false, true)) {
                f100 f100Var = cspVar.d;
                if (f100Var != null) {
                    f100Var.i("PlaybackProcessor", "release playback processor");
                }
                w3t0 w3t0Var = this.j;
                if (w3t0Var != null) {
                    w3t0Var.e();
                }
                ThreadStuckAnalyzer threadStuckAnalyzer = this.i;
                if (threadStuckAnalyzer != null) {
                    threadStuckAnalyzer.interrupt();
                }
                dn8 dn8Var = this.k;
                if (dn8Var != null) {
                    dn8Var.i();
                }
                this.m.b();
                s3q0 s3q0Var = s3q0.a;
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Throwable th) {
            if (this.g.add(th.toString()) && (xu10Var = this.d) != null) {
                xu10Var.a(new awa0(th));
            }
            f100 f100Var2 = cspVar.d;
            if (f100Var2 != null) {
                f100Var2.a("PlaybackProcessor", th);
            }
        }
    }

    @Override // xsna.qva0
    public final qva0.a v(int i) {
        xu10 xu10Var;
        try {
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Throwable th) {
            if (this.g.add(th.toString()) && (xu10Var = this.d) != null) {
                xu10Var.a(new awa0(th));
            }
            f100 f100Var = this.a.d;
            if (f100Var != null) {
                f100Var.a("PlaybackProcessor", th);
            }
        }
        if (this.q.get()) {
            return null;
        }
        w3t0 w3t0Var = this.j;
        if (w3t0Var == null) {
            w3t0Var = null;
        }
        qva0.a f = w3t0Var.f();
        return f == null ? g(new oms0.a(new oap.b(Integer.valueOf(i)))) : f;
    }
}
