package xsna;

import android.media.MediaCodec;
import com.vk.media.codec.MediaCodecSelectorException;
import com.vk.media.pipeline.PipelineException;
import com.vk.media.pipeline.codec.MediaCodecException;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.stat.TranscodeType;
import com.vk.media.pipeline.model.timeline.AudioFragment;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import com.vk.media.pipeline.model.transform.TransformFormat;
import com.vk.media.pipeline.session.playback.PlaybackException;
import com.vk.media.pipeline.utils.concurrent.ThreadStuckAnalyzer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.dkt0;
import xsna.g330;
import xsna.qpa0;

/* compiled from: PipelineImpl.kt */
/* loaded from: classes3.dex */
public final class ppa0 implements gpa0 {
    public final Timeline a;
    public final nfq b;
    public final xu10 c;
    public final jpa0 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final csp h;
    public volatile qpa0 i;
    public volatile jrk0 j;
    public volatile tsi0 k;

    /* compiled from: PipelineImpl.kt */
    public static final /* synthetic */ class a extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            ppa0 ppa0Var = (ppa0) this.receiver;
            return Boolean.valueOf(ppa0Var.g.get() || ppa0Var.e.get());
        }
    }

    public ppa0(ipa0 ipa0Var) {
        this.a = ipa0Var.e;
        this.b = new nfq(ipa0Var.f, ipa0Var.g);
        this.c = ipa0Var.b;
        jpa0 jpa0Var = ipa0Var.c;
        this.d = jpa0Var;
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        this.g = new AtomicBoolean();
        this.h = new csp(ipa0Var.a.getApplicationContext(), jpa0Var, new a(this, ppa0.class, "isCancelPipelineExecutionRequested", "isCancelPipelineExecutionRequested()Z", 0), ipa0Var.d);
    }

    @Override // xsna.gpa0
    public final qva0 a(xsw xswVar) {
        if (this.k != null) {
            g(new PlaybackException("Only one active session permitted! Either Transform or Playback."));
            return null;
        }
        qpa0 dVar = new qpa0.d(true);
        qpa0 qpa0Var = qpa0.a.a;
        if (this.g.get() || this.e.get()) {
            dVar = qpa0Var;
        }
        this.i = dVar;
        try {
            lya0 lya0Var = new lya0(this.h, this.a, this.b, xswVar, this.c);
            this.k = lya0Var;
            return lya0Var.f;
        } catch (PipelineException e) {
            g(e);
            return null;
        } catch (Throwable th) {
            g(new PlaybackException(th));
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.List] */
    @Override // xsna.gpa0
    public final void b(Timeline timeline) {
        boolean equals;
        g330 eVar;
        f100 f100Var;
        tsi0 tsi0Var = this.k;
        if (tsi0Var == null || !(tsi0Var instanceof lya0)) {
            g(new PlaybackException("Tried to updateModel but session is " + tsi0Var));
            return;
        }
        lya0 lya0Var = (lya0) tsi0Var;
        mwa0 mwa0Var = lya0Var.h;
        if (mwa0Var == null) {
            lya0Var.b = timeline;
            f100 f100Var2 = lya0Var.a.d;
            if (f100Var2 != null) {
                f100Var2.i("PlaybackSession", "timeline changed before PlaybackProcessor initialization");
                return;
            }
            return;
        }
        Timeline timeline2 = lya0Var.b;
        List<VideoFragment> list = timeline2.b;
        AudioFragment audioFragment = timeline.c;
        List<VideoFragment> list2 = timeline.b;
        if (timeline2.equals(timeline)) {
            eVar = g330.b.a;
        } else {
            if (list.size() != list2.size()) {
                equals = false;
            } else {
                List<VideoFragment> list3 = list2;
                List<VideoFragment> list4 = list;
                Iterator<T> it = list3.iterator();
                Iterator<T> it2 = list4.iterator();
                ArrayList arrayList = new ArrayList(Math.min(c5g.u(list3, 10), c5g.u(list4, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    VideoFragment videoFragment = (VideoFragment) it.next();
                    arrayList.add(new VideoFragment(videoFragment.b.q3(((VideoFragment) it2.next()).b.X8()), videoFragment.c, videoFragment.d));
                }
                equals = new Timeline(arrayList, timeline.c).equals(timeline2);
            }
            eVar = equals ? g330.d.a : (list.equals(list2) || timeline2.c.equals(audioFragment)) ? !list.equals(list2) ? new g330.e(list2) : new g330.a(audioFragment) : new g330.c(timeline);
        }
        if (eVar instanceof g330.b) {
            return;
        }
        if (eVar instanceof g330.d) {
            List<VideoFragment> list5 = timeline.b;
            ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
            Iterator<T> it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((VideoFragment) it3.next()).b.X8());
            }
            if (!mwa0Var.q.get() && mwa0Var.r.get()) {
                w3t0 w3t0Var = mwa0Var.j;
                if (w3t0Var == null) {
                    w3t0Var = null;
                }
                dkt0 a2 = w3t0Var.y.a();
                if (a2.g.size() != arrayList2.size() && (f100Var = a2.h) != null) {
                    f100Var.b(new IllegalStateException("incorrect updateVideoPlayableItems: " + j5g.g0((Iterable) a2.g, null, null, null, 0, null, 63) + " | " + j5g.g0(arrayList2, null, null, null, 0, null, 63)), "VideoTimelineReader");
                }
                Iterable iterable = (Iterable) a2.g;
                Iterator it4 = iterable.iterator();
                Iterator it5 = arrayList2.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(c5g.u(iterable, 10), c5g.u(arrayList2, 10)));
                while (it4.hasNext() && it5.hasNext()) {
                    Object next = it4.next();
                    VideoEffect videoEffect = (VideoEffect) it5.next();
                    dkt0.c cVar = (dkt0.c) next;
                    if (videoEffect == null) {
                        videoEffect = (VideoEffect) VideoEffect.e.getValue();
                    }
                    arrayList3.add(new dkt0.c(videoEffect, cVar.b, cVar.c));
                }
                a2.g = arrayList3;
            }
            f100 f100Var3 = lya0Var.a.d;
            if (f100Var3 != null) {
                f100Var3.i("PlaybackSession", "timeline recoverably changed, handlers updated");
            }
        } else {
            lya0Var.i = eVar;
            f100 f100Var4 = lya0Var.a.d;
            if (f100Var4 != null) {
                f100Var4.i("PlaybackSession", "timeline unrecoverably changed, handlers will be recreated");
            }
        }
        lya0Var.b = timeline;
    }

    @Override // xsna.gpa0
    public final qpa0 c(ykm0 ykm0Var) {
        qpa0 h;
        if (this.k != null) {
            return h(new PipelineException("Only one active session permitted! Either Transform or Playback."));
        }
        qpa0 dVar = new qpa0.d(false);
        qpa0 qpa0Var = qpa0.a.a;
        if (this.g.get() || this.e.get()) {
            dVar = qpa0Var;
        }
        this.i = dVar;
        this.e.set(false);
        this.f.set(true);
        try {
            try {
                try {
                    try {
                        qpa0 i = i(e(ykm0Var));
                        f();
                        this.f.set(false);
                        this.k = null;
                        return i;
                    } catch (InterruptedException e) {
                        h = h(e);
                        f();
                        this.f.set(false);
                        this.k = null;
                        return h;
                    }
                } catch (PipelineException e2) {
                    h = h(e2);
                    f();
                    this.f.set(false);
                    this.k = null;
                    return h;
                }
            } catch (Throwable th) {
                h = h(new PipelineException(th));
                f();
                this.f.set(false);
                this.k = null;
                return h;
            }
        } catch (Throwable th2) {
            f();
            this.f.set(false);
            this.k = null;
            throw th2;
        }
    }

    @Override // xsna.gpa0
    public final void cancel() {
        this.e.set(true);
    }

    public final okp0 d(ykm0 ykm0Var, boolean z) {
        csp cspVar = this.h;
        Timeline timeline = this.a;
        nfq nfqVar = this.b;
        okp0 okp0Var = new okp0(cspVar, timeline, nfqVar, this.c, ykm0Var, z);
        this.k = okp0Var;
        long currentTimeMillis = System.currentTimeMillis();
        f100 f100Var = cspVar.d;
        if (f100Var != null) {
            f100Var.i("TransformSession", "Start transforming for timeline: " + timeline);
        }
        f100 f100Var2 = cspVar.d;
        if (f100Var2 != null) {
            f100Var2.i("TransformSession", "Requested transform format: " + ((TransformFormat) ykm0Var.b));
        }
        Thread currentThread = Thread.currentThread();
        ThreadStuckAnalyzer threadStuckAnalyzer = new ThreadStuckAnalyzer(null, cspVar.d, TimeUnit.MINUTES.toMillis(2L));
        threadStuckAnalyzer.g.add(Thread.currentThread().getName());
        threadStuckAnalyzer.g.add("video-transcode-rendering-handler-thread");
        threadStuckAnalyzer.e = new cod0(okp0Var, currentThread);
        threadStuckAnalyzer.start();
        try {
            a5o0 a2 = new jol(cspVar, timeline, nfqVar, okp0Var.f, z).a(new ykm0((File) ykm0Var.a, (TransformFormat) ykm0Var.b, new jkp0(new kkp0((jkp0) ykm0Var.c, threadStuckAnalyzer))));
            try {
                okp0Var.d = a2.c();
                okp0Var.e = ((ejp0) a2.d.a).a(new gq10(a2.a.d));
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                f100 f100Var3 = cspVar.d;
                if (f100Var3 != null) {
                    f100Var3.i("TransformSession", "Session ended with status=(" + okp0Var.d + "), output=" + ((File) ykm0Var.a).getAbsolutePath());
                }
                f100 f100Var4 = cspVar.d;
                if (f100Var4 != null) {
                    f100Var4.i("TransformSession", a2.e + " execution took " + currentTimeMillis2 + " ms");
                }
                okp0Var.b(a2);
                a2.b();
                return okp0Var;
            } catch (Throwable th) {
                a2.b();
                throw th;
            }
        } finally {
            threadStuckAnalyzer.interrupt();
        }
    }

    public final okp0 e(ykm0 ykm0Var) {
        rtf0 rtf0Var = new rtf0(((jkp0) ykm0Var.c).a);
        ykm0 ykm0Var2 = new ykm0((File) ykm0Var.a, (TransformFormat) ykm0Var.b, new jkp0(rtf0Var));
        try {
            okp0 d = d(ykm0Var2, false);
            qpa0 qpa0Var = d.d;
            if (qpa0Var instanceof qpa0.c) {
                throw ((qpa0.c) qpa0Var).a;
            }
            return d;
        } catch (Throwable th) {
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (th2 instanceof MediaCodecException) {
                    break;
                }
                if (th2.equals(th2.getCause())) {
                    break;
                }
            }
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                if (th3 instanceof ThreadStuckAnalyzer.ThreadStuckException) {
                    break;
                }
                if (th3.equals(th3.getCause())) {
                    break;
                }
            }
            for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                if (th4 instanceof MediaCodec.CodecException) {
                    break;
                }
                if (th4.equals(th4.getCause())) {
                    break;
                }
            }
            for (Throwable th5 = th; th5 != null; th5 = th5.getCause()) {
                if (th5 instanceof MediaCodecSelectorException) {
                    if (this.g.get() || this.e.get()) {
                        throw th;
                    }
                    tsi0 tsi0Var = this.k;
                    if (tsi0Var != null) {
                        zu10 a2 = tsi0Var.a(th);
                        xu10 xu10Var = this.c;
                        if (xu10Var != null) {
                            xu10Var.e(new dkp0(a2));
                        }
                        f100 f100Var = this.h.d;
                        if (f100Var != null) {
                            f100Var.e("PipelineImpl", "Performing SW fallback due to error: " + a2);
                        }
                    }
                    rtf0Var.c = true;
                    rtf0Var.d = rtf0Var.b;
                    return d(ykm0Var2, true);
                }
                if (th5.equals(th5.getCause())) {
                    break;
                }
            }
            throw th;
        }
    }

    public final void f() {
        tsi0 tsi0Var;
        qpa0 qpa0Var = this.i;
        if (!(qpa0Var instanceof qpa0.b)) {
            if (qpa0Var instanceof qpa0.c) {
                qpa0.c cVar = (qpa0.c) qpa0Var;
                if ((cVar.a instanceof InterruptedException) || (tsi0Var = this.k) == null) {
                    return;
                }
                zu10 a2 = tsi0Var.a(cVar.a);
                xu10 xu10Var = this.c;
                if (xu10Var != null) {
                    xu10Var.c(a2);
                }
                f100 f100Var = this.h.d;
                if (f100Var != null) {
                    f100Var.e("PipelineImpl", "Transforming error: " + a2);
                    return;
                }
                return;
            }
            return;
        }
        if (!((qpa0.b) qpa0Var).b) {
            xu10 xu10Var2 = this.c;
            if (xu10Var2 != null) {
                xu10Var2.b();
                return;
            }
            return;
        }
        jrk0 jrk0Var = this.j;
        pkp0 pkp0Var = jrk0Var != null ? new pkp0(jrk0Var.a, jrk0Var.b, jrk0Var.c, jrk0Var.d, jrk0Var.e, jrk0Var.f, jrk0Var.o, jrk0Var.p, jrk0Var.h, jrk0Var.i, jrk0Var.j, jrk0Var.k, jrk0Var.l, jrk0Var.m, jrk0Var.n, jrk0Var.q, jrk0Var.r, jrk0Var.s, jrk0Var.t, jrk0Var.u, jrk0Var.v) : new pkp0(0, 0, 0, 0, 0, 0, false, false, 0L, 0L, 0L, 0L, 0L, TranscodeType.NONE, EmptyList.b, false, null, null, null, null, null);
        xu10 xu10Var3 = this.c;
        if (xu10Var3 != null) {
            xu10Var3.g(pkp0Var);
        }
        f100 f100Var2 = this.h.d;
        if (f100Var2 != null) {
            f100Var2.i("PipelineImpl", "Transforming done. Stat: " + pkp0Var);
        }
    }

    public final void g(PipelineException pipelineException) {
        xu10 xu10Var = this.c;
        if (xu10Var != null) {
            xu10Var.a(new awa0(pipelineException));
        }
    }

    public final qpa0 h(Exception exc) {
        qpa0 qpa0Var = qpa0.a.a;
        if (!this.g.get() && !this.e.get()) {
            qpa0Var = new qpa0.c(exc);
        }
        this.i = qpa0Var;
        return qpa0Var;
    }

    public final qpa0 i(okp0 okp0Var) {
        qpa0 qpa0Var = qpa0.a.a;
        if (!this.g.get() && !this.e.get()) {
            qpa0Var = okp0Var.d;
        }
        this.i = qpa0Var;
        this.j = okp0Var.e;
        return qpa0Var;
    }

    @Override // xsna.gpa0
    public final void release() {
        this.g.set(true);
        tsi0 tsi0Var = this.k;
        lya0 lya0Var = tsi0Var instanceof lya0 ? (lya0) tsi0Var : null;
        if (lya0Var != null) {
            lya0Var.j = true;
        }
    }
}
