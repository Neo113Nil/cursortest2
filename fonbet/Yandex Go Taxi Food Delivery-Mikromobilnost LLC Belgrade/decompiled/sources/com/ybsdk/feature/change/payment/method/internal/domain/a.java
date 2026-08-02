package com.ybsdk.feature.change.payment.method.internal.domain;

import com.ybsdk.utils.poller.b;
import defpackage.d6v;
import defpackage.fi9;
import java.util.Map;
import kotlinx.coroutines.flow.e;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.change.payment.method.internal.repositories.a a;
    public final b b;

    public a(com.ybsdk.feature.change.payment.method.internal.repositories.a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final fi9 a(String str, Map map, d6v d6vVar) {
        return e.i(new DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1(this, str, map, d6vVar, null));
    }
}
