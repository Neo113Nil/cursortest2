package com.ybsdk.common;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.DeviceIdProvider", f = "DeviceIdProvider.kt", l = {160, 202}, m = "readStashedDeviceId")
/* loaded from: classes2.dex */
final class DeviceIdProvider$readStashedDeviceId$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceIdProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceIdProvider$readStashedDeviceId$1(DeviceIdProvider deviceIdProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = deviceIdProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DeviceIdProvider.a(this.this$0, 0L, this);
    }
}
