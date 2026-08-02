package xsna;

import com.ironsource.B5;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.k;
import okhttp3.p;
import okhttp3.u;
import ru.ok.android.commons.http.Http;

/* compiled from: BridgeInterceptor.kt */
/* loaded from: classes11.dex */
public final class ic8 implements Interceptor {
    public final wsj a;

    public ic8(wsj wsjVar) {
        this.a = wsjVar;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) throws IOException {
        boolean z;
        okhttp3.v m;
        okhttp3.p request = aVar.request();
        p.a b = request.b();
        okhttp3.l lVar = request.a;
        okhttp3.k kVar = request.c;
        okhttp3.t tVar = request.d;
        if (tVar != null) {
            okhttp3.m contentType = tVar.contentType();
            if (contentType != null) {
                b.c.h("Content-Type", contentType.a);
            }
            long contentLength = tVar.contentLength();
            if (contentLength != -1) {
                b.c.h(Http.Header.CONTENT_LENGTH, String.valueOf(contentLength));
                b.g("Transfer-Encoding");
            } else {
                b.c.h("Transfer-Encoding", "chunked");
                b.g(Http.Header.CONTENT_LENGTH);
            }
        }
        int i = 0;
        if (kVar.a("Host") == null) {
            b.c.h("Host", x2r0.v(lVar, false));
        }
        if (kVar.a("Connection") == null) {
            b.c.h("Connection", "Keep-Alive");
        }
        if (kVar.a("Accept-Encoding") == null && kVar.a(Command.HTTP_HEADER_RANGE) == null) {
            b.c.h("Accept-Encoding", Http.ContentEncoding.GZIP);
            z = true;
        } else {
            z = false;
        }
        wsj wsjVar = this.a;
        List<usj> b2 = wsjVar.b(lVar);
        if (!b2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : b2) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                usj usjVar = (usj) obj;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(usjVar.e());
                sb.append(B5.U);
                sb.append(usjVar.i());
                i = i2;
            }
            b.c.h(Http.Header.COOKIE, sb.toString());
        }
        if (kVar.a("User-Agent") == null) {
            b.c.h("User-Agent", "okhttp/4.12.0");
        }
        okhttp3.u a = aVar.a(b.b());
        njv.b(wsjVar, lVar, a.s());
        u.a w = a.w();
        w.p(request);
        if (z && Http.ContentEncoding.GZIP.equalsIgnoreCase(okhttp3.u.r(Http.Header.CONTENT_ENCODING, a)) && njv.a(a) && (m = a.m()) != null) {
            dsu dsuVar = new dsu(m.source());
            k.a d = a.s().d();
            d.g(Http.Header.CONTENT_ENCODING);
            d.g(Http.Header.CONTENT_LENGTH);
            w.i(d.e());
            w.b(new n8f0(okhttp3.u.r("Content-Type", a), -1L, new e8f0(dsuVar)));
        }
        return w.c();
    }
}
