package com.yandex.go.chargers.offer.ui.compose.ui;

import defpackage.j1a;
import defpackage.laa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.paa;
import defpackage.u7a;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpaa;", "offerUiState", "Lzy11;", "<anonymous>", "(Lpaa;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.ui.compose.ui.ChargersOfferUiStateInteractor$getUiStateFlow$2", f = "ChargersOfferUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateInteractor$getUiStateFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateInteractor$getUiStateFlow$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersOfferUiStateInteractor$getUiStateFlow$2 chargersOfferUiStateInteractor$getUiStateFlow$2 = new ChargersOfferUiStateInteractor$getUiStateFlow$2(this.this$0, continuation);
        chargersOfferUiStateInteractor$getUiStateFlow$2.L$0 = obj;
        return chargersOfferUiStateInteractor$getUiStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersOfferUiStateInteractor$getUiStateFlow$2 chargersOfferUiStateInteractor$getUiStateFlow$2 = (ChargersOfferUiStateInteractor$getUiStateFlow$2) create((paa) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersOfferUiStateInteractor$getUiStateFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        paa paaVar = (paa) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (paaVar instanceof laa) {
            ((u7a) this.this$0.e.b).r(new j1a(((laa) paaVar).a, 1));
        }
        return zy11.a;
    }
}
