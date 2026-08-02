package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;

/* compiled from: GameWithBadge.kt */
/* loaded from: classes17.dex */
public final class j8t {
    public static final h8t a(h8t h8tVar, long j, String str) {
        sbt sbtVar = h8tVar.d;
        if (epx.f(sbtVar.a.o, str)) {
            return h8tVar;
        }
        WebApiApplication webApiApplication = sbtVar.a;
        if (webApiApplication.b == j && !epx.f(webApiApplication.o, str)) {
            webApiApplication = WebApiApplication.a(webApiApplication, null, null, str, null, 0L, -8193);
        }
        return new h8t(h8tVar.d, h8tVar.e, h8tVar.f, n6t.a(webApiApplication), h8tVar.h, h8tVar.i, h8tVar.j);
    }
}
