package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.taxi.order.y;

/* loaded from: classes8.dex */
public final class l880 {
    public final y a;
    public final n20 b;

    public l880(y yVar, n20 n20Var) {
        this.a = yVar;
        this.b = n20Var;
    }

    public final void a(tls tlsVar) {
        for (o2y0 o2y0Var : ((a) this.b).l()) {
            TaxiOrder b = o2y0Var.b();
            boolean I = b.I();
            String str = b.a;
            if (!I) {
                boolean G = b.G();
                y yVar = this.a;
                if (!G || zob1.e(b)) {
                    yVar.m(0L, str);
                } else {
                    yVar.a(str);
                }
            }
            tlsVar.invoke(o2y0Var);
        }
    }
}
