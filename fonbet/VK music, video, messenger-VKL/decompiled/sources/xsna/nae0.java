package xsna;

import com.vk.log.L;
import okhttp3.l;
import okhttp3.p;

/* compiled from: ProxyRedirectInterceptor.kt */
/* loaded from: classes.dex */
public final class nae0 extends cm6 {
    @Override // xsna.cm6
    public final okhttp3.p d(okhttp3.u uVar) {
        okhttp3.p A = uVar.A();
        String str = A.a.d;
        String a = A.c.a("User-Agent");
        okhttp3.p d = super.d(uVar);
        if (d == null) {
            return null;
        }
        okhttp3.l lVar = d.a;
        String str2 = lVar.d;
        L.e("STARTUP HOST REDIRECT -> " + d.b + " | " + lVar + " | headers: " + d.c);
        l.a f = lVar.f();
        f.d(str);
        okhttp3.l b = f.b();
        p.a b2 = d.b();
        b2.a = b;
        b2.c.b("Host", str2);
        if (a != null && !drm0.N(a)) {
            b2.c.b("User-Agent", a);
        }
        return b2.b();
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "ProxyRedirect";
    }
}
