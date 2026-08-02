package com.yandex.go.payments.lpm.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.lpm.domain.LpmPaymentMethodsListSourceInteractorImpl$triggersFlow$3", f = "LpmPaymentMethodsListSourceInteractorImpl.kt", l = {HProv.PP_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LpmPaymentMethodsListSourceInteractorImpl$triggersFlow$3 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LpmPaymentMethodsListSourceInteractorImpl$triggersFlow$3 lpmPaymentMethodsListSourceInteractorImpl$triggersFlow$3 = new LpmPaymentMethodsListSourceInteractorImpl$triggersFlow$3(2, continuation);
        lpmPaymentMethodsListSourceInteractorImpl$triggersFlow$3.L$0 = obj;
        return lpmPaymentMethodsListSourceInteractorImpl$triggersFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LpmPaymentMethodsListSourceInteractorImpl$triggersFlow$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(zy11Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
