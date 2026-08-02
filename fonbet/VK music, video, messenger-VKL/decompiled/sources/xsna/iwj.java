package xsna;

import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CoroutinesRoom.android.kt */
@b6l(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class iwj extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Callable<Object> $callable;
    final /* synthetic */ kq9<Object> $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwj(Callable<Object> callable, kq9<Object> kq9Var, spj<? super iwj> spjVar) {
        super(2, spjVar);
        this.$callable = callable;
        this.$continuation = kq9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new iwj(this.$callable, this.$continuation, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((iwj) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        try {
            this.$continuation.resumeWith(this.$callable.call());
        } catch (Throwable th) {
            this.$continuation.resumeWith(new Result.Failure(th));
        }
        return s3q0.a;
    }
}
