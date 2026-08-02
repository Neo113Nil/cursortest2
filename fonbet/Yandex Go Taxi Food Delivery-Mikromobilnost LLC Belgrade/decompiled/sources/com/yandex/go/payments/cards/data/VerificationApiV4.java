package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.VerificationsParam;
import com.yandex.go.payments.cards.data.model.VerificationsResponse;
import com.yandex.go.payments.cards.data.model.VerificationsStatusResponse;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.q76;
import defpackage.s490;
import defpackage.wqs;
import defpackage.z8u;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J=\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJE\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/cards/data/VerificationApiV4;", "", "", "authToken", "userId", "idempotencyToken", "Lcom/yandex/go/payments/cards/data/model/VerificationsParam;", "param", "Lcmt;", "Lcom/yandex/go/payments/cards/data/model/VerificationsResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/cards/data/model/VerificationsParam;)Lcmt;", "verificationId", "", "supportedFeatures", "Lcom/yandex/go/payments/cards/data/model/VerificationsStatusResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface VerificationApiV4 {
    @s490("payment/verifications")
    cmt<VerificationsResponse> a(@z8u("Authorization") String authToken, @z8u("X-YaTaxi-UserId") String userId, @z8u("X-Idempotency-Token") String idempotencyToken, @q76 VerificationsParam param);

    @wqs("payment/verifications/status")
    cmt<VerificationsStatusResponse> b(@z8u("Authorization") String authToken, @z8u("X-YaTaxi-UserId") String userId, @djg0("verification_id") String verificationId, @djg0("supported_features") Set<String> supportedFeatures);
}
