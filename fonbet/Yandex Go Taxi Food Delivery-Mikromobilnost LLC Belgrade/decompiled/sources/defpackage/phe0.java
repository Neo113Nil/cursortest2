package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.a;
import ru.yandex.taxi.common_models.SupportedEatsServices;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public abstract class phe0 {
    public static final Set a;

    static {
        k4o a2 = SupportedEatsServices.a();
        ArrayList arrayList = new ArrayList(tcc.n(a2, 10));
        Iterator<E> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(((SupportedEatsServices) it.next()).getKey());
        }
        a = a.N0(a.o0(arrayList, TariffOrderFlow.ORDER_FLOW_TAXI_KEY));
    }
}
