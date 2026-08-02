package com.yandex.go.chargers.offer.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.domain.ChargersCreateOfferInteractor$observeOffer$2", f = "ChargersCreateOfferInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersCreateOfferInteractor$observeOffer$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersCreateOfferInteractor$observeOffer$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersCreateOfferInteractor$observeOffer$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersCreateOfferInteractor$observeOffer$2 chargersCreateOfferInteractor$observeOffer$2 = (ChargersCreateOfferInteractor$observeOffer$2) create((zy11) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersCreateOfferInteractor$observeOffer$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.g.a();
        return zy11.a;
    }
}
