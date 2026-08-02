package defpackage;

import com.yandex.go.taxi.order.api.titles.OrderTitles$Alignment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class p7j implements q8j {
    public final q7j a;

    public p7j(gs70 gs70Var, q7j q7jVar) {
        this.a = q7jVar;
    }

    @Override // defpackage.q8j
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        this.a.a.l(gs70.a(taxiOrder).b ? OrderTitles$Alignment.START : OrderTitles$Alignment.CENTER);
        return zy11.a;
    }
}
