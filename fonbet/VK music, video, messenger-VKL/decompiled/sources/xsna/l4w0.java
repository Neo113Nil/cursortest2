package xsna;

import android.net.Uri;
import com.vk.push.common.HostInfoProvider;
import com.vk.push.common.Logger;
import com.vk.push.core.backoff.BackOff;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.o;
import okhttp3.p;

/* compiled from: VkpnsNotifierConnection.kt */
/* loaded from: classes5.dex */
public final class l4w0 implements tk70 {
    public final BackOff a;
    public final okhttp3.o b;
    public final HostInfoProvider c;
    public final Logger d;
    public final LinkedHashSet<uhx0> e;
    public final ConcurrentLinkedDeque<String> f;
    public p8f0 g;
    public final bpn0 h;

    /* compiled from: VkpnsNotifierConnection.kt */
    public static final class a implements Interceptor {
        @Override // okhttp3.Interceptor
        public final okhttp3.u intercept(Interceptor.a aVar) {
            String a = aVar.request().c.a(BaseHttpHeadersHolder.DEFAULT_DEBUG_HEADER);
            if (a == null || drm0.N(a)) {
                a = UUID.randomUUID().toString();
            }
            p.a b = aVar.request().b();
            b.c.h("X-Request-Id", a);
            b.c.g(BaseHttpHeadersHolder.DEFAULT_DEBUG_HEADER);
            return aVar.a(b.b());
        }
    }

    public l4w0(BackOff backOff, okhttp3.o oVar, Logger logger) {
        if (qxi.b == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        atv0 atv0Var = new atv0();
        this.a = backOff;
        this.b = oVar;
        this.c = atv0Var;
        this.d = logger.createLogger("NotifierConnection");
        this.e = new LinkedHashSet<>();
        this.f = new ConcurrentLinkedDeque<>();
        this.h = new bpn0(new m4w0(this));
    }

    @Override // xsna.tk70
    public final void a(String str, nk70 nk70Var) {
        ConcurrentLinkedDeque<String> concurrentLinkedDeque = this.f;
        concurrentLinkedDeque.remove(str);
        if (concurrentLinkedDeque.isEmpty()) {
            nk70Var.invoke(this);
        }
    }

    @Override // xsna.tk70
    public final void b(String str, mk70 mk70Var) {
        ConcurrentLinkedDeque<String> concurrentLinkedDeque = this.f;
        concurrentLinkedDeque.add(str);
        this.a.resetBackOff();
        int size = concurrentLinkedDeque.size();
        if (size == 1) {
            mk70Var.invoke(this);
        } else if (size > 10) {
            concurrentLinkedDeque.removeFirst();
        }
    }

    @Override // xsna.tk70
    public final void c(boolean z) {
        String host;
        Logger logger = this.d;
        Logger.DefaultImpls.info$default(logger, "Start connect to notifier", null, 2, null);
        HostInfoProvider hostInfoProvider = this.c;
        if (hostInfoProvider.getPort() != null) {
            host = hostInfoProvider.getHost() + ':' + hostInfoProvider.getPort();
        } else {
            host = hostInfoProvider.getHost();
        }
        ConcurrentLinkedDeque<String> concurrentLinkedDeque = this.f;
        if (concurrentLinkedDeque.isEmpty()) {
            Logger.DefaultImpls.warn$default(logger, "You need to add push tokens to connect to the notifier", null, 2, null);
            return;
        }
        String uri = new Uri.Builder().scheme(hostInfoProvider.getScheme()).encodedAuthority(host).path("api/v3/ws").appendQueryParameter("push_tokens", j5g.g0(concurrentLinkedDeque, StringUtils.COMMA, null, null, 0, null, 62)).build().toString();
        o.a e = this.b.e();
        e.z = x2r0.b("interval", 60L, TimeUnit.SECONDS);
        if (z) {
            bpn0 bpn0Var = this.h;
            e.d((bjq) bpn0Var.getValue());
            ((bjq) bpn0Var.getValue()).a(hostInfoProvider.getHost());
            bjq bjqVar = (bjq) bpn0Var.getValue();
            bjqVar.getClass();
            try {
                bjqVar.c.remove(0);
            } catch (IndexOutOfBoundsException unused) {
            }
            Logger.DefaultImpls.warn$default(logger, "Drop unreachable notifier address", null, 2, null);
        }
        e.f = false;
        e.a(new a());
        okhttp3.o oVar = new okhttp3.o(e);
        p.a aVar = new p.a();
        aVar.i(uri);
        okhttp3.p b = aVar.b();
        uhx0[] uhx0VarArr = (uhx0[]) this.e.toArray(new uhx0[0]);
        this.g = oVar.f(b, new avi((uhx0[]) Arrays.copyOf(uhx0VarArr, uhx0VarArr.length)));
    }

    @Override // xsna.tk70
    public final void d(String str) {
        Logger logger = this.d;
        Logger.DefaultImpls.info$default(logger, "Close connection to notifier", null, 2, null);
        try {
            p8f0 p8f0Var = this.g;
            if (p8f0Var != null) {
                p8f0Var.close(1000, str);
            }
        } catch (Exception e) {
            logger.error("Failed to close web socket", e);
        }
        this.g = null;
    }

    public final boolean e(String str) {
        StringBuilder sb = new StringBuilder("Can send message to web socket: ");
        sb.append(this.g != null);
        Logger.DefaultImpls.debug$default(this.d, sb.toString(), null, 2, null);
        p8f0 p8f0Var = this.g;
        if (p8f0Var != null) {
            return p8f0Var.send(str);
        }
        return false;
    }
}
