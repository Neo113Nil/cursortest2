package com.ybsdk.common;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.DeviceIdProvider", f = "DeviceIdProvider.kt", l = {317, HProv.ALG_SID_GR3410_12_256}, m = "getDeviceIdData")
/* loaded from: classes2.dex */
final class DeviceIdProvider$getDeviceIdData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceIdProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceIdProvider$getDeviceIdData$1(DeviceIdProvider deviceIdProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = deviceIdProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
