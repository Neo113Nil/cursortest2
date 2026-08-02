package com.yandex.go.payments.data;

import com.yandex.go.payments.data.model.PaymentMethodsBankIcons;
import com.yandex.go.payments.data.model.PaymentMethodsParams;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import defpackage.cmt;
import defpackage.m6x0;
import defpackage.q76;
import defpackage.qg21;
import defpackage.s490;
import defpackage.wqs;
import defpackage.x6v;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\f0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/data/PaymentMethodsApi;", "", "Lcom/yandex/go/payments/data/model/PaymentMethodsParams;", "params", "Lcmt;", "Lcom/yandex/go/payments/data/model/response/PaymentMethods;", "b", "(Lcom/yandex/go/payments/data/model/PaymentMethodsParams;)Lcmt;", "", "fileUrl", "Lx6v;", "ignoring", "", "Lcom/yandex/go/payments/data/model/PaymentMethodsBankIcons;", "a", "(Ljava/lang/String;Lx6v;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface PaymentMethodsApi {
    @wqs
    cmt<Map<String, PaymentMethodsBankIcons>> a(@qg21 String fileUrl, @m6x0 x6v ignoring);

    @s490("paymentmethods")
    cmt<PaymentMethods> b(@q76 PaymentMethodsParams params);
}
