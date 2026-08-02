package xsna;

import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import xsna.k8g0;

/* compiled from: LongPollReadTimeoutInterceptor.kt */
/* loaded from: classes.dex */
public final class p400 implements Interceptor, uz80 {
    @Override // xsna.uz80
    public final String getTag() {
        return "LongPollRead";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.p request = aVar.request();
        if (aVar.request().c(k8g0.c.class) == null) {
            return aVar.a(request);
        }
        k8g0.c cVar = (k8g0.c) aVar.request().c(k8g0.c.class);
        Integer valueOf = cVar != null ? Integer.valueOf(cVar.a) : null;
        return (valueOf == null || ((long) valueOf.intValue()) + ((long) 5) <= ((long) (aVar.d() / 1000))) ? aVar.a(request) : aVar.e(valueOf.intValue() + 5, TimeUnit.SECONDS).a(request);
    }
}
