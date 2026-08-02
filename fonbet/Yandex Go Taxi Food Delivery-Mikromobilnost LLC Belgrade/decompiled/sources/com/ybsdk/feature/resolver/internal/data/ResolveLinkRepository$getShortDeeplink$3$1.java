package com.ybsdk.feature.resolver.internal.data;

import com.ybsdk.feature.resolver.internal.network.dto.ShortLinkResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/ybsdk/feature/resolver/internal/network/dto/ShortLinkResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.resolver.internal.data.ResolveLinkRepository$getShortDeeplink$3$1", f = "ResolveLinkRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ResolveLinkRepository$getShortDeeplink$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ResolveLinkRepository$getShortDeeplink$3$1 resolveLinkRepository$getShortDeeplink$3$1 = new ResolveLinkRepository$getShortDeeplink$3$1(2, continuation);
        resolveLinkRepository$getShortDeeplink$3$1.L$0 = obj;
        return resolveLinkRepository$getShortDeeplink$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ResolveLinkRepository$getShortDeeplink$3$1) create((ShortLinkResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return ((ShortLinkResponse) this.L$0).getDeeplink();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
