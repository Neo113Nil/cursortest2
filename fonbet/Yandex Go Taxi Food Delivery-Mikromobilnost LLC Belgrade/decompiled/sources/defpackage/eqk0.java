package defpackage;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderPendingChanges;
import com.yandex.go.taxi.order.provider.a;
import java.util.Iterator;
import java.util.function.Consumer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class eqk0 extends a20 {
    public final /* synthetic */ fqk0 c;

    public eqk0(fqk0 fqk0Var) {
        this.c = fqk0Var;
    }

    @Override // defpackage.a20
    public final String a() {
        return "change payment";
    }

    @Override // defpackage.a20
    public final void b(Object obj, Throwable th) {
        Object obj2;
        Object value;
        TaxiOrder taxiOrder;
        yc9 yc9Var = (yc9) obj;
        super.b(yc9Var, th);
        fqk0 fqk0Var = this.c;
        TaxiOrder i = ((e0) fqk0Var.e).i(yc9Var.b);
        if (i != null) {
            Iterator it = ((a) fqk0Var.b).l().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (jl40.l(((o2y0) obj2).b().a, i.a)) {
                        break;
                    }
                }
            }
            o2y0 o2y0Var = (o2y0) obj2;
            if (o2y0Var != null) {
                r0 r0Var = o2y0Var.a;
                do {
                    value = r0Var.getValue();
                    taxiOrder = (TaxiOrder) value;
                    synchronized (taxiOrder) {
                        TaxiOrderPendingChanges taxiOrderPendingChanges = taxiOrder.i;
                        lv90.Companion.getClass();
                        TaxiOrderPendingChanges k = taxiOrderPendingChanges.k(lv90.g);
                        k.g(ChangeOrderState$Source.PAYMENT);
                        taxiOrder.i = k;
                    }
                } while (!r0Var.k(value, taxiOrder));
                o2y0Var.f();
            }
            fqk0Var.d.g(i);
        }
        Consumer consumer = yc9Var.h;
        if (consumer != null) {
            qyy0.c(new xmf0(26, consumer, th));
        }
    }

    @Override // defpackage.a20
    public final void c(Object obj) {
        yc9 yc9Var = (yc9) obj;
        super.c(yc9Var);
        Runnable runnable = yc9Var.g;
        if (runnable != null) {
            qyy0.c(runnable);
        }
    }

    @Override // defpackage.a20
    public final Object d(String str, Object obj, Continuation continuation) {
        return this.c.c.d((yc9) obj, (ContinuationImpl) continuation);
    }
}
