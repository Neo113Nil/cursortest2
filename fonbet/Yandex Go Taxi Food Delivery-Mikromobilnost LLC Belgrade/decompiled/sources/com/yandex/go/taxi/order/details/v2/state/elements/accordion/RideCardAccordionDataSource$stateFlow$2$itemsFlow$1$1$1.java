package com.yandex.go.taxi.order.details.v2.state.elements.accordion;

import com.yandex.go.taxi.order.models.api.e;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ojk0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ltpr;", "Lzjk0;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.accordion.RideCardAccordionDataSource$stateFlow$2$itemsFlow$1$1$1", f = "RideCardAccordionDataSource.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAccordionDataSource$stateFlow$2$itemsFlow$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ ojk0 $it;
    final /* synthetic */ List<e> $pendingChanges;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardAccordionDataSource$stateFlow$2$itemsFlow$1$1$1(b bVar, ojk0 ojk0Var, List list, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$it = ojk0Var;
        this.$pendingChanges = list;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardAccordionDataSource$stateFlow$2$itemsFlow$1$1$1(this.this$0, this.$it, this.$pendingChanges, this.$currencyRules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardAccordionDataSource$stateFlow$2$itemsFlow$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.taxi.order.details.v2.state.elements.generic.a aVar = this.this$0.a;
        ojk0 ojk0Var = this.$it;
        List<e> list = this.$pendingChanges;
        fef fefVar = this.$currencyRules;
        this.label = 1;
        Object a = aVar.a(ojk0Var, list, fefVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
