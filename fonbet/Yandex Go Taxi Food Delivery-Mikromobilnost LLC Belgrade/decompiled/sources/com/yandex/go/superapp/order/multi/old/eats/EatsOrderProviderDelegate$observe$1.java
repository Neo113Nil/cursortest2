package com.yandex.go.superapp.order.multi.old.eats;

import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class EatsOrderProviderDelegate$observe$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((AtomicReference) this.receiver).set((List) obj);
        return zy11.a;
    }
}
