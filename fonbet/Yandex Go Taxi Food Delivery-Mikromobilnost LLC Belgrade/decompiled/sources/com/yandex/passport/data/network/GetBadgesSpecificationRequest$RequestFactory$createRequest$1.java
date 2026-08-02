package com.yandex.passport.data.network;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.GetBadgesSpecificationRequest$RequestFactory", f = "GetBadgesSpecificationRequest.kt", l = {65}, m = "createRequest")
/* loaded from: classes8.dex */
final class GetBadgesSpecificationRequest$RequestFactory$createRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBadgesSpecificationRequest$RequestFactory$createRequest$1(w2 w2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = w2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
