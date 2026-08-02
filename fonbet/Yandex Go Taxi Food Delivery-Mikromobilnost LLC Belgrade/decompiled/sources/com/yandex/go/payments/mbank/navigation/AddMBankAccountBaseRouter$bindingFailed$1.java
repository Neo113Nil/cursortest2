package com.yandex.go.payments.mbank.navigation;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodAnalytics$AddMBankBindingStatus;
import defpackage.ff41;
import defpackage.mvg;
import defpackage.scg;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.mbank.navigation.AddMBankAccountBaseRouter$bindingFailed$1", f = "AddMBankAccountBaseRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddMBankAccountBaseRouter$bindingFailed$1 extends SuspendLambda implements tls {
    final /* synthetic */ ff41 $webContainerApi;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMBankAccountBaseRouter$bindingFailed$1(b bVar, ff41 ff41Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$webContainerApi = ff41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AddMBankAccountBaseRouter$bindingFailed$1(this.this$0, this.$webContainerApi, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((AddMBankAccountBaseRouter$bindingFailed$1) create((Continuation) obj)).invokeSuspend(zy11.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.this$0.I.a(PaymentMethodAnalytics$AddMBankBindingStatus.Falied);
        ((scg) this.$webContainerApi).b().i();
        throw new IllegalStateException();
    }
}
