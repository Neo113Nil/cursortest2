package com.yandex.go.payments_widgets.section.payments;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ala0;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments_widgets.section.payments.PaymentWidgetsAnalyticsInteractor$onVisibilityChanged$1", f = "PaymentWidgetsAnalyticsInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentWidgetsAnalyticsInteractor$onVisibilityChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ PaymentWidgetsAnalyticsInteractor$VisibilityState $state;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ala0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentWidgetsAnalyticsInteractor$onVisibilityChanged$1(ala0 ala0Var, PaymentWidgetsAnalyticsInteractor$VisibilityState paymentWidgetsAnalyticsInteractor$VisibilityState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ala0Var;
        this.$state = paymentWidgetsAnalyticsInteractor$VisibilityState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentWidgetsAnalyticsInteractor$onVisibilityChanged$1(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentWidgetsAnalyticsInteractor$onVisibilityChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ala0 ala0Var;
        g050 g050Var;
        PaymentWidgetsAnalyticsInteractor$VisibilityState paymentWidgetsAnalyticsInteractor$VisibilityState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            ala0Var = this.this$0;
            kotlinx.coroutines.sync.a aVar = ala0Var.c;
            PaymentWidgetsAnalyticsInteractor$VisibilityState paymentWidgetsAnalyticsInteractor$VisibilityState2 = this.$state;
            this.L$0 = aVar;
            this.L$1 = ala0Var;
            this.L$2 = paymentWidgetsAnalyticsInteractor$VisibilityState2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar;
            paymentWidgetsAnalyticsInteractor$VisibilityState = paymentWidgetsAnalyticsInteractor$VisibilityState2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            paymentWidgetsAnalyticsInteractor$VisibilityState = (PaymentWidgetsAnalyticsInteractor$VisibilityState) this.L$2;
            ala0Var = (ala0) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            PaymentWidgetsAnalyticsInteractor$VisibilityState paymentWidgetsAnalyticsInteractor$VisibilityState3 = (PaymentWidgetsAnalyticsInteractor$VisibilityState) ala0Var.d.getValue();
            PaymentWidgetsAnalyticsInteractor$VisibilityState paymentWidgetsAnalyticsInteractor$VisibilityState4 = PaymentWidgetsAnalyticsInteractor$VisibilityState.HIDED;
            zy11 zy11Var = zy11.a;
            if (paymentWidgetsAnalyticsInteractor$VisibilityState3 != paymentWidgetsAnalyticsInteractor$VisibilityState4) {
                if (paymentWidgetsAnalyticsInteractor$VisibilityState3 == PaymentWidgetsAnalyticsInteractor$VisibilityState.NO_SECTION) {
                }
                if ((paymentWidgetsAnalyticsInteractor$VisibilityState3 == PaymentWidgetsAnalyticsInteractor$VisibilityState.VISIBLE && paymentWidgetsAnalyticsInteractor$VisibilityState3 != PaymentWidgetsAnalyticsInteractor$VisibilityState.UNDER_SCROLL) || (paymentWidgetsAnalyticsInteractor$VisibilityState != paymentWidgetsAnalyticsInteractor$VisibilityState4 && paymentWidgetsAnalyticsInteractor$VisibilityState != PaymentWidgetsAnalyticsInteractor$VisibilityState.NO_SECTION)) {
                    g050Var.d(null);
                    return zy11Var;
                }
                z = false;
                ala0Var.d.l(paymentWidgetsAnalyticsInteractor$VisibilityState);
                ala0.a(ala0Var, z);
                g050Var.d(null);
                return zy11Var;
            }
            if (paymentWidgetsAnalyticsInteractor$VisibilityState == PaymentWidgetsAnalyticsInteractor$VisibilityState.VISIBLE) {
                ala0Var.d.l(paymentWidgetsAnalyticsInteractor$VisibilityState);
                ala0.a(ala0Var, z);
                g050Var.d(null);
                return zy11Var;
            }
            if (paymentWidgetsAnalyticsInteractor$VisibilityState3 == PaymentWidgetsAnalyticsInteractor$VisibilityState.VISIBLE) {
            }
            z = false;
            ala0Var.d.l(paymentWidgetsAnalyticsInteractor$VisibilityState);
            ala0.a(ala0Var, z);
            g050Var.d(null);
            return zy11Var;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
