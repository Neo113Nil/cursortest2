package androidx.compose.foundation;

import defpackage.c050;
import defpackage.g050;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.seu;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {212, HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class MutatorMutex$mutate$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, j jVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$priority = mutatePriority;
        this.this$0 = jVar;
        this.$block = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, continuation);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutate$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [g050, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c050 c050Var;
        j jVar;
        g050 g050Var;
        tls tlsVar;
        j jVar2;
        Throwable th;
        c050 c050Var2;
        g050 g050Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    kotlin.b.b(obj);
                    c050Var = new c050(this.$priority, (l8x) ((tse) this.L$0).getCoroutineContext().get(seu.C));
                    j.a(this.this$0, c050Var);
                    jVar = this.this$0;
                    g050Var = jVar.b;
                    tls tlsVar2 = this.$block;
                    this.L$0 = c050Var;
                    this.L$1 = g050Var;
                    this.L$2 = tlsVar2;
                    this.L$3 = jVar;
                    this.label = 1;
                    if (g050Var.a(this) != coroutineSingletons) {
                        tlsVar = tlsVar2;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jVar2 = (j) this.L$2;
                    g050Var2 = (g050) this.L$1;
                    c050Var2 = (c050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        atomicReference2 = jVar2.a;
                        while (!atomicReference2.compareAndSet(c050Var2, null) && atomicReference2.get() == c050Var2) {
                        }
                        g050Var2.d(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = jVar2.a;
                        while (!atomicReference.compareAndSet(c050Var2, null)) {
                        }
                        throw th;
                    }
                }
                j jVar3 = (j) this.L$3;
                tlsVar = (tls) this.L$2;
                g050Var = (g050) this.L$1;
                c050 c050Var3 = (c050) this.L$0;
                kotlin.b.b(obj);
                jVar = jVar3;
                c050Var = c050Var3;
                this.L$0 = c050Var;
                this.L$1 = g050Var;
                this.L$2 = jVar;
                this.L$3 = null;
                this.label = 2;
                Object invoke = tlsVar.invoke(this);
                if (invoke != coroutineSingletons) {
                    jVar2 = jVar;
                    obj = invoke;
                    c050Var2 = c050Var;
                    g050Var2 = g050Var;
                    atomicReference2 = jVar2.a;
                    while (!atomicReference2.compareAndSet(c050Var2, null)) {
                    }
                    g050Var2.d(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                jVar2 = jVar;
                th = th3;
                c050Var2 = c050Var;
                atomicReference = jVar2.a;
                while (!atomicReference.compareAndSet(c050Var2, null) && atomicReference.get() == c050Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.d(null);
            throw th4;
        }
    }
}
