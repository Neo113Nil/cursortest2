package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.LoadAccountsMiddleware", f = "LoadAccountsMiddleware.kt", l = {56, 62, 66, 69, 85}, m = "loadLoginParameters")
/* loaded from: classes2.dex */
final class LoadAccountsMiddleware$loadLoginParameters$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadAccountsMiddleware$loadLoginParameters$1(d0 d0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d0.b(this.this$0, null, this);
    }
}
