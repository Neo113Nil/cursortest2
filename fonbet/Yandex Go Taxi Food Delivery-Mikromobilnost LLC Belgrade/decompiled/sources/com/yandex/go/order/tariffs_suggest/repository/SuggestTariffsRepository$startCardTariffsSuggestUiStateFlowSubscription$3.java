package com.yandex.go.order.tariffs_suggest.repository;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto;
import defpackage.dms;
import defpackage.fef;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.ip8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "", "", "newSelectedTariffs", "Lzy11;", "<unused var>", "Lru/yandex/taxi/theme/ThemeType;", "Lip8;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Ljava/util/Set;VLru/yandex/taxi/theme/ThemeType;)Lcom/yandex/go/order/tariffs_suggest/mapper/CardTariffsSuggestUiState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.repository.SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$3", f = "SuggestTariffsRepository.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$3 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$3(a aVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$3 suggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$3 = new SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$3(this.this$0, (Continuation) obj5);
        suggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$3.L$0 = (TaxiOrder) obj;
        suggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$3.L$1 = (Set) obj2;
        return suggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrderStatusInfo V;
        TariffsSuggestDto tariffsSuggestDto;
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        Set set = (Set) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (taxiOrder == null || (V = taxiOrder.V()) == null || (tariffsSuggestDto = V.v0) == null) {
                return null;
            }
            ief iefVar = V.K;
            fef h = iefVar != null ? gwk0.h(iefVar) : null;
            a aVar = this.this$0;
            com.yandex.go.order.tariffs_suggest.mapper.a aVar2 = aVar.b;
            boolean booleanValue = ((Boolean) aVar.k.getValue()).booleanValue();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            obj = aVar2.d(tariffsSuggestDto, h, set, booleanValue, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (ip8) obj;
    }
}
