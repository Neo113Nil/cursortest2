package com.yandex.go.address_confirmation.modal;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rbt0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalViewPresenter$attachView$5", f = "SourceAddressConfirmationModalViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SourceAddressConfirmationModalViewPresenter$attachView$5 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAddressConfirmationModalViewPresenter$attachView$5(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourceAddressConfirmationModalViewPresenter$attachView$5(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        SourceAddressConfirmationModalViewPresenter$attachView$5 sourceAddressConfirmationModalViewPresenter$attachView$5 = (SourceAddressConfirmationModalViewPresenter$attachView$5) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sourceAddressConfirmationModalViewPresenter$attachView$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r0 r0Var = this.this$0.Q;
        rbt0 rbt0Var = (rbt0) r0Var.getValue();
        r0Var.l(rbt0Var != null ? new rbt0(rbt0Var.a, null, rbt0Var.c) : null);
        return zy11.a;
    }
}
