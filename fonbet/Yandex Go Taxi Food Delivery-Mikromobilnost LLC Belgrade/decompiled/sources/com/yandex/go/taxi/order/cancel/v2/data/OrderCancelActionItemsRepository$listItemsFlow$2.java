package com.yandex.go.taxi.order.cancel.v2.data;

import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import com.yandex.go.taxi.order.models.api.e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "currentTheme", "Lkotlin/Pair;", "", "Lol70;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.v2.data.OrderCancelActionItemsRepository$listItemsFlow$2", f = "OrderCancelActionItemsRepository.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderCancelActionItemsRepository$listItemsFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<OrderCancelNotification.ListItem> $listItems;
    final /* synthetic */ List<e> $pendingChanges;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelActionItemsRepository$listItemsFlow$2(b bVar, List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$listItems = list;
        this.$pendingChanges = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderCancelActionItemsRepository$listItemsFlow$2 orderCancelActionItemsRepository$listItemsFlow$2 = new OrderCancelActionItemsRepository$listItemsFlow$2(this.this$0, this.$listItems, this.$pendingChanges, continuation);
        orderCancelActionItemsRepository$listItemsFlow$2.L$0 = obj;
        return orderCancelActionItemsRepository$listItemsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderCancelActionItemsRepository$listItemsFlow$2) create((ThemeType) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ThemeType themeType = (ThemeType) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            List<OrderCancelNotification.ListItem> list = this.$listItems;
            List<e> list2 = this.$pendingChanges;
            this.L$0 = themeType;
            this.label = 1;
            obj = b.a(bVar, list, themeType, list2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new Pair(obj, themeType);
    }
}
