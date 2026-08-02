package defpackage;

import android.os.SystemClock;
import com.yandex.go.account.api.superapp.CookieInjectionEvent;
import com.yandex.go.superapp.api.loading_tracker.ServiceLoadingEvent;
import com.yandex.passport.internal.methods.requester.a;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import ru.yandex.taxi.n;

/* loaded from: classes5.dex */
public final class c9w0 implements tls {
    public final /* synthetic */ int a = 1;
    public long b;
    public final /* synthetic */ Object c;

    public c9w0(a aVar, long j) {
        this.c = aVar;
        this.b = j;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                CookieInjectionEvent cookieInjectionEvent = (CookieInjectionEvent) obj;
                n nVar = (n) obj2;
                int i2 = b9w0.a[cookieInjectionEvent.ordinal()];
                if (i2 == 1) {
                    this.b = SystemClock.elapsedRealtime();
                } else if (i2 == 2) {
                    jdj jdjVar = nVar.c;
                    rvq0 rvq0Var = nVar.g;
                    fva0.f((fva0) jdjVar.c, "Eats.UpdateCookie.Success", null, this.b, 2);
                    fva0.b((fva0) jdjVar.c, "Eats.UpdateCookie.Success", null, new dzm(15, jdjVar), 2);
                    rvq0Var.c.b = true;
                    rvq0Var.a(ServiceLoadingEvent.AUTH_FINISH);
                } else if (i2 == 3) {
                    jdj jdjVar2 = nVar.c;
                    rvq0 rvq0Var2 = nVar.g;
                    fva0.f((fva0) jdjVar2.c, "Eats.UpdateCookie.Failure", null, this.b, 2);
                    fva0.b((fva0) jdjVar2.c, "Eats.UpdateCookie.Failure", null, null, 6);
                    rvq0Var2.c.b = true;
                    rvq0Var2.a(ServiceLoadingEvent.AUTH_FINISH);
                } else if (i2 != 4) {
                    w511.b();
                    break;
                } else {
                    nVar.g.a(ServiceLoadingEvent.AUTH_FINISH);
                }
                vbb vbbVar = nVar.f;
                h1p h1pVar = (h1p) vbbVar.b;
                ibw0 ibw0Var = (ibw0) vbbVar.a;
                int i3 = cne.a[cookieInjectionEvent.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    String value = h1pVar.getValue();
                    ibw0Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(Constants.KEY_SERVICE, value);
                    ibw0Var.a.a("SuperappMain.CookieEnjector.InjectingStarted", hashMap, 2, new HashMap());
                    break;
                } else if (i3 == 3 || i3 == 4) {
                    String value2 = h1pVar.getValue();
                    ibw0Var.getClass();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(Constants.KEY_SERVICE, value2);
                    ibw0Var.a.a("SuperappMain.CookieEnjector.Received", hashMap2, 2, new HashMap());
                    break;
                } else {
                    w511.b();
                }
            default:
                ((a) obj2).e.remove(Long.valueOf(this.b));
                break;
        }
        return zy11Var;
    }

    public c9w0(n nVar) {
        this.c = nVar;
    }
}
