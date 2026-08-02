package com.yandex.go.taxi.order.support.data.mappers;

import com.yandex.go.taxi.order.models.api.ride_support.OrderRideSupportNotification;
import defpackage.kjw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkjw0;", "<anonymous>", "(Ltse;)Lkjw0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.support.data.mappers.SupportItemsMapper$mapModel$2", f = "SupportItemsMapper.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SupportItemsMapper$mapModel$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<OrderRideSupportNotification.SupportItemDto> $notificationItems;
    final /* synthetic */ OrderRideSupportNotification $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportItemsMapper$mapModel$2(List list, OrderRideSupportNotification orderRideSupportNotification, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$notificationItems = list;
        this.$response = orderRideSupportNotification;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SupportItemsMapper$mapModel$2 supportItemsMapper$mapModel$2 = new SupportItemsMapper$mapModel$2(this.$notificationItems, this.$response, this.this$0, continuation);
        supportItemsMapper$mapModel$2.L$0 = obj;
        return supportItemsMapper$mapModel$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportItemsMapper$mapModel$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<OrderRideSupportNotification.SupportItemDto> list = this.$notificationItems;
            b bVar = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new SupportItemsMapper$mapModel$2$items$1$1(bVar, (OrderRideSupportNotification.SupportItemDto) it.next(), null), 3));
            }
            OrderRideSupportNotification orderRideSupportNotification = this.$response;
            str = orderRideSupportNotification.b;
            String str4 = orderRideSupportNotification.c;
            String str5 = orderRideSupportNotification.d;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = str;
            this.L$3 = str4;
            this.L$4 = str5;
            this.label = 1;
            Object b = kotlinx.coroutines.a.b(arrayList, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str4;
            str3 = str5;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = (String) this.L$4;
            str2 = (String) this.L$3;
            str = (String) this.L$2;
            kotlin.b.b(obj);
        }
        return new kjw0(str, str2, str3, kotlin.collections.a.M((Iterable) obj));
    }
}
