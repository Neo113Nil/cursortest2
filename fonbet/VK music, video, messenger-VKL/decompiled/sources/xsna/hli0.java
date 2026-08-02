package xsna;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.random.Random;

/* compiled from: Sequences.kt */
@b6l(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", l = {178}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class hli0 extends RestrictedSuspendLambda implements wzs<ali0<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ Random $random;
    final /* synthetic */ uki0<Object> $this_shuffled;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hli0(uki0<Object> uki0Var, Random random, spj<? super hli0> spjVar) {
        super(2, spjVar);
        this.$this_shuffled = uki0Var;
        this.$random = random;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        hli0 hli0Var = new hli0(this.$this_shuffled, this.$random, spjVar);
        hli0Var.L$0 = obj;
        return hli0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<Object> ali0Var, spj<? super s3q0> spjVar) {
        return ((hli0) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List B;
        ali0 ali0Var = (ali0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            B = rli0.B(this.$this_shuffled);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            B = (List) this.L$1;
            kotlin.a.a(obj);
        }
        while (!B.isEmpty()) {
            int k = this.$random.k(B.size());
            Object I = g5g.I(B);
            if (k < B.size()) {
                I = B.set(k, I);
            }
            this.L$0 = ali0Var;
            this.L$1 = B;
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = k;
            this.label = 1;
            if (ali0Var.a(I, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return s3q0.a;
    }
}
