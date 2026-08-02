package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeStoreFactory$ExecutorImpl", f = "WebCardComposeStoreFactory.kt", l = {305}, m = "processSelectedPicture-0E7RQCE")
/* loaded from: classes2.dex */
final class WebCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m = this.this$0.m(null, 0, this);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : new Result(m);
    }
}
