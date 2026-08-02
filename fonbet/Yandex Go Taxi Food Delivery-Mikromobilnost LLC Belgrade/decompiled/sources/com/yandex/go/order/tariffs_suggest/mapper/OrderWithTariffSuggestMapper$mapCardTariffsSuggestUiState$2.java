package com.yandex.go.order.tariffs_suggest.mapper;

import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fef;
import defpackage.ip8;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lip8;", "<anonymous>", "(Ltse;)Lip8;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.mapper.OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2", f = "OrderWithTariffSuggestMapper.kt", l = {49, 50, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ TariffsSuggestDto $dto;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ Set<String> $selectedTariffs;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2(a aVar, TariffsSuggestDto tariffsSuggestDto, Set set, fef fefVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dto = tariffsSuggestDto;
        this.$selectedTariffs = set;
        this.$currencyRules = fefVar;
        this.$isLoading = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2 orderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2 = new OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2(this.this$0, this.$dto, this.$selectedTariffs, this.$currencyRules, this.$isLoading, continuation);
        orderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2.L$0 = obj;
        return orderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if (r3 == r2) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    /* JADX WARN: Type inference failed for: r3v10, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qoh h;
        noh h2;
        Object s;
        Object k;
        noh nohVar;
        CharSequence charSequence;
        Object k2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2$title$1(this.this$0, this.$dto, null), 3);
            h = tje.h(tseVar, null, null, new OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2$subtitle$1(this.this$0, this.$dto, null), 3);
            h2 = tje.h(tseVar, null, null, new OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2$tariffs$1(this.this$0, this.$dto, this.$selectedTariffs, this.$currencyRules, this.$isLoading, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            s = h3.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence3 = (CharSequence) this.L$5;
                    charSequence2 = (CharSequence) this.L$4;
                    b.b(obj);
                    k2 = obj;
                    return new ip8(charSequence2, charSequence3, (List) k2);
                }
                charSequence = (CharSequence) this.L$4;
                nohVar = (noh) this.L$3;
                b.b(obj);
                k = obj;
                CharSequence charSequence4 = (CharSequence) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = charSequence;
                this.L$5 = charSequence4;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                    charSequence2 = charSequence;
                    charSequence3 = charSequence4;
                    return new ip8(charSequence2, charSequence3, (List) k2);
                }
                return coroutineSingletons;
            }
            h2 = (noh) this.L$3;
            ?? r3 = (noh) this.L$2;
            b.b(obj);
            h = r3;
            s = obj;
        }
        CharSequence charSequence5 = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = charSequence5;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            nohVar = h2;
            charSequence = charSequence5;
            CharSequence charSequence42 = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = charSequence;
            this.L$5 = charSequence42;
            this.label = 3;
            k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
