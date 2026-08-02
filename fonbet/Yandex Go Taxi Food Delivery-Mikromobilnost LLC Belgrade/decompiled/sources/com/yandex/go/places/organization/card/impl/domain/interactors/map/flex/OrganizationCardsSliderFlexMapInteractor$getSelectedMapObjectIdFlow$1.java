package com.yandex.go.places.organization.card.impl.domain.interactors.map.flex;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "Lti80;", "Lcom/yandex/go/places/models/data/entities/network/map/e;", "<destruct>", "<anonymous>", "(Lkotlin/Pair;)Lcom/yandex/go/places/models/data/entities/network/map/e;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.domain.interactors.map.flex.OrganizationCardsSliderFlexMapInteractor$getSelectedMapObjectIdFlow$1", f = "OrganizationCardsSliderFlexMapInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardsSliderFlexMapInteractor$getSelectedMapObjectIdFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardsSliderFlexMapInteractor$getSelectedMapObjectIdFlow$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrganizationCardsSliderFlexMapInteractor$getSelectedMapObjectIdFlow$1 organizationCardsSliderFlexMapInteractor$getSelectedMapObjectIdFlow$1 = new OrganizationCardsSliderFlexMapInteractor$getSelectedMapObjectIdFlow$1(this.this$0, continuation);
        organizationCardsSliderFlexMapInteractor$getSelectedMapObjectIdFlow$1.L$0 = obj;
        return organizationCardsSliderFlexMapInteractor$getSelectedMapObjectIdFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationCardsSliderFlexMapInteractor$getSelectedMapObjectIdFlow$1) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.places.models.data.entities.network.map.e eVar = (com.yandex.go.places.models.data.entities.network.map.e) pair.getSecond();
        if (this.this$0.i.f) {
            return eVar;
        }
        return null;
    }
}
