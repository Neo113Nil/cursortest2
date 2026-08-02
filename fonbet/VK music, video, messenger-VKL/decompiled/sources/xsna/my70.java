package xsna;

import android.net.Uri;
import android.os.SystemClock;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.model.builders.ImageStatusEventBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import okhttp3.c;
import okhttp3.p;
import xsna.i360;

/* compiled from: OkHttpPriorityNetworkFetcher.kt */
/* loaded from: classes2.dex */
public final class my70 extends oi6 {
    public final boolean a;
    public final boolean b;
    public final bpn0 c;
    public final ConcurrentHashMap.KeySetView<u6r, Boolean> d = ConcurrentHashMap.newKeySet();
    public final ArrayList<b> e = new ArrayList<>(16);
    public final AtomicReference<ScheduledFuture<?>> f = new AtomicReference<>(null);

    /* compiled from: OkHttpPriorityNetworkFetcher.kt */
    public final class a extends uk6 {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // xsna.vhd0
        public final void c() {
            ImageStatusEventBuilder.Status status = ImageStatusEventBuilder.Status.CancelRequested;
            my70 my70Var = my70.this;
            my70Var.k(status);
            L l = L.a;
            l.getClass();
            LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
            boolean m = L.m(loggerOutputTarget);
            c cVar = this.a;
            if (!m) {
                L.u(l, L.LogType.d, new Object[]{"OkHttpPriorityNetworkFetcher", "Cancellation requested: " + cVar.b()});
            }
            if (!my70Var.d.contains(cVar)) {
                cVar.b.n().w().b().execute(new tzz(3, cVar, my70Var));
                return;
            }
            l.getClass();
            if (L.m(loggerOutputTarget)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"OkHttpPriorityNetworkFetcher", "Cannot cancel already running loading: " + cVar.b()});
        }
    }

    /* compiled from: OkHttpPriorityNetworkFetcher.kt */
    public static final class b {
        public static final gpl b = new gpl(1);
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }
    }

    /* compiled from: OkHttpPriorityNetworkFetcher.kt */
    public static final class c extends u6r {
        public volatile boolean d;
        public volatile long e;
        public volatile i360.a f;
        public volatile boolean g;

        public c() {
            throw null;
        }
    }

    /* compiled from: OkHttpPriorityNetworkFetcher.kt */
    public final class d implements lb9 {
        public final c b;

        public d(c cVar) {
            this.b = cVar;
        }

        @Override // xsna.lb9
        public final void onFailure(okhttp3.d dVar, IOException iOException) {
            my70 my70Var = my70.this;
            c cVar = this.b;
            my70Var.i(dVar, iOException, cVar);
            my70Var.d.remove(cVar);
            my70Var.h();
        }

        @Override // xsna.lb9
        public final void onResponse(okhttp3.d dVar, okhttp3.u uVar) {
            Object failure;
            okhttp3.v vVar;
            my70 my70Var = my70.this;
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
                    L.e("OkHttpPriorityNetworkFetcher", "Response is handled: " + cVar.b());
                    my70Var.k(ImageStatusEventBuilder.Status.Loaded);
                    s3q0 s3q0Var = s3q0.a;
                    vVar.close();
                } else {
                    my70Var.i(dVar, new IOException("Unexpected HTTP code " + uVar), cVar);
                    vVar.close();
                }
                failure = s3q0.a;
                Throwable a = Result.a(failure);
                if (a != null) {
                    my70Var.i(dVar, a, cVar);
                }
                my70.this.d.remove(this.b);
                my70.this.h();
            } finally {
            }
        }
    }

    public my70(boolean z, jnf jnfVar, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = new bpn0(new xq1(8, jnfVar, this));
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
            L.f("OkHttpPriorityNetworkFetcher", "Cannot create request", a2);
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
                L.u(l, L.LogType.d, new Object[]{"OkHttpPriorityNetworkFetcher", "Schedule fetching image: " + cVar.b()});
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
            L.f("OkHttpPriorityNetworkFetcher", "Cannot schedule image: " + cVar.b(), a2);
        }
        kotlin.a.a(failure);
    }

    @Override // xsna.oi6
    public final Map c(u6r u6rVar, int i) {
        return dt.b("is_requeued", String.valueOf(((c) u6rVar).g));
    }

    public final void h() {
        ScheduledFuture<?> andSet = this.f.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
        synchronized (this.e) {
            if (this.e.isEmpty()) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"OkHttpPriorityNetworkFetcher", "Nothing to fetch"});
                }
                return;
            }
            b bVar = this.e.get(0);
            Iterator<b> it = this.e.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (next.a.d) {
                    it.remove();
                } else if (b.b.compare(bVar, next) > 0) {
                    bVar = next;
                }
            }
            this.e.remove(bVar);
            c cVar = bVar.a;
            try {
                this.d.add(cVar);
                okhttp3.p g = g(cVar);
                okhttp3.d a2 = ((okhttp3.o) this.c.getValue()).a(g);
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"OkHttpPriorityNetworkFetcher", "Started to load: " + g.a});
                }
                k(ImageStatusEventBuilder.Status.StartedToLoad);
                ((f8f0) a2).f9(new d(cVar));
            } catch (Throwable th) {
                k(ImageStatusEventBuilder.Status.Failed);
                this.d.remove(cVar);
                i360.a aVar = cVar.f;
                if (aVar != null) {
                    aVar.b(th);
                }
                L.f("OkHttpPriorityNetworkFetcher", "Cannot fetch image: " + cVar.b(), th);
            }
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
        L.e("OkHttpPriorityNetworkFetcher", "Throwable is handled: " + cVar.b(), th);
    }

    public final void j(c cVar) {
        Object failure;
        int i;
        try {
            synchronized (this.e) {
                this.e.add(new b(cVar));
            }
            qcn qcnVar = ((okhttp3.o) this.c.getValue()).b;
            int e = qcnVar.e();
            synchronized (qcnVar) {
                i = qcnVar.b;
            }
            if (e < i) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"OkHttpPriorityNetworkFetcher", "Run fetchNext by: " + cVar.b()});
                }
                h();
            } else {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"OkHttpPriorityNetworkFetcher", "Wait next fetchNext call for: " + cVar.b()});
                }
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.f("OkHttpPriorityNetworkFetcher", "Something wrong in scheduling by priority: " + cVar.b(), a2);
            com.vk.metrics.eventtracking.b.a.a(a2);
        }
        kotlin.a.a(failure);
    }

    public final void k(ImageStatusEventBuilder.Status status) {
        if (this.b) {
            new ImageStatusEventBuilder(status, ImageStatusEventBuilder.FetcherType.Priority).q();
        }
    }
}
