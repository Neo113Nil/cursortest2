package com.yandex.go.payments.nameedit.navigation;

import com.yandex.go.payments.analytics.PaymentsAnalytics$Button;
import com.yandex.go.payments.analytics.PaymentsAnalytics$PaymentMethodsType;
import com.yandex.go.payments.domain.y;
import defpackage.agd;
import defpackage.evu0;
import defpackage.mca0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oca0;
import defpackage.qu;
import defpackage.sca0;
import defpackage.tca0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xea0;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.nameedit.navigation.PaymentMethodsNameEditRouter$content$1$2$1", f = "PaymentMethodsNameEditRouter.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsNameEditRouter$content$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tca0 $action;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ oca0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsNameEditRouter$content$1$2$1(oca0 oca0Var, tca0 tca0Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oca0Var;
        this.$action = tca0Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsNameEditRouter$content$1$2$1(this.this$0, this.$action, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsNameEditRouter$content$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y yVar = this.this$0.I;
            String str = ((sca0) this.$action).a;
            xea0 xea0Var = ((mca0) ((agd) this.$this_buildContent).a).b;
            this.label = 1;
            if (yVar.c(str, xea0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        oca0 oca0Var = this.this$0;
        PaymentMethod$Type paymentMethod$Type = ((mca0) ((agd) this.$this_buildContent).a).b.a;
        oca0Var.getClass();
        PaymentsAnalytics$PaymentMethodsType U = oca0.U(paymentMethod$Type);
        if (U != null) {
            this.this$0.H.a(U, !evu0.J(((sca0) this.$action).a), PaymentsAnalytics$Button.Save);
        }
        this.this$0.r(new qu(9));
        return zy11.a;
    }
}
