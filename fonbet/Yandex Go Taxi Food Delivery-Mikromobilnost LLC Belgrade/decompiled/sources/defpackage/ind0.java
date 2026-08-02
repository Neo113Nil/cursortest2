package defpackage;

import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class ind0 {
    public final UUID a;
    public final PlusTarifficatorPurchase b;
    public final List c;
    public final PlusPayPaymentAnalyticsParams d;
    public final Map e;

    public ind0(UUID uuid, PlusTarifficatorPurchase plusTarifficatorPurchase, List list, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, Map map) {
        this.a = uuid;
        this.b = plusTarifficatorPurchase;
        this.c = list;
        this.d = plusPayPaymentAnalyticsParams;
        this.e = map;
    }

    public static ind0 a(ind0 ind0Var, PlusTarifficatorPurchase plusTarifficatorPurchase, List list, int i) {
        UUID uuid = ind0Var.a;
        if ((i & 2) != 0) {
            plusTarifficatorPurchase = ind0Var.b;
        }
        PlusTarifficatorPurchase plusTarifficatorPurchase2 = plusTarifficatorPurchase;
        if ((i & 4) != 0) {
            list = ind0Var.c;
        }
        PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams = ind0Var.d;
        Map map = ind0Var.e;
        ind0Var.getClass();
        return new ind0(uuid, plusTarifficatorPurchase2, list, plusPayPaymentAnalyticsParams, map);
    }

    public final PlusTarifficatorPurchase b() {
        PlusTarifficatorPurchase plusTarifficatorPurchase = (PlusTarifficatorPurchase) a.b0(this.c);
        return plusTarifficatorPurchase == null ? this.b : plusTarifficatorPurchase;
    }

    public final PlusTarifficatorPurchase c() {
        List list = this.c;
        if (list.isEmpty()) {
            return this.b;
        }
        PlusPayCompositeOffers.Offer offer = ((PlusTarifficatorPurchase) a.P(list)).getOffer();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            PlusTarifficatorPurchase plusTarifficatorPurchase = (PlusTarifficatorPurchase) listIterator.previous();
            if (jl40.l(plusTarifficatorPurchase.getOffer(), offer)) {
                return plusTarifficatorPurchase;
            }
        }
        w511.i("List contains no element matching the predicate.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ind0)) {
            return false;
        }
        ind0 ind0Var = (ind0) obj;
        return jl40.l(this.a, ind0Var.a) && this.b.equals(ind0Var.b) && this.c.equals(ind0Var.c) && jl40.l(this.d, ind0Var.d) && jl40.l(this.e, ind0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusTarifficatorContext(purchaseSessionId=");
        sb.append(this.a);
        sb.append(", currentPurchase=");
        sb.append(this.b);
        sb.append(", purchasesHistory=");
        sb.append(this.c);
        sb.append(", analyticsParams=");
        sb.append(this.d);
        sb.append(", externalCallerPayload=");
        return smw0.n(sb, this.e, ')');
    }
}
