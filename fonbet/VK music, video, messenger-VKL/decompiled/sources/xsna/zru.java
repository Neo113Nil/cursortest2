package xsna;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.Interceptor;
import okhttp3.p;
import okhttp3.t;
import ru.ok.android.commons.http.Http;
import xsna.k8g0;

/* compiled from: GzipRequestInterceptor.kt */
/* loaded from: classes.dex */
public final class zru implements Interceptor {
    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        Long n;
        okhttp3.p request = aVar.request();
        okhttp3.k kVar = request.c;
        okhttp3.t tVar = request.d;
        String str = request.b;
        String a = kVar.a(Http.Header.CONTENT_LENGTH);
        long longValue = (a == null || (n = arm0.n(a)) == null) ? 0L : n.longValue();
        if (!epx.f(str, "POST") || longValue <= 180 || request.c(k8g0.a.class) == null) {
            return aVar.a(request);
        }
        p.a b = request.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d8f0 d8f0Var = new d8f0(mq9.b(new GZIPOutputStream(byteArrayOutputStream)));
        if (tVar != null) {
            try {
                tVar.writeTo(d8f0Var);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                th = th;
                try {
                    d8f0Var.close();
                } catch (Throwable th2) {
                    mnh0.d(th, th2);
                }
            }
        }
        try {
            d8f0Var.close();
            th = null;
        } catch (Throwable th3) {
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        okhttp3.s d = t.a.d(okhttp3.t.Companion, byteArrayOutputStream.toByteArray(), tVar != null ? tVar.contentType() : null, 0, 6);
        long j = d.d;
        b.c.h(Http.Header.CONTENT_ENCODING, Http.ContentEncoding.GZIP);
        b.c.h(Http.Header.CONTENT_LENGTH, String.valueOf(j));
        b.f(str, d);
        return aVar.a(b.b());
    }
}
