package com.yandex.go.payments.lpm.navigation;

import com.yandex.go.payments.lpm.domain.e;
import com.yandex.go.payments.paymentlist.navigation.f;
import defpackage.azz;
import defpackage.ezz;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.lpm.navigation.LpmPaymentRouterImpl$launchPaymentsList$1", f = "LpmPaymentRouterImpl.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LpmPaymentRouterImpl$launchPaymentsList$1 extends SuspendLambda implements wls {
    final /* synthetic */ f $listRouter;
    final /* synthetic */ azz $payload;
    final /* synthetic */ e $paymentSourceInteractor;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LpmPaymentRouterImpl$launchPaymentsList$1(d dVar, f fVar, azz azzVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$listRouter = fVar;
        this.$payload = azzVar;
        this.$paymentSourceInteractor = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LpmPaymentRouterImpl$launchPaymentsList$1(this.this$0, this.$listRouter, this.$payload, this.$paymentSourceInteractor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LpmPaymentRouterImpl$launchPaymentsList$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        m950 m950Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            dVar = this.this$0;
            f fVar = this.$listRouter;
            azz azzVar = this.$payload;
            this.L$0 = dVar;
            this.L$1 = fVar;
            this.label = 1;
            Object Q = d.Q(dVar, azzVar, this);
            if (Q == coroutineSingletons) {
                return coroutineSingletons;
            }
            m950Var = fVar;
            obj = Q;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m950Var = (m950) this.L$1;
            dVar = (d) this.L$0;
            kotlin.b.b(obj);
        }
        dVar.A(m950Var, obj, new ezz(this.this$0, this.$paymentSourceInteractor, 0));
        return zy11.a;
    }
}
