package com.yandex.go.lottie_loader.data.api;

import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rvj0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrvj0;", "<anonymous>", "(Ltse;)Lrvj0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lottie_loader.data.api.LottieApi$downloadAnimationFile$response$1", f = "LottieApi.kt", l = {21}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LottieApi$downloadAnimationFile$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ cmt<rvj0> $call;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieApi$downloadAnimationFile$response$1(cmt cmtVar, Continuation continuation) {
        super(2, continuation);
        this.$call = cmtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LottieApi$downloadAnimationFile$response$1(this.$call, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LottieApi$downloadAnimationFile$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        cmt<rvj0> cmtVar = this.$call;
        this.label = 1;
        Object d = ru.yandex.taxi.network.api.a.d(cmtVar, this);
        return d == coroutineSingletons ? coroutineSingletons : d;
    }
}
