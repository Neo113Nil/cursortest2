package xsna;

import android.os.SystemClock;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.hb60;

/* compiled from: AudienceResearchTrackingCallback.kt */
/* loaded from: classes4.dex */
public final class bb4 implements hb60.a {
    public final ua4 a;
    public final izs<NewsEntry, Boolean> b;
    public final long c;
    public final long d;
    public final long e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final AtomicLong g;
    public final ConcurrentHashMap<NewsEntry, a> h;
    public volatile io.reactivex.rxjava3.disposables.c i;

    /* compiled from: AudienceResearchTrackingCallback.kt */
    public final class a {
        public final AtomicLong a = new AtomicLong(0);
        public final AtomicBoolean b = new AtomicBoolean(false);
        public final AtomicBoolean c = new AtomicBoolean(false);
        public final AtomicBoolean d = new AtomicBoolean(false);
        public io.reactivex.rxjava3.disposables.c e;

        public a() {
        }

        public final void a() {
            this.d.set(true);
            if (this.c.compareAndSet(true, false)) {
                io.reactivex.rxjava3.core.a a = bb4.this.a.a();
                a.getClass();
                itg0.j(new io.reactivex.rxjava3.internal.operators.completable.v(a, io.reactivex.rxjava3.internal.functions.a.g).q(asu0.a.c()), null, 3);
            }
            io.reactivex.rxjava3.disposables.c cVar = this.e;
            if (cVar != null) {
                cVar.dispose();
            }
            this.e = null;
            this.b.set(false);
        }
    }

    /* compiled from: AudienceResearchTrackingCallback.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public bb4() {
        throw null;
    }

    public bb4(ua4 ua4Var, izs izsVar) {
        this.a = ua4Var;
        this.b = izsVar;
        this.c = 1000L;
        this.d = ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS;
        this.e = 2000L;
        this.f = new io.reactivex.rxjava3.disposables.b();
        this.g = new AtomicLong(0L);
        this.h = new ConcurrentHashMap<>();
    }

    @Override // xsna.hb60.a
    public final long a() {
        return 0L;
    }

    @Override // xsna.hb60.a
    public final void b(NewsEntry newsEntry, List<? extends qi6<?>> list) {
        a putIfAbsent;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.g.set(elapsedRealtime);
        if (!this.b.invoke(newsEntry).booleanValue()) {
            c();
            return;
        }
        ConcurrentHashMap<NewsEntry, a> concurrentHashMap = this.h;
        a aVar = concurrentHashMap.get(newsEntry);
        if (aVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(newsEntry, (aVar = new a()))) != null) {
            aVar = putIfAbsent;
        }
        a aVar2 = aVar;
        bb4 bb4Var = bb4.this;
        aVar2.a.set(elapsedRealtime);
        if (aVar2.b.compareAndSet(false, true)) {
            aVar2.d.set(false);
            int i = 1;
            io.reactivex.rxjava3.disposables.c l = itg0.l(xa4.m(bb4Var.a, bb4Var.c, bb4Var.d, new g50(aVar2, i), new wm1(aVar2, i)).q(asu0.a.c()));
            bb4Var.f.b(l);
            aVar2.e = l;
        }
        c();
    }

    public final void c() {
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.internal.operators.completable.a0 r = io.reactivex.rxjava3.core.a.r(this.e, TimeUnit.MILLISECONDS);
        asu0.a.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = r.q(asu0.i()).subscribe(new jf1(this, 1), new ia(new b(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 5));
        this.f.b(subscribe);
        this.i = subscribe;
    }

    @Override // xsna.hb60.a
    public final void dispose() {
        Iterator<T> it = this.h.values().iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
        this.h.clear();
        this.f.e();
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        this.i = null;
    }
}
