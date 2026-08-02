package com.yandex.go.taxi.summary.router;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.rqv0;
import defpackage.tse;
import defpackage.vqv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.router.TariffCardRouterImpl$showTariffCard$1", f = "TariffCardRouterImpl.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffCardRouterImpl$showTariffCard$1 extends SuspendLambda implements wls {
    final /* synthetic */ SummaryExpandReason $reason;
    final /* synthetic */ pex0 $tariffDescription;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffCardRouterImpl$showTariffCard$1(a aVar, pex0 pex0Var, SummaryExpandReason summaryExpandReason, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tariffDescription = pex0Var;
        this.$reason = summaryExpandReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffCardRouterImpl$showTariffCard$1(this.this$0, this.$tariffDescription, this.$reason, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffCardRouterImpl$showTariffCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vqv0 vqv0Var = this.this$0.a;
            rqv0 rqv0Var = new rqv0(this.$tariffDescription.J0, this.$reason, null);
            this.label = 1;
            if (vqv0Var.a.emit(rqv0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
