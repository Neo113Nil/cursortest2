package com.yandex.go.taxi.order;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.OrderStatusTotwUpdater", f = "OrderStatusTotwUpdater.kt", l = {109, HProv.PP_CACHE_SIZE, HProv.PP_DELETE_KEYSET}, m = "update", v = 2)
/* loaded from: classes14.dex */
final class OrderStatusTotwUpdater$update$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusTotwUpdater$update$1(e0 e0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(0L, this);
    }
}
