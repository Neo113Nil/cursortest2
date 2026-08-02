package com.yandex.go.order.tariffs_suggest.repository;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.repository.SuggestTariffsRepository$buttonUiStateFlow$1", f = "SuggestTariffsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestTariffsRepository$buttonUiStateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestTariffsRepository$buttonUiStateFlow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuggestTariffsRepository$buttonUiStateFlow$1 suggestTariffsRepository$buttonUiStateFlow$1 = new SuggestTariffsRepository$buttonUiStateFlow$1(this.this$0, continuation);
        suggestTariffsRepository$buttonUiStateFlow$1.L$0 = obj;
        return suggestTariffsRepository$buttonUiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuggestTariffsRepository$buttonUiStateFlow$1 suggestTariffsRepository$buttonUiStateFlow$1 = (SuggestTariffsRepository$buttonUiStateFlow$1) create((TaxiOrder) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        suggestTariffsRepository$buttonUiStateFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrderStatusInfo V;
        TariffsSuggestDto tariffsSuggestDto;
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        zy11 zy11Var = zy11.a;
        if (taxiOrder != null && (V = taxiOrder.V()) != null && (tariffsSuggestDto = V.v0) != null) {
            a aVar = this.this$0;
            List<TariffsSuggestDto.TariffDetailsDto> list = tariffsSuggestDto.c;
            aVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (TariffsSuggestDto.TariffDetailsDto tariffDetailsDto : list) {
                String str = !tariffDetailsDto.h ? tariffDetailsDto.a : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            Iterable<String> iterable = (Iterable) aVar.f.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : iterable) {
                if (!arrayList.contains(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            r0 r0Var = aVar.e;
            r0Var.m(null, v4r0.g((Set) r0Var.getValue(), arrayList2));
        }
        return zy11Var;
    }
}
