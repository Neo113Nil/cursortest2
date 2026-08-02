package xsna;

import okhttp3.Interceptor;
import okhttp3.k;
import okhttp3.p;
import ru.ok.android.commons.http.Http;

/* compiled from: AcceptWebpInterceptor.kt */
/* loaded from: classes.dex */
public final class tj implements Interceptor, uz80 {
    public static final tj a = new tj();

    @Override // xsna.uz80
    public final String getTag() {
        return "AcceptWebp";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.k kVar = aVar.request().c;
        String a2 = kVar.a(Http.Header.ACCEPT);
        String concat = (a2 == null || drm0.N(a2)) ? "image/webp" : a2.concat(", image/webp");
        k.a d = kVar.d();
        d.h(Http.Header.ACCEPT, concat);
        okhttp3.k e = d.e();
        p.a b = aVar.request().b();
        b.c = e.d();
        return aVar.a(b.b());
    }
}
