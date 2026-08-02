package com.ybsdk.feature.resolver.internal.data;

import com.ybsdk.feature.resolver.internal.network.dto.OnboardingResponseV2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "it", "Lcom/ybsdk/feature/resolver/internal/network/dto/OnboardingResponseV2;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.resolver.internal.data.ResolveLinkRepository$getDeeplinks$3$1", f = "ResolveLinkRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ResolveLinkRepository$getDeeplinks$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ResolveLinkRepository$getDeeplinks$3$1 resolveLinkRepository$getDeeplinks$3$1 = new ResolveLinkRepository$getDeeplinks$3$1(2, continuation);
        resolveLinkRepository$getDeeplinks$3$1.L$0 = obj;
        return resolveLinkRepository$getDeeplinks$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ResolveLinkRepository$getDeeplinks$3$1) create((OnboardingResponseV2) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return ((OnboardingResponseV2) this.L$0).getDeeplinks();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
