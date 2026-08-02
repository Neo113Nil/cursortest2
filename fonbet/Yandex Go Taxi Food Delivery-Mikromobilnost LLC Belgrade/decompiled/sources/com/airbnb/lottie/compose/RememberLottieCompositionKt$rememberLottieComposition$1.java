package com.airbnb.lottie.compose;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@mvg(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class RememberLottieCompositionKt$rememberLottieComposition$1 extends SuspendLambda implements zls {
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        new RememberLottieCompositionKt$rememberLottieComposition$1(3, (Continuation) obj3).invokeSuspend(zy11.a);
        return Boolean.FALSE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.FALSE;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
