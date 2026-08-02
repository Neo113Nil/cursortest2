package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Scrollable.kt */
@b6l(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {945}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class yhh0 extends SuspendLambda implements wzs<ggh0, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<n160, spj<? super s3q0>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ zhh0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhh0(spj spjVar, wzs wzsVar, zhh0 zhh0Var) {
        super(2, spjVar);
        this.this$0 = zhh0Var;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        yhh0 yhh0Var = new yhh0(spjVar, this.$block, this.this$0);
        yhh0Var.L$0 = obj;
        return yhh0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ggh0 ggh0Var, spj<? super s3q0> spjVar) {
        return ((yhh0) create(ggh0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ggh0 ggh0Var = (ggh0) this.L$0;
            zhh0 zhh0Var = this.this$0;
            zhh0Var.k = ggh0Var;
            wzs<n160, spj<? super s3q0>, Object> wzsVar = this.$block;
            whh0 whh0Var = zhh0Var.l;
            this.label = 1;
            if (wzsVar.invoke(whh0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
