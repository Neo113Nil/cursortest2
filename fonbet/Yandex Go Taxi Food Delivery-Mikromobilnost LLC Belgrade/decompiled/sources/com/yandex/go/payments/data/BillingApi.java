package com.yandex.go.payments.data;

import com.yandex.go.payments.data.model.BindGooglePayBillingRequest;
import com.yandex.go.payments.data.model.BindGooglePayResponse;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/data/BillingApi;", "", "", "serviceToken", "Lcom/yandex/go/payments/data/model/BindGooglePayBillingRequest;", "params", "Lcmt;", "Lcom/yandex/go/payments/data/model/BindGooglePayResponse;", "a", "(Ljava/lang/String;Lcom/yandex/go/payments/data/model/BindGooglePayBillingRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface BillingApi {
    @s490("bind_google_pay_token")
    cmt<BindGooglePayResponse> a(@z8u("X-Service-Token") String serviceToken, @q76 BindGooglePayBillingRequest params);
}
