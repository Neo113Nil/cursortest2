package com.yandex.go.payments.paymentlist.domain.converter;

import java.util.List;

/* loaded from: classes8.dex */
public final class d {
    public final PaymentMethodsConverter$PaymentOptionGroupType a;
    public final List b;
    public final String c;

    public d(PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType, List list) {
        this.a = paymentMethodsConverter$PaymentOptionGroupType;
        this.b = list;
        this.c = paymentMethodsConverter$PaymentOptionGroupType.getWireName();
    }
}
