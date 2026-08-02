package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BaseDeferredUseCase.kt */
@b6l(c = "com.vk.uxpolls.coroutine.BaseDeferredUseCase$invoke$1$1", f = "BaseDeferredUseCase.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class oc6 extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ Object $params;
    int label;
    final /* synthetic */ pc6<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc6(pc6<Object, Object> pc6Var, Object obj, spj<? super oc6> spjVar) {
        super(2, spjVar);
        this.this$0 = pc6Var;
        this.$params = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new oc6(this.this$0, this.$params, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((oc6) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            pc6<Object, Object> pc6Var = this.this$0;
            Object obj2 = this.$params;
            this.label = 1;
            Object c = pc6Var.c(obj2, this);
            return c == coroutineSingletons ? coroutineSingletons : c;
        } catch (Throwable th) {
            this.this$0.a(this.$params, th);
            throw null;
        }
    }
}
