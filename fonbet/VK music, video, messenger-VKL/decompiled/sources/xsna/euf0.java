package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: rememberLottieComposition.kt */
@b6l(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class euf0 extends SuspendLambda implements yzs<Integer, Throwable, spj<? super Boolean>, Object> {
    int label;

    @Override // xsna.yzs
    public final Object invoke(Integer num, Throwable th, spj<? super Boolean> spjVar) {
        num.intValue();
        new euf0(3, spjVar).invokeSuspend(s3q0.a);
        return Boolean.FALSE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        return Boolean.FALSE;
    }
}
