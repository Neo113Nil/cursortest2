package com.yandex.go.scooters.data;

import com.yandex.go.scooters.data.model.CreateOffersV1Response;
import defpackage.gwk0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qko0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsco0;", "<anonymous>", "(Ltse;)Lsco0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.ScooterOfferRepository$createScooterOffer$2$passesAsync$1", f = "ScootersOfferRepository.kt", l = {72, 72}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScooterOfferRepository$createScooterOffer$2$passesAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $preOfferExperimentsAsync;
    final /* synthetic */ CreateOffersV1Response $response;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScooterOfferRepository$createScooterOffer$2$passesAsync$1(a aVar, CreateOffersV1Response createOffersV1Response, noh nohVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = createOffersV1Response;
        this.$preOfferExperimentsAsync = nohVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScooterOfferRepository$createScooterOffer$2$passesAsync$1(this.this$0, this.$response, this.$preOfferExperimentsAsync, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScooterOfferRepository$createScooterOffer$2$passesAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CreateOffersV1Response createOffersV1Response;
        com.yandex.go.scooters.data.mapper.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.scooters.data.mapper.a aVar2 = this.this$0.b;
            createOffersV1Response = this.$response;
            noh nohVar = this.$preOfferExperimentsAsync;
            this.L$0 = aVar2;
            this.L$1 = createOffersV1Response;
            this.label = 1;
            Object k = nohVar.k(this);
            if (k != coroutineSingletons) {
                aVar = aVar2;
                obj = k;
            }
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        createOffersV1Response = (CreateOffersV1Response) this.L$1;
        aVar = (com.yandex.go.scooters.data.mapper.a) this.L$0;
        kotlin.b.b(obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object e = aVar.e.e(gwk0.h(createOffersV1Response.c), createOffersV1Response.e, ((qko0) obj).a, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
