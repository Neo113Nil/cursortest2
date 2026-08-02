package defpackage;

import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class pq80 implements nq80 {
    public final dit a;

    public pq80(dit ditVar) {
        this.a = ditVar;
    }

    public final String a(PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, PlusPayCompositeOffers.Offer offer) {
        oq80 oq80Var = new oq80();
        dit ditVar = this.a;
        String str = ditVar.a;
        LinkedHashMap linkedHashMap = oq80Var.a;
        linkedHashMap.put("clientSource", str);
        linkedHashMap.put("clientSubSource", ditVar.b);
        String clientPlace = plusPayPaymentAnalyticsParams.getClientPlace();
        if (clientPlace != null) {
            linkedHashMap.put("clientPlace", clientPlace);
        }
        linkedHashMap.put("isPlusHome", String.valueOf(ditVar.c));
        linkedHashMap.put("target", offer.getMeta().getProductTarget());
        linkedHashMap.put("offersBatchId", offer.getMeta().getOffersBatchId());
        linkedHashMap.put("offersPositionIds", a.X(Collections.singletonList(offer.getPositionId()), ",", null, null, null, 62));
        linkedHashMap.put("paymentIntegration", "PaymentSDK");
        linkedHashMap.put("os", ConstantDeviceInfo.APP_PLATFORM);
        for (Map.Entry<String, String> entry : plusPayPaymentAnalyticsParams.getClientParams().entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return oq80Var.a();
    }
}
