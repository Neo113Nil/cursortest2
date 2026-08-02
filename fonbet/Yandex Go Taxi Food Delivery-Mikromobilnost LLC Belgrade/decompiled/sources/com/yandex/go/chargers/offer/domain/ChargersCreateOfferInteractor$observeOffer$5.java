package com.yandex.go.chargers.offer.domain;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s6a;
import defpackage.vva;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls6a;", "it", "Lzy11;", "<anonymous>", "(Ls6a;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.domain.ChargersCreateOfferInteractor$observeOffer$5", f = "ChargersCreateOfferInteractor.kt", l = {111}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersCreateOfferInteractor$observeOffer$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersCreateOfferInteractor$observeOffer$5(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersCreateOfferInteractor$observeOffer$5 chargersCreateOfferInteractor$observeOffer$5 = new ChargersCreateOfferInteractor$observeOffer$5(this.this$0, continuation);
        chargersCreateOfferInteractor$observeOffer$5.L$0 = obj;
        return chargersCreateOfferInteractor$observeOffer$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersCreateOfferInteractor$observeOffer$5) create((s6a) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChargersOfferResponseDto chargersOfferResponseDto;
        s6a s6aVar = (s6a) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.g.d.l(s6aVar != null ? s6aVar.d : null);
            com.yandex.go.chargers.surge.domain.a aVar = this.this$0.b;
            ChargersSurgeDto chargersSurgeDto = (s6aVar == null || (chargersOfferResponseDto = s6aVar.d) == null) ? null : chargersOfferResponseDto.o;
            this.L$0 = null;
            this.label = 1;
            obj = aVar.a(chargersSurgeDto, this);
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
        this.this$0.d.a.l((vva) obj);
        return zy11.a;
    }
}
