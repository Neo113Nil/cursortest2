package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.network.encoding.EncodingType;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Interceptor;
import okhttp3.p;
import okhttp3.u;
import ru.ok.android.commons.http.Http;
import xsna.k8g0;

/* compiled from: ZstdInterceptor.kt */
/* loaded from: classes3.dex */
public final class u7y0 implements Interceptor {
    public final m7y0 a;
    public final z4g b;
    public final k7y0 c;

    public u7y0(m7y0 m7y0Var, z4g z4gVar, k7y0 k7y0Var) {
        this.a = m7y0Var;
        this.b = z4gVar;
        this.c = k7y0Var;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.p request = aVar.request();
        if (request.c(k8g0.b.class) != null) {
            return aVar.a(request);
        }
        m7y0 m7y0Var = this.a;
        if (!m7y0Var.c()) {
            return aVar.a(request);
        }
        p.a b = aVar.request().b();
        eoi0 a = m7y0Var.a();
        k7y0 k7y0Var = this.c;
        if (k7y0Var.a) {
            b.c.g("Accept-Encoding");
            b.c.b("Accept-Encoding", "zstd");
            if (a != null) {
                b.c.b("x-zstd-dict-version", a.b);
            }
        }
        okhttp3.u a2 = aVar.a(b.b());
        String r = okhttp3.u.r(Http.Header.CONTENT_ENCODING, a2);
        boolean D = r != null ? drm0.D(r, "zstd", true) : false;
        String a3 = a2.g.a("x-zstd-dict-version");
        String str = null;
        if (a3 == null) {
            a3 = null;
        }
        okhttp3.v vVar = a2.h;
        if (!D || vVar == null) {
            return a2;
        }
        ArrayList arrayList = a2.b.a.f;
        String str2 = (String) (1 < arrayList.size() ? arrayList.get(1) : j5g.g0(arrayList, BundleUtil.UNDERLINE_TAG, null, null, 0, null, 62));
        if (a != null) {
            try {
                str = a.b;
            } catch (Throwable th) {
                String message = th.getMessage();
                if (message == null) {
                    message = go9.b("Invalid dict version ", a3);
                }
                this.b.e(EncodingType.ZSTD, str2, message, th);
                throw new IOException(th);
            }
        }
        m7y0Var.b(str, a3);
        agk0 pu8Var = k7y0Var.b ? new pu8(vVar.source()) : vVar.source();
        e8f0 e8f0Var = new e8f0(mq9.d(m7y0Var.d((pu8Var instanceof bn8 ? (bn8) pu8Var : new e8f0(pu8Var)).f4(), a3, a, new ljf(11, this, str2))));
        u.a w = a2.w();
        w.f.g(Http.Header.CONTENT_ENCODING);
        w.f.b(Http.Header.CONTENT_ENCODING, "identity");
        w.g = new n8f0(String.valueOf(vVar.contentType()), vVar.contentLength(), e8f0Var);
        return w.c();
    }
}
