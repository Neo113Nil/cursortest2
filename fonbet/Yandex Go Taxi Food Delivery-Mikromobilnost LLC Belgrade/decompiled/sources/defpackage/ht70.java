package defpackage;

import com.yandex.go.taxi.order.details.v1.style.OrderDetailsStyleState;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class ht70 implements a2k {
    public final yj70 a;
    public final it70 b;
    public final y480 c;
    public final gci0 d;

    public ht70(yj70 yj70Var, it70 it70Var, y480 y480Var) {
        this.a = yj70Var;
        this.b = it70Var;
        this.c = y480Var;
        this.d = it70Var.b;
    }

    @Override // defpackage.q8j
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        ((y480) this.a.a).a.getClass();
        this.b.a.l(gs70.a(taxiOrder).b ? OrderDetailsStyleState.DETAILS_STYLE_V2 : OrderDetailsStyleState.DETAILS_STYLE_V1);
        return zy11.a;
    }

    @Override // defpackage.a2k
    public final Object b(TaxiOrder taxiOrder) {
        this.c.a.getClass();
        return new gt70(gs70.a(taxiOrder).b);
    }
}
