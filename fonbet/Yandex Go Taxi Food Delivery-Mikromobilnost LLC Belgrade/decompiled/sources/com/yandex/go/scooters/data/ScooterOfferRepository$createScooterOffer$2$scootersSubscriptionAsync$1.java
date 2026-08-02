package com.yandex.go.scooters.data;

import com.yandex.go.scooters.data.model.CreateOffersV1Response;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltwo0;", "<anonymous>", "(Ltse;)Ltwo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.ScooterOfferRepository$createScooterOffer$2$scootersSubscriptionAsync$1", f = "ScootersOfferRepository.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScooterOfferRepository$createScooterOffer$2$scootersSubscriptionAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ CreateOffersV1Response $response;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScooterOfferRepository$createScooterOffer$2$scootersSubscriptionAsync$1(a aVar, CreateOffersV1Response createOffersV1Response, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = createOffersV1Response;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScooterOfferRepository$createScooterOffer$2$scootersSubscriptionAsync$1(this.this$0, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScooterOfferRepository$createScooterOffer$2$scootersSubscriptionAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        com.yandex.go.scooters.data.mapper.a aVar = this.this$0.b;
        CreateOffersV1Response createOffersV1Response = this.$response;
        this.label = 1;
        Object e = aVar.e(createOffersV1Response, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
