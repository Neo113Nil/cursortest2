package com.yandex.passport.internal.sloth.credentialmanager;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.sloth.credentialmanager.GoogleCredentialManagerImpl", f = "GoogleCredentialManagerImpl.kt", l = {142, 159}, m = "request-yxL6bBk")
/* loaded from: classes15.dex */
final class GoogleCredentialManagerImpl$request$7 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleCredentialManagerImpl$request$7(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.g(null, false, null, null, this);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : new Result(g);
    }
}
