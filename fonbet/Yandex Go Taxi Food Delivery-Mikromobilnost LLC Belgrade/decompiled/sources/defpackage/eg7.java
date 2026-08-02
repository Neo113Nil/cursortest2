package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.ButtonModifierDTO;
import com.yandex.go.taxi.order.models.api.objects.Forwarding;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class eg7 {
    public static dg7 a(TaxiOrder taxiOrder) {
        String str = taxiOrder.V().g.g;
        Forwarding forwarding = taxiOrder.V().g.e;
        Object obj = null;
        String str2 = forwarding != null ? forwarding.a : null;
        Iterator it = taxiOrder.V().V.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (ButtonModifierDTO.ButtonName.CALL_TO_DRIVER == ((ButtonModifierDTO) next).a) {
                obj = next;
                break;
            }
        }
        return new dg7((ButtonModifierDTO) obj, str, (str.length() > 0 || str2 != null) && taxiOrder.V().S);
    }
}
