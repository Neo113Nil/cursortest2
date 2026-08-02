package xsna;

import java.util.Iterator;
import kotlin.Pair;
import okhttp3.Interceptor;
import okhttp3.p;

/* compiled from: XScreenInterceptor.kt */
/* loaded from: classes.dex */
public final class f4y0 implements Interceptor, uz80 {
    public final fjv a;
    public final boolean b;

    public f4y0(fjv fjvVar, boolean z) {
        this.a = fjvVar;
        this.b = z;
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "XScreen";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        Object obj;
        Iterator<Pair<? extends String, ? extends String>> it = aVar.request().c.iterator();
        while (true) {
            wk3 wk3Var = (wk3) it;
            if (!wk3Var.hasNext()) {
                obj = null;
                break;
            }
            obj = wk3Var.next();
            if (brm0.w((String) ((Pair) obj).i(), "X-Screen", true)) {
                break;
            }
        }
        if (obj != null) {
            return aVar.a(aVar.request());
        }
        String str = (String) this.a.invoke();
        m63.j(m63.c(), new Pair("screen.name", str));
        if (this.b && drm0.N(str)) {
            throw new IllegalStateException("empty screen name");
        }
        p.a b = aVar.request().b();
        b.c.b("X-Screen", str);
        return aVar.a(b.b());
    }
}
