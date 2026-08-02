package com.yandex.passport.data.network;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.TryAddPlusDeviceRequest$RequestFactory", f = "TryAddPlusDeviceRequest.kt", l = {90}, m = "createRequest")
/* loaded from: classes15.dex */
final class TryAddPlusDeviceRequest$RequestFactory$createRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ kd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryAddPlusDeviceRequest$RequestFactory$createRequest$1(kd kdVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
