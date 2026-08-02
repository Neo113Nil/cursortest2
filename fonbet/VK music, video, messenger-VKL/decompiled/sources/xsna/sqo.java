package xsna;

import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;

/* compiled from: DynamicReadTimeoutInterceptor.kt */
/* loaded from: classes3.dex */
public final class sqo implements Interceptor {
    public volatile int a = -1;

    public final void a(int i) {
        this.a = i;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.p request = aVar.request();
        int i = this.a;
        return (i == -1 || aVar.d() == i) ? aVar.a(request) : aVar.e(i, TimeUnit.MILLISECONDS).a(request);
    }
}
