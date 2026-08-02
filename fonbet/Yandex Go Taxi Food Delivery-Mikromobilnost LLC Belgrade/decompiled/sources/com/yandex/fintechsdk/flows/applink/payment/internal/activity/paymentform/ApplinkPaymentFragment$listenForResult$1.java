package com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform;

import defpackage.eci0;
import defpackage.lwf;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w13;
import defpackage.wls;
import defpackage.x5;
import defpackage.z13;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment$listenForResult$1", f = "ApplinkPaymentFragment.kt", l = {HProv.PP_CONTAINER_STATUS}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class ApplinkPaymentFragment$listenForResult$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ ApplinkPaymentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplinkPaymentFragment$listenForResult$1(ApplinkPaymentFragment applinkPaymentFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = applinkPaymentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ApplinkPaymentFragment$listenForResult$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ApplinkPaymentFragment$listenForResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z13 component;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            component = this.this$0.getComponent();
            eci0 eci0Var = ((w13) ((lwf) component).R.get()).b;
            x5 x5Var = new x5(22, this.this$0);
            this.label = 1;
            if (eci0Var.a.collect(x5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
