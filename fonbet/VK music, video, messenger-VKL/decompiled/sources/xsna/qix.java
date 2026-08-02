package xsna;

import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.eyx;
import xsna.tix;

/* compiled from: InternalMutatorMutex.kt */
@b6l(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {179, 103}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class qix extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ izs<spj<Object>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ tix this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qix(MutatePriority mutatePriority, tix tixVar, izs<? super spj<Object>, ? extends Object> izsVar, spj<? super qix> spjVar) {
        super(2, spjVar);
        this.$priority = mutatePriority;
        this.this$0 = tixVar;
        this.$block = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        qix qixVar = new qix(this.$priority, this.this$0, this.$block, spjVar);
        qixVar.L$0 = obj;
        return qixVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((qix) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, xsna.ui50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tix tixVar;
        ui50 ui50Var;
        izs<spj<Object>, Object> izsVar;
        tix.a aVar;
        ui50 ui50Var2;
        tix tixVar2;
        Throwable th;
        tix.a aVar2;
        AtomicReference<tix.a> atomicReference;
        AtomicReference<tix.a> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    kotlin.a.a(obj);
                    tix.a aVar3 = new tix.a(this.$priority, (eyx) ((yvj) this.L$0).getCoroutineContext().get(eyx.a.b));
                    AtomicReference<tix.a> atomicReference3 = this.this$0.a;
                    while (true) {
                        tix.a aVar4 = atomicReference3.get();
                        if (aVar4 != null && aVar3.a.compareTo(aVar4.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(aVar4, aVar3)) {
                            if (atomicReference3.get() != aVar4) {
                                break;
                            }
                        }
                        if (aVar4 != null) {
                            aVar4.b.b(null);
                        }
                        tixVar = this.this$0;
                        ui50Var = tixVar.b;
                        izs<spj<Object>, Object> izsVar2 = this.$block;
                        this.L$0 = aVar3;
                        this.L$1 = ui50Var;
                        this.L$2 = izsVar2;
                        this.L$3 = tixVar;
                        this.label = 1;
                        if (ui50Var.b(this) != coroutineSingletons) {
                            izsVar = izsVar2;
                            aVar = aVar3;
                        }
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tixVar2 = (tix) this.L$2;
                        ui50Var2 = (ui50) this.L$1;
                        aVar2 = (tix.a) this.L$0;
                        try {
                            kotlin.a.a(obj);
                            atomicReference2 = tixVar2.a;
                            while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                            }
                            ui50Var2.c(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = tixVar2.a;
                            while (!atomicReference.compareAndSet(aVar2, null)) {
                            }
                            throw th;
                        }
                    }
                    tix tixVar3 = (tix) this.L$3;
                    izsVar = (izs) this.L$2;
                    ui50Var = (ui50) this.L$1;
                    aVar = (tix.a) this.L$0;
                    kotlin.a.a(obj);
                    tixVar = tixVar3;
                }
                this.L$0 = aVar;
                this.L$1 = ui50Var2;
                this.L$2 = tixVar;
                this.L$3 = null;
                this.label = 2;
                Object invoke = izsVar.invoke(this);
                if (invoke != coroutineSingletons) {
                    tixVar2 = tixVar;
                    obj = invoke;
                    aVar2 = aVar;
                    atomicReference2 = tixVar2.a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    ui50Var2.c(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                tixVar2 = tixVar;
                th = th3;
                aVar2 = aVar;
                atomicReference = tixVar2.a;
                while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                }
                throw th;
            }
            ui50Var2 = ui50Var;
        } catch (Throwable th4) {
            r1.c(null);
            throw th4;
        }
    }
}
