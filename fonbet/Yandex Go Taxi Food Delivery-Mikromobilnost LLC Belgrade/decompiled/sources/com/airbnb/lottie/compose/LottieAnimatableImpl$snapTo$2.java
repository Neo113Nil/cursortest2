package com.airbnb.lottie.compose;

import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class LottieAnimatableImpl$snapTo$2 extends SuspendLambda implements tls {
    final /* synthetic */ nsz $composition;
    final /* synthetic */ int $iteration;
    final /* synthetic */ float $progress;
    final /* synthetic */ boolean $resetLastFrameNanos;
    int label;
    final /* synthetic */ LottieAnimatableImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$snapTo$2(LottieAnimatableImpl lottieAnimatableImpl, nsz nszVar, float f, int i, boolean z, Continuation continuation) {
        super(1, continuation);
        this.this$0 = lottieAnimatableImpl;
        this.$composition = nszVar;
        this.$progress = f;
        this.$iteration = i;
        this.$resetLastFrameNanos = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LottieAnimatableImpl$snapTo$2(this.this$0, this.$composition, this.$progress, this.$iteration, this.$resetLastFrameNanos, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        LottieAnimatableImpl$snapTo$2 lottieAnimatableImpl$snapTo$2 = (LottieAnimatableImpl$snapTo$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        lottieAnimatableImpl$snapTo$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        LottieAnimatableImpl lottieAnimatableImpl = this.this$0;
        lottieAnimatableImpl.B.setValue(this.$composition);
        this.this$0.g(this.$progress);
        this.this$0.f(this.$iteration);
        LottieAnimatableImpl.b(this.this$0, false);
        if (this.$resetLastFrameNanos) {
            this.this$0.E.setValue(Long.MIN_VALUE);
        }
        return zy11.a;
    }
}
