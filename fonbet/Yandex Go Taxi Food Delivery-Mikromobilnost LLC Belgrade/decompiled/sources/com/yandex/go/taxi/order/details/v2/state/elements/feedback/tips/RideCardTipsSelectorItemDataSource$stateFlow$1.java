package com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsSelector;
import defpackage.bbk0;
import defpackage.bpk0;
import defpackage.cpk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.xss0;
import defpackage.yjk0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lbpk0;", "elements", "Lxss0;", "preferredTipsSubscription", "Lzjk0;", "<anonymous>", "(Ljava/util/List;Lxss0;)Lzjk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.RideCardTipsSelectorItemDataSource$stateFlow$1", f = "RideCardTipsSelectorItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTipsSelectorItemDataSource$stateFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ RideCardItemDto$TipsSelector $item;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTipsSelectorItemDataSource$stateFlow$1(RideCardItemDto$TipsSelector rideCardItemDto$TipsSelector, Continuation continuation) {
        super(3, continuation);
        this.$item = rideCardItemDto$TipsSelector;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardTipsSelectorItemDataSource$stateFlow$1 rideCardTipsSelectorItemDataSource$stateFlow$1 = new RideCardTipsSelectorItemDataSource$stateFlow$1(this.$item, (Continuation) obj3);
        rideCardTipsSelectorItemDataSource$stateFlow$1.L$0 = (List) obj;
        rideCardTipsSelectorItemDataSource$stateFlow$1.L$1 = (xss0) obj2;
        return rideCardTipsSelectorItemDataSource$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        xss0 xss0Var = (xss0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (list.isEmpty()) {
            return new yjk0(this.$item.a);
        }
        List list2 = list;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bpk0 bpk0Var = (bpk0) it.next();
                if ((bpk0Var.c instanceof bbk0) && bpk0Var.b) {
                    z = true;
                    break;
                }
            }
        }
        RideCardItemDto$TipsSelector rideCardItemDto$TipsSelector = this.$item;
        String str = rideCardItemDto$TipsSelector.a;
        String str2 = rideCardItemDto$TipsSelector.b;
        if (!z) {
            xss0Var = null;
        }
        return new cpk0(str, str2, xss0Var, list);
    }
}
