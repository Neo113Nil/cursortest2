package xsna;

import okhttp3.Interceptor;
import okhttp3.p;

/* compiled from: NetworkOkHttpProvider.kt */
/* loaded from: classes11.dex */
public final class q460 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        p.a b = aVar.request().b();
        b.c.h("X-VK-Android-Client", "new");
        return aVar.a(b.b());
    }
}
