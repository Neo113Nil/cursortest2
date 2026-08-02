package com.yandex.go.order.bundle.map.impl.data.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, d2 = {"<anonymous>", "", "T", "orders", "ordersIds", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.order.bundle.map.impl.data.repository.FilterOverlayOrderRepositoryImpl$getFilteredOrdersFlow$1", f = "FilterOverlayOrderRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FilterOverlayOrderRepositoryImpl$getFilteredOrdersFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ tls $getOrderId;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterOverlayOrderRepositoryImpl$getFilteredOrdersFlow$1(tls tlsVar, Continuation continuation) {
        super(3, continuation);
        this.$getOrderId = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FilterOverlayOrderRepositoryImpl$getFilteredOrdersFlow$1 filterOverlayOrderRepositoryImpl$getFilteredOrdersFlow$1 = new FilterOverlayOrderRepositoryImpl$getFilteredOrdersFlow$1(this.$getOrderId, (Continuation) obj3);
        filterOverlayOrderRepositoryImpl$getFilteredOrdersFlow$1.L$0 = (List) obj;
        filterOverlayOrderRepositoryImpl$getFilteredOrdersFlow$1.L$1 = (Set) obj2;
        return filterOverlayOrderRepositoryImpl$getFilteredOrdersFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        Set set = (Set) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tls tlsVar = this.$getOrderId;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (set.contains(tlsVar.invoke(obj2))) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
