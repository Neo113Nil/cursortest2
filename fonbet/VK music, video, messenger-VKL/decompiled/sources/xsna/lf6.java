package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BaseJobUseCase.kt */
@b6l(c = "com.vk.uxpolls.coroutine.BaseJobUseCase$invoke$1$1", f = "BaseJobUseCase.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class lf6 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Object $params;
    int label;
    final /* synthetic */ mf6<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf6(mf6<Object> mf6Var, Object obj, spj<? super lf6> spjVar) {
        super(2, spjVar);
        this.this$0 = mf6Var;
        this.$params = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lf6(this.this$0, this.$params, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lf6) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                mf6<Object> mf6Var = this.this$0;
                Object obj2 = this.$params;
                this.label = 1;
                if (mf6Var.a(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        } catch (Throwable th) {
            this.this$0.getClass();
            throw th;
        }
    }
}
