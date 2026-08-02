package xsna;

import androidx.compose.animation.core.MutatePriority;
import androidx.compose.animation.core.MutationInterruptedException;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.eyx;
import xsna.ji50;

/* compiled from: InternalMutatorMutex.kt */
@b6l(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {178, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class li50 extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ izs<spj<Object>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ji50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public li50(MutatePriority mutatePriority, ji50 ji50Var, izs<? super spj<Object>, ? extends Object> izsVar, spj<? super li50> spjVar) {
        super(2, spjVar);
        this.$priority = mutatePriority;
        this.this$0 = ji50Var;
        this.$block = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        li50 li50Var = new li50(this.$priority, this.this$0, this.$block, spjVar);
        li50Var.L$0 = obj;
        return li50Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((li50) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, xsna.ui50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ji50 ji50Var;
        ui50 ui50Var;
        izs<spj<Object>, Object> izsVar;
        ji50.a aVar;
        ui50 ui50Var2;
        ji50 ji50Var2;
        Throwable th;
        ji50.a aVar2;
        AtomicReference<ji50.a> atomicReference;
        AtomicReference<ji50.a> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    kotlin.a.a(obj);
                    ji50.a aVar3 = new ji50.a(this.$priority, (eyx) ((yvj) this.L$0).getCoroutineContext().get(eyx.a.b));
                    AtomicReference<ji50.a> atomicReference3 = this.this$0.a;
                    while (true) {
                        ji50.a aVar4 = atomicReference3.get();
                        if (aVar4 != null && aVar3.a.compareTo(aVar4.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(aVar4, aVar3)) {
                            if (atomicReference3.get() != aVar4) {
                                break;
                            }
                        }
                        if (aVar4 != null) {
                            aVar4.b.b(new MutationInterruptedException());
                        }
                        ji50Var = this.this$0;
                        ui50Var = ji50Var.b;
                        izs<spj<Object>, Object> izsVar2 = this.$block;
                        this.L$0 = aVar3;
                        this.L$1 = ui50Var;
                        this.L$2 = izsVar2;
                        this.L$3 = ji50Var;
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
                        ji50Var2 = (ji50) this.L$2;
                        ui50Var2 = (ui50) this.L$1;
                        aVar2 = (ji50.a) this.L$0;
                        try {
                            kotlin.a.a(obj);
                            atomicReference2 = ji50Var2.a;
                            while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                            }
                            ui50Var2.c(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = ji50Var2.a;
                            while (!atomicReference.compareAndSet(aVar2, null)) {
                            }
                            throw th;
                        }
                    }
                    ji50 ji50Var3 = (ji50) this.L$3;
                    izsVar = (izs) this.L$2;
                    ui50Var = (ui50) this.L$1;
                    aVar = (ji50.a) this.L$0;
                    kotlin.a.a(obj);
                    ji50Var = ji50Var3;
                }
                this.L$0 = aVar;
                this.L$1 = ui50Var2;
                this.L$2 = ji50Var;
                this.L$3 = null;
                this.label = 2;
                Object invoke = izsVar.invoke(this);
                if (invoke != coroutineSingletons) {
                    ji50Var2 = ji50Var;
                    obj = invoke;
                    aVar2 = aVar;
                    atomicReference2 = ji50Var2.a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    ui50Var2.c(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                ji50Var2 = ji50Var;
                th = th3;
                aVar2 = aVar;
                atomicReference = ji50Var2.a;
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
