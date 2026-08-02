package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SingleProcessCoordinator.kt */
@b6l(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class qvj0 extends SuspendLambda implements wzs<lsr<? super s3q0>, spj<? super s3q0>, Object> {
    int label;

    public qvj0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qvj0(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super s3q0> lsrVar, spj<? super s3q0> spjVar) {
        return ((qvj0) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        return s3q0.a;
    }
}
