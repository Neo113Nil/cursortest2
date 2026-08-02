package com.yandex.delivery.utils.dialogmanager;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.utils.dialogmanager.ErrorDialogInteractor$requestErrorDialog$2", f = "ErrorDialogInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
public final class ErrorDialogInteractor$requestErrorDialog$2 extends SuspendLambda implements tls {
    int label;

    public ErrorDialogInteractor$requestErrorDialog$2() {
        super(1, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ErrorDialogInteractor$requestErrorDialog$2(1, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ErrorDialogInteractor$requestErrorDialog$2 errorDialogInteractor$requestErrorDialog$2 = (ErrorDialogInteractor$requestErrorDialog$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        errorDialogInteractor$requestErrorDialog$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
