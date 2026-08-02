package xsna;

import androidx.compose.animation.core.AnimationEndReason;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: Animatable.kt */
@b6l(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class hf2 extends SuspendLambda implements izs<spj<? super fq2<Object, wq2>>, Object> {
    final /* synthetic */ rm2<Object, wq2> $animation;
    final /* synthetic */ izs<if2<Object, wq2>, s3q0> $block;
    final /* synthetic */ Object $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ if2<Object, wq2> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hf2(if2<Object, wq2> if2Var, Object obj, rm2<Object, wq2> rm2Var, long j, izs<? super if2<Object, wq2>, s3q0> izsVar, spj<? super hf2> spjVar) {
        super(1, spjVar);
        this.this$0 = if2Var;
        this.$initialVelocity = obj;
        this.$animation = rm2Var;
        this.$startTime = j;
        this.$block = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new hf2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super fq2<Object, wq2>> spjVar) {
        return ((hf2) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kq2 kq2Var;
        Ref$BooleanRef ref$BooleanRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                if2<Object, wq2> if2Var = this.this$0;
                if2Var.c.d = (V) if2Var.a.a().invoke(this.$initialVelocity);
                ((zak0) this.this$0.e).setValue(this.$animation.f());
                ((zak0) this.this$0.d).setValue(Boolean.TRUE);
                kq2<Object, wq2> kq2Var2 = this.this$0.c;
                kq2 kq2Var3 = new kq2(kq2Var2.b, ((zak0) kq2Var2.c).getValue(), sua.f(kq2Var2.d), kq2Var2.e, Long.MIN_VALUE, kq2Var2.g);
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                rm2<Object, wq2> rm2Var = this.$animation;
                long j = this.$startTime;
                gf2 gf2Var = new gf2(this.this$0, kq2Var3, this.$block, ref$BooleanRef2, 0);
                this.L$0 = kq2Var3;
                this.L$1 = ref$BooleanRef2;
                this.label = 1;
                if (nkn0.b(kq2Var3, rm2Var, j, gf2Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kq2Var = kq2Var3;
                ref$BooleanRef = ref$BooleanRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                kq2Var = (kq2) this.L$0;
                kotlin.a.a(obj);
            }
            AnimationEndReason animationEndReason = ref$BooleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            if2.b(this.this$0);
            return new fq2(kq2Var, animationEndReason);
        } catch (CancellationException e) {
            if2.b(this.this$0);
            throw e;
        }
    }
}
