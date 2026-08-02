package com.yandex.go.chargers.offer.domain;

import defpackage.fp9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tsa;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfp9;", "params", "Ls6a;", "<anonymous>", "(Lfp9;)Ls6a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.domain.ChargersCreateOfferInteractor$observeOffer$4", f = "ChargersCreateOfferInteractor.kt", l = {108}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersCreateOfferInteractor$observeOffer$4 extends SuspendLambda implements wls {
    final /* synthetic */ tsa $stationNumber;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersCreateOfferInteractor$observeOffer$4(tsa tsaVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$stationNumber = tsaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersCreateOfferInteractor$observeOffer$4 chargersCreateOfferInteractor$observeOffer$4 = new ChargersCreateOfferInteractor$observeOffer$4(this.$stationNumber, this.this$0, continuation);
        chargersCreateOfferInteractor$observeOffer$4.L$0 = obj;
        return chargersCreateOfferInteractor$observeOffer$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersCreateOfferInteractor$observeOffer$4) create((fp9) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fp9 fp9Var = (fp9) this.L$0;
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
        b bVar = this.this$0;
        tsa tsaVar = this.$stationNumber;
        this.L$0 = null;
        this.label = 1;
        Object a = b.a(bVar, tsaVar, fp9Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
