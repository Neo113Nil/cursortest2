package com.yandex.go.masstransit.sdk.order.impl.activation;

import defpackage.hnr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nyj0;
import defpackage.tje;
import defpackage.tse;
import defpackage.v77;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.activation.TicketActivationScanUiStateInteractor$startNfcValidation$1", f = "TicketActivationScanUiStateInteractor.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TicketActivationScanUiStateInteractor$startNfcValidation$1 extends SuspendLambda implements wls {
    final /* synthetic */ hnr0 $resultFlow;
    final /* synthetic */ tse $scope;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketActivationScanUiStateInteractor$startNfcValidation$1(hnr0 hnr0Var, d dVar, tse tseVar, Continuation continuation) {
        super(2, continuation);
        this.$resultFlow = hnr0Var;
        this.this$0 = dVar;
        this.$scope = tseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketActivationScanUiStateInteractor$startNfcValidation$1(this.$resultFlow, this.this$0, this.$scope, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketActivationScanUiStateInteractor$startNfcValidation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hnr0 hnr0Var = this.$resultFlow;
            this.label = 1;
            obj = e.y(hnr0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        nyj0 nyj0Var = (nyj0) obj;
        String str = nyj0Var.c;
        if (str != null) {
            this.this$0.b(str);
        } else {
            v77 v77Var = nyj0Var.b;
            d dVar = this.this$0;
            if (v77Var != null) {
                tse tseVar = this.$scope;
                dVar.getClass();
                tje.N(tseVar, null, null, new TicketActivationScanUiStateInteractor$handleNfcSuccess$1(dVar, v77Var, null), 3);
            } else {
                dVar.b("Unknown NFC error");
            }
        }
        return zy11.a;
    }
}
