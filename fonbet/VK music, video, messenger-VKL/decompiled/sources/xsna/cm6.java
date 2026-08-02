package xsna;

import java.io.IOException;
import kotlin.Pair;
import okhttp3.Interceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.l;
import okhttp3.p;
import ru.ok.android.commons.http.Http;

/* compiled from: BaseRedirectInterceptor.kt */
/* loaded from: classes.dex */
public abstract class cm6 implements Interceptor, uz80 {
    public final okhttp3.p a(String str, okhttp3.u uVar) {
        String r;
        l.a aVar;
        if (b() && (r = okhttp3.u.r("Location", uVar)) != null) {
            okhttp3.l lVar = uVar.A().a;
            lVar.getClass();
            try {
                aVar = new l.a();
                aVar.e(lVar, r);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            okhttp3.l b = aVar != null ? aVar.b() : null;
            if (b != null && (epx.f(b.a, uVar.A().a.a) || c())) {
                p.a b2 = uVar.A().b();
                if (xwk.f(str)) {
                    int o = uVar.o();
                    boolean z = str.equals("PROPFIND") || o == 308 || o == 307;
                    if (str.equals("PROPFIND") || o == 308 || o == 307) {
                        b2.f(str, z ? uVar.A().d : null);
                    } else {
                        b2.f("GET", null);
                    }
                    if (!z) {
                        b2.g("Transfer-Encoding");
                        b2.g(Http.Header.CONTENT_LENGTH);
                        b2.g("Content-Type");
                    }
                }
                if (!x2r0.a(uVar.A().a, b)) {
                    b2.g(Http.Header.AUTHORIZATION);
                }
                b2.a = b;
                return b2.b();
            }
        }
        return null;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public okhttp3.p d(okhttp3.u uVar) throws IOException {
        int o = uVar.o();
        String str = uVar.A().b;
        if (o == 307) {
            if (epx.f(str, "GET") || epx.f(str, "HEAD") || epx.f(str, "POST")) {
                return a(str, uVar);
            }
            return null;
        }
        if (o != 308) {
            switch (o) {
                case 300:
                case 301:
                case 302:
                case Http.StatusCode.SEE_OTHER /* 303 */:
                    return a(str, uVar);
                default:
                    return null;
            }
        }
        if (epx.f(str, "GET") || epx.f(str, "HEAD")) {
            return a(str, uVar);
        }
        return null;
    }

    @Override // okhttp3.Interceptor
    public okhttp3.u intercept(Interceptor.a aVar) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) aVar;
        f8f0 f8f0Var = realInterceptorChain.a;
        okhttp3.u a = realInterceptorChain.a(e(realInterceptorChain.e));
        int i = 0;
        while (i < 20) {
            if (!f8f0Var.q) {
                okhttp3.p d = d(a);
                if (d == null) {
                    break;
                }
                okhttp3.p e = e(d);
                i++;
                m63.a(m63.c(), "http.redirect", new Pair("redirect.from", a.A().a.i), new Pair("redirect.to", e.a.i), new Pair("redirect.status_code", Integer.valueOf(a.o())), new Pair("redirect.count", Integer.valueOf(i)));
                x2r0.c(a);
                a = realInterceptorChain.a(e);
            } else {
                throw new IOException("Call was canceled!");
            }
        }
        return a;
    }

    public okhttp3.p e(okhttp3.p pVar) {
        return pVar;
    }
}
