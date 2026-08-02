package xsna;

import androidx.compose.foundation.MutatePriority;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.eyx;
import xsna.ni50;

/* compiled from: MutatorMutex.kt */
@b6l(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 167}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class mi50 extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ wzs<Object, spj<Object>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ Object $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ni50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mi50(MutatePriority mutatePriority, ni50 ni50Var, wzs<Object, ? super spj<Object>, ? extends Object> wzsVar, Object obj, spj<? super mi50> spjVar) {
        super(2, spjVar);
        this.$priority = mutatePriority;
        this.this$0 = ni50Var;
        this.$block = wzsVar;
        this.$receiver = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        mi50 mi50Var = new mi50(this.$priority, this.this$0, this.$block, this.$receiver, spjVar);
        mi50Var.L$0 = obj;
        return mi50Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((mi50) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, xsna.ui50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ni50 ni50Var;
        Object obj2;
        ni50.a aVar;
        ui50 ui50Var;
        wzs<Object, spj<Object>, Object> wzsVar;
        ni50 ni50Var2;
        Throwable th;
        ni50.a aVar2;
        AtomicReference<ni50.a> atomicReference;
        AtomicReference<ni50.a> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    kotlin.a.a(obj);
                    ni50.a aVar3 = new ni50.a(this.$priority, (eyx) ((yvj) this.L$0).getCoroutineContext().get(eyx.a.b));
                    ni50.a(this.this$0, aVar3);
                    ni50Var = this.this$0;
                    wi50 wi50Var = ni50Var.b;
                    wzs<Object, spj<Object>, Object> wzsVar2 = this.$block;
                    Object obj3 = this.$receiver;
                    this.L$0 = aVar3;
                    this.L$1 = wi50Var;
                    this.L$2 = wzsVar2;
                    this.L$3 = obj3;
                    this.L$4 = ni50Var;
                    this.label = 1;
                    if (wi50Var.b(this) != coroutineSingletons) {
                        obj2 = obj3;
                        aVar = aVar3;
                        ui50Var = wi50Var;
                        wzsVar = wzsVar2;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ni50Var2 = (ni50) this.L$2;
                    ui50Var = (ui50) this.L$1;
                    aVar2 = (ni50.a) this.L$0;
                    try {
                        kotlin.a.a(obj);
                        atomicReference2 = ni50Var2.a;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        ui50Var.c(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = ni50Var2.a;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th;
                    }
                }
                ni50 ni50Var3 = (ni50) this.L$4;
                obj2 = this.L$3;
                wzsVar = (wzs) this.L$2;
                ui50 ui50Var2 = (ui50) this.L$1;
                aVar = (ni50.a) this.L$0;
                kotlin.a.a(obj);
                ni50Var = ni50Var3;
                ui50Var = ui50Var2;
                this.L$0 = aVar;
                this.L$1 = ui50Var;
                this.L$2 = ni50Var;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object invoke = wzsVar.invoke(obj2, this);
                if (invoke != coroutineSingletons) {
                    ni50Var2 = ni50Var;
                    obj = invoke;
                    aVar2 = aVar;
                    atomicReference2 = ni50Var2.a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    ui50Var.c(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                ni50Var2 = ni50Var;
                th = th3;
                aVar2 = aVar;
                atomicReference = ni50Var2.a;
                while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.c(null);
            throw th4;
        }
    }
}
