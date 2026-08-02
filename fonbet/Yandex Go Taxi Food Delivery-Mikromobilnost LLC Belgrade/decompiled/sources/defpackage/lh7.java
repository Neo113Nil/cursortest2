package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.Arrays;
import kotlin.text.Regex;

/* loaded from: classes14.dex */
public final /* synthetic */ class lh7 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaxiOrder b;

    public /* synthetic */ lh7(TaxiOrder taxiOrder, int i) {
        this.a = i;
        this.b = taxiOrder;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                String str = this.b.V().g.g;
                return new Regex("^\\+\\d*,\\d+$").a(str) ? str : b64.k("\\d{5}(?!\\d{3})", b64.k("[^+0-9]", str, ""), "xxxxx");
            case 1:
                return String.format("id: %s", Arrays.copyOf(new Object[]{this.b.a}, 1));
            case 2:
                TaxiOrder taxiOrder = this.b;
                return String.format("OrderStatus: Update order notification for order=%s at status=%s", Arrays.copyOf(new Object[]{taxiOrder.a, taxiOrder.h.b}, 2));
            default:
                TaxiOrder taxiOrder2 = this.b;
                synchronized (taxiOrder2) {
                    taxiOrder2.l = taxiOrder2.l.N();
                }
                return zy11.a;
        }
    }
}
