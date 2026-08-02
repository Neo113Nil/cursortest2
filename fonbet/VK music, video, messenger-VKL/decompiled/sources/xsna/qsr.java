package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FlowCoroutine.kt */
@b6l(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class qsr extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yzs<yvj, lsr<Object>, spj<? super s3q0>, Object> $block;
    final /* synthetic */ lsr<Object> $this_flow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qsr(yzs<? super yvj, ? super lsr<Object>, ? super spj<? super s3q0>, ? extends Object> yzsVar, lsr<Object> lsrVar, spj<? super qsr> spjVar) {
        super(2, spjVar);
        this.$block = yzsVar;
        this.$this_flow = lsrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        qsr qsrVar = new qsr(this.$block, this.$this_flow, spjVar);
        qsrVar.L$0 = obj;
        return qsrVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qsr) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            yzs<yvj, lsr<Object>, spj<? super s3q0>, Object> yzsVar = this.$block;
            lsr<Object> lsrVar = this.$this_flow;
            this.label = 1;
            if (yzsVar.invoke(yvjVar, lsrVar, this) == coroutineSingletons) {
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
