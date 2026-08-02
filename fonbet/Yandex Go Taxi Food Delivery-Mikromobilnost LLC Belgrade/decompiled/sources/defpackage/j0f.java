package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class j0f implements i0f {
    public final eu90 a;
    public final vfd0 b;

    public j0f(eu90 eu90Var, vfd0 vfd0Var) {
        this.a = eu90Var;
        this.b = vfd0Var;
    }

    public static String a(PlusPayCounterOffers plusPayCounterOffers) {
        List<PlusPayCounterOffers.CounterOffer> offers = plusPayCounterOffers.getOffers();
        ArrayList arrayList = new ArrayList(tcc.n(offers, 10));
        Iterator<T> it = offers.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlusPayCounterOffers.CounterOffer) it.next()).getOffer());
        }
        return ((PlusPayCompositeOffers.Offer) a.P(arrayList)).getMeta().getProductTarget();
    }
}
