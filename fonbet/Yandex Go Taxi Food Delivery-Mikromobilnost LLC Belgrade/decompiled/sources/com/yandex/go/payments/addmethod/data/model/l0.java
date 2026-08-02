package com.yandex.go.payments.addmethod.data.model;

import com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusResponse;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class l0 extends xqt {
    public static final l0 e = new l0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction.Companion.serializer(), qoi0.a(PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("async_application", PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction.Companion.serializer(), qoi0.a(PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction.class)));
    }
}
