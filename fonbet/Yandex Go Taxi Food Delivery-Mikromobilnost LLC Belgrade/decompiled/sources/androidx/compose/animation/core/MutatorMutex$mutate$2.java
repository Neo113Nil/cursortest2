package androidx.compose.animation.core;

import defpackage.d050;
import defpackage.g050;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.seu;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {178, HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class MutatorMutex$mutate$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, d dVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$priority = mutatePriority;
        this.this$0 = dVar;
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
        d050 d050Var;
        d dVar;
        g050 g050Var;
        tls tlsVar;
        d dVar2;
        Throwable th;
        d050 d050Var2;
        g050 g050Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    kotlin.b.b(obj);
                    d050Var = new d050(this.$priority, (l8x) ((tse) this.L$0).getCoroutineContext().get(seu.C));
                    AtomicReference atomicReference3 = this.this$0.a;
                    while (true) {
                        d050 d050Var3 = (d050) atomicReference3.get();
                        if (d050Var3 != null && d050Var.a.compareTo(d050Var3.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(d050Var3, d050Var)) {
                            if (atomicReference3.get() != d050Var3) {
                                break;
                            }
                        }
                        if (d050Var3 != null) {
                            d050Var3.b.a(new MutationInterruptedException());
                        }
                        dVar = this.this$0;
                        g050Var = dVar.b;
                        tls tlsVar2 = this.$block;
                        this.L$0 = d050Var;
                        this.L$1 = g050Var;
                        this.L$2 = tlsVar2;
                        this.L$3 = dVar;
                        this.label = 1;
                        if (g050Var.a(this) != coroutineSingletons) {
                            tlsVar = tlsVar2;
                        }
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dVar2 = (d) this.L$2;
                        g050Var2 = (g050) this.L$1;
                        d050Var2 = (d050) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            atomicReference2 = dVar2.a;
                            while (!atomicReference2.compareAndSet(d050Var2, null) && atomicReference2.get() == d050Var2) {
                            }
                            g050Var2.d(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = dVar2.a;
                            while (!atomicReference.compareAndSet(d050Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    d dVar3 = (d) this.L$3;
                    tlsVar = (tls) this.L$2;
                    g050Var = (g050) this.L$1;
                    d050 d050Var4 = (d050) this.L$0;
                    kotlin.b.b(obj);
                    dVar = dVar3;
                    d050Var = d050Var4;
                }
                this.L$0 = d050Var;
                this.L$1 = g050Var;
                this.L$2 = dVar;
                this.L$3 = null;
                this.label = 2;
                Object invoke = tlsVar.invoke(this);
                if (invoke != coroutineSingletons) {
                    dVar2 = dVar;
                    obj = invoke;
                    d050Var2 = d050Var;
                    g050Var2 = g050Var;
                    atomicReference2 = dVar2.a;
                    while (!atomicReference2.compareAndSet(d050Var2, null)) {
                    }
                    g050Var2.d(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                dVar2 = dVar;
                th = th3;
                d050Var2 = d050Var;
                atomicReference = dVar2.a;
                while (!atomicReference.compareAndSet(d050Var2, null) && atomicReference.get() == d050Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.d(null);
            throw th4;
        }
    }
}
