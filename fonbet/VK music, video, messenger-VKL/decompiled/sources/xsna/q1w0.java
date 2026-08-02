package xsna;

import okhttp3.Interceptor;
import okhttp3.p;

/* compiled from: OkHttpClient.kt */
/* loaded from: classes3.dex */
public final class q1w0 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        p.a b = aVar.request().b();
        b.c.g("Sec-WebSocket-Extensions");
        return aVar.a(b.b());
    }
}
