package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import com.yandex.go.chargers.offer.data.api.ChargersPromoPlateDto;
import defpackage.mvg;
import defpackage.n9a;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "La8a;", "<anonymous>", "(Ltse;)La8a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareChargersOfferContent$2$promoPlate$1", f = "ChargersOfferUiStateMapper.kt", l = {278}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareChargersOfferContent$2$promoPlate$1 extends SuspendLambda implements wls {
    final /* synthetic */ n9a $chargersOfferToggle;
    final /* synthetic */ ChargersOfferResponseDto $response;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareChargersOfferContent$2$promoPlate$1(b bVar, ChargersOfferResponseDto chargersOfferResponseDto, n9a n9aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$response = chargersOfferResponseDto;
        this.$chargersOfferToggle = n9aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$promoPlate$1(this.this$0, this.$response, this.$chargersOfferToggle, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareChargersOfferContent$2$promoPlate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        b bVar = this.this$0;
        ChargersPromoPlateDto chargersPromoPlateDto = this.$response.n;
        n9a n9aVar = this.$chargersOfferToggle;
        this.label = 1;
        Object a = b.a(bVar, chargersPromoPlateDto, n9aVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
