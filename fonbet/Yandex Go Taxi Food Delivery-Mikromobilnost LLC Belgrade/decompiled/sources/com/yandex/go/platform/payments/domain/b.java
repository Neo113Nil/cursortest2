package com.yandex.go.platform.payments.domain;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.ex11;
import defpackage.fx11;
import defpackage.ryj0;
import defpackage.tls;

/* loaded from: classes13.dex */
public final class b implements ryj0 {
    public final tls a;

    public b(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        ((UnbindCardInteractor$unbindCard$2$paymentCompletion$1) this.a).invoke(new ex11((PaymentKitError) obj));
    }

    @Override // defpackage.ryj0
    public final void onSuccess(Object obj) {
        ((UnbindCardInteractor$unbindCard$2$paymentCompletion$1) this.a).invoke(fx11.a);
    }
}
