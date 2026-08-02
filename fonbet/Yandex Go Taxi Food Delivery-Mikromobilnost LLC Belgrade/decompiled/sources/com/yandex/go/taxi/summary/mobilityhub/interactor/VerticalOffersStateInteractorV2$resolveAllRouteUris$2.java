package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.GroupItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubButtonContainerDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$DetailedMultimodalRoute;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$SelectOffer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$AlternativeOfferItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$DefaultOfferItemDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$GroupItemsDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenResponseV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.b1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.s0;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a(\u0012\u0016\u0012\u0014 \u0004*\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\u0002j\u0002`\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u00050\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltse;", "Ljava/util/IdentityHashMap;", "", "Lcom/yandex/go/taxi/summary/mobilityhub/model/DtoReference;", "kotlin.jvm.PlatformType", "Latj0;", "<anonymous>", "(Ltse;)Ljava/util/IdentityHashMap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractorV2$resolveAllRouteUris$2", f = "VerticalOffersStateInteractorV2.kt", l = {293}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalOffersStateInteractorV2$resolveAllRouteUris$2 extends SuspendLambda implements wls {
    final /* synthetic */ HubScreenResponseV2 $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalOffersStateInteractorV2$resolveAllRouteUris$2(HubScreenResponseV2 hubScreenResponseV2, i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.$response = hubScreenResponseV2;
        this.this$0 = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalOffersStateInteractorV2$resolveAllRouteUris$2 verticalOffersStateInteractorV2$resolveAllRouteUris$2 = new VerticalOffersStateInteractorV2$resolveAllRouteUris$2(this.$response, this.this$0, continuation);
        verticalOffersStateInteractorV2$resolveAllRouteUris$2.L$0 = obj;
        return verticalOffersStateInteractorV2$resolveAllRouteUris$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalOffersStateInteractorV2$resolveAllRouteUris$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ArrayList t = g8e.t(obj);
            List<b1> list = this.$response.a;
            i0 i0Var = this.this$0;
            for (b1 b1Var : list) {
                if (b1Var instanceof HubItemDtoV2$DefaultOfferItemDtoV2) {
                    t.add(tje.h(tseVar, null, null, new VerticalOffersStateInteractorV2$resolveAllRouteUris$2$1$1(i0Var, b1Var, null), 3));
                    HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV2 = (HubItemDtoV2$DefaultOfferItemDtoV2) b1Var;
                    s0 s0Var = hubItemDtoV2$DefaultOfferItemDtoV2.g;
                    if (s0Var instanceof HubItemActionV2$SelectOffer) {
                        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer = (HubItemActionV2$SelectOffer) s0Var;
                        ycc.r(i0Var.e(tseVar, hubItemActionV2$SelectOffer.f), t);
                        HubButtonContainerDto hubButtonContainerDto = hubItemActionV2$SelectOffer.g;
                        s0 s0Var2 = hubButtonContainerDto != null ? hubButtonContainerDto.b : null;
                        if (s0Var2 != null) {
                            t.add(tje.h(tseVar, null, null, new VerticalOffersStateInteractorV2$resolveAllRouteUris$2$1$2(i0Var, s0Var2, null), 3));
                            if (s0Var2 instanceof HubItemActionV2$DetailedMultimodalRoute) {
                                ycc.r(i0Var.e(tseVar, ((HubItemActionV2$DetailedMultimodalRoute) s0Var2).b), t);
                            }
                        }
                    }
                    i0.a(i0Var, tseVar, hubItemDtoV2$DefaultOfferItemDtoV2.h, t);
                    for (HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto : hubItemDtoV2$DefaultOfferItemDtoV2.f) {
                        s0 s0Var3 = hubItemDtoV2$AlternativeOfferItemDto.e;
                        if (s0Var3 != null) {
                            t.add(tje.h(tseVar, null, null, new VerticalOffersStateInteractorV2$resolveAllRouteUris$2$1$3$1$1(i0Var, s0Var3, null), 3));
                        }
                        i0.a(i0Var, tseVar, hubItemDtoV2$AlternativeOfferItemDto.f, t);
                    }
                } else if (b1Var instanceof HubItemDtoV2$GroupItemsDto) {
                    Iterator it = ((HubItemDtoV2$GroupItemsDto) b1Var).b.iterator();
                    while (it.hasNext()) {
                        t.add(tje.h(tseVar, null, null, new VerticalOffersStateInteractorV2$resolveAllRouteUris$2$1$4$1(i0Var, (GroupItemDto) it.next(), null), 3));
                    }
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(t, this);
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
        List M = kotlin.collections.a.M((Iterable) obj);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        kotlin.collections.b.p(identityHashMap, M);
        return identityHashMap;
    }
}
