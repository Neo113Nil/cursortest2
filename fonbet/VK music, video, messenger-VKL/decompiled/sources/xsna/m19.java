package xsna;

import kotlin.Pair;
import okhttp3.Interceptor;

/* compiled from: CallBackoffInterceptor.kt */
/* loaded from: classes.dex */
public final class m19 implements Interceptor, uz80 {
    public final z1p0 a;

    public m19(z1p0 z1p0Var) {
        this.a = z1p0Var;
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "CallBackoff";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        String str = aVar.request().a.i;
        z1p0 z1p0Var = this.a;
        Pair<Long, String> b = z1p0Var.b(str);
        long longValue = b.d().longValue();
        String g = b.g();
        if (longValue > 0) {
            m63.a(m63.c(), "backoff.triggered", new Pair("backoff.time_ms", Long.valueOf(longValue)), new Pair("backoff.reason", g));
            Thread.sleep(longValue);
        }
        try {
            okhttp3.u a = aVar.a(aVar.request());
            if (!a.t()) {
                z1p0Var.a(str, "CallBackoffFailure");
                return a;
            }
            vx5 vx5Var = z1p0Var.a;
            if (!vx5Var.a.containsKey(str)) {
                return a;
            }
            vx5Var.a.remove(str);
            return a;
        } catch (Exception e) {
            z1p0Var.a(str, "CallBackoff(".concat(qjg.a(e)));
            throw e;
        }
    }
}
