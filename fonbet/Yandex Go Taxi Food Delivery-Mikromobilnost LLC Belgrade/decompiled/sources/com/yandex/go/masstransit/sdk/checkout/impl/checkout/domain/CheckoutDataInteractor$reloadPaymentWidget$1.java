package com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain;

import com.yandex.fintechsdk.flows.payment.kit.api.widget.PaymentKitWidget;
import defpackage.enb;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r1a0;
import defpackage.rlc;
import defpackage.rmb;
import defpackage.tse;
import defpackage.uka0;
import defpackage.vka0;
import defpackage.wls;
import defpackage.xka0;
import defpackage.yka0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.CheckoutDataInteractor$reloadPaymentWidget$1", f = "CheckoutDataInteractor.kt", l = {188}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CheckoutDataInteractor$reloadPaymentWidget$1 extends SuspendLambda implements wls {
    final /* synthetic */ r1a0 $paymentInfoContext;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutDataInteractor$reloadPaymentWidget$1(k kVar, r1a0 r1a0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$paymentInfoContext = r1a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutDataInteractor$reloadPaymentWidget$1(this.this$0, this.$paymentInfoContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutDataInteractor$reloadPaymentWidget$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.a.e(rmb.a);
            k kVar = this.this$0;
            s sVar = kVar.d;
            Map<String, String> map = kVar.b.a;
            if (map == null) {
                ny61.r("TicketingSystemContext must not be null");
                return null;
            }
            i3y i3yVar = sVar.f;
            ((PaymentKitWidget) i3yVar.getValue()).reload(map);
            j jVar = new j(kotlinx.coroutines.flow.e.X(((PaymentKitWidget) i3yVar.getValue()).getState(), new PaymentWidgetHolder$getWidgetState$$inlined$flatMapLatest$1(sVar, null)));
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(jVar, this);
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
        yka0 yka0Var = (yka0) obj;
        if (yka0Var instanceof vka0) {
            this.this$0.l(new rlc(this.$paymentInfoContext.b, ((vka0) yka0Var).a));
        } else if (jl40.l(yka0Var, xka0.a)) {
            this.this$0.j(this.$paymentInfoContext.a);
        } else if (jl40.l(yka0Var, uka0.a)) {
            this.this$0.a.e(enb.e(this.$paymentInfoContext));
        }
        return zy11.a;
    }
}
