package com.yandex.go.multimodal_route.ui.detailed_card;

import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.detailed_card.MultimodalOverlayPayloadInteractorImpl$getUriFromTaxiInfo$2", f = "MultimodalOverlayPayloadInteractorImpl.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalOverlayPayloadInteractorImpl$getUriFromTaxiInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $mmOfferId;
    final /* synthetic */ TaxiOrder $order;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalOverlayPayloadInteractorImpl$getUriFromTaxiInfo$2(a aVar, String str, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$mmOfferId = str;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalOverlayPayloadInteractorImpl$getUriFromTaxiInfo$2(this.this$0, this.$mmOfferId, this.$order, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalOverlayPayloadInteractorImpl$getUriFromTaxiInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.multimodal_route.repositories.a aVar = this.this$0.b;
            String str = this.$mmOfferId;
            String str2 = str == null ? this.$order.a : null;
            boolean G = this.$order.G();
            this.label = 1;
            a = aVar.a(str2, str, this, G);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        if (a instanceof Result.Failure) {
            a = null;
        }
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto = (TaxiTransportInfoResponseDto) a;
        if (taxiTransportInfoResponseDto == null || (list = taxiTransportInfoResponseDto.e) == null) {
            return null;
        }
        return (String) kotlin.collections.a.R(list);
    }
}
