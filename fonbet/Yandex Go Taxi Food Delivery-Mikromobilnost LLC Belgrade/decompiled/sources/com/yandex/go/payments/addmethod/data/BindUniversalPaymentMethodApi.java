package com.yandex.go.payments.addmethod.data;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeRequest;
import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import com.yandex.go.payments.addmethod.data.model.BindPaymentMethodRequest;
import com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusRequest;
import com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusResponse;
import com.yandex.go.payments.addmethod.data.model.g0;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/BindUniversalPaymentMethodApi;", "", "Lcom/yandex/go/payments/addmethod/data/model/BindPaymentMethodRequest;", "params", "Lcmt;", "Lcom/yandex/go/payments/addmethod/data/model/g0;", "c", "(Lcom/yandex/go/payments/addmethod/data/model/BindPaymentMethodRequest;)Lcmt;", "Lcom/yandex/go/payments/addmethod/data/model/PaymentMethodBindingStatusRequest;", "Lcom/yandex/go/payments/addmethod/data/model/PaymentMethodBindingStatusResponse;", "b", "(Lcom/yandex/go/payments/addmethod/data/model/PaymentMethodBindingStatusRequest;)Lcmt;", "Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeRequest;", "Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse;", "a", "(Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface BindUniversalPaymentMethodApi {
    @s490("payment-method/v1/home")
    cmt<AddPaymentHomeResponse> a(@q76 AddPaymentHomeRequest params);

    @s490("payment-method/v1/binding-status")
    cmt<PaymentMethodBindingStatusResponse> b(@q76 PaymentMethodBindingStatusRequest params);

    @s490("payment-method/v1/bind")
    cmt<g0> c(@q76 BindPaymentMethodRequest params);
}
