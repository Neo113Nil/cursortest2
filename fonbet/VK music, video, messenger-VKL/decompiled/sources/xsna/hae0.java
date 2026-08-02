package xsna;

import android.net.Uri;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.IOException;
import java.net.URL;
import kotlin.Pair;
import okhttp3.Interceptor;
import okhttp3.l;
import okhttp3.p;

/* compiled from: ProxyInterceptor.kt */
/* loaded from: classes.dex */
public final class hae0 extends cm6 {
    public final dev0 a;

    public hae0(dev0 dev0Var) {
        this.a = dev0Var;
    }

    @Override // xsna.cm6
    public final okhttp3.p d(okhttp3.u uVar) {
        okhttp3.p d = super.d(uVar);
        if (d != null && this.a.a()) {
            L.d(new kr50(d, 18));
        }
        return d;
    }

    @Override // xsna.cm6
    public final okhttp3.p e(okhttp3.p pVar) {
        okhttp3.l lVar;
        okhttp3.l lVar2 = pVar.a;
        cgv cgvVar = (cgv) pVar.c(cgv.class);
        if (epx.f(lVar2.d, cgvVar != null ? cgvVar.b : null)) {
            l.a f = lVar2.f();
            f.d(cgvVar.a);
            lVar = f.b();
        } else {
            lVar = lVar2;
        }
        if (!lVar.equals(lVar2)) {
            p.a b = pVar.b();
            b.a = lVar;
            pVar = b.b();
        }
        Uri b2 = this.a.b(Uri.parse(lVar.i));
        String host = b2 != null ? b2.getHost() : null;
        if (host == null) {
            return pVar;
        }
        okhttp3.l lVar3 = pVar.a;
        l.a f2 = lVar3.f();
        f2.d(host);
        okhttp3.l b3 = f2.b();
        L.d(new cy0(24, lVar3, b3));
        p.a b4 = pVar.b();
        b4.c.h("Host", lVar3.d);
        b4.a = b3;
        return b4.b();
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "Proxy";
    }

    @Override // xsna.cm6, okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) throws IOException {
        dev0 dev0Var = this.a;
        boolean enable = dev0Var.enable();
        m63.j(m63.c(), new Pair("proxy.enabled", Boolean.valueOf(enable)));
        if (!enable) {
            return aVar.a(aVar.request());
        }
        try {
            okhttp3.u intercept = super.intercept(aVar);
            if (!intercept.t() && (intercept.o() != 101 || !j5g.P(intercept.s(), new Pair("Upgrade", "websocket")))) {
                URL j = intercept.A().a.j();
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return intercept;
                }
                L.u(l, L.LogType.e, new Object[]{"proxy", "response error: " + j + " result:" + intercept.o()});
                return intercept;
            }
            return intercept;
        } catch (Exception e) {
            if (dev0Var.a()) {
                okhttp3.p request = aVar.request();
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"host error: " + e + " request original: " + request.a});
                }
            }
            throw e;
        }
    }
}
