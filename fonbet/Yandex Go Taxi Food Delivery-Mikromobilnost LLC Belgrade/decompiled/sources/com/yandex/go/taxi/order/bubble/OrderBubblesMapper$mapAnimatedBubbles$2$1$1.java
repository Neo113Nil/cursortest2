package com.yandex.go.taxi.order.bubble;

import com.yandex.go.taxi.order.bubble.model.Bubble$Type;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$CompanionsSearch;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qe2;
import defpackage.re2;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltl6;", "<anonymous>", "(Ltse;)Ltl6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.bubble.OrderBubblesMapper$mapAnimatedBubbles$2$1$1", f = "OrderBubblesMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderBubblesMapper$mapAnimatedBubbles$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ SearchInfoResponse$CompanionsSearch.TravelCompanion $it;
    final /* synthetic */ Bubble$Type $type;
    final /* synthetic */ boolean $withDefaultIconSize;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBubblesMapper$mapAnimatedBubbles$2$1$1(b bVar, SearchInfoResponse$CompanionsSearch.TravelCompanion travelCompanion, Bubble$Type bubble$Type, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$it = travelCompanion;
        this.$type = bubble$Type;
        this.$withDefaultIconSize = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderBubblesMapper$mapAnimatedBubbles$2$1$1(this.this$0, this.$it, this.$type, this.$withDefaultIconSize, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderBubblesMapper$mapAnimatedBubbles$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        SearchInfoResponse$CompanionsSearch.TravelCompanion travelCompanion = this.$it;
        Bubble$Type bubble$Type = this.$type;
        boolean z = this.$withDefaultIconSize;
        bVar.getClass();
        zzs zzsVar = travelCompanion.b;
        String str = travelCompanion.a;
        if (zzsVar != zzs.f) {
            qe2 qe2Var = str.length() == 0 ? null : new qe2(((m7x0) bVar.c).a(str), travelCompanion.c, z);
            if (qe2Var != null) {
                return new re2(zzsVar, bubble$Type, qe2Var);
            }
        }
        return null;
    }
}
