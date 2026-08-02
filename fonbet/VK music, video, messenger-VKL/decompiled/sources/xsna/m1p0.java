package xsna;

import okhttp3.Interceptor;
import okhttp3.l;
import okhttp3.p;

/* compiled from: TogglesCheckNetworkInterceptor.kt */
/* loaded from: classes3.dex */
public final class m1p0 implements Interceptor {
    public static final m1p0 a = new m1p0();
    public static final io.reactivex.rxjava3.subjects.d<l260> b = io.reactivex.rxjava3.subjects.d.O0(new l260("", false));

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        boolean z = true;
        if (!epx.f(j5g.b0(1, aVar.request().a.f), "account.getToggles")) {
            return aVar.a(aVar.request());
        }
        okhttp3.l lVar = aVar.request().a;
        String g = lVar.g("network_check_id");
        if (g == null) {
            return aVar.a(aVar.request());
        }
        String g2 = lVar.g("tunnel_enabled");
        if (g2 == null) {
            return aVar.a(aVar.request());
        }
        int i = -1;
        int i2 = g2.equals("1") ? -1 : 0;
        String g3 = lVar.g("is_wifi");
        if (g3 != null && !g3.equals("1")) {
            i = 0;
        }
        l.a f = lVar.f();
        f.h("network_check_id");
        f.h("tunnel_enabled");
        f.h("is_wifi");
        okhttp3.l b2 = f.b();
        p.a b3 = aVar.request().b();
        b3.a = b2;
        b3.c.b("X-Check-Network", String.valueOf((i & 4) | (i2 & 1)));
        okhttp3.u a2 = aVar.a(b3.b());
        if (!epx.f(okhttp3.u.r("x-connection-type", a2), "unstable")) {
            String a3 = a2.g.a("X-Connection-Type");
            if (a3 == null) {
                a3 = null;
            }
            if (!epx.f(a3, "unstable")) {
                z = false;
            }
        }
        b.onNext(new l260(g, z));
        return a2;
    }
}
