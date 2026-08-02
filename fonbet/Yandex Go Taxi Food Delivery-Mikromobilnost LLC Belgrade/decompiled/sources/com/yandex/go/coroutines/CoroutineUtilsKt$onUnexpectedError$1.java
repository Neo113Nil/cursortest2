package com.yandex.go.coroutines;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lzy11;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.CoroutineUtilsKt$onUnexpectedError$1", f = "CoroutineUtils.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class CoroutineUtilsKt$onUnexpectedError$1 extends SuspendLambda implements wls {
    final /* synthetic */ IllegalStateException $exception;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineUtilsKt$onUnexpectedError$1(IllegalStateException illegalStateException, Continuation continuation) {
        super(2, continuation);
        this.$exception = illegalStateException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoroutineUtilsKt$onUnexpectedError$1 coroutineUtilsKt$onUnexpectedError$1 = new CoroutineUtilsKt$onUnexpectedError$1(this.$exception, continuation);
        coroutineUtilsKt$onUnexpectedError$1.L$0 = obj;
        return coroutineUtilsKt$onUnexpectedError$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CoroutineUtilsKt$onUnexpectedError$1 coroutineUtilsKt$onUnexpectedError$1 = (CoroutineUtilsKt$onUnexpectedError$1) create((Throwable) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        coroutineUtilsKt$onUnexpectedError$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$exception.initCause(th);
        jst.e.r("Unexpected exception thrown", this.$exception);
        return zy11.a;
    }
}
