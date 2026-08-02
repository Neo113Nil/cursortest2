package com.yandex.passport.data.network;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.DeviceAuthorizationCommitRequest$RequestFactory", f = "DeviceAuthorizationCommitRequest.kt", l = {74}, m = "createRequest")
/* loaded from: classes15.dex */
final class DeviceAuthorizationCommitRequest$RequestFactory$createRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthorizationCommitRequest$RequestFactory$createRequest$1(i1 i1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = i1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
