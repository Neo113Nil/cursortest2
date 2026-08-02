package xsna;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SessionMutex.kt */
@b6l(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class kui0 extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ AtomicReference<jui0<Object>> $arg0;
    final /* synthetic */ wzs<Object, spj<Object>, Object> $session;
    final /* synthetic */ izs<yvj, Object> $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kui0(izs<? super yvj, Object> izsVar, AtomicReference<jui0<Object>> atomicReference, wzs<Object, ? super spj<Object>, ? extends Object> wzsVar, spj<? super kui0> spjVar) {
        super(2, spjVar);
        this.$sessionInitializer = izsVar;
        this.$arg0 = atomicReference;
        this.$session = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        kui0 kui0Var = new kui0(this.$sessionInitializer, this.$arg0, this.$session, spjVar);
        kui0Var.L$0 = obj;
        return kui0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((kui0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0055, code lost:
    
        if (xsna.iyx.c(r8, r7) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jui0<Object> jui0Var;
        jui0<Object> jui0Var2;
        AtomicReference<jui0<Object>> atomicReference;
        AtomicReference<jui0<Object>> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                jui0Var = new jui0<>(iyx.f(yvjVar.getCoroutineContext()), this.$sessionInitializer.invoke(yvjVar));
                jui0<Object> andSet = this.$arg0.getAndSet(jui0Var);
                if (andSet != null) {
                    eyx eyxVar = andSet.a;
                    this.L$0 = jui0Var;
                    this.label = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jui0Var2 = (jui0) this.L$0;
                    try {
                        kotlin.a.a(obj);
                        atomicReference2 = this.$arg0;
                        while (!atomicReference2.compareAndSet(jui0Var2, null) && atomicReference2.get() == jui0Var2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        atomicReference = this.$arg0;
                        while (!atomicReference.compareAndSet(jui0Var2, null) && atomicReference.get() == jui0Var2) {
                        }
                        throw th;
                    }
                }
                jui0Var = (jui0) this.L$0;
                kotlin.a.a(obj);
            }
            wzs<Object, spj<Object>, Object> wzsVar = this.$session;
            Object obj2 = jui0Var.b;
            this.L$0 = jui0Var;
            this.label = 2;
            obj = wzsVar.invoke(obj2, this);
            if (obj != coroutineSingletons) {
                jui0Var2 = jui0Var;
                atomicReference2 = this.$arg0;
                while (!atomicReference2.compareAndSet(jui0Var2, null)) {
                }
                return obj;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            jui0Var2 = jui0Var;
            atomicReference = this.$arg0;
            while (!atomicReference.compareAndSet(jui0Var2, null)) {
            }
            throw th;
        }
    }
}
