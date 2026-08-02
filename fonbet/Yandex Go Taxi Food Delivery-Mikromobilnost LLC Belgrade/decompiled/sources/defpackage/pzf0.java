package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.analytics.evgen.a;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public interface pzf0 {
    static void a(rzf0 rzf0Var, String str, PurchaseTypeDto purchaseTypeDto, PurchaseStatusTypeDto purchaseStatusTypeDto, SubscriptionInfoError subscriptionInfoError, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            subscriptionInfoError = null;
        }
        rzf0Var.g.invoke(new ymv(str, purchaseTypeDto, purchaseStatusTypeDto, subscriptionInfoError != null ? iib1.b(subscriptionInfoError) : null));
        if (subscriptionInfoError != null) {
            fih fihVar = (fih) rzf0Var.e;
            a aVar = fihVar.a;
            i3y i3yVar = fihVar.b;
            String X = kotlin.collections.a.X(((Map) aVar.a().a).entrySet(), "\n", null, null, null, 62);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String message = subscriptionInfoError.getMessage();
            if (message != null) {
                linkedHashMap.put(Constants.KEY_MESSAGE, message);
            }
            String place = subscriptionInfoError.getPlace();
            if (place != null) {
                linkedHashMap.put("place", place);
            }
            String storyId = subscriptionInfoError.getStoryId();
            if (storyId != null) {
                linkedHashMap.put("storyId", storyId);
            }
            if (subscriptionInfoError instanceof SubscriptionInfoError.NoTarget) {
                linkedHashMap.put("paymentMethod", ((SubscriptionInfoError.NoTarget) subscriptionInfoError).getPaymentMethod());
            } else if (subscriptionInfoError instanceof SubscriptionInfoError.NoProductsByTarget) {
                SubscriptionInfoError.NoProductsByTarget noProductsByTarget = (SubscriptionInfoError.NoProductsByTarget) subscriptionInfoError;
                linkedHashMap.put("targetId", noProductsByTarget.getTargetId());
                linkedHashMap.put("paymentMethod", noProductsByTarget.getPaymentMethod());
                String errorMessage = noProductsByTarget.getErrorMessage();
                if (errorMessage != null) {
                    linkedHashMap.put(ErrorResponseData.JSON_ERROR_MESSAGE, errorMessage);
                }
            } else if (subscriptionInfoError instanceof SubscriptionInfoError.EmptyProductsByTarget) {
                SubscriptionInfoError.EmptyProductsByTarget emptyProductsByTarget = (SubscriptionInfoError.EmptyProductsByTarget) subscriptionInfoError;
                linkedHashMap.put("targetId", emptyProductsByTarget.getTargetId());
                linkedHashMap.put("vendorType", emptyProductsByTarget.getVendorType());
                linkedHashMap.put("offersIds", kotlin.collections.a.X(emptyProductsByTarget.getOffersIds(), null, null, null, null, 63));
                linkedHashMap.put("paymentMethod", emptyProductsByTarget.getPaymentMethod());
            } else if (subscriptionInfoError instanceof SubscriptionInfoError.InvalidPaymentMethod) {
                SubscriptionInfoError.InvalidPaymentMethod invalidPaymentMethod = (SubscriptionInfoError.InvalidPaymentMethod) subscriptionInfoError;
                linkedHashMap.put("targetId", invalidPaymentMethod.getTargetId());
                linkedHashMap.put("paymentMethod", invalidPaymentMethod.getPaymentMethod());
            }
            String X2 = kotlin.collections.a.X(linkedHashMap.entrySet(), "\n", null, null, null, 62);
            String name = iib1.b(subscriptionInfoError).name();
            skd0.h(PlusLogTag.SUBSCRIPTION, b64.l("Error when trying to show native buy button, error=", name, " errorParams=", X2), null);
            w8o w8oVar = (w8o) i3yVar.getValue();
            if (w8oVar != null) {
                w8oVar.reportError(String.format("error.native.button.show.%s", Arrays.copyOf(new Object[]{name}, 1)), unr0.p("globalParams: {\n", X, "\n}\nerrorParams: {\n", X2, "\n}"), null);
            }
            w8o w8oVar2 = (w8o) i3yVar.getValue();
            if (w8oVar2 != null) {
                w8oVar2.a();
            }
        }
    }
}
