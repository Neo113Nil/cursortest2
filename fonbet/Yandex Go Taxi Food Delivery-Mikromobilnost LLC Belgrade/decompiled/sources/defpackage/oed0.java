package defpackage;

import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.repository.api.model.offers.Price;

/* loaded from: classes2.dex */
public final class oed0 {
    public static PlusPayPrice a(Price price) {
        return new PlusPayPrice(price.getAmount(), price.getCurrency());
    }
}
