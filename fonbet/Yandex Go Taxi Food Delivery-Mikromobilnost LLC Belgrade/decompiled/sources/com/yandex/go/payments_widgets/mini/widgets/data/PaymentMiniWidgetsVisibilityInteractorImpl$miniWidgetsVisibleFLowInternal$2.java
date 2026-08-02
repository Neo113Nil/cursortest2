package com.yandex.go.payments_widgets.mini.widgets.data;

import defpackage.bms;
import defpackage.cea0;
import defpackage.fl3;
import defpackage.hl3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhl3;", "authStatus", "", "isVisible", "Lcea0;", Constants.KEY_DATA, "<anonymous>", "(Lhl3;ZLcea0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments_widgets.mini.widgets.data.PaymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFLowInternal$2", f = "PaymentMiniWidgetsVisibilityInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFLowInternal$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        PaymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFLowInternal$2 paymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFLowInternal$2 = new PaymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFLowInternal$2(4, (Continuation) obj4);
        paymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFLowInternal$2.L$0 = (hl3) obj;
        paymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFLowInternal$2.Z$0 = booleanValue;
        paymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFLowInternal$2.L$1 = (cea0) obj3;
        return paymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFLowInternal$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hl3 hl3Var = (hl3) this.L$0;
        boolean z = this.Z$0;
        cea0 cea0Var = (cea0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf((hl3Var instanceof fl3) && z && cea0Var != null);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
