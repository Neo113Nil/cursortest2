package com.yandex.passport.internal.ui.authsdk;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.authsdk.AuthSdkUi$showError$1", f = "AuthSdkUi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthSdkUi$showError$1 extends SuspendLambda implements tls {
    final /* synthetic */ sls $onCancel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSdkUi$showError$1(sls slsVar, Continuation continuation) {
        super(1, continuation);
        this.$onCancel = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AuthSdkUi$showError$1(this.$onCancel, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        AuthSdkUi$showError$1 authSdkUi$showError$1 = (AuthSdkUi$showError$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        authSdkUi$showError$1.invokeSuspend(zy11Var);
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
        this.$onCancel.invoke();
        return zy11.a;
    }
}
