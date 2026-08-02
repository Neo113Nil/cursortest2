package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import defpackage.iyu;
import defpackage.khq0;
import defpackage.kz6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ru60;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.VerticalHubV2UiStateInteractor$mapLoadingState$$inlined$flatMapLatest$1", f = "VerticalHubV2UiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class VerticalHubV2UiStateInteractor$mapLoadingState$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ List $items$inlined;
    final /* synthetic */ khq0 $selectedOfferData$inlined;
    final /* synthetic */ ru60 $state$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV2UiStateInteractor$mapLoadingState$$inlined$flatMapLatest$1(Continuation continuation, q qVar, ru60 ru60Var, khq0 khq0Var, List list) {
        super(3, continuation);
        this.this$0 = qVar;
        this.$state$inlined = ru60Var;
        this.$selectedOfferData$inlined = khq0Var;
        this.$items$inlined = list;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalHubV2UiStateInteractor$mapLoadingState$$inlined$flatMapLatest$1 verticalHubV2UiStateInteractor$mapLoadingState$$inlined$flatMapLatest$1 = new VerticalHubV2UiStateInteractor$mapLoadingState$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$state$inlined, this.$selectedOfferData$inlined, this.$items$inlined);
        verticalHubV2UiStateInteractor$mapLoadingState$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        verticalHubV2UiStateInteractor$mapLoadingState$$inlined$flatMapLatest$1.L$1 = obj2;
        return verticalHubV2UiStateInteractor$mapLoadingState$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kz6 kz6Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            iyu iyuVar = (iyu) obj2;
            q qVar = this.this$0;
            HubOfferType hubOfferType = this.$state$inlined.b;
            khq0 khq0Var = this.$selectedOfferData$inlined;
            i iVar = new i(q.b(qVar, true, hubOfferType, (khq0Var == null || (kz6Var = khq0Var.h) == null) ? null : kz6Var.d), this.$items$inlined, iyuVar, this.$state$inlined, this.$selectedOfferData$inlined, this.this$0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(iVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
