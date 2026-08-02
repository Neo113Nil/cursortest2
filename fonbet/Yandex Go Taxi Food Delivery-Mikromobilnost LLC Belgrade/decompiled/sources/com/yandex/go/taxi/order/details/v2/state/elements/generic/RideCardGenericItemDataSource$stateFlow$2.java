package com.yandex.go.taxi.order.details.v2.state.elements.generic;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.e;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Type;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ojk0;
import defpackage.vik0;
import defpackage.wik0;
import defpackage.wls;
import defpackage.xss0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxss0;", "it", "Lwik0;", "<anonymous>", "(Lxss0;)Lwik0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.generic.RideCardGenericItemDataSource$stateFlow$2", f = "RideCardGenericItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardGenericItemDataSource$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ kdc $backgroundColor;
    final /* synthetic */ ojk0 $item;
    final /* synthetic */ List<e> $pendingChanges;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardGenericItemDataSource$stateFlow$2(a aVar, ojk0 ojk0Var, List list, kdc kdcVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = ojk0Var;
        this.$pendingChanges = list;
        this.$backgroundColor = kdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardGenericItemDataSource$stateFlow$2 rideCardGenericItemDataSource$stateFlow$2 = new RideCardGenericItemDataSource$stateFlow$2(this.this$0, this.$item, this.$pendingChanges, this.$backgroundColor, continuation);
        rideCardGenericItemDataSource$stateFlow$2.L$0 = obj;
        return rideCardGenericItemDataSource$stateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardGenericItemDataSource$stateFlow$2) create((xss0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xss0 xss0Var = (xss0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ChangeOrderState$Source changeOrderState$Source = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        RideCardItemDto$Type type = this.$item.getType();
        List<e> list = this.$pendingChanges;
        aVar.getClass();
        int i = vik0.a[type.ordinal()];
        boolean z = true;
        if (i == 1) {
            changeOrderState$Source = ChangeOrderState$Source.SOURCE_POINT;
        } else if (i == 2) {
            changeOrderState$Source = ChangeOrderState$Source.DESTINATION_POINT;
        } else if (i == 3) {
            changeOrderState$Source = ChangeOrderState$Source.ROUTE_POINT;
        } else if (i == 4) {
            changeOrderState$Source = ChangeOrderState$Source.PAYMENT;
        } else if (i == 5) {
            changeOrderState$Source = ChangeOrderState$Source.REQUIREMENT;
        }
        List<e> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((e) it.next()).getB() == changeOrderState$Source) {
                    break;
                }
            }
        }
        z = false;
        return new wik0(this.$item.getId(), this.$item.getB(), xss0Var, this.$backgroundColor, z);
    }
}
