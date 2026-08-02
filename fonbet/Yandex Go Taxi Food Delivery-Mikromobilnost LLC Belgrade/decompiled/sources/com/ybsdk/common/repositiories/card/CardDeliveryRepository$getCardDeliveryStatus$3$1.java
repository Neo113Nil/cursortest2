package com.ybsdk.common.repositiories.card;

import com.ybsdk.api.entities.YBCardDeliveryApplicationStatus;
import com.ybsdk.network.dto.card.CardDeliveryStatusResponse;
import defpackage.ef51;
import defpackage.hd8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse;", "applicationStatus", "Lef51;", "<anonymous>", "(Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse;)Lef51;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.card.CardDeliveryRepository$getCardDeliveryStatus$3$1", f = "CardDeliveryRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CardDeliveryRepository$getCardDeliveryStatus$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    public CardDeliveryRepository$getCardDeliveryStatus$3$1() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardDeliveryRepository$getCardDeliveryStatus$3$1 cardDeliveryRepository$getCardDeliveryStatus$3$1 = new CardDeliveryRepository$getCardDeliveryStatus$3$1(2, continuation);
        cardDeliveryRepository$getCardDeliveryStatus$3$1.L$0 = obj;
        return cardDeliveryRepository$getCardDeliveryStatus$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDeliveryRepository$getCardDeliveryStatus$3$1) create((CardDeliveryStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        YBCardDeliveryApplicationStatus yBCardDeliveryApplicationStatus;
        CardDeliveryStatusResponse.CardDeliveryInfo applicationInfo;
        CardDeliveryStatusResponse.CardDeliveryInfo applicationInfo2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CardDeliveryStatusResponse cardDeliveryStatusResponse = (CardDeliveryStatusResponse) this.L$0;
        CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus applicationStatus = (cardDeliveryStatusResponse == null || (applicationInfo2 = cardDeliveryStatusResponse.getApplicationInfo()) == null) ? null : applicationInfo2.getApplicationStatus();
        switch (applicationStatus == null ? -1 : hd8.a[applicationStatus.ordinal()]) {
            case -1:
                yBCardDeliveryApplicationStatus = YBCardDeliveryApplicationStatus.NO_DELIVERY_APPLICATION;
                break;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                yBCardDeliveryApplicationStatus = YBCardDeliveryApplicationStatus.NEED_DELIVERY_INFO;
                break;
            case 2:
                yBCardDeliveryApplicationStatus = YBCardDeliveryApplicationStatus.CREATED;
                break;
            case 3:
                yBCardDeliveryApplicationStatus = YBCardDeliveryApplicationStatus.LOGISTIC;
                break;
            case 4:
                yBCardDeliveryApplicationStatus = YBCardDeliveryApplicationStatus.ACTIVATION;
                break;
            case 5:
                yBCardDeliveryApplicationStatus = YBCardDeliveryApplicationStatus.WAITING_FOR_PICKUP;
                break;
            case 6:
                yBCardDeliveryApplicationStatus = YBCardDeliveryApplicationStatus.CANCEL;
                break;
            case 7:
                yBCardDeliveryApplicationStatus = YBCardDeliveryApplicationStatus.FAIL;
                break;
            case 8:
                yBCardDeliveryApplicationStatus = YBCardDeliveryApplicationStatus.SUCCESS;
                break;
            case 9:
                x4c.g("Get card delivery error- incorrect application_status enum", null, null, null, 14);
                yBCardDeliveryApplicationStatus = YBCardDeliveryApplicationStatus.FAIL;
                break;
        }
        if (cardDeliveryStatusResponse != null && (applicationInfo = cardDeliveryStatusResponse.getApplicationInfo()) != null) {
            str = applicationInfo.getApplicationProductType();
        }
        return new ef51(yBCardDeliveryApplicationStatus, str);
    }
}
