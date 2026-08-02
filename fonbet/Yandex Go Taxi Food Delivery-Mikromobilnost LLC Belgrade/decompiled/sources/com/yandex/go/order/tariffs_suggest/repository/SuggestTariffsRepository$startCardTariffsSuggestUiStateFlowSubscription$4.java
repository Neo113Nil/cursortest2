package com.yandex.go.order.tariffs_suggest.repository;

import defpackage.ip8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lip8;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lip8;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.repository.SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$4", f = "SuggestTariffsRepository.kt", l = {90}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$4(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$4 suggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$4 = new SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$4(this.this$0, continuation);
        suggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$4.L$0 = obj;
        return suggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$4) create((ip8) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ip8 ip8Var = (ip8) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        r0 r0Var = this.this$0.i;
        this.L$0 = null;
        this.label = 1;
        r0Var.emit(ip8Var, this);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
