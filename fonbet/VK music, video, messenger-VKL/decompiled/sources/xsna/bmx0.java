package xsna;

import java.io.IOException;
import kotlin.Result;
import okhttp3.Interceptor;
import xsna.cmx0;
import xsna.dmx0;

/* compiled from: WhitelistNetworkCheckInterceptor.kt */
/* loaded from: classes.dex */
public final class bmx0 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        Object failure;
        try {
            failure = aVar.a(aVar.request());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            if (dmx0.i.get()) {
                dmx0.a aVar2 = dmx0.b;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                boolean b = aVar2.b().b();
                dmx0.a aVar3 = dmx0.b;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar3.b().c();
                if (b && dmx0.h.get()) {
                    g840 g840Var = dmx0.d;
                    if (g840Var != null) {
                        g840Var.a();
                        dmx0.a.getClass();
                        ((php0) dmx0.c.getValue()).a(g840Var);
                    }
                    dmx0.a aVar4 = dmx0.b;
                    if (aVar4 == null) {
                        aVar4 = null;
                    }
                    dmx0 dmx0Var = dmx0.a;
                    g840 a = aVar4.a(new xv2(dmx0Var, 18), new emx0(dmx0Var), new fmx0(dmx0Var));
                    dmx0.d = a;
                    dmx0Var.getClass();
                    ((php0) dmx0.c.getValue()).b(a, 0L);
                }
            }
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null && (a2 instanceof IOException) && dmx0.i.get()) {
            dmx0.a aVar5 = dmx0.b;
            if (aVar5 == null) {
                aVar5 = null;
            }
            aVar5.b().a();
            dmx0.a aVar6 = dmx0.b;
            if ((aVar6 != null ? aVar6 : null).b().b()) {
                dmx0 dmx0Var2 = dmx0.a;
                cmx0.d dVar = cmx0.d.a;
                dmx0Var2.getClass();
                dmx0.d(dVar);
            }
        }
        kotlin.a.a(failure);
        return (okhttp3.u) failure;
    }
}
