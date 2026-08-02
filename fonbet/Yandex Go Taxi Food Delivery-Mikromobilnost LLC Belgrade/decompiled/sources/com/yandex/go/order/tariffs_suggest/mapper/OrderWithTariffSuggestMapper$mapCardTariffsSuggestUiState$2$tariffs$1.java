package com.yandex.go.order.tariffs_suggest.mapper;

import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lhp8;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.mapper.OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2$tariffs$1", f = "OrderWithTariffSuggestMapper.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2$tariffs$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ TariffsSuggestDto $dto;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ Set<String> $selectedTariffs;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2$tariffs$1(a aVar, TariffsSuggestDto tariffsSuggestDto, Set set, fef fefVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dto = tariffsSuggestDto;
        this.$selectedTariffs = set;
        this.$currencyRules = fefVar;
        this.$isLoading = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2$tariffs$1(this.this$0, this.$dto, this.$selectedTariffs, this.$currencyRules, this.$isLoading, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2$tariffs$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        TariffsSuggestDto tariffsSuggestDto = this.$dto;
        List list = tariffsSuggestDto.c;
        Set<String> set = this.$selectedTariffs;
        fef fefVar = this.$currencyRules;
        boolean z = this.$isLoading;
        boolean z2 = tariffsSuggestDto.f == TariffsSuggestDto.SelectionMode.MULTI_CHOICE;
        this.label = 1;
        Object a = a.a(aVar, list, set, fefVar, z, z2, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
