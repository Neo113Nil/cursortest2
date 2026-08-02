package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UnfinishedWorkListener.kt */
@b6l(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e3q0 extends SuspendLambda implements zzs<lsr<? super Boolean>, Throwable, Long, spj<? super Boolean>, Object> {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // xsna.zzs
    public final Object invoke(lsr<? super Boolean> lsrVar, Throwable th, Long l, spj<? super Boolean> spjVar) {
        long longValue = l.longValue();
        e3q0 e3q0Var = new e3q0(4, spjVar);
        e3q0Var.L$0 = th;
        e3q0Var.J$0 = longValue;
        return e3q0Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Throwable th = (Throwable) this.L$0;
            long j = this.J$0;
            m100.c().b(g3q0.a, "Cannot check for unfinished work", th);
            long min = Math.min(j * 30000, g3q0.b);
            this.label = 1;
            if (qsl.b(min, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return Boolean.TRUE;
    }
}
