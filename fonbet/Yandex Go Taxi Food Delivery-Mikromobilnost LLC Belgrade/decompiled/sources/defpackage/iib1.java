package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseErrorTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class iib1 {
    public static int a;

    public static final void a(y7a y7aVar, b8a b8aVar, v7a v7aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1136716678);
        int i2 = (btsVar.k(y7aVar) ? 4 : 2) | i | (btsVar.k(b8aVar) ? 32 : 16) | (btsVar.k(v7aVar) ? 256 : 128);
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (y7aVar != null) {
            btsVar.e0(1890764694);
            fib1.a(y7aVar, btsVar, i2 & 14);
            btsVar.t(false);
        } else if (b8aVar != null) {
            btsVar.e0(1890840613);
            gib1.a(b8aVar, v7aVar, btsVar, (i2 >> 3) & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            btsVar.e0(1890939720);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(y7aVar, b8aVar, v7aVar, i, 0);
        }
    }

    public static final PurchaseErrorTypeDto b(SubscriptionInfoError subscriptionInfoError) {
        if (subscriptionInfoError instanceof SubscriptionInfoError.ParseConfigError) {
            return PurchaseErrorTypeDto.PARSE_CONFIG_ERROR;
        }
        if (subscriptionInfoError instanceof SubscriptionInfoError.NoTarget) {
            return PurchaseErrorTypeDto.NO_TARGET;
        }
        if (subscriptionInfoError instanceof SubscriptionInfoError.NoProductsByTarget) {
            return PurchaseErrorTypeDto.NO_PRODUCTS_BY_TARGET;
        }
        if (subscriptionInfoError instanceof SubscriptionInfoError.EmptyProductsByTarget) {
            return PurchaseErrorTypeDto.EMPTY_PRODUCTS_BY_TARGET;
        }
        if (subscriptionInfoError instanceof SubscriptionInfoError.InvalidPaymentMethod) {
            return PurchaseErrorTypeDto.INVALID_PAYMENT_METHOD;
        }
        w511.b();
        return null;
    }
}
