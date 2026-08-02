package xsna;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.model.builders.ImageStatusEventBuilder;
import java.io.IOException;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import okhttp3.c;
import okhttp3.p;
import xsna.i360;

/* compiled from: OkHttpNetworkFetcher2.kt */
/* loaded from: classes.dex */
public final class hy70 extends oi6 {
    public final jnf a;
    public final boolean b;

    /* compiled from: OkHttpNetworkFetcher2.kt */
    /* loaded from: classes2.dex */
    public final class a extends uk6 {
        public final f8f0 a;
        public final okhttp3.o b;

        public a(f8f0 f8f0Var, okhttp3.o oVar) {
            this.a = f8f0Var;
            this.b = oVar;
        }

        @Override // xsna.vhd0
        public final void c() {
            hy70.this.i(ImageStatusEventBuilder.Status.CancelRequested);
            if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                this.b.b.a().execute(new g0(this, 18));
            } else {
                this.a.cancel();
            }
        }
    }

    /* compiled from: OkHttpNetworkFetcher2.kt */
    /* loaded from: classes2.dex */
    public final class b implements lb9 {
        public final c b;
        public final i360.a c;

        public b(c cVar, i360.a aVar) {
            this.b = cVar;
            this.c = aVar;
        }

        @Override // xsna.lb9
        public final void onFailure(okhttp3.d dVar, IOException iOException) {
            hy70.this.h(this.b, dVar, iOException, this.c);
        }

        @Override // xsna.lb9
        public final void onResponse(okhttp3.d dVar, okhttp3.u uVar) {
            Object failure;
            okhttp3.v vVar;
            hy70 hy70Var = hy70.this;
            c cVar = this.b;
            i360.a aVar = this.c;
            try {
                cVar.e = SystemClock.elapsedRealtime();
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
                    aVar.c(vVar.byteStream(), (int) contentLength);
                    s3q0 s3q0Var = s3q0.a;
                    vVar.close();
                    hy70Var.i(ImageStatusEventBuilder.Status.Loaded);
                } else {
                    hy70Var.h(cVar, dVar, new IOException("Unexpected HTTP code " + uVar), aVar);
                    vVar.close();
                }
                failure = s3q0.a;
                Throwable a = Result.a(failure);
                if (a != null) {
                    hy70Var.h(cVar, dVar, a, aVar);
                }
                L.e("OkHttpNetworkFetcher2", "Response is handled: " + cVar.b());
            } finally {
            }
        }
    }

    /* compiled from: OkHttpNetworkFetcher2.kt */
    /* loaded from: classes2.dex */
    public static final class c extends u6r {
        public long d;
        public long e;
        public long f;

        public c(l7j<rip> l7jVar, uhd0 uhd0Var) {
            super(l7jVar, uhd0Var);
        }

        public final long c() {
            return this.f;
        }

        public final long d() {
            return this.e;
        }

        public final long e() {
            return this.d;
        }

        public final void f(long j) {
            this.f = j;
        }

        public final void g(long j) {
            this.d = j;
        }
    }

    public hy70(jnf jnfVar, boolean z) {
        this.a = jnfVar;
        this.b = z;
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
            L.f("OkHttpNetworkFetcher2", "Cannot create request", a2);
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
        c cVar = (c) u6rVar;
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"OkHttpNetworkFetcher2", "Schedule fetching image: " + cVar.b()});
        }
        i(ImageStatusEventBuilder.Status.Scheduled);
        cVar.g(SystemClock.elapsedRealtime());
        try {
            okhttp3.p g = g(cVar);
            okhttp3.l lVar = g.a;
            String str = lVar.d;
            okhttp3.o oVar = (okhttp3.o) this.a.invoke();
            okhttp3.d a2 = oVar.a(g);
            cVar.a().p(new a((f8f0) a2, oVar));
            if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.d, new Object[]{"OkHttpNetworkFetcher2", "Started to load: " + lVar});
            }
            i(ImageStatusEventBuilder.Status.StartedToLoad);
            ((f8f0) a2).f9(new b(cVar, aVar));
        } catch (Throwable th) {
            aVar.b(th);
            i(ImageStatusEventBuilder.Status.Failed);
            L.f("OkHttpNetworkFetcher2", "Cannot fetch image: " + cVar.b(), th);
        }
    }

    @Override // xsna.oi6
    public final Map c(u6r u6rVar, int i) {
        c cVar = (c) u6rVar;
        return pn00.k(new Pair("queue_time", String.valueOf(cVar.d() - cVar.e())), new Pair("fetch_time", String.valueOf(cVar.c() - cVar.d())), new Pair("total_time", String.valueOf(cVar.c() - cVar.e())), new Pair(CampaignEx.JSON_KEY_IMAGE_SIZE, String.valueOf(i)));
    }

    @Override // xsna.oi6
    public final void d(u6r u6rVar) {
        ((c) u6rVar).f(SystemClock.elapsedRealtime());
    }

    public final void h(c cVar, okhttp3.d dVar, Throwable th, i360.a aVar) {
        cVar.f(SystemClock.elapsedRealtime());
        Throwable[] suppressed = th.getSuppressed();
        if (dVar.g3() && (suppressed.length == 0 || (rl3.b0(suppressed) instanceof IOException))) {
            aVar.a();
            i(ImageStatusEventBuilder.Status.Cancelled);
        } else {
            aVar.b(th);
            i(ImageStatusEventBuilder.Status.Failed);
        }
        if (!(th instanceof IOException) || !epx.f(th.getMessage(), "Canceled")) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
        L.e("OkHttpNetworkFetcher2", "Throwable is handled: " + cVar.b(), th);
    }

    public final void i(ImageStatusEventBuilder.Status status) {
        if (this.b) {
            new ImageStatusEventBuilder(status, ImageStatusEventBuilder.FetcherType.Enqueue).q();
        }
    }
}
