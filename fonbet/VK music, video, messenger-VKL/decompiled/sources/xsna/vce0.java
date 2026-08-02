package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PublishMarkersExecutor.kt */
@b6l(c = "com.vk.geo.impl.presentation.publish.PublishMarkersExecutor$handle$3", f = "PublishMarkersExecutor.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class vce0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ uee0 $transaction;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wce0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vce0(wce0 wce0Var, uee0 uee0Var, spj<? super vce0> spjVar) {
        super(2, spjVar);
        this.this$0 = wce0Var;
        this.$transaction = uee0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        vce0 vce0Var = new vce0(this.this$0, this.$transaction, spjVar);
        vce0Var.L$0 = obj;
        return vce0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vce0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                dfe0 dfe0Var = this.this$0.c;
                uee0 uee0Var = this.$transaction;
                this.L$0 = yvjVar;
                this.label = 1;
                if (dfe0Var.invoke(uee0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            xf9.e.g(this.$transaction.a, yvjVar);
            return s3q0.a;
        } catch (Throwable th) {
            xf9.e.g(this.$transaction.a, yvjVar);
            throw th;
        }
    }
}
