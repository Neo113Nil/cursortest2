package xsna;

import androidx.compose.animation.core.AnimationEndReason;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.oxj0;

/* compiled from: AnimationModifier.kt */
@b6l(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {242}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class pxj0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ oxj0.a $this_apply;
    int label;
    final /* synthetic */ oxj0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxj0(oxj0.a aVar, long j, oxj0 oxj0Var, spj<? super pxj0> spjVar) {
        super(2, spjVar);
        this.$this_apply = aVar;
        this.$targetSize = j;
        this.this$0 = oxj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pxj0(this.$this_apply, this.$targetSize, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pxj0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pxj0 pxj0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<q9x, tq2> if2Var = this.$this_apply.a;
            q9x q9xVar = new q9x(this.$targetSize);
            iq2<q9x> iq2Var = this.this$0.p;
            this.label = 1;
            pxj0Var = this;
            obj = if2.c(if2Var, q9xVar, iq2Var, null, pxj0Var, 12);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            pxj0Var = this;
        }
        if (((fq2) obj).b == AnimationEndReason.Finished) {
            pxj0Var.this$0.getClass();
        }
        return s3q0.a;
    }
}
