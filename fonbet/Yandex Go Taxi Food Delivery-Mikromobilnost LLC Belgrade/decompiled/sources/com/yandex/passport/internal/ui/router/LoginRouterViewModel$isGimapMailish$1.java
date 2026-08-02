package com.yandex.passport.internal.ui.router;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.router.LoginRouterViewModel", f = "LoginRouterViewModel.kt", l = {91}, m = "isGimapMailish")
/* loaded from: classes2.dex */
final class LoginRouterViewModel$isGimapMailish$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginRouterViewModel$isGimapMailish$1(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Y(null, null, this);
    }
}
