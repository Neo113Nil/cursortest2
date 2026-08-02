package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import okhttp3.Interceptor;
import okhttp3.l;
import okhttp3.p;

/* compiled from: OverrideHostDaleInterceptor.kt */
/* loaded from: classes.dex */
public final class a490 implements Interceptor, uz80 {
    public final dev0 a;

    public a490(dev0 dev0Var) {
        this.a = dev0Var;
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "OverrideHostDale";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        if (!this.a.isEnabled()) {
            return aVar.a(aVar.request());
        }
        okhttp3.p request = aVar.request();
        Object c = request.c(cgv.class);
        okhttp3.l lVar = request.a;
        cgv cgvVar = (cgv) c;
        if (!epx.f(cgvVar != null ? cgvVar.b : null, lVar.d)) {
            return aVar.a(request);
        }
        String str = cgvVar.b;
        String str2 = cgvVar.a;
        if (epx.f(str, lVar.d) && BuildInfo.h()) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{tdj.a(new StringBuilder("OverrideHostDale: host restored for proxy from "), cgvVar.b, " to ", str2)});
            }
        }
        p.a b = request.b();
        l.a f = lVar.f();
        f.d(str2);
        b.a = f.b();
        b.h(cgv.class, null);
        return aVar.a(b.b());
    }
}
