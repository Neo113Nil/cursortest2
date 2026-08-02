package com.yandex.go.order.tariffs_suggest.mapper;

import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.b47;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lb47;", "<anonymous>", "(Ltse;)Lb47;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.mapper.OrderWithTariffSuggestMapper$mapButtonUiState$2", f = "OrderWithTariffSuggestMapper.kt", l = {65, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OrderWithTariffSuggestMapper$mapButtonUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ TariffsSuggestDto.ButtonsList $buttonsDto;
    final /* synthetic */ boolean $isAvailable;
    final /* synthetic */ boolean $isLoading;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderWithTariffSuggestMapper$mapButtonUiState$2(TariffsSuggestDto.ButtonsList buttonsList, boolean z, boolean z2, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$buttonsDto = buttonsList;
        this.$isAvailable = z;
        this.$isLoading = z2;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderWithTariffSuggestMapper$mapButtonUiState$2 orderWithTariffSuggestMapper$mapButtonUiState$2 = new OrderWithTariffSuggestMapper$mapButtonUiState$2(this.$buttonsDto, this.$isAvailable, this.$isLoading, this.this$0, continuation);
        orderWithTariffSuggestMapper$mapButtonUiState$2.L$0 = obj;
        return orderWithTariffSuggestMapper$mapButtonUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderWithTariffSuggestMapper$mapButtonUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        if (r10 == r1) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FormattedText formattedText;
        TariffsSuggestDto.TariffButtonDto tariffButtonDto;
        FormattedText formattedText2;
        boolean z;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                z = this.Z$0;
                b.b(obj);
                return new b47((CharSequence) obj, z, this.$isLoading);
            }
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            b.b(obj);
            return new b47((CharSequence) obj, z, this.$isLoading);
        }
        b.b(obj);
        TariffsSuggestDto.ButtonsList buttonsList = this.$buttonsDto;
        TariffsSuggestDto.TariffButtonDto tariffButtonDto2 = buttonsList.a;
        if (tariffButtonDto2 == null || (formattedText = tariffButtonDto2.a) == null || (tariffButtonDto = buttonsList.b) == null || (formattedText2 = tariffButtonDto.a) == null) {
            return null;
        }
        qoh h = tje.h(tseVar, null, null, new OrderWithTariffSuggestMapper$mapButtonUiState$2$updateTariffsButtonText$1(this.this$0, formattedText, null), 3);
        qoh h2 = tje.h(tseVar, null, null, new OrderWithTariffSuggestMapper$mapButtonUiState$2$unavailableButtonText$1(this.this$0, formattedText2, null), 3);
        z = this.$isAvailable;
        if (z || this.$isLoading) {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.Z$0 = z;
            this.label = 1;
            obj = h.s(this);
        } else {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.Z$0 = z;
            this.label = 2;
            obj = h2.s(this);
        }
        return coroutineSingletons;
    }
}
