package com.yandex.go.mainscreen.superapp.impl.currentaddress;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.currentaddress.CurrentAddressSearchModalViewRouter", f = "CurrentAddressSearchModalViewRouter.kt", l = {62}, m = "setIsAddressClarified", v = 2)
/* loaded from: classes12.dex */
final class CurrentAddressSearchModalViewRouter$setIsAddressClarified$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentAddressSearchModalViewRouter$setIsAddressClarified$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.T(this.this$0, null, this);
    }
}
