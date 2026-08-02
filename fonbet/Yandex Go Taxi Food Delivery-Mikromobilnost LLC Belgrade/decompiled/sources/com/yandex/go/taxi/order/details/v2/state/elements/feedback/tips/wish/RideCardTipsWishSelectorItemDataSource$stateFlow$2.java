package com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector;
import defpackage.bbk0;
import defpackage.bms;
import defpackage.bpk0;
import defpackage.hg4;
import defpackage.kpk0;
import defpackage.lpk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.xss0;
import defpackage.zy11;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lbpk0;", "elements", "Lkpk0;", "content", "Lxss0;", "preferredTipsSubscription", "Llpk0;", "<anonymous>", "(Ljava/util/List;Lkpk0;Lxss0;)Llpk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish.RideCardTipsWishSelectorItemDataSource$stateFlow$2", f = "RideCardTipsWishSelectorItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTipsWishSelectorItemDataSource$stateFlow$2 extends SuspendLambda implements bms {
    final /* synthetic */ hg4 $background;
    final /* synthetic */ RideCardItemDto$TipsWishSelector $item;
    final /* synthetic */ CharSequence $subtitle;
    final /* synthetic */ CharSequence $title;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTipsWishSelectorItemDataSource$stateFlow$2(RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector, CharSequence charSequence, CharSequence charSequence2, hg4 hg4Var, Continuation continuation) {
        super(4, continuation);
        this.$item = rideCardItemDto$TipsWishSelector;
        this.$title = charSequence;
        this.$subtitle = charSequence2;
        this.$background = hg4Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RideCardTipsWishSelectorItemDataSource$stateFlow$2 rideCardTipsWishSelectorItemDataSource$stateFlow$2 = new RideCardTipsWishSelectorItemDataSource$stateFlow$2(this.$item, this.$title, this.$subtitle, this.$background, (Continuation) obj4);
        rideCardTipsWishSelectorItemDataSource$stateFlow$2.L$0 = (List) obj;
        rideCardTipsWishSelectorItemDataSource$stateFlow$2.L$1 = (kpk0) obj2;
        rideCardTipsWishSelectorItemDataSource$stateFlow$2.L$2 = (xss0) obj3;
        return rideCardTipsWishSelectorItemDataSource$stateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Integer num;
        List list = (List) this.L$0;
        kpk0 kpk0Var = (kpk0) this.L$1;
        xss0 xss0Var = (xss0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<bpk0> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (bpk0 bpk0Var : list2) {
                if ((bpk0Var.c instanceof bbk0) && bpk0Var.b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector = this.$item;
        String str = rideCardItemDto$TipsWishSelector.a;
        String str2 = rideCardItemDto$TipsWishSelector.b;
        RideCardItemDto$TipsWishSelector.Background background = rideCardItemDto$TipsWishSelector.f;
        return new lpk0(str, str2, this.$title, this.$subtitle, this.$background, (background == null || (num = background.b) == null) ? 0 : num.intValue(), kpk0Var, z ? xss0Var : null, list);
    }
}
