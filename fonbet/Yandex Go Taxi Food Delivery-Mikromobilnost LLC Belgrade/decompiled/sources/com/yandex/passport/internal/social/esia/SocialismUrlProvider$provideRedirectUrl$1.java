package com.yandex.passport.internal.social.esia;

import defpackage.mvg;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.social.esia.SocialismUrlProvider", f = "SocialismUrlProvider.kt", l = {BuildConfig.API_LEVEL}, m = "provideRedirectUrl")
/* loaded from: classes15.dex */
final class SocialismUrlProvider$provideRedirectUrl$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialismUrlProvider$provideRedirectUrl$1(l0 l0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, null, null, this);
    }
}
