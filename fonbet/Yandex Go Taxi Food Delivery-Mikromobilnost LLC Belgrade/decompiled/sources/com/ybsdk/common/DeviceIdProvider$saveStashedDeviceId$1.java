package com.ybsdk.common;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.DeviceIdProvider", f = "DeviceIdProvider.kt", l = {221}, m = "saveStashedDeviceId")
/* loaded from: classes2.dex */
final class DeviceIdProvider$saveStashedDeviceId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceIdProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceIdProvider$saveStashedDeviceId$1(DeviceIdProvider deviceIdProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = deviceIdProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        DeviceIdProvider deviceIdProvider = this.this$0;
        Regex regex = DeviceIdProvider.k;
        return deviceIdProvider.f(0L, null, this);
    }
}
