package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.BindingRequest;
import com.yandex.go.payments.cards.data.model.BindingResponse;
import com.yandex.go.payments.cards.data.model.CardMetaRequest;
import com.yandex.go.payments.cards.data.model.CardMetaResponse;
import com.yandex.go.payments.cards.data.model.GuessAmount;
import com.yandex.go.payments.cards.data.model.PaymentVerificationsResponse;
import com.yandex.go.payments.cards.pci_dss.data.model.SupplyPaymentBillingRequest;
import defpackage.cmt;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJU\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00150\bj\u0002`\u00162\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H'¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/cards/data/TrustApi;", "", "", "authToken", "serviceToken", "partition", "Lcom/yandex/go/payments/cards/data/model/BindingRequest;", "request", "Lcmt;", "Lcom/yandex/go/payments/cards/data/model/BindingResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/cards/data/model/BindingRequest;)Lcmt;", "bindingId", "verificationId", "Lcom/yandex/go/payments/cards/data/model/GuessAmount;", "guessAmount", "Lcom/yandex/go/payments/cards/data/model/PaymentVerificationsResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/cards/data/model/GuessAmount;)Lcmt;", "Lcom/yandex/go/payments/cards/pci_dss/data/model/SupplyPaymentBillingRequest;", "r", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "c", "(Lcom/yandex/go/payments/cards/pci_dss/data/model/SupplyPaymentBillingRequest;)Lcmt;", "Lcom/yandex/go/payments/cards/data/model/CardMetaRequest;", "bin", "Lcom/yandex/go/payments/cards/data/model/CardMetaResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/cards/data/model/CardMetaRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface TrustApi {
    @s490("v2/cardmeta")
    cmt<CardMetaResponse> a(@z8u("X-Oauth-Token") String authToken, @z8u("X-Passport-Partition") String partition, @q76 CardMetaRequest bin);

    @s490("bindings/v2.0/bindings")
    cmt<BindingResponse> b(@z8u("X-Oauth-Token") String authToken, @z8u("X-Service-Token") String serviceToken, @z8u("X-Passport-Partition") String partition, @q76 BindingRequest request);

    @s490("supply_payment_data")
    cmt<zy11> c(@q76 SupplyPaymentBillingRequest r);

    @s490("bindings/v2.0/bindings/{payment_method_id}/verifications/{verification_id}/guess_amount")
    cmt<PaymentVerificationsResponse> d(@pq90("payment_method_id") String bindingId, @pq90("verification_id") String verificationId, @z8u("X-Oauth-Token") String authToken, @z8u("X-Service-Token") String serviceToken, @z8u("X-Passport-Partition") String partition, @q76 GuessAmount guessAmount);
}
