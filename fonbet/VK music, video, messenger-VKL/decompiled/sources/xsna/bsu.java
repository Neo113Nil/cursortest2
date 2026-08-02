package xsna;

import okhttp3.Interceptor;
import okhttp3.u;
import ru.ok.android.commons.http.Http;

/* compiled from: GzipResponseInterceptor.kt */
/* loaded from: classes.dex */
public final class bsu implements Interceptor {
    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.u a = aVar.a(aVar.request());
        boolean equalsIgnoreCase = Http.ContentEncoding.GZIP.equalsIgnoreCase(a.s().a(Http.Header.CONTENT_ENCODING));
        okhttp3.v m = a.m();
        if (!equalsIgnoreCase || m == null) {
            return a;
        }
        e8f0 e8f0Var = new e8f0(new dsu(m.source()));
        u.a w = a.w();
        w.o(Http.Header.CONTENT_ENCODING);
        w.o(Http.Header.CONTENT_LENGTH);
        w.a(Http.Header.CONTENT_ENCODING, "identity");
        w.b(new n8f0(okhttp3.u.r("Content-Type", a), -1L, e8f0Var));
        return w.c();
    }
}
