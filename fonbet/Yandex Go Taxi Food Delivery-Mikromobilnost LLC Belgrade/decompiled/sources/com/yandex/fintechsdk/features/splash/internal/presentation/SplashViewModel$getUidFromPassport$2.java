package com.yandex.fintechsdk.features.splash.internal.presentation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.v7w;
import defpackage.wls;
import defpackage.yrt0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv7w;", "Lzy11;", "Lzrt0;", "<anonymous>", "(Lv7w;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.splash.internal.presentation.SplashViewModel$getUidFromPassport$2", f = "SplashViewModel.kt", l = {238}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SplashViewModel$getUidFromPassport$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SplashViewModel$getUidFromPassport$2 splashViewModel$getUidFromPassport$2 = new SplashViewModel$getUidFromPassport$2(2, continuation);
        splashViewModel$getUidFromPassport$2.L$0 = obj;
        return splashViewModel$getUidFromPassport$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashViewModel$getUidFromPassport$2) create((v7w) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v7w v7wVar = (v7w) this.L$0;
            this.label = 1;
            if (com.yandex.fintechsdk.core.architecture.api.mvi.b.d(v7wVar, yrt0.a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
