package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LottieAnimatable.kt */
@b6l(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class x600 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ i700 $composition;
    final /* synthetic */ int $iteration;
    final /* synthetic */ float $progress;
    final /* synthetic */ boolean $resetLastFrameNanos;
    int label;
    final /* synthetic */ w600 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x600(w600 w600Var, i700 i700Var, float f, int i, boolean z, spj<? super x600> spjVar) {
        super(1, spjVar);
        this.this$0 = w600Var;
        this.$composition = i700Var;
        this.$progress = f;
        this.$iteration = i;
        this.$resetLastFrameNanos = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new x600(this.this$0, this.$composition, this.$progress, this.$iteration, this.$resetLastFrameNanos, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((x600) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        w600 w600Var = this.this$0;
        ((zak0) w600Var.j).setValue(this.$composition);
        this.this$0.n(this.$progress);
        this.this$0.m(this.$iteration);
        w600.h(this.this$0, false);
        if (this.$resetLastFrameNanos) {
            ((zak0) this.this$0.m).setValue(Long.MIN_VALUE);
        }
        return s3q0.a;
    }
}
