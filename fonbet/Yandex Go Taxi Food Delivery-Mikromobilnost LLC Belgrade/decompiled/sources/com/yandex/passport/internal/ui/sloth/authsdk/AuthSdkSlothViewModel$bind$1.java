package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothViewModel", f = "AuthSdkSlothViewModel.kt", l = {62}, m = "bind")
/* loaded from: classes2.dex */
final class AuthSdkSlothViewModel$bind$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSdkSlothViewModel$bind$1(i0 i0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.W(null, this);
    }
}
