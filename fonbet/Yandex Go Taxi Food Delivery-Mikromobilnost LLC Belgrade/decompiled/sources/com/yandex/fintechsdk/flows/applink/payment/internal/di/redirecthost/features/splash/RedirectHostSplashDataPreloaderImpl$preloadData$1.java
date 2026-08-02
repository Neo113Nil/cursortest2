package com.yandex.fintechsdk.flows.applink.payment.internal.di.redirecthost.features.splash;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.fintechsdk.flows.applink.payment.internal.di.redirecthost.features.splash.RedirectHostSplashDataPreloaderImpl", f = "RedirectHostSplashDataPreloaderImpl.kt", l = {15}, m = "preloadData-IoAF18A")
/* loaded from: classes12.dex */
final class RedirectHostSplashDataPreloaderImpl$preloadData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectHostSplashDataPreloaderImpl$preloadData$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
