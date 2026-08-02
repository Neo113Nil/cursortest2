package com.ybsdk.common.repositiories.auth;

import defpackage.fp90;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.repositiories.auth.AuthTokenRepository", f = "AuthTokenRepository.kt", l = {53}, m = "requestNewPassportToken-A57tDZw")
/* loaded from: classes8.dex */
final class AuthTokenRepository$requestNewPassportToken$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthTokenRepository$requestNewPassportToken$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(0L, this);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        String str = (String) b;
        if (str != null) {
            return new fp90(str);
        }
        return null;
    }
}
