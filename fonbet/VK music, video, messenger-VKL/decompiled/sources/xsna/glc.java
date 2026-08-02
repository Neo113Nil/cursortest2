package xsna;

import okhttp3.Interceptor;
import okhttp3.p;

/* compiled from: ClientAgentInterceptor.kt */
/* loaded from: classes.dex */
public final class glc implements Interceptor {
    public final String a;

    public glc(String str) {
        this.a = str;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        p.a b = aVar.request().b();
        b.c.b("Client-Agent", this.a);
        return aVar.a(b.b());
    }
}
