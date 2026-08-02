package xsna;

import android.net.Uri;
import android.os.SystemClock;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.model.builders.ImageStatusEventBuilder;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.c;
import okhttp3.p;
import xsna.i360;

/* compiled from: OkHttpNetworkNewFetcher.kt */
/* loaded from: classes2.dex */
public final class iy70 extends oi6 {
    public final boolean a;
    public final bpn0 b;
    public final ConcurrentHashMap.KeySetView<u6r, Boolean> c = ConcurrentHashMap.newKeySet();
    public final PriorityBlockingQueue<b> d = new PriorityBlockingQueue<>(16, b.b);
    public final AtomicReference<ScheduledFuture<?>> e = new AtomicReference<>(null);

    /* compiled from: OkHttpNetworkNewFetcher.kt */
    public final class a extends uk6 {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // xsna.vhd0
        public final void c() {
            ImageStatusEventBuilder.Status status = ImageStatusEventBuilder.Status.CancelRequested;
            iy70 iy70Var = iy70.this;
            iy70Var.k(status);
            L l = L.a;
            l.getClass();
            LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
            boolean m = L.m(loggerOutputTarget);
            c cVar = this.a;
            if (!m) {
                L.u(l, L.LogType.d, new Object[]{"OkHttpNetworkNewFetcher", "Cancellation requested: " + cVar.b()});
            }
            if (!iy70Var.c.contains(cVar)) {
                cVar.b.n().w().b().execute(new j0(cVar, 12));
                return;
            }
            l.getClass();
            if (L.m(loggerOutputTarget)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"OkHttpNetworkNewFetcher", "Cannot cancel already running loading: " + cVar.b()});
        }
    }

    /* compiled from: OkHttpNetworkNewFetcher.kt */
    public static final class b {
        public static final jy70 b = new jy70(0);
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }
    }

    /* compiled from: OkHttpNetworkNewFetcher.kt */
    public static final class c extends u6r {
        public volatile boolean d;
        public volatile long e;
        public volatile i360.a f;
        public volatile boolean g;

        public c() {
            throw null;
        }
    }

    /* compiled from: OkHttpNetworkNewFetcher.kt */
    public final class d implements lb9 {
        public final c b;

        public d(c cVar) {
            this.b = cVar;
        }

        @Override // xsna.lb9
        public final void onFailure(okhttp3.d dVar, IOException iOException) {
            iy70 iy70Var = iy70.this;
            c cVar = this.b;
            iy70Var.i(dVar, iOException, cVar);
            iy70Var.c.remove(cVar);
            iy70Var.h();
        }

        @Override // xsna.lb9
        public final void onResponse(okhttp3.d dVar, okhttp3.u uVar) {
            Object failure;
            okhttp3.v vVar;
            iy70 iy70Var = iy70.this;
            c cVar = this.b;
            try {
                vVar = uVar.h;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (vVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            try {
                if (uVar.t()) {
                    long contentLength = vVar.contentLength();
                    if (contentLength < 0) {
                        contentLength = 0;
                    }
                    int i = (int) contentLength;
                    i360.a aVar = cVar.f;
                    if (aVar != null) {
                        aVar.c(vVar.byteStream(), i);
                    }
                    L.e("OkHttpNetworkNewFetcher", "Response is handled: " + cVar.b());
                    iy70Var.k(ImageStatusEventBuilder.Status.Loaded);
                    s3q0 s3q0Var = s3q0.a;
                    vVar.close();
                } else {
                    iy70Var.i(dVar, new IOException("Unexpected HTTP code " + uVar), cVar);
                    vVar.close();
                }
                failure = s3q0.a;
                Throwable a = Result.a(failure);
                if (a != null) {
                    iy70Var.i(dVar, a, cVar);
                }
                iy70.this.c.remove(this.b);
                iy70.this.h();
            } finally {
            }
        }
    }

    public iy70(jnf jnfVar, boolean z) {
        this.a = z;
        this.b = new bpn0(new mh3(19, jnfVar, this));
    }

    public static okhttp3.p g(c cVar) {
        Object failure;
        try {
            Uri e = jeq0.e(cVar.b(), "client_cache_source");
            p.a aVar = new p.a();
            c.a aVar2 = new c.a();
            aVar2.b = true;
            aVar.c(aVar2.a());
            aVar.i(e.toString());
            aVar.d();
            failure = aVar.b();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.f("OkHttpNetworkNewFetcher", "Cannot create request", a2);
        }
        kotlin.a.a(failure);
        return (okhttp3.p) failure;
    }

    @Override // xsna.oi6
    public final u6r a(l7j l7jVar, uhd0 uhd0Var) {
        return new c(l7jVar, uhd0Var);
    }

    @Override // xsna.oi6
    public final void b(u6r u6rVar, i360.a aVar) {
        Object failure;
        c cVar = (c) u6rVar;
        try {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"OkHttpNetworkNewFetcher", "Schedule fetching image: " + cVar.b()});
            }
            k(ImageStatusEventBuilder.Status.Scheduled);
            cVar.e = SystemClock.elapsedRealtime();
            cVar.f = aVar;
            cVar.b.p(new a(cVar));
            j(cVar);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.f("OkHttpNetworkNewFetcher", "Cannot schedule image: " + cVar.b(), a2);
        }
        kotlin.a.a(failure);
    }

    @Override // xsna.oi6
    public final Map c(u6r u6rVar, int i) {
        return dt.b("is_requeued", String.valueOf(((c) u6rVar).g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [T, java.lang.Object] */
    public final void h() {
        c cVar;
        ScheduledFuture<?> andSet = this.e.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = this.d.poll();
        while (true) {
            T t = ref$ObjectRef.element;
            if (t == 0 || !((b) t).a.d) {
                break;
            }
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType = L.LogType.d;
                StringBuilder sb = new StringBuilder("Skip fetching task: ");
                b bVar = (b) ref$ObjectRef.element;
                sb.append((bVar == null || (cVar = bVar.a) == null) ? null : cVar.b());
                L.u(l, logType, new Object[]{"OkHttpNetworkNewFetcher", sb.toString()});
            }
            ref$ObjectRef.element = this.d.poll();
        }
        T t2 = ref$ObjectRef.element;
        if (t2 == 0) {
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l2, L.LogType.d, new Object[]{"OkHttpNetworkNewFetcher", "Nothing to fetch"});
            return;
        }
        c cVar2 = ((b) t2).a;
        try {
            this.c.add(cVar2);
            okhttp3.p g = g(cVar2);
            okhttp3.d a2 = ((okhttp3.o) this.b.getValue()).a(g);
            L l3 = L.a;
            l3.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l3, L.LogType.d, new Object[]{"OkHttpNetworkNewFetcher", "Started to load: " + g.a});
            }
            k(ImageStatusEventBuilder.Status.StartedToLoad);
            ((f8f0) a2).f9(new d(cVar2));
        } catch (Throwable th) {
            k(ImageStatusEventBuilder.Status.Failed);
            this.c.remove(cVar2);
            i360.a aVar = cVar2.f;
            if (aVar != null) {
                aVar.b(th);
            }
            L.f("OkHttpNetworkNewFetcher", "Cannot fetch image: " + cVar2.b(), th);
        }
    }

    public final void i(okhttp3.d dVar, Throwable th, c cVar) {
        Throwable[] suppressed = th.getSuppressed();
        if (dVar.g3() && (suppressed.length == 0 || (rl3.b0(suppressed) instanceof IOException))) {
            i360.a aVar = cVar.f;
            if (aVar != null) {
                aVar.a();
            }
            k(ImageStatusEventBuilder.Status.Cancelled);
        } else {
            i360.a aVar2 = cVar.f;
            if (aVar2 != null) {
                aVar2.b(th);
            }
            k(ImageStatusEventBuilder.Status.Failed);
        }
        if (!(th instanceof IOException) || !epx.f(th.getMessage(), "Canceled")) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
        L.e("OkHttpNetworkNewFetcher", "Throwable is handled: " + cVar.b(), th);
    }

    public final void j(c cVar) {
        Object failure;
        int i;
        try {
            this.d.offer(new b(cVar));
            qcn qcnVar = ((okhttp3.o) this.b.getValue()).b;
            int e = qcnVar.e();
            synchronized (qcnVar) {
                i = qcnVar.b;
            }
            if (e < i) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"OkHttpNetworkNewFetcher", "Run fetchNext by: " + cVar.b()});
                }
                h();
            } else {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"OkHttpNetworkNewFetcher", "Wait next fetchNext call for: " + cVar.b()});
                }
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.f("OkHttpNetworkNewFetcher", "Something wrong in scheduling by priority: " + cVar.b(), a2);
            com.vk.metrics.eventtracking.b.a.a(a2);
        }
        kotlin.a.a(failure);
    }

    public final void k(ImageStatusEventBuilder.Status status) {
        if (this.a) {
            new ImageStatusEventBuilder(status, ImageStatusEventBuilder.FetcherType.Priority).q();
        }
    }
}
