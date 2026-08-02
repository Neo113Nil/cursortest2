package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class ej3 implements p8w {
    public final f a;
    public final AppAnalyticsReporter b;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public final Object d = new Object();

    public ej3(f fVar, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = fVar;
        this.b = appAnalyticsReporter;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        kvj0 b = zci0Var.b(new d5j0(zci0Var.e.b()));
        if (b.w != 401) {
            this.c.set(true);
            return b;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        long id = currentThread.getId();
        e5z0 e5z0Var = i5z0.a;
        e5z0Var.m("AuthInterceptor");
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" tid:");
        e5z0Var.a(oyr.n(id, " ### 401 received", sb), new Object[0]);
        this.b.m0.a.a("tech.auth.unauthorized_intercepted", null);
        b.close();
        synchronized (this.d) {
            if (this.c.get()) {
                this.a.a();
                this.c.set(false);
            }
        }
        return zci0Var.b(new d5j0(zci0Var.e.b()));
    }
}
