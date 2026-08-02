package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes5.dex */
public final class fho {
    public final yrv0 a;
    public final rvq0 b;
    public final h1p c;

    public fho(yrv0 yrv0Var, rvq0 rvq0Var, h1p h1pVar) {
        this.a = yrv0Var;
        this.b = rvq0Var;
        this.c = h1pVar;
    }

    public final void a(p32 p32Var) {
        hst hstVar = jst.e;
        h1p h1pVar = this.c;
        unr0.C(new Object[]{h1pVar.getValue(), p32Var.a}, 2, "SuperApp: %s webView send analytics event [%s]", hstVar);
        yrv0 yrv0Var = this.a;
        yrv0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b bVar = p32Var.b;
        if (bVar != null) {
            linkedHashMap.put("serviceEventValue", bVar);
        }
        linkedHashMap.put("originScreen", qcx.c(yrv0Var.b()));
        linkedHashMap.put(Constants.KEY_SERVICE, qcx.c(h1pVar.getValue()));
        ((j) yrv0Var.b).u(new k52(g8e.o("Superapp.Showcase.Event.", p32Var.a), new c(linkedHashMap)));
    }

    public final void b(boolean z) {
        hst hstVar = jst.e;
        h1p h1pVar = this.c;
        unr0.C(new Object[]{h1pVar.getValue(), Boolean.valueOf(z)}, 2, "SuperApp: %s request change swipe area, exist: %s", hstVar);
        yrv0 yrv0Var = this.a;
        i d = ((j) yrv0Var.a).d("Superapp.Showcase.SetInteractiveDismiss");
        String b = yrv0Var.b();
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("originScreen", b);
        linkedHashMap.put(Constants.KEY_SERVICE, h1pVar.getValue());
        d.g("enable", !z);
        d.m();
    }
}
