package com.yandex.go.payments.data;

import com.yandex.go.payments.data.model.ListPaymentMethodsParams;
import com.yandex.go.payments.data.model.ListPaymentMethodsResponse;
import com.yandex.go.payments.data.model.PaymentMethodsBankIcons;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.m6x0;
import defpackage.q76;
import defpackage.qg21;
import defpackage.s490;
import defpackage.wqs;
import defpackage.x6v;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e0\u00072\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/data/PaymentsApi;", "", "", Constants.KEY_SERVICE, "serviceFeature", "Lcom/yandex/go/payments/data/model/ListPaymentMethodsParams;", "body", "Lcmt;", "Lcom/yandex/go/payments/data/model/ListPaymentMethodsResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/data/model/ListPaymentMethodsParams;)Lcmt;", "fileUrl", "Lx6v;", "ignoring", "", "Lcom/yandex/go/payments/data/model/PaymentMethodsBankIcons;", "a", "(Ljava/lang/String;Lx6v;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PaymentsApi {
    @wqs
    cmt<Map<String, PaymentMethodsBankIcons>> a(@qg21 String fileUrl, @m6x0 x6v ignoring);

    @s490("/payments/v1/list-payment-methods")
    cmt<ListPaymentMethodsResponse> b(@djg0("service") String service, @djg0("feature") String serviceFeature, @q76 ListPaymentMethodsParams body);
}
