package xsna;

import com.vk.core.apps.BuildInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import okhttp3.Interceptor;
import okhttp3.o;

/* compiled from: OkHttpClientProvider.kt */
/* loaded from: classes.dex */
public final class rx70 {
    public final gzs<z560> a;
    public final HostnameVerifier b;
    public final List<Interceptor> c;
    public final boolean d;

    public rx70() {
        throw null;
    }

    public rx70(gzs gzsVar, z9e0 z9e0Var, List list, boolean z, int i) {
        z9e0Var = (i & 2) != 0 ? null : z9e0Var;
        this.a = gzsVar;
        this.b = z9e0Var;
        this.c = list;
        this.d = z;
    }

    public final okhttp3.o a() {
        o.a aVar = new o.a();
        aVar.f = false;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.c(4L, timeUnit);
        aVar.g(4L, timeUnit);
        aVar.e(4L, timeUnit);
        aVar.k = null;
        aVar.a(new qx70());
        boolean z = this.d;
        aVar.h = z;
        aVar.i = z;
        if (!BuildInfo.m()) {
            q5m.a().getClass();
        }
        List<Interceptor> list = this.c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                aVar.a((Interceptor) it.next());
            }
        }
        HostnameVerifier hostnameVerifier = this.b;
        if (hostnameVerifier != null) {
            if (!hostnameVerifier.equals(aVar.t)) {
                aVar.B = null;
            }
            aVar.t = hostnameVerifier;
        }
        z560 invoke = this.a.invoke();
        aVar.f(invoke.a, invoke);
        return new okhttp3.o(aVar);
    }
}
