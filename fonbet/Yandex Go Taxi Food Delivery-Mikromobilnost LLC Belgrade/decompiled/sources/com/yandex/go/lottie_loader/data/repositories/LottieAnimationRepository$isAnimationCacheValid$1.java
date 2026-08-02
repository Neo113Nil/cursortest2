package com.yandex.go.lottie_loader.data.repositories;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.lottie_loader.data.repositories.LottieAnimationRepository", f = "LottieAnimationRepository.kt", l = {91, 91}, m = "isAnimationCacheValid", v = 2)
/* loaded from: classes12.dex */
final class LottieAnimationRepository$isAnimationCacheValid$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimationRepository$isAnimationCacheValid$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i(null, this);
    }
}
