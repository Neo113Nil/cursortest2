package com.ybsdk.feature.rebind.payment.internal.domain;

import com.ybsdk.utils.poller.b;
import defpackage.d6v;
import defpackage.fi9;
import kotlinx.coroutines.flow.e;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.rebind.payment.internal.data.a a;
    public final b b;

    public a(com.ybsdk.feature.rebind.payment.internal.data.a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final fi9 a(String str, d6v d6vVar) {
        return e.i(new RebindPaymentMethodInteractor$getRebindPaymentMethod$1(this, str, d6vVar, null));
    }
}
