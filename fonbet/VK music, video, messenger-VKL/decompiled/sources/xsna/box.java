package xsna;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Interruptible.kt */
@b6l(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class box extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ gzs<Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public box(gzs<Object> gzsVar, spj<? super box> spjVar) {
        super(2, spjVar);
        this.$block = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        box boxVar = new box(this.$block, spjVar);
        boxVar.L$0 = obj;
        return boxVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((box) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        kotlin.coroutines.d coroutineContext = ((yvj) this.L$0).getCoroutineContext();
        gzs<Object> gzsVar = this.$block;
        try {
            mro0 mro0Var = new mro0();
            mro0Var.g = iyx.g(iyx.f(coroutineContext), mro0Var);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = mro0.h;
            try {
                do {
                    i = atomicIntegerFieldUpdater.get(mro0Var);
                    if (i != 0) {
                        if (i != 2 && i != 3) {
                            mro0.k(i);
                            throw null;
                        }
                    }
                    return gzsVar.invoke();
                } while (!atomicIntegerFieldUpdater.compareAndSet(mro0Var, i, 0));
                return gzsVar.invoke();
            } finally {
                mro0Var.j();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
