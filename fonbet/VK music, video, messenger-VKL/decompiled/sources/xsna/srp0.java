package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Trimmer.kt */
@b6l(c = "com.vk.libvideo.design.compose.base.trimmer.TrimmerKt$TrimmerThumbs$1$1", f = "Trimmer.kt", l = {254}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class srp0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ jgh0 $scrollState;
    final /* synthetic */ int $thumbsScrollOffsetPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srp0(jgh0 jgh0Var, int i, spj<? super srp0> spjVar) {
        super(2, spjVar);
        this.$scrollState = jgh0Var;
        this.$thumbsScrollOffsetPx = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new srp0(this.$scrollState, this.$thumbsScrollOffsetPx, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((srp0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            jgh0 jgh0Var = this.$scrollState;
            int i2 = this.$thumbsScrollOffsetPx;
            this.label = 1;
            if (fdi.K(jgh0Var, i2 - ((wak0) jgh0Var.a).getIntValue(), this) == coroutineSingletons) {
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
