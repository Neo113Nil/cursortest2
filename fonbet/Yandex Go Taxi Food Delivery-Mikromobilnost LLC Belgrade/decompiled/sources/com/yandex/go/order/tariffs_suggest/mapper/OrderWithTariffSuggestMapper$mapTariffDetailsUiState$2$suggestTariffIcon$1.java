package com.yandex.go.order.tariffs_suggest.mapper;

import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgp8;", "<anonymous>", "(Ltse;)Lgp8;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.mapper.OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2$suggestTariffIcon$1", f = "OrderWithTariffSuggestMapper.kt", l = {HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2$suggestTariffIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ TariffsSuggestDto.TariffDetailsDto $tariffDetailsDto;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2$suggestTariffIcon$1(a aVar, TariffsSuggestDto.TariffDetailsDto tariffDetailsDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tariffDetailsDto = tariffDetailsDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2$suggestTariffIcon$1(this.this$0, this.$tariffDetailsDto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2$suggestTariffIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        TariffsSuggestDto.TariffDetailsDto tariffDetailsDto = this.$tariffDetailsDto;
        this.label = 1;
        Object b = a.b(aVar, tariffDetailsDto, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
