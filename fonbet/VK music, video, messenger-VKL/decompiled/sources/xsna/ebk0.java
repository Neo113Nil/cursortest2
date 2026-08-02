package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ProduceState.kt */
@b6l(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3$1", f = "ProduceState.kt", l = {141}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ebk0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<qhd0<Object>, spj<? super s3q0>, Object> $producer;
    final /* synthetic */ wh50<Object> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ebk0(wzs<? super qhd0<Object>, ? super spj<? super s3q0>, ? extends Object> wzsVar, wh50<Object> wh50Var, spj<? super ebk0> spjVar) {
        super(2, spjVar);
        this.$producer = wzsVar;
        this.$result = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ebk0 ebk0Var = new ebk0(this.$producer, this.$result, spjVar);
        ebk0Var.L$0 = obj;
        return ebk0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ebk0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            wzs<qhd0<Object>, spj<? super s3q0>, Object> wzsVar = this.$producer;
            shd0 shd0Var = new shd0(this.$result, yvjVar.getCoroutineContext());
            this.label = 1;
            if (wzsVar.invoke(shd0Var, this) == coroutineSingletons) {
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
